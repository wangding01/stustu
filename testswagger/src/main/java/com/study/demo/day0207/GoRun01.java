package com.study.demo.day0207;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author wangding
 * @date 2020年2月7日 下午2:38:06
 * @Description：测试图片翻转
 */
public class GoRun01 {
	private static final Log log = LogFactory.getLog(GoRun01.class);

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		BufferedImage img = ImageIO.read(new File("F:\\4.jpg"));
		BufferedImage bufferedImage = ImageTools.Rotate(img, 180);
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		ImageIO.write(bufferedImage, "jpg", outStream);
		byte[] by = outStream.toByteArray();
		FileOutputStream fileOutputStream = new FileOutputStream(new File("F:\\5.jpg"));
		fileOutputStream.write(by);
		outStream.close();
		fileOutputStream.close();
		long end = System.currentTimeMillis();
		log.info("消耗时间：" + (end - start) + "ms");
	}
}
