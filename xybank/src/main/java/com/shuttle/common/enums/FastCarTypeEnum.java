package com.shuttle.common.enums;

/**
 * 快车类型
 * 
 * @author quan
 *
 */
public enum FastCarTypeEnum {

	/**
	 * 1、实时
	 */
	REAL_TIME("1", "实时"),

	/**
	 * 2、预约
	 */
	APPOINTMENT("2", "预约"),

	/**
	 * 3、全部
	 */
	ALL("3", "全部");

	private String code;
	private String name;

	private FastCarTypeEnum(String code, String name) {
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
