package com.study.demo.spring0915;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo091503 {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("SpringBean091501.xml");
		Demo091502 demo09150201 = (Demo091502) ap.getBean("demo091502");
		System.out.println(demo09150201.getName());
	}
}
