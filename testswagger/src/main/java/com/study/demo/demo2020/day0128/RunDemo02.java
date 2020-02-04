package com.study.demo.demo2020.day0128;

/**
 * 
 * @author wangding
 * @date 2020年1月28日 下午2:39:13
 * @Description：默认方法
 */
public class RunDemo02 {

	public static void main(String[] args) {
		DefaultInterface defaultInterface = new DefaultInterfaceImpl();
		defaultInterface.one();
		defaultInterface.two();
		new DefaultInterfaceImpl().defaultInterface();
	}

}
