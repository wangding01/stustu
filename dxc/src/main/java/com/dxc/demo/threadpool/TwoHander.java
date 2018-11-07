package com.dxc.demo.threadpool;

public class TwoHander implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("线程2执行中！" + i + Thread.currentThread().getName());
			if (i == 5) {
				Thread.currentThread().destroy();
				System.out.println("线程销毁");
			}
		}
	}

}
