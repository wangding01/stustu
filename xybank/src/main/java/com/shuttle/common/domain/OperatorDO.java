package com.shuttle.common.domain;

import java.io.Serializable;

/**
 * 用于绑定操作人员   因为操作人可能是用户本人也可能是系统管理人员 
 * @author dongao
 * 2018-2-6 10:35:50
 */
public class OperatorDO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//用户id或者系统管理人员id
	private String id;
	
	//0表示系统管理人员  1表示用户本人
	private String type;
	
	//操作人员的真实姓名
	private String name;
	
	public OperatorDO() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
