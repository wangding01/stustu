package com.study.demo.day1103;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GoRun01 {

	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(5);
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			executorService.submit(new Thread1103(countDownLatch));
			countDownLatch.countDown();
		}
		executorService.shutdown();

	}
}
