package com.study.demo.demo2020.day0414;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;

/**
 * 
 * @author wangding
 * @date 2020年4月14日 下午7:07:19
 * @Description：goole工具图片压缩
 */
public class GoRun01 {
	private static final int MAX_SIZE = 80 * 1024;

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\JAVA\\TEST\\01.jpg");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] by01 = new byte[fileInputStream.available()];
		fileInputStream.read(by01);
		long start = System.currentTimeMillis();
		while (true) {
			byte[] by = picCompressByGoole01(by01);
			by01 = by;
			System.out.println("开始了" + by.length / 1024);
			if (by.length < MAX_SIZE) {
				break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end - start) + "ms");
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\JAVA\\TEST\\04.jpg");
		fileOutputStream.write(by01);
		fileOutputStream.close();
		fileInputStream.close();
	}

	private static byte[] picCompressByGoole01(byte[] by) throws IOException {
		InputStream input = new ByteArrayInputStream(by);
		BufferedImage bufferedImage = null;
		byte[] by01 = null;
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		bufferedImage = Thumbnails.of(input).scale(0.75f).asBufferedImage();
		ImageIO.write(bufferedImage, "jpg", output);
		by01 = output.toByteArray();
		return by01;
	}
}
