package com.dxc.demo.threadpool;

public class OneHander implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("线程1执行中！" + i + Thread.currentThread().getName());
		}
	}

}
