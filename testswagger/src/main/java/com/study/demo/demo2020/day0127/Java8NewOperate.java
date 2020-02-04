package com.study.demo.demo2020.day0127;

/**
 * 
 * @author wangding
 * @date 2020年1月27日 下午9:49:17
 * @Description：java8新特新 Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
 * 
 *                       Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
 * 
 *                       使用 Lambda 表达式可以使代码变的更加简洁紧凑。
 */
public class Java8NewOperate {

	public static void main(String[] args) {

		MathOperation mathOperation = new MathOperationImpl();
		mathOperation.add(0, 0);
		MathOperation mathOperation01 = (int a, int b) -> a + b;
		System.out.println(mathOperation01.add(1, 2));
		System.out.println();
	}

}
