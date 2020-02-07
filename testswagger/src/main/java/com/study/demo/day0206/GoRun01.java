package com.study.demo.day0206;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author wangding
 * @date 2020年2月6日 下午2:26:39
 * @Description：i/o操作 字节流的读取方式
 */
public class GoRun01 {
	private static final Log log = LogFactory.getLog(GoRun01.class);

	public static void main(String[] args) throws IOException {
		String word = "小毛驴";
		File file = new File("F:\\3.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		byte[] by = word.getBytes();
		FileOutputStream out = new FileOutputStream(file);
		out.write(by);
		out.close();
		log.info("信息写入完成：" + word + ",现在开始读取信息");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] byread = new byte[1024];
		int len = fileInputStream.read(byread);
		fileInputStream.close();
		log.info("信息读取完成，len值为：" + len + "读取的值为：" + new String(byread, 0, len));
	}
}
