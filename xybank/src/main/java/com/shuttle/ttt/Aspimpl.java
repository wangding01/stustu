package com.shuttle.ttt;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspimpl {
	private long start;
	private long end;

	@Pointcut("@annotation(mu)")
	private void cut(Mu mu) {
	}

	// 开始环绕   
//	@Around("cut(mu)")
//	public void around(ProceedingJoinPoint joinPoint, Mu mu) throws Throwable {
//		System.out.println("1");
//		try {
//			joinPoint.proceed();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("4");
//	}

	@Before("cut(mu)")
	public void before(Mu mu) {
		start = System.currentTimeMillis();
		System.out.println("2");
	}

	@After("cut(mu)")
	public void after(Mu mu) {
		end = System.currentTimeMillis();
		System.out.println("开始时间:" + start + "\n" + "结束时间：" + end);
	}
}
