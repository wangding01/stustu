package com.study.demo.day0207;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
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
 * @date 2020年2月7日 下午3:36:33
 * @Description：base64测试案例
 */
public class GoRun02 {
	private static final Log log = LogFactory.getLog(GoRun02.class);

	public static void main(String[] args) throws IOException {
		log.info("开始将图片转成base64");
		File file = new File("F:\\4.jpg");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] by = new byte[fileInputStream.available()];// 一次性全部读取所有的字节
		fileInputStream.read(by);
		fileInputStream.close();
		Encoder base64 = Base64.getEncoder();
		String iamgeBase64 = base64.encodeToString(by);
		log.info("将base64转成BufferedImage");
		Decoder decoder = Base64.getDecoder();
		byte[] by01 = decoder.decode(iamgeBase64);
		ByteArrayInputStream bais = new ByteArrayInputStream(by01);// 将字节转换成inputStream
		BufferedImage bi = ImageIO.read(bais);
		bais.close();
		log.info("开始翻转图片");
		BufferedImage bufferedImage = ImageTools.Rotate(bi, 180);
		log.info("再将翻转之后的图片转成base64");
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		ImageIO.write(bufferedImage, "jpg", outStream);
		byte[] by02 = outStream.toByteArray();
		String finalBase64 = base64.encodeToString(by02);
		log.info("最终的base64为：" + finalBase64 + ",开始输出图片。。。");
		FileOutputStream fileOutputStream1 = new FileOutputStream(new File("F:\\6.jpg"));
		fileOutputStream1.write(by02);
		fileOutputStream1.close();

	}
}
