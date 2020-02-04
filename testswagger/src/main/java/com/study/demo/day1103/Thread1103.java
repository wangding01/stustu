package com.study.demo.day1103;

import java.util.concurrent.CountDownLatch;

public class Thread1103 extends Thread {
	private final CountDownLatch startLatch;

	public Thread1103(CountDownLatch startLatch) {
		this.startLatch = startLatch;
	}

	@Override
	public void run() {
		try {
			startLatch.await();
			System.out.println("当前线程号" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
