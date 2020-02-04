package com.study.demo.demo2020.day0128;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author wangding
 * @date 2020年1月28日 下午4:49:16
 * @Description：Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据。
 */
public class RunDemo03 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("1", "2", "3", "4", "");
		System.out.println("计算总数：" + list.stream().count());
		list.stream().filter(String -> !String.isEmpty()).forEach(System.out::printf);
		long x = list.stream().filter(String -> String.isEmpty()).count();
		System.out.println("x" + x);

//		list.stream().forEachOrdered(System.out::printf);
//		Random random = new Random();
//		random.ints().limit(10).forEach(System.out::println);
//		System.out.println("--------------");
//		System.out.println(random.ints().limit(10).findFirst());
	}
}
