package com.shuttle.ttt;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyThread implements Runnable {
	 private Thread t;
	 private String threadName;
	 
	 MyThread(String name) {
	      threadName = name;
//	      System.out.println("Creating " +  threadName );
	   }
	   public void start () {
//		      System.out.println("Starting " +  threadName );
		      if (t == null) {
		         t = new Thread (this, threadName);
		         t.start ();
		      }
		   }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 5; i > 0; i--) {
			System.out.println(threadName+"抽到" + i);
		}
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		  MyThread R1 = new MyThread( "Thread-1");
//	      R1.start();
//	      MyThread R2 = new MyThread( "Thread-2");
//	      R2.start();
//	      MyThread R3 = new MyThread( "Thread-3");
//	      R3.start();
//	      MyThread R4 = new MyThread( "Thread-4");
//	      R4.start();
		 ExecutorService executorService = Executors.newSingleThreadExecutor(); //创建一个单线程
	        Future future = executorService.submit(new Runnable() { //接收一个Runnable实例
	            public void run() {
	                System.out.println("Asynchronous task");
	            }
	        });
	        System.out.println(future.get()); //任务执行结束返回null.
	        executorService.shutdown();
	}
}
