package com.pactera.entity.customer;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * 
 * date : 2018-10-01 19:34:36
 * author : mapper generator
 * description : 
 * 
 **/
@Data
public class Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	**/
	private Integer contractId;

	/**
	 * 合同编号
	**/
	private String contractNo;

	private Integer productCode;

	/**
	 * 产品名称
	**/
	private String productName;

	/**
	 * 存量份额
	**/
	private Integer stockShare;

	/**
	 * 开户银行
	**/
	private String accountBank;

	/**
	 * 账户名称
	**/
	private String accountName;

	/**
	 * 银行账号
	**/
	private String bankAccount;

	/**
	 * 固定电话
	**/
	private String telephone;

	/**
	 * 邮编
	**/
	private String postcode;

	/**
	 * 销售模式
	**/
	private String salesModel;

	/**
	 * 销售渠道
	**/
	private String salesChannel;

	/**
	 * 合同到期日期
	**/
	private Date expiryDate;

	/**
	 * 收益级别期限
	**/
	private Integer incomeLevelTerm;

	/**
	 * 预期收益率
	**/
	private Double expectedRate;

	/**
	 * 当前客户经理
	**/
	private String customerManager;

	/**
	 * 签约时间
	**/
	private Date signingTime;

	/**
	 * 认购金额
	**/
	private BigDecimal subscriptionAmount;

	private Integer customerId;

}