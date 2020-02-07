package com.study.demo.day0206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author wangding
 * @date 2020年2月6日 下午4:33:28
 * @Description：Buffer io
 */
public class GoRun03 {
	private static final Log log = LogFactory.getLog(GoRun03.class);

	public static void main(String[] args) throws IOException {
		String[] x = { "11", "22", "33" };
		File file = new File("F:\\3.txt");
		if (!file.exists()) {
			log.info("使用文件不存在!");
		}
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		for (String string : x) {
			bufferedWriter.write(string);
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
		fileWriter.close();
		log.info("buffer写入完成");
		log.info("现在开始读取文本内容");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String x1 = "";
		while ((x1 = bufferedReader.readLine()) != null) {
			log.info("读取的值依次为：" + x1);
		}
		bufferedReader.close();
		fileReader.close();
	}
}
