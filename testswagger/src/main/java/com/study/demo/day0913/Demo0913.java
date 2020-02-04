package com.study.demo.day0913;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * 利用UDP发送和接受广播信息
 * 
 * @author wangding
 * @date 2019年9月13日 下午12:46:09 @Description：
 */
public class Demo0913 extends Thread {
	String wethear = "今天会下雨大兄弟";
	int port = 8989;
	InetAddress address = null;
	MulticastSocket multicastSocket = null;

	// 构造方法构造
	Demo0913() {
		try {
			address = InetAddress.getByName("224.255.10.0");
			multicastSocket = new MulticastSocket(8989);
			multicastSocket.joinGroup(address);
			multicastSocket.setTimeToLive(MIN_PRIORITY);
			System.out.println("初始化广播完成");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		byte data[] = wethear.getBytes();
		DatagramPacket datagramPacket = new DatagramPacket(data, data.length, address, port);
		System.out.println("发送广播消息+" + new String(data));
		super.run();
	}

	public static void main(String[] args) {
		new Demo0913().start();
		new Demo091301().run();
	}
}
