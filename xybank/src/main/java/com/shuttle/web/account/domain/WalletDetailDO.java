package com.shuttle.web.account.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 
 * 
 * @author dongao
 * @email dongao@maoniuchuxing.net
 * @date 2018-02-11 15:34:42
 */
public class WalletDetailDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String walletDetailId;
	//
	private String walletId;
	//
	private String incomeExpendType;
	//
	private String payMode;
	//
	private BigDecimal incomeExpendMoney;
	//
	private Date generateTime;
	//
	private String incomeExpendDescription;
	//
	private Date createTime;
	//
	private String creator;
	//
	private Date updateTime;
	//
	private String updator;
	//
	private String remark;

	/**
	 * 设置：
	 */
	public void setWalletDetailId(String walletDetailId) {
		this.walletDetailId = walletDetailId;
	}
	/**
	 * 获取：
	 */
	public String getWalletDetailId() {
		return walletDetailId;
	}
	/**
	 * 设置：
	 */
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}
	/**
	 * 获取：
	 */
	public String getWalletId() {
		return walletId;
	}
	/**
	 * 设置：
	 */
	public void setIncomeExpendType(String incomeExpendType) {
		this.incomeExpendType = incomeExpendType;
	}
	/**
	 * 获取：
	 */
	public String getIncomeExpendType() {
		return incomeExpendType;
	}
	/**
	 * 设置：
	 */
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	/**
	 * 获取：
	 */
	public String getPayMode() {
		return payMode;
	}
	/**
	 * 设置：
	 */
	public void setIncomeExpendMoney(BigDecimal incomeExpendMoney) {
		this.incomeExpendMoney = incomeExpendMoney;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getIncomeExpendMoney() {
		return incomeExpendMoney;
	}
	/**
	 * 设置：
	 */
	public void setGenerateTime(Date generateTime) {
		this.generateTime = generateTime;
	}
	/**
	 * 获取：
	 */
	public Date getGenerateTime() {
		return generateTime;
	}
	/**
	 * 设置：
	 */
	public void setIncomeExpendDescription(String incomeExpendDescription) {
		this.incomeExpendDescription = incomeExpendDescription;
	}
	/**
	 * 获取：
	 */
	public String getIncomeExpendDescription() {
		return incomeExpendDescription;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
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
}
