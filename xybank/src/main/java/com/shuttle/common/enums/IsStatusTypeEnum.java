package com.shuttle.common.enums;

/**
 * IS状态类型
 * 
 * @author quan
 *
 */
public enum IsStatusTypeEnum {
	/**
	 * 0、否
	 */
	NO("0", "否"),

	/**
	 * 1、是
	 */
	YES("1", "是");

	private String code;
	private String name;

	private IsStatusTypeEnum(String code, String name) {
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
