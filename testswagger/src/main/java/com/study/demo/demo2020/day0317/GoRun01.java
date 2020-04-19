package com.study.demo.demo2020.day0317;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author wangding
 * @date 2020年3月17日 下午9:14:33
 * @Description：
 */
public class GoRun01 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\1.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		long starttime = System.currentTimeMillis();
		String msg = "12000000000000000012,";
		StringBuilder txt = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			txt.append(msg+(30000000+i)+ System.getProperty("line.separator"));
		}
		
		FileWriter fileWriter = new FileWriter(file,false);
		fileWriter.write(txt.toString());
		fileWriter.close();
		long endTime = System.currentTimeMillis();
		System.out.println("运行结束"+(endTime-starttime)+"ms");
		//读取并且封装成sql
//		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));    
//		BufferedReader reader = new BufferedReader(new InputStreamReader(fis,"utf-8"),1024*1024*5);// 用5M的缓冲读取文本文件  
//		String line = "";
//		while((line = reader.readLine()) != null){
//			System.out.println(line);
//		}
//		fis.close();
//		reader.close();
		
	}
}
