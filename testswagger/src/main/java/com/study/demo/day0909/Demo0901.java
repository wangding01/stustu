package com.study.demo.day0909;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo0901 extends Thread {
	@Override
	public void run() {
		System.out.println("咋个不对哦" + Thread.currentThread().getName());
		super.run();
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket clientSocket = new Socket("127.0.0.1", 8989);
		clientSocket.getOutputStream().write(new Byte(""));
		System.out.println("初始化客户端server完成");
	}
}
