package com.shuttle.common.enums;

/**
 * 实名验证
 * 
 * @author admin
 *
 */
public enum BaseUserInfoRealVerifyEnum {
	/**
	 * 0、待审核
	 */
	PENDING("0", "待审核"),

	/**
	 * 1、 通过
	 */
	PASS("1", "通过"),

	/**
	 * 2 、未通过
	 */
	NOT_PASS("2", "未通过");


	private String code;
	private String name;

	private BaseUserInfoRealVerifyEnum(String code, String name) {
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
