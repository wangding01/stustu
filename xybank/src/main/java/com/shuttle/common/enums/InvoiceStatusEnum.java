package com.shuttle.common.enums;

public enum InvoiceStatusEnum {

	NO_INVOICE("0", "未开发票"),
	
	INVOICED("1", "已开发票");
	
	private String code;
	
	private String name;
	
	private InvoiceStatusEnum(String code, String name){
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
