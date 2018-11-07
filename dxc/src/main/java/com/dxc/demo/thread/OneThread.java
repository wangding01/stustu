package com.dxc.demo.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class OneThread {
	@Async
	public void ex() {
		for (int i = 0; i < 5; i++) {
			System.out.println("线程1执行中！" + i + Thread.currentThread().getName());
		}
	}
}
