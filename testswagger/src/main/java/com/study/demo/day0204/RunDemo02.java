package com.study.demo.day0204;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author wangding
 * @date 2020年2月5日 下午3:39:53
 * @Description：测试对象SET
 */
public class RunDemo02 {
	private static final Log log = LogFactory.getLog(RunDemo02.class);

	public static void main(String[] args) {
		Set<SetCollectionBean> set = new HashSet<SetCollectionBean>();
		set.add(new SetCollectionBean("wangding01", "01"));
		set.add(new SetCollectionBean("wangding01", "01"));
		log.info("当前set对象：" + set);
	}
}
