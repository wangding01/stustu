package com.study.demo.day0909;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo09 extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("这是多线程之一" + Thread.currentThread().getName());
		super.run();
	}

	public static void main(String[] args) {
		// 基础用法
		System.out.println("这个是主线程" + Thread.currentThread().getName());
		new Demo09().start();
		new Demo0901().run();
		// 还能直接new啊
		Thread thread01 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "第一个线程去干吗001");

			}
		});
		thread01.start();
		Thread thread02 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "第一个线程去干吗002");
			}
		});
		thread02.start();
		BufferedReader bufferedReader;
		ServerSocket serverSocket;
		Socket socket;
		try {
			// 初始化socket服务端
			serverSocket = new ServerSocket(8989);
			System.out.println("初始化服务器server完成");
			socket = serverSocket.accept();
			System.out.println("有客户端链接了");
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(bufferedReader.readLine() + "读取到客户端发送的消息");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
