package com.study.demo.day1119;

import org.springframework.stereotype.Service;

@Service
public class OperateImpl1 implements OperateInterface {

	@Override
	public void eat() {
		System.out.println("这是实现方法1");

	}

}
