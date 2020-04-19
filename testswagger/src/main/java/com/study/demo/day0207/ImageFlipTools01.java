package com.study.demo.day0207;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageFlipTools01 {
	/**
	 * 旋转
	 * 
	 * @param degree 旋转角度
	 * @throws Exception
	 */
	public static void spin(int degree) throws Exception {
		int swidth = 0; // 旋转后的宽度
		int sheight = 0; // 旋转后的高度
		int x; // 原点横坐标
		int y; // 原点纵坐标

		File file = new File("F:\\4.jpg");
		if (!file.isFile()) {
			throw new Exception("ImageDeal>>>" + file + " 不是一个图片文件!");
		}
		BufferedImage bi = ImageIO.read(file); // 读取该图片
		// 处理角度--确定旋转弧度
		degree = degree % 360;
		if (degree < 0)
			degree = 360 + degree;// 将角度转换到0-360度之间
		double theta = Math.toRadians(degree);// 将角度转为弧度

		// 确定旋转后的宽和高
		if (degree == 180 || degree == 0 || degree == 360) {
			swidth = bi.getWidth();
			sheight = bi.getHeight();
		} else if (degree == 90 || degree == 270) {
			sheight = bi.getWidth();
			swidth = bi.getHeight();
		} else {
			swidth = (int) (Math.sqrt(bi.getWidth() * bi.getWidth() + bi.getHeight() * bi.getHeight()));
			sheight = (int) (Math.sqrt(bi.getWidth() * bi.getWidth() + bi.getHeight() * bi.getHeight()));
		}

		x = (swidth / 2) - (bi.getWidth() / 2);// 确定原点坐标
		y = (sheight / 2) - (bi.getHeight() / 2);

		BufferedImage spinImage = new BufferedImage(swidth, sheight, bi.getType());
		// 设置图片背景颜色
		Graphics2D gs = (Graphics2D) spinImage.getGraphics();
		gs.setColor(Color.white);
		gs.fillRect(0, 0, swidth, sheight);// 以给定颜色绘制旋转后图片的背景

		AffineTransform at = new AffineTransform();
		at.rotate(theta, swidth / 2, sheight / 2);// 旋转图象
		at.translate(x, y);
		AffineTransformOp op = new AffineTransformOp(at, AffineTransformOp.TYPE_BICUBIC);
		spinImage = op.filter(bi, spinImage);
		File sf = new File("F:\\", "8" + "." + "jpg");
		ImageIO.write(spinImage, "jpg", sf); // 保存图片

	}

	public static void main(String[] args) throws Exception {
		spin(90);
		
		
	}
}
