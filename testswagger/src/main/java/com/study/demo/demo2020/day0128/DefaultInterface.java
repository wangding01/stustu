package com.study.demo.demo2020.day0128;

public interface DefaultInterface {
	default void one() {
		System.out.println("这是接口一");
	};

	default void two() {
		System.out.println("这是接口2");
	}

}
