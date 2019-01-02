package com.shuttle.common.enums;

public enum MessageTypeEnum {
	/**
	 * 系统消息表
	 */
	SYSTEM("1", "系统消息"),

	/**
	 * 预约信息表
	 */
	APPOINTMENT("2", "预约信息表");

	private String code;

	private String name;

	private MessageTypeEnum(String code, String name) {
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
