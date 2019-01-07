package com.pactera.entity.product;
import com.pactera.entity.project.Project;
import lombok.Data;

import java.io.Serializable;


/**
 * 
 * date : 2018-09-26 15:36:23
 * author : mapper generator
 * description : 产品表
 * 
 **/
@Data
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 产品代码
	**/
	private Integer productCode;

	/**
	 * 产品名称
	**/
	private String productName;

	/**
	 * 销售渠道
	**/
	private String salesChannels;

	/**
	 * 结构类型
	**/
	private String structureType;

	/**
	 * 收益类型
	**/
	private String revenueType;

	/**
	 * 合同前缀
	**/
	private String contractPrefix;

	/**
	 * 产品描述
	**/
	private String productDescription;

	/**
	 * 备注
	**/
	private String note;

	/**
	 * 运营经理A
	**/
	private String operationManagerA;

	/**
	 * 运营经理B
	**/
	private String operationManagerB;

	/**
	 * 产品风险等级(低，中低，中，中高，高，全部)
	**/
	private String productRisk;

	private String 	customerRiskLevel;
	/**
	 * 产品投向
	 **/
	private String productTo;

	/**
	 * 收益分配周期(1:周2:旬3:月4:季度5:年度6:到期一次付清7:其他)
	 **/
	private String distributionCycle;

	/**
	 * 收益分配描述
	 **/
	private String distributionDescription;

	/**
	 * 开放周期(1:周2:旬3:月4:季度5:年度6:到期一次付清7:其他)
	 **/
	private String openCycle;

	/**
	 * 开放周期描述
	 **/
	private String openCycleDescription;

	/**
	 * 封闭期
	 **/
	private Integer closePeriod;

	/**
	 * 封闭期单位
	 **/
	private String closedUnit;

	/**
	 * 是否可赎回(是/否)
	 **/
	private String redeemable;

	/**
	 * 赎回费率
	 **/
	private Double redeemableRate;

	/**
	 * 赎回限制
	 **/
	private String redeemableLimit;

	/**
	 * 是否允许追加(是/否)
	 **/
	private String isAppend;

	private Integer projectId;

	private Integer status;

	private Project project;





}