package com.shuttle.common.enums;

public enum IncomeExpendTypeEnum {
	/**
	 * 1、收入
	 */
	INCOME("1", "收入"),

	/**
	 * 2、支出
	 */
	EXPEND("2", "支出"),
	/**
	 * 3、全部
	 */
	ALL("3", "全部");

	private String code;
	private String name;

	private IncomeExpendTypeEnum(String code, String name) {
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
