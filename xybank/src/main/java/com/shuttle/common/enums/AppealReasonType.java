package com.shuttle.common.enums;

public enum AppealReasonType {

	OVERLOAD_CONTRABAND("1", "乘客超载/带违禁品"),
	
	CLIENT_CANNOT_CONTACT("2", "联系不上乘客"),
	
	INCIVILIZATION("3", "乘客殴打司机或毁坏车辆"),
	
	PLATFORM_CAR_TOO_FAR("4", "派单太远"),
	
	CLIENT_WRONG_ORDER("5", "乘客发错订单"),
	
	CLIENT_NOTIN_BOARDING_POINT("6", "乘客不在上车点"),
	
	REPEATED_ORDERS("7", "重复派单"),
	
	LIMIT_DRIVING_NUMBER("8", "限行限号"),
	
	ROAD_REPAIRING_CLOSURE("9", "修路封路");
	
	private String code;
	
	private String name;
	
	private AppealReasonType(String code, String name) {
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
