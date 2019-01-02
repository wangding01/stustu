package com.shuttle.common.enums;

public enum CancelUserType {
	
	CLIENT("1", "乘客"),
	
	DRIVER("2", "司机");
	
	private String code;
	
	private String name;
	
	private CancelUserType(String code, String name) {
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
