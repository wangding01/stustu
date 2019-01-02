package com.shuttle.web.product.domain;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * 商品
 * 
 * @author malin
 * @email dongao@maoniuchuxing.net
 * @date 2018-03-20 17:48:48
 */
public class ProductDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//
	private String id;
	// 名称
	private String name;
	// 服务类型
	private String serviceType;
	// 上架时间
	private Date shelfTime;
	// 市场价
	private Integer primeCost;
	// 渠道价
	private Integer salePrice;
	// 创建人
	private String creator;
	// 创建时间
	private Date createTime;
	// 修改时间
	private Date updateTime;
	// 更新人
	private String updator;
	// 备注
	private String remark;
	// 商户id
	private Long businessId;

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	/**
	 * 设置：名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取：名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置：服务类型
	 */
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * 获取：服务类型
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * 设置：上架时间
	 */
	public void setShelfTime(Date shelfTime) {
		this.shelfTime = shelfTime;
	}

	/**
	 * 获取：上架时间
	 */
	public Date getShelfTime() {
		return shelfTime;
	}

	/**
	 * 设置：市场价
	 */
	public void setPrimeCost(Integer primeCost) {
		this.primeCost = primeCost;
	}

	/**
	 * 获取：市场价
	 */
	public Integer getPrimeCost() {
		return primeCost;
	}

	/**
	 * 设置：渠道价
	 */
	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * 获取：渠道价
	 */
	public Integer getSalePrice() {
		return salePrice;
	}

	/**
	 * 设置：创建人
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * 获取：创建人
	 */
	public String getCreator() {
		return creator;
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
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置：更新人
	 */
	public void setUpdator(String updator) {
		this.updator = updator;
	}

	/**
	 * 获取：更新人
	 */
	public String getUpdator() {
		return updator;
	}

	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}

}
