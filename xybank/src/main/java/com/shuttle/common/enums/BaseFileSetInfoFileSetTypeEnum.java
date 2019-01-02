package com.shuttle.common.enums;

/**
 * 文件集类型
 * 
 * @author admin
 *
 */
public enum BaseFileSetInfoFileSetTypeEnum {

	/**
	 * 1、用户头像
	 */
	USER_HEAD("1", "用户头像"),

	/**
	 * 2、身份证
	 */
	ID_CARD("2", "身份证"),

	/**
	 * 3、驾驶证
	 */
	DRIVER_CARD("3", "驾驶证"),

	/**
	 * 4、行驶证
	 */
	RUN_CARD("4", "行驶证"),

	/**
	 * 5、车辆全身照
	 */
	VEHICLE_FULL("5", "车辆全身照");

	private String code;
	private String name;

	private BaseFileSetInfoFileSetTypeEnum(String code, String name) {
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
