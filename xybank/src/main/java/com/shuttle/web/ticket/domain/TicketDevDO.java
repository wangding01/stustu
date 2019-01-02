package com.shuttle.web.ticket.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author malin
 * @email dongao@maoniuchuxing.net
 * @date 2018-03-23 17:33:04
 */
public class TicketDevDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//
	private String ticketId;
	//
	private String clientId;
	//
	private String mobileNumber;
	//
	private Long qrCodeId;
	//
	private String ticketType;
	//
	private String stationType;
	//
	private Integer passengerNumber;
	//
	private Date buyTicketsTime;
	//
	private Date startTime;
	//
	private Date endTime;
	//
	private Date useTime;
	//
	private String startLocationId;
	//
	private String startName;
	//
	private String startAddress;
	//
	private BigDecimal startLongitude;
	//
	private BigDecimal startLatitude;
	//
	private BigDecimal startDirection;
	//
	private String endLocationId;
	//
	private String endName;
	//
	private String endAddress;
	//
	private BigDecimal endLongitude;
	//
	private BigDecimal endLatitude;
	//
	private BigDecimal endDirection;
	//
	private String ticketStatus;
	//
	private String payStatus;
	//
	private BigDecimal amountPayment;
	//
	private String assessStatus;
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
	// 车票来源：1-移动端用户；2-分销系统商户
	private String source;
	// 分销系统商品id
	private Long productId;
	// 分销系统商品渠道价格单价（单位：元）
	private BigDecimal productSalePrice;

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	/**
	 * 设置：
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * 获取：
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * 设置：
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * 获取：
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * 设置：
	 */
	public void setQrCodeId(Long qrCodeId) {
		this.qrCodeId = qrCodeId;
	}

	/**
	 * 获取：
	 */
	public Long getQrCodeId() {
		return qrCodeId;
	}

	/**
	 * 设置：
	 */
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	/**
	 * 获取：
	 */
	public String getTicketType() {
		return ticketType;
	}

	/**
	 * 设置：
	 */
	public void setStationType(String stationType) {
		this.stationType = stationType;
	}

	/**
	 * 获取：
	 */
	public String getStationType() {
		return stationType;
	}

	/**
	 * 设置：
	 */
	public void setPassengerNumber(Integer passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

	/**
	 * 获取：
	 */
	public Integer getPassengerNumber() {
		return passengerNumber;
	}

	/**
	 * 设置：
	 */
	public void setBuyTicketsTime(Date buyTicketsTime) {
		this.buyTicketsTime = buyTicketsTime;
	}

	/**
	 * 获取：
	 */
	public Date getBuyTicketsTime() {
		return buyTicketsTime;
	}

	/**
	 * 设置：
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * 获取：
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * 设置：
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * 获取：
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * 设置：
	 */
	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	/**
	 * 获取：
	 */
	public Date getUseTime() {
		return useTime;
	}

	/**
	 * 设置：
	 */
	public void setStartLocationId(String startLocationId) {
		this.startLocationId = startLocationId;
	}

	/**
	 * 获取：
	 */
	public String getStartLocationId() {
		return startLocationId;
	}

	/**
	 * 设置：
	 */
	public void setStartName(String startName) {
		this.startName = startName;
	}

	/**
	 * 获取：
	 */
	public String getStartName() {
		return startName;
	}

	/**
	 * 设置：
	 */
	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}

	/**
	 * 获取：
	 */
	public String getStartAddress() {
		return startAddress;
	}

	/**
	 * 设置：
	 */
	public void setStartLongitude(BigDecimal startLongitude) {
		this.startLongitude = startLongitude;
	}

	/**
	 * 获取：
	 */
	public BigDecimal getStartLongitude() {
		return startLongitude;
	}

	/**
	 * 设置：
	 */
	public void setStartLatitude(BigDecimal startLatitude) {
		this.startLatitude = startLatitude;
	}

	/**
	 * 获取：
	 */
	public BigDecimal getStartLatitude() {
		return startLatitude;
	}

	/**
	 * 设置：
	 */
	public void setStartDirection(BigDecimal startDirection) {
		this.startDirection = startDirection;
	}

	/**
	 * 获取：
	 */
	public BigDecimal getStartDirection() {
		return startDirection;
	}

	/**
	 * 设置：
	 */
	public void setEndLocationId(String endLocationId) {
		this.endLocationId = endLocationId;
	}

	/**
	 * 获取：
	 */
	public String getEndLocationId() {
		return endLocationId;
	}

	/**
	 * 设置：
	 */
	public void setEndName(String endName) {
		this.endName = endName;
	}

	/**
	 * 获取：
	 */
	public String getEndName() {
		return endName;
	}

	/**
	 * 设置：
	 */
	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}

	/**
	 * 获取：
	 */
	public String getEndAddress() {
		return endAddress;
	}

	/**
	 * 设置：
	 */
	public void setEndLongitude(BigDecimal endLongitude) {
		this.endLongitude = endLongitude;
	}

	/**
	 * 获取：
	 */
	public BigDecimal getEndLongitude() {
		return endLongitude;
	}

	/**
	 * 设置：
	 */
	public void setEndLatitude(BigDecimal endLatitude) {
		this.endLatitude = endLatitude;
	}

	/**
	 * 获取：
	 */
	public BigDecimal getEndLatitude() {
		return endLatitude;
	}

	/**
	 * 设置：
	 */
	public void setEndDirection(BigDecimal endDirection) {
		this.endDirection = endDirection;
	}

	/**
	 * 获取：
	 */
	public BigDecimal getEndDirection() {
		return endDirection;
	}

	/**
	 * 设置：
	 */
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	/**
	 * 获取：
	 */
	public String getTicketStatus() {
		return ticketStatus;
	}

	/**
	 * 设置：
	 */
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	/**
	 * 获取：
	 */
	public String getPayStatus() {
		return payStatus;
	}

	/**
	 * 设置：
	 */
	public void setAmountPayment(BigDecimal amountPayment) {
		this.amountPayment = amountPayment;
	}

	/**
	 * 获取：
	 */
	public BigDecimal getAmountPayment() {
		return amountPayment;
	}

	/**
	 * 设置：
	 */
	public void setAssessStatus(String assessStatus) {
		this.assessStatus = assessStatus;
	}

	/**
	 * 获取：
	 */
	public String getAssessStatus() {
		return assessStatus;
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

	/**
	 * 设置：车票来源：1-移动端用户；2-分销系统商户
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * 获取：车票来源：1-移动端用户；2-分销系统商户
	 */
	public String getSource() {
		return source;
	}

	/**
	 * 设置：分销系统商品id
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * 获取：分销系统商品id
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * 设置：分销系统商品渠道价格单价（单位：元）
	 */
	public void setProductSalePrice(BigDecimal productSalePrice) {
		this.productSalePrice = productSalePrice;
	}

	/**
	 * 获取：分销系统商品渠道价格单价（单位：元）
	 */
	public BigDecimal getProductSalePrice() {
		return productSalePrice;
	}
}
