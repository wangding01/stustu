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
public class WalletInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String walletId;
	//
	private String userId;
	//
	private String bankName;
	//
	private String creditCardNumber;
	//
	private String cardholder;
	//
	private BigDecimal accountBalance;
	//
	private String tradePassword;
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
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * 获取：
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * 设置：
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	/**
	 * 获取：
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	/**
	 * 设置：
	 */
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}
	/**
	 * 获取：
	 */
	public String getCardholder() {
		return cardholder;
	}
	/**
	 * 设置：
	 */
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}
	/**
	 * 设置：
	 */
	public void setTradePassword(String tradePassword) {
		this.tradePassword = tradePassword;
	}
	/**
	 * 获取：
	 */
	public String getTradePassword() {
		return tradePassword;
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
