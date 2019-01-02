package com.shuttle.common.enums;

public enum CostType {
	/**
	 * 里程
	 */
	MILEAGE("1", "里程{1}公里"),
	/**
	 * 超里程
	 */
	SUPER_MILEAGE("2", "超里程{1}公里"),
	/**
	 * 时长
	 */
	TIME("3", "时长{1}分钟"),
	/**
	 * 夜间
	 */
	NIGHT("4", "夜间时段"),
	/**
	 * 高速
	 */
	HIGHWAY("5", "高速费"),
	/**
	 * 路桥
	 */
	TOLL_CHARGE("6", "路桥费"),
	/**
	 * 停车
	 */
	PARKING_FEE("7", "停车费"),
	/**
	 * 取消订单
	 */
	CANCEL_ORDER("8", "取消订单费"),
	/**
	 * 其他
	 */
	OTHERS("9", "最低消费");
	
	private String code;
	
	private String name;
	
	private CostType(String code, String name) {
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
