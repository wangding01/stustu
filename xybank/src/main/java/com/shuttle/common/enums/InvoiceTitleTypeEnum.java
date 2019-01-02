package com.shuttle.common.enums;

public enum InvoiceTitleTypeEnum {

	/**
	 * 0、企业
	 */
	ENTERPRISE("0", "企业"),

	/**
	 * 1、个人
	 */

	PERSONAL("1", "个人");
	
	private String code;
	private String name;
	
	private InvoiceTitleTypeEnum(String code, String name) {
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
