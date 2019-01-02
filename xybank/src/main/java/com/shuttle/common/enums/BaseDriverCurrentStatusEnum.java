package com.shuttle.common.enums;

public enum BaseDriverCurrentStatusEnum {
	/**
	 * 1、未出车
	 */
	NOT_TRAVEL ("1", "未出车"),

	/**
	 * 2、出车中
	 */
	TRAVEL ("2", "出车中"),

	/**
	 * 3、行程中
	 */
	ROUTING("3", "行程中");

	private String code;
	private String name;

	private BaseDriverCurrentStatusEnum(String code, String name) {
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
