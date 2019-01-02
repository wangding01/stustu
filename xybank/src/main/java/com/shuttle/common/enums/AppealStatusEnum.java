package com.shuttle.common.enums;

public enum AppealStatusEnum {
	/**
	 * 待处理
	 */
	DEAL_WITH("1", "待处理"),
	/**
	 * 处理中
	 */
	DOING_WITH("2", "处理中"),
	/**
	 * 已处理
	 */
	DEAL_DONE("3", "已处理");

	private String code;

	private String name;

	private AppealStatusEnum(String code, String name) {
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
