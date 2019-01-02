package com.shuttle.common.enums;

/**
 * 车辆业务类型
 * 
 * @author admin
 *
 */
public enum BusinessTypeEnum {
	/**
	 * 1、出租车
	 */
	TAXI("1", "出租车"),

	/**
	 * 2、快车
	 */
	FAST_CAR("2", "快车");

	private String code;
	private String name;

	private BusinessTypeEnum(String code, String name) {
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
