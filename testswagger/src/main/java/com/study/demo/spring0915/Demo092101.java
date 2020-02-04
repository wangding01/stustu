package com.study.demo.spring0915;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Demo092101 {

	private long startTime;
	private long endTime;

	@Pointcut("execution(* com.study.demo.spring0915.Demo091502.getName())")
	public void aopTest() {

	}

	@Before("execution(* com.study.demo.spring0915.Demo091502.getName())")
	public void beforeAopTest() {
		this.startTime = System.currentTimeMillis();
		System.out.println("beforeAopTest+++++++++++++++++++++++" + startTime);
		System.out.println("开始时间1" + startTime);
	}

	@After("aopTest()")
	public void afterAopTest() {
		this.endTime = System.currentTimeMillis();
		System.out.println("开始时间2" + startTime);
		System.out.println(endTime - startTime + "ms消耗时间" + new Date().getTime());
	}
}
