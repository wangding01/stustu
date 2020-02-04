package com.study.demo.demo2020.day0128;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author wangding
 * @date 2020年1月28日 下午1:03:09
 * @Description：函数式接口
 */
public class RunDemo01 {

	public static void main(String[] args) {

		GettingService gettingService = (String msg) -> System.out.println(msg);
		gettingService.sayMsg("1213");

		List<Integer> list = Arrays.asList(1, 2, 3);
		Predicate<Integer> predicate = n -> true;
		System.out.println(predicate.toString());
	}
}
