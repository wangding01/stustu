package com.study.demo.day1103;

import java.util.concurrent.CountDownLatch;

public class GoRun {
	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(5);
		for (int i = 0; i < 5; i++) {
			new Thread1103(countDownLatch).start();
			countDownLatch.countDown();
		}

	}
}
