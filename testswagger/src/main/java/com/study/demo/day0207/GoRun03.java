package com.study.demo.day0207;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author wangding
 * @date 2020年2月7日 下午4:20:24
 * @Description：测试最终的图片旋转方法
 */
public class GoRun03 {
	private static final Log log = LogFactory.getLog(GoRun03.class);

	public static void main(String[] args) throws IOException {
		log.info("开始将图片转成base64");
		File file = new File("F:\\7.jpg");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] by = new byte[fileInputStream.available()];// 一次性全部读取所有的字节
		fileInputStream.read(by);
		fileInputStream.close();
		Encoder base64 = Base64.getEncoder();
		String iamgeBase64 = base64.encodeToString(by);
		String filpBase64 = ImageFlipTool.ImageFlip(iamgeBase64, 90);
		log.info("开始输出图片。。。");
		Decoder decoder = Base64.getDecoder();
		FileOutputStream fileOutputStream1 = new FileOutputStream(new File("F:\\8.jpg"));
		fileOutputStream1.write(decoder.decode(filpBase64));
		fileOutputStream1.close();
	}
}
