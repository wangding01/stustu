package com.shuttle.common.enums;

public enum AccountTradeRecordPayModeEnum {
	/**
	 * 1、支付宝
	 */
	ALI_PAY("1", "支付宝"),

	/**
	 * 2、微信
	 */

	WECHAT_PAY("2", "微信"),
	/**
	 * 3、现金
	 */
	
	CASH_PAY("3", "现金");

	private String code;
	private String name;

	private AccountTradeRecordPayModeEnum(String code, String name) {
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
