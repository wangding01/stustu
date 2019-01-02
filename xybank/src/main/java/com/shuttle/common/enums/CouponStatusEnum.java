package com.shuttle.common.enums;

public enum CouponStatusEnum {
	/**
	 * 未使用
	 */
	NOT_USED("0", "未使用"),
	/**
	 * 已使用
	 */
	USED("1", "已使用"),
	/**
	 * 已过期
	 */
	EXPIRED("2", "已过期");

	private String code;
	
	private String name;
	
	private CouponStatusEnum (String code, String name) {
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
