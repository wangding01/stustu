package com.dxc.demo.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TwoThread {
	@Async
	public void ex() {
		for (int i = 0; i < 5; i++) {
			System.out.println("线程2执行中！" + i + Thread.currentThread().getName());
		}
	}
}
