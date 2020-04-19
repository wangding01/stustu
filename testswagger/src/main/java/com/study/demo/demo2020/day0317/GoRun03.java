package com.study.demo.demo2020.day0317;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 
 * @author wangding
 * @date 2020年3月17日 下午10:32:02
 * @Description：大文本读取
 */
public class GoRun03 {
public static void main(String[] args) throws IOException {
	String fff = "D:\\1.txt";
	 int bufSize = 1024;
     byte[] bs = new byte[bufSize];
     ByteBuffer byteBuf = ByteBuffer.allocate(1024);
     FileChannel channel = new RandomAccessFile(fff, "r").getChannel();
     while (channel.read(byteBuf) != -1) {
         int size = byteBuf.position();
         byteBuf.rewind();
         byteBuf.get(bs); // 把文件当字符串处理，直接打印做为一个例子。
         System.out.print(new String(bs, 0, size));
         byteBuf.clear();
     }
}
}
