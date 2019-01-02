package com.shuttle.common.enums;

public enum DriverTagEnum {

	/**
	 * 1、认路会导航
	 */
	ROAD_MAP("1", "认路会导航"),
	
	/**
	 * 2、安静有礼貌
	 */
	QUITE_POLITE("2", "安静有礼貌"),
	
	/**
	 * 3、安全又平稳
	 */
	SAFE_STABLE("3", "安全又平稳"),
	
	/**
	 * 4、干净无异味
	 */
	CLEAN_NO_SMELL("4", "干净无异味"),
	
	/**
	 * 5、司机抽烟
	 */
	SMOKING("5", "司机抽烟"),
	
	/**
	 * 6、态度恶劣
	 */
	BAD_ATTITUDE("6", "态度恶劣"),
	
	/**
	 * 7、打电话
	 */
	PHONE("7", "打电话"),
	
	/**
	 * 8、开车太急
	 */
	FASE_DRIVING("8", "开车太急"),
	
	/**
	 * 9、车辆不符
	 */
	WRONG_VEHICLE("9", "车辆不符");
	
	private String code;
	private String name;
	
	private DriverTagEnum(String code, String name) {
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
