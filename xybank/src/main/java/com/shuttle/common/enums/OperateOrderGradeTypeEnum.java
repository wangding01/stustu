package com.shuttle.common.enums;

public enum OperateOrderGradeTypeEnum {
	/**
	 * 1、乘客给司机评分
	 */
	CLIENT_TO_DRIVER("1", "乘客给司机评分"),

	/**
	 * 2、司机给乘客评分
	 */
	DRIVER_TO_CLIENT("2", "司机给乘客评分");

	private String code;
	private String name;

	private OperateOrderGradeTypeEnum(String code, String name) {
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
