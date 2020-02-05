package com.study.demo.day0204;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author wangding
 * @date 2020年2月4日 下午2:16:27
 * @Description：SET的使用
 */
public class RunDemo01 {
	private static final Log log = LogFactory.getLog(RunDemo01.class);

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("demo1");
		set.add("demo2");
		log.info("SET的值为：" + set);
		boolean b = set.add("demo2");
		log.info("boolean的值为：" + b);
		set.add("demo3");
		log.info("最终集合：" + set);
		for (String string : set) {
			log.info(string);
		}
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			log.info(it.next());
		}
	}
}
