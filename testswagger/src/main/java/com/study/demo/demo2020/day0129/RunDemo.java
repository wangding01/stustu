package com.study.demo.demo2020.day0129;

import java.util.Optional;

/**
 * 
 * @author wangding
 * @date 2020年1月29日 上午11:51:44
 * @Description：Optional 类是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。
 * 
 *                       Optional
 *                       是个容器：它可以保存类型T的值，或者仅仅保存null。Optional提供很多有用的方法，这样我们就不用显式进行空值检测。
 * 
 *                       Optional 类的引入很好的解决空指针异常。
 */
public class RunDemo {

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = null;
		Optional<Integer> a = Optional.ofNullable(x1);
		Optional<Integer> b = Optional.ofNullable(x2);
		System.out.println(a.get());
//		System.out.println(b.get());
		System.out.println(b.isPresent());
	}
}
