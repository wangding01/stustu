package com.study.demo.day0206;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author wangding
 * @date 2020年2月6日 下午5:45:53
 * @Description：文件复制
 */
public class GoRun04 {
	private static final Log log = LogFactory.getLog(GoRun03.class);

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\1.jpg");
		FileInputStream inputStream = new FileInputStream(file);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] by = new byte[512];
		log.info("返回一个可以从这个输入流读取（或跳过）的字节数的估计值：" + bufferedInputStream.available() + "read的值："
				+ bufferedInputStream.read(by));

		int len = 0;
		while ((len = bufferedInputStream.read(by)) != -1) {
			bos.write(by, 0, len);
		}
		byte[] by01 = bos.toByteArray();
		log.info("转换字节数组完成,开始输出到另外一个文件");
		File file2 = new File("F:\\11.jpg");
		FileOutputStream fileOutputStream = new FileOutputStream(file2);
		fileOutputStream.write(by01);
		log.info("复制完成");
		fileOutputStream.close();
		bos.close();
		inputStream.close();
	}
}
