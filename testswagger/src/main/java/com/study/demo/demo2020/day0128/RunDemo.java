package com.study.demo.demo2020.day0128;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author wangding
 * @date 2020年1月28日 下午12:28:49
 * @Description：方法引用通过方法的名字来指向一个方法。
 * 
 * 									方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
 * 
 *                                  方法引用使用一对冒号 :: 。
 */
public class RunDemo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		List<String> names1 = new ArrayList<String>();
		names.add("Google");
		names.add("Runoob");
		names.add("Taobao");
		names.add("Baidu");
		names.add("Sina");

		names.forEach(names1::add);
		names1.forEach(System.out::println);
	}

}
