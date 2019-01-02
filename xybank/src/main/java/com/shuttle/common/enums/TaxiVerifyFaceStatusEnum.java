package com.shuttle.common.enums;

public enum TaxiVerifyFaceStatusEnum {

	/**
	 * 1、成功成功
	 */
	FAIL("1", "认证成功"),

	/**
	 * 2、认证失败
	 */
	SUCCESS("2", "认证失败"),

	/**
	 * 3、未发现身份证信息
	 */
	NOT_FOUND_ID_CARD("3", "未发现身份证信息");

	private String code;
	private String name;

	private TaxiVerifyFaceStatusEnum(String code, String name) {
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
