package com.shuttle.common.enums;

public enum PaymentMethodEnum {
	/**
	 * 1、线上支付
	 */
	ONLINE("1", "线上支付"),

	/**
	 * 2、线下支付
	 */

	OFFLINE("2", "线下支付");

	private String code;
	private String name;

	private PaymentMethodEnum(String code, String name) {
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
