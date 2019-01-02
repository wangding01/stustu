package com.shuttle.common.enums;

public enum WithdrawsCashStatusEnum {
	/**
	 * 0、服务器异常
	 */
	FAIL("0", "提现失败"),

	/**
	 * 1、提现成功
	 */
	SUCCESS("1", "提现成功"),
	/**
	 * 2、余额不足
	 */
	INSUFFICIENT_BALANCE("2", "余额不足"),
	/**
	 * 3、当前非提现日
	 */
	NOT_THE_CURRENT_DAY("3", "当前非提现日"),
	/**
	 * 4、当前系统时间已超过提现时间
	 */
	NOT_THE_CURRENT_DATE("4", "当前系统时间已超过提现时间"),
	/**
	 * 5、交易密码错误
	 */
	PASSWORD_ERROR("5", "交易密码错误");

	private String code;
	private String name;

	private WithdrawsCashStatusEnum(String code, String name) {
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
