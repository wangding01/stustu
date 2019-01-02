package com.shuttle.common.enums;

/**
 * 订单状态
 * 
 * @author quan
 *
 */
public enum OrderStatusEnum {
	/**
	 * 1、预约成功
	 */
	APPOINTMENT_SUCCESS("1", "预约成功"),

	/**
	 * 2、行程中
	 */
	ON_ROUTE("2", "行程中"),

	/**
	 * 3、已完成
	 */
	COMPLETED("3", "已完成"),

	/**
	 * 4、乘客已取消
	 */
	CLIENT_CANCELED("4", "已取消"),

	/**
	 * 5、司机已取消
	 */
	DRIVER_CANCELED("5", "已取消");

	private String code;
	private String name;

	private OrderStatusEnum(String code, String name) {
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
