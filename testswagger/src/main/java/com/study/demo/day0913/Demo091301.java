package com.study.demo.day0913;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

public class Demo091301 implements Runnable {
	int port = 8989;
	InetAddress address = null;
	MulticastSocket multicastSocket = null;

	public Demo091301() {
		try {
			multicastSocket = new MulticastSocket(8989);
			multicastSocket.joinGroup(InetAddress.getByName("224.255.10.0"));
			System.out.println("初始化接受消息体完成");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		byte data[] = new byte[1024];
		DatagramPacket datagramPacket = null;
		try {
			datagramPacket = new DatagramPacket(data, data.length, InetAddress.getByName("224.255.10.0"), port);
			multicastSocket.receive(datagramPacket);
			System.out.println("开始接受广播消息" + new String(datagramPacket.getData()));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
