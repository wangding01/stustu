package com.study.demo.day0207;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import javax.imageio.ImageIO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author wangding
 * @date 2020年2月7日 下午4:08:15
 * @Description：图片翻转工具类
 */
public class ImageFlipTool {
	private static final Log log = LogFactory.getLog(ImageFlipTool.class);
	private static final Decoder DECODER = Base64.getDecoder();
	private static final Encoder ENCODER = Base64.getEncoder();

	/**
	 * 对外调用的方法
	 * 
	 * @param base64
	 * @param angel
	 * @return base64
	 * @throws IOException
	 */
	public static String ImageFlip(String iamgeBase64, double angel) throws IOException {
		log.info("开始翻转图片，翻转角度：" + angel);
		long startTime = System.currentTimeMillis();
		byte[] by01 = DECODER.decode(iamgeBase64);
		ByteArrayInputStream bais = new ByteArrayInputStream(by01);// 将字节转换成inputStream
		BufferedImage bi = ImageIO.read(bais);
		bais.close();
		BufferedImage bufferedImage = Rotate(bi, angel);
		log.info("将翻转之后的图片转成base64");
		
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		ImageIO.write(bufferedImage, "jpg", outStream);
		byte[] by02 = outStream.toByteArray();
		
		String finalBase64 = ENCODER.encodeToString(by02);
		long endTime = System.currentTimeMillis();
		log.info("图片翻转结束，消耗时间：" + (endTime - startTime) + "ms");
		return finalBase64;
	}

	/**
	 * 图像旋转
	 * 
	 * @param src
	 * @param angel
	 * @return
	 */
	public static BufferedImage Rotate(Image src, double angel) {
		int src_width = src.getWidth(null);
		int src_height = src.getHeight(null);
		// calculate the new image size
		Rectangle rect_des = CalcRotatedSize(new Rectangle(new Dimension(src_width, src_height)), angel);
		BufferedImage res = null;
		res = new BufferedImage(rect_des.width, rect_des.height, BufferedImage.TYPE_3BYTE_BGR);
		Graphics2D g2 = res.createGraphics();
		// transform
		g2.translate((rect_des.width - src_width) / 2, (rect_des.height - src_height) / 2);
		g2.rotate(Math.toRadians(angel), src_width / 2, src_height / 2);
		g2.drawImage(src, null, null);
		return res;
	}

	/**
	 * 具体翻转策略
	 * 
	 * @param src
	 * @param angel
	 * @return
	 */
	public static Rectangle CalcRotatedSize(Rectangle src, double angel) {
		// if angel is greater than 90 degree, we need to do some conversion
		if (angel >= 90) {
			if (angel / 90 % 2 == 1) {
				int temp = src.height;
				src.height = src.width;
				src.width = temp;
			}
			angel = angel % 90;
		}
		// 返回一个平方根
		double r = Math.sqrt(src.height * src.height + src.width * src.width) / 2;
		// Math.sin反悔弧度的正弦值，Math.toRadians角度转换为弧度
		double len = 2 * Math.sin(Math.toRadians(angel) / 2) * r;
		double angel_alpha = (Math.PI - Math.toRadians(angel)) / 2;
		double angel_dalta_width = Math.atan((double) src.height / src.width);
		double angel_dalta_height = Math.atan((double) src.width / src.height);

		int len_dalta_width = (int) (len * Math.cos(Math.PI - angel_alpha - angel_dalta_width));
		len_dalta_width = len_dalta_width > 0 ? len_dalta_width : -len_dalta_width;

		int len_dalta_height = (int) (len * Math.cos(Math.PI - angel_alpha - angel_dalta_height));
		len_dalta_height = len_dalta_height > 0 ? len_dalta_height : -len_dalta_height;

		int des_width = src.width + len_dalta_width * 2;
		int des_height = src.height + len_dalta_height * 2;
		des_width = des_width > 0 ? des_width : -des_width;
		des_height = des_height > 0 ? des_height : -des_height;
		return new java.awt.Rectangle(new Dimension(des_width, des_height));
	}

}
