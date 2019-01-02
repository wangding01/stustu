package com.shuttle.common.enums;

public enum CancelReasonType {
	
	CHANGE_ROUTE_NONEED_CAR("1", "行程有变，无需用车"),
	
	PLATFORM_CAR_TOO_FAR("2", "平台派单太远"),
	
	CANNOT_CONTACT_DRIVER("3", "联系不上司机"),
	
	PRICE_INCREASE_CASH_PAYMENT("4", "司机要求加价或现金支付");
	
	private String code;
	
	private String name;

	private CancelReasonType(String code, String name) {
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
