package com.shuttle.common.enums;

public enum AccountApplicationTreateStatusEnum {

	/**
	 * 1、待处理
	 */
	PENDING("1", "待处理"),

	/**
	 * 2、处理中
	 */
	PROCESSING("2", "处理中"),

	/**
	 * 3、已处理
	 */
	SOLVED("3", "已处理");

	private String code;
	private String name;

	private AccountApplicationTreateStatusEnum(String code, String name) {
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
