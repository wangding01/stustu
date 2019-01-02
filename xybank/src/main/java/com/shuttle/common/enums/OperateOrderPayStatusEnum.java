package com.shuttle.common.enums;

public enum OperateOrderPayStatusEnum {
	/**
	 * 1、未支付
	 */
	NO_PAY("1", "未支付"),

	/**
	 * 2、已支付
	 */

	PAID("2", "已支付"),
	/**
	 * 3、未发起收款
	 */
	RECEIVABLES("3", "未发起收款");

	private String code;
	private String name;

	private OperateOrderPayStatusEnum(String code, String name) {
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
