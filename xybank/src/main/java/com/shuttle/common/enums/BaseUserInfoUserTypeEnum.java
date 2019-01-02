package com.shuttle.common.enums;

/**
 * 用户类型
 * 
 * @author admin
 *
 */
public enum BaseUserInfoUserTypeEnum {
	/**
	 * 1、乘客
	 */
	CLIENT("1", "乘客"),

	/**
	 * 2、司机
	 */
	DRIVER("2", "司机");

	private String code;
	private String name;

	private BaseUserInfoUserTypeEnum(String code, String name) {
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
