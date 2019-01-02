package com.shuttle.common.enums;

public enum AppealType {

	ORDER("1", "订单申诉"),
	
	DEDUCTION("2", "扣费申诉");
	
	private String code;
	
	private String name;
	
	private AppealType(String code, String name) {
		this.code = code;
		this.name= name;
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
