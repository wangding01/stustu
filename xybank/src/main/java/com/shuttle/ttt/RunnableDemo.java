package com.shuttle.ttt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnableDemo implements Runnable {
	 private Thread t;
	 private String threadName;
	 private List<String> list = new ArrayList<String>(Arrays.asList("11","22","33","44","55","66","77"));
		
   RunnableDemo( String name) {
      threadName = name;
//      System.out.println("Creating " +  threadName );
   }
   public void start () {
//	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	@Override
	public void run() {
//		System.out.println("Running " +  threadName );
		// TODO Auto-generated method stub
		List<String> list1 = list;
		java.util.Random random=new java.util.Random();
		int a=random.nextInt(list1.size());
//		System.out.println(a);
		list1.remove(a);
		System.out.println(threadName+"抽到" + list1.get(a)+"。。。。。剩余个数"+list1.size());
	}
	
	public static void main(String[] args) {
		  RunnableDemo R1 = new RunnableDemo( "Thread-1");
	      R1.start();
	      RunnableDemo R2 = new RunnableDemo( "Thread-2");
	      R2.start();
	      RunnableDemo R3 = new RunnableDemo( "Thread-3");
	      R3.start();
	      RunnableDemo R4 = new RunnableDemo( "Thread-4");
	      R4.start();
	      RunnableDemo R5 = new RunnableDemo( "Thread-5");
	      R5.start();
	      RunnableDemo R6 = new RunnableDemo( "Thread-6");
	      R6.start();
	      RunnableDemo R7 = new RunnableDemo( "Thread-7");
	      R7.start();
	}
}