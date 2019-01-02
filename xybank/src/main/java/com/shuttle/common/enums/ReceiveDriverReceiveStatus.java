package com.shuttle.common.enums;

/**
 * 司机接单状态
 * 
 * @author quan
 *
 */
public enum ReceiveDriverReceiveStatus {

	/**
	 * 1、开始接单
	 */
	START_RECEIVE_ORDER("1", "开始接单"),

	/**
	 * 2、待确认
	 */
	WAIT_CONFIRM("2", "待确认"),

	/**
	 * 3、已确认
	 */
	CONFIRMED("3", "已确认"),

	/**
	 * 4、行程中
	 */
	ON_ROUTE("4", "行程中");

	private String code;
	private String name;

	private ReceiveDriverReceiveStatus(String code, String name) {
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
