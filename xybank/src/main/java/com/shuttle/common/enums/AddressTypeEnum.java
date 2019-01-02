package com.shuttle.common.enums;

public enum AddressTypeEnum {

	HOME("1", "家"),
	
	COMPANY("2", "公司");
	
	private String code;
	
	private String name;
	
	private AddressTypeEnum(String code, String name) {
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
