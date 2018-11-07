package com.dxc.demo.threadpool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoolService {
	@Autowired
	private ThreadsPoolConfig config; // 注入 配置

	public void loadThreadsPool(Runnable x) {

		// 初始化 线程池
		HandlerThreadsPool handlerThreadsPool = new HandlerThreadsPool(config);

		// 调用线程池，创建线程 。处理事件
		handlerThreadsPool.execute(x);
	}
}
