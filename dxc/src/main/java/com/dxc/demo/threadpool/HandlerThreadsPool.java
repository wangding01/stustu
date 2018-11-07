package com.dxc.demo.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.annotation.PreDestroy;

/**
 * 线程管理器
 */
public class HandlerThreadsPool {

	public ExecutorService executorService;

	public HandlerThreadsPool() {
		// TODO Auto-generated constructor stub
		this.executorService = Executors.newCachedThreadPool();
	}

	public HandlerThreadsPool(ThreadsPoolConfig config) {
		// TODO Auto-generated constructor stub
		if (config.isCustom()) {
			BlockingQueue<Runnable> queue = null;
			if (config.getWorkQueue() > 0) {
				queue = new LinkedBlockingQueue<Runnable>(config.getWorkQueue()); // 一般使用 LinkedBlockingQueue 队列
			} else {
				queue = new LinkedBlockingQueue<Runnable>();
			}
			this.executorService = new ThreadPoolExecutor(config.getCorePoolSize(), config.getMaximumPoolSize(),
					config.getKeepAliveTime(), TimeUnit.SECONDS, queue, new ThreadPoolExecutor.AbortPolicy()// 拒绝策略，任务队列满后，新的任务将被丢弃，并抛出异常
			);
		} else {
			this.executorService = Executors.newCachedThreadPool();
		}
	}

	/*
	 * 创建线程，对线程处理事件
	 */
	public void execute(Runnable runnable) {
		executorService.execute(runnable);
	}

	/*
	 * 对象销毁时，销毁线程
	 */

	@PreDestroy
	public void stop() {
		executorService.shutdown();
	}

}