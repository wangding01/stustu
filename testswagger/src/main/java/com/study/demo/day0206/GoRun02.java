package com.study.demo.day0206;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author wangding
 * @date 2020年2月6日 下午2:46:00
 * @Description：字符流的读取方式 FileReader和FileWriter
 */
public class GoRun02 {
	private static final Log log = LogFactory.getLog(GoRun02.class);

	public static void main(String[] args) throws IOException {
		String x = "大毛驴";
		File file = new File("F:\\4.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(x);
		fileWriter.close();
		log.info("writer文件写入完成：" + x);
		log.info("开始读取文件信息");
		char[] cbuf = new char[1024];
		FileReader fileReader = new FileReader(file);
		int len = fileReader.read(cbuf);
		fileReader.close();
		log.info("读取的值为：" + new String(cbuf, 0, len));
	}
}
