package com.shuttle.common.enums;

/**
 * 用户状态
 * 
 * @author admin
 *
 */
public enum BaseUserInfoUserStatusEnum {
	/**
	 * 1、正常
	 */
	NORMAL("1", "正常"),

	/**
	 * 2、 锁定
	 */
	LOCK("2", "锁定"),

	/**
	 * 3 、停用
	 */
	DISABLE("3", "停用"),

	/**
	 * 4 、注销
	 */
	LOGOUT("4", "注销"),

	/**
	 * 5 、未填写资料
	 */
	NOT_WRITE_DATA("5", "未填写资料"),

	/**
	 * 6 、未激活
	 */
	NOT_ACTIVE("6", "未激活");

	private String code;
	private String name;

	private BaseUserInfoUserStatusEnum(String code, String name) {
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
