package com.shuttle.web.bank.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author dongao
 * @email dongao@maoniuchuxing.net
 * @date 2019-01-03 14:28:35
 */
public class BankDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer id;
	//贷款方式（1.房贷2.保单3.车贷4.全款房信贷5.同行贷6.生意贷7.抵押贷8.全川车子抵押贷）
	private Integer loan;
	//放款银行
	private String lendingBank;
	//天/利息（基本单位元）
	private Double dayInterst;
	//最小利息（基本单位为厘）
	private Integer minInterest;
	//最大利息（基本单位为厘）
	private Integer maxInterest;
	//地区范围
	private String area;
	//最大额度(单位为元）
	private Integer maxLendingLines;
	//最小额度(单位为元）
	private Integer minLendingLines;
	//期限
	private String lendingLimit;
	//准入条件
	private String access;
	//征信条件
	private String creditConditions;
	//年龄min
	private Integer minAge;
	//年龄max
	private Integer maxAge;
	//放款时间
	private String lendingTime;
	//手续费
	private String poundage;
	//放大倍数
	private String magnification;
	//劣势
	private String disadvantage;
	//优势
	private String advantage;
	//特殊要求
	private String specialRequirements;
	//抵押类型
	private Integer mortgageType;
	//还款方式
	private Integer reimbursementMeans;
	//放款比例
	private Integer lendingRate;
	//需要资料
	private String needInformation;
	//房龄要求
	private String hoseAge;
	//客户要求
	private String customerRequest;
	//流程
	private String process;
	//是否压证
	private Integer needCertificates;
	//评估公证费
	private String evaluateNotaryFees;
	//是否看名族
	private Integer needNational;
	//返点
	private Integer rebates;
	//GPS费用
	private String gpsFees;
	//联系人
	private String contact;
	//联系人电话
	private String contactPhone;
	//签约方式
	private String contractWay;

	/**
	 * 设置：主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：贷款方式（1.房贷2.保单3.车贷4.全款房信贷5.同行贷6.生意贷7.抵押贷8.全川车子抵押贷）
	 */
	public void setLoan(Integer loan) {
		this.loan = loan;
	}
	/**
	 * 获取：贷款方式（1.房贷2.保单3.车贷4.全款房信贷5.同行贷6.生意贷7.抵押贷8.全川车子抵押贷）
	 */
	public Integer getLoan() {
		return loan;
	}
	/**
	 * 设置：放款银行
	 */
	public void setLendingBank(String lendingBank) {
		this.lendingBank = lendingBank;
	}
	/**
	 * 获取：放款银行
	 */
	public String getLendingBank() {
		return lendingBank;
	}
	/**
	 * 设置：天/利息（基本单位元）
	 */
	public void setDayInterst(Double dayInterst) {
		this.dayInterst = dayInterst;
	}
	/**
	 * 获取：天/利息（基本单位元）
	 */
	public Double getDayInterst() {
		return dayInterst;
	}
	/**
	 * 设置：最小利息（基本单位为厘）
	 */
	public void setMinInterest(Integer minInterest) {
		this.minInterest = minInterest;
	}
	/**
	 * 获取：最小利息（基本单位为厘）
	 */
	public Integer getMinInterest() {
		return minInterest;
	}
	/**
	 * 设置：最大利息（基本单位为厘）
	 */
	public void setMaxInterest(Integer maxInterest) {
		this.maxInterest = maxInterest;
	}
	/**
	 * 获取：最大利息（基本单位为厘）
	 */
	public Integer getMaxInterest() {
		return maxInterest;
	}
	/**
	 * 设置：地区范围
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * 获取：地区范围
	 */
	public String getArea() {
		return area;
	}
	/**
	 * 设置：最大额度(单位为元）
	 */
	public void setMaxLendingLines(Integer maxLendingLines) {
		this.maxLendingLines = maxLendingLines;
	}
	/**
	 * 获取：最大额度(单位为元）
	 */
	public Integer getMaxLendingLines() {
		return maxLendingLines;
	}
	/**
	 * 设置：最小额度(单位为元）
	 */
	public void setMinLendingLines(Integer minLendingLines) {
		this.minLendingLines = minLendingLines;
	}
	/**
	 * 获取：最小额度(单位为元）
	 */
	public Integer getMinLendingLines() {
		return minLendingLines;
	}
	/**
	 * 设置：期限
	 */
	public void setLendingLimit(String lendingLimit) {
		this.lendingLimit = lendingLimit;
	}
	/**
	 * 获取：期限
	 */
	public String getLendingLimit() {
		return lendingLimit;
	}
	/**
	 * 设置：准入条件
	 */
	public void setAccess(String access) {
		this.access = access;
	}
	/**
	 * 获取：准入条件
	 */
	public String getAccess() {
		return access;
	}
	/**
	 * 设置：征信条件
	 */
	public void setCreditConditions(String creditConditions) {
		this.creditConditions = creditConditions;
	}
	/**
	 * 获取：征信条件
	 */
	public String getCreditConditions() {
		return creditConditions;
	}
	/**
	 * 设置：年龄min
	 */
	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}
	/**
	 * 获取：年龄min
	 */
	public Integer getMinAge() {
		return minAge;
	}
	/**
	 * 设置：年龄max
	 */
	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}
	/**
	 * 获取：年龄max
	 */
	public Integer getMaxAge() {
		return maxAge;
	}
	/**
	 * 设置：放款时间
	 */
	public void setLendingTime(String lendingTime) {
		this.lendingTime = lendingTime;
	}
	/**
	 * 获取：放款时间
	 */
	public String getLendingTime() {
		return lendingTime;
	}
	/**
	 * 设置：手续费
	 */
	public void setPoundage(String poundage) {
		this.poundage = poundage;
	}
	/**
	 * 获取：手续费
	 */
	public String getPoundage() {
		return poundage;
	}
	/**
	 * 设置：放大倍数
	 */
	public void setMagnification(String magnification) {
		this.magnification = magnification;
	}
	/**
	 * 获取：放大倍数
	 */
	public String getMagnification() {
		return magnification;
	}
	/**
	 * 设置：劣势
	 */
	public void setDisadvantage(String disadvantage) {
		this.disadvantage = disadvantage;
	}
	/**
	 * 获取：劣势
	 */
	public String getDisadvantage() {
		return disadvantage;
	}
	/**
	 * 设置：优势
	 */
	public void setAdvantage(String advantage) {
		this.advantage = advantage;
	}
	/**
	 * 获取：优势
	 */
	public String getAdvantage() {
		return advantage;
	}
	/**
	 * 设置：特殊要求
	 */
	public void setSpecialRequirements(String specialRequirements) {
		this.specialRequirements = specialRequirements;
	}
	/**
	 * 获取：特殊要求
	 */
	public String getSpecialRequirements() {
		return specialRequirements;
	}
	/**
	 * 设置：抵押类型
	 */
	public void setMortgageType(Integer mortgageType) {
		this.mortgageType = mortgageType;
	}
	/**
	 * 获取：抵押类型
	 */
	public Integer getMortgageType() {
		return mortgageType;
	}
	/**
	 * 设置：还款方式
	 */
	public void setReimbursementMeans(Integer reimbursementMeans) {
		this.reimbursementMeans = reimbursementMeans;
	}
	/**
	 * 获取：还款方式
	 */
	public Integer getReimbursementMeans() {
		return reimbursementMeans;
	}
	/**
	 * 设置：放款比例
	 */
	public void setLendingRate(Integer lendingRate) {
		this.lendingRate = lendingRate;
	}
	/**
	 * 获取：放款比例
	 */
	public Integer getLendingRate() {
		return lendingRate;
	}
	/**
	 * 设置：需要资料
	 */
	public void setNeedInformation(String needInformation) {
		this.needInformation = needInformation;
	}
	/**
	 * 获取：需要资料
	 */
	public String getNeedInformation() {
		return needInformation;
	}
	/**
	 * 设置：房龄要求
	 */
	public void setHoseAge(String hoseAge) {
		this.hoseAge = hoseAge;
	}
	/**
	 * 获取：房龄要求
	 */
	public String getHoseAge() {
		return hoseAge;
	}
	/**
	 * 设置：客户要求
	 */
	public void setCustomerRequest(String customerRequest) {
		this.customerRequest = customerRequest;
	}
	/**
	 * 获取：客户要求
	 */
	public String getCustomerRequest() {
		return customerRequest;
	}
	/**
	 * 设置：流程
	 */
	public void setProcess(String process) {
		this.process = process;
	}
	/**
	 * 获取：流程
	 */
	public String getProcess() {
		return process;
	}
	/**
	 * 设置：是否压证
	 */
	public void setNeedCertificates(Integer needCertificates) {
		this.needCertificates = needCertificates;
	}
	/**
	 * 获取：是否压证
	 */
	public Integer getNeedCertificates() {
		return needCertificates;
	}
	/**
	 * 设置：评估公证费
	 */
	public void setEvaluateNotaryFees(String evaluateNotaryFees) {
		this.evaluateNotaryFees = evaluateNotaryFees;
	}
	/**
	 * 获取：评估公证费
	 */
	public String getEvaluateNotaryFees() {
		return evaluateNotaryFees;
	}
	/**
	 * 设置：是否看名族
	 */
	public void setNeedNational(Integer needNational) {
		this.needNational = needNational;
	}
	/**
	 * 获取：是否看名族
	 */
	public Integer getNeedNational() {
		return needNational;
	}
	/**
	 * 设置：返点
	 */
	public void setRebates(Integer rebates) {
		this.rebates = rebates;
	}
	/**
	 * 获取：返点
	 */
	public Integer getRebates() {
		return rebates;
	}
	/**
	 * 设置：GPS费用
	 */
	public void setGpsFees(String gpsFees) {
		this.gpsFees = gpsFees;
	}
	/**
	 * 获取：GPS费用
	 */
	public String getGpsFees() {
		return gpsFees;
	}
	/**
	 * 设置：联系人
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * 获取：联系人
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * 设置：联系人电话
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	/**
	 * 获取：联系人电话
	 */
	public String getContactPhone() {
		return contactPhone;
	}
	/**
	 * 设置：签约方式
	 */
	public void setContractWay(String contractWay) {
		this.contractWay = contractWay;
	}
	/**
	 * 获取：签约方式
	 */
	public String getContractWay() {
		return contractWay;
	}
}
