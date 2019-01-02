package com.shuttle.common.enums;

public enum InvoiceTypeEnum {

	/**
	 * 0、电子发票
	 */
	E_INVOICE("0", "电子发票"),

	/**
	 * 1、纸质发票
	 */

	PAPER_INVOICE("1", "纸质发票");
	
	private String code;
	private String name;
	
	private InvoiceTypeEnum(String code, String name) {
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
