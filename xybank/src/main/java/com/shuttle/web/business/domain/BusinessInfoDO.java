package com.shuttle.web.business.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author lisonggen
 * @email lisonggen@maoniuchuxing.net
 * @date 2018-03-20 17:08:44
 */
public class BusinessInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long businessId;
	//商家名称
	private String businessName;
	//商家地址
	private String businessAddress;
	//联系人
	private String contacts;
	//手机
	private String mobilePhone;
	//座机
	private String landline;
	//注册时间
	private Date registrationTime;
	//4种状态：0正常，1销户，2锁定，3异常
	private String businessStatus;
	//密码
	private String password;
	//创建时间
	private Date createTime;
	//
	private String creator;
	//
	private Date updateTime;
	//
	private String updator;
	//
	private String remark;
	//商家所有人id
	private Long ownerId;

	/**
	 * 设置：
	 */
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}
	/**
	 * 获取：
	 */
	public Long getBusinessId() {
		return businessId;
	}
	/**
	 * 设置：商家名称
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	/**
	 * 获取：商家名称
	 */
	public String getBusinessName() {
		return businessName;
	}
	/**
	 * 设置：商家地址
	 */
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}
	/**
	 * 获取：商家地址
	 */
	public String getBusinessAddress() {
		return businessAddress;
	}
	/**
	 * 设置：联系人
	 */
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	/**
	 * 获取：联系人
	 */
	public String getContacts() {
		return contacts;
	}
	/**
	 * 设置：手机
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * 获取：手机
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * 设置：座机
	 */
	public void setLandline(String landline) {
		this.landline = landline;
	}
	/**
	 * 获取：座机
	 */
	public String getLandline() {
		return landline;
	}
	/**
	 * 设置：注册时间
	 */
	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}
	/**
	 * 获取：注册时间
	 */
	public Date getRegistrationTime() {
		return registrationTime;
	}
	/**
	 * 设置：4种状态：0正常，1销户，2锁定，3异常
	 */
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}
	/**
	 * 获取：4种状态：0正常，1销户，2锁定，3异常
	 */
	public String getBusinessStatus() {
		return businessStatus;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * 获取：
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdator(String updator) {
		this.updator = updator;
	}
	/**
	 * 获取：
	 */
	public String getUpdator() {
		return updator;
	}
	/**
	 * 设置：
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：商家所有人id
	 */
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	/**
	 * 获取：商家所有人id
	 */
	public Long getOwnerId() {
		return ownerId;
	}
}
