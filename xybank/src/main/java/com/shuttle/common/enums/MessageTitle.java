package com.shuttle.common.enums;

public enum MessageTitle {

	SYSTEM("1", "系统消息");
	
	private String code;
	
	private String name;
	
	private MessageTitle(String code, String name) {
		this.code = code;
		this.name= name;
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
