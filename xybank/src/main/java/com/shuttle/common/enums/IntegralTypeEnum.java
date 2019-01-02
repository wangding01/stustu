package com.shuttle.common.enums;

public enum IntegralTypeEnum {

	DOWNLOAD("1", "下载赠送"),
	
	ROUTE_GIVING("2", "行程赠送"),
	
	FEE_DEDUCTION("3", "路费抵扣");
	
	private String code;
	
	private String name;
	
	private IntegralTypeEnum(String code, String name) {
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
