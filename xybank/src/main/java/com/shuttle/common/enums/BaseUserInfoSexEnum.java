package com.shuttle.common.enums;

/**
 * 用户性别
 * @author admin
 *
 */
public enum BaseUserInfoSexEnum {
	/**
	 * 1、男人
	 */
	MAN("1", "男人"),

	/**
	 * 2、女人
	 */
	WOMAN("2", "女人");

	private String code;
	private String name;

	private BaseUserInfoSexEnum(String code, String name) {
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
