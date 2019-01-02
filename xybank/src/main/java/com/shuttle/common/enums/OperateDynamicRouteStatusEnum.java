package com.shuttle.common.enums;

/**
 * 行程状态
 * 
 * @author quan
 *
 */
public enum OperateDynamicRouteStatusEnum {
	/**
	 * 1、收到订单
	 */
	RECEIVE_ORDER("1", "收到订单"),

	/**
	 * 2、开始接乘客
	 */
	START_RECEIVE("2", "开始接乘客"),

	/**
	 * 3、行程中
	 */
	ON_ROUTE("3", "行程中");

	private String code;
	private String name;

	private OperateDynamicRouteStatusEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
