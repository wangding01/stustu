package com.dxc.demo.threadpool;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsgHandler implements Runnable {

	@Autowired
	private ThreadsPoolConfig config; // 注入 配置

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("线程2执行中！" + i + Thread.currentThread().getName());
		}
	}

	@PostConstruct
	public void loadThreadsPool() {

		// 初始化 线程池
		HandlerThreadsPool handlerThreadsPool = new HandlerThreadsPool(config);

		// 调用线程池，创建线程 。处理事件
		handlerThreadsPool.execute(new MsgHandler());
	}
}