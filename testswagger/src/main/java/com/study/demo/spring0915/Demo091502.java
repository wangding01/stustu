package com.study.demo.spring0915;

import java.util.Date;

public class Demo091502 {

	private String name = "demo091502";
	private Date nowDate = new Date();

	public Demo091502() {
		System.out.println("来嘛，构造方法" + this.nowDate);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
