package com.pactera.entity.product;
import lombok.Data;

import java.io.Serializable;


/**
 * 
 * date : 2018-09-26 15:36:23
 * author : mapper generator
 * description : 投资表
 * 
 **/
@Data
public class Investment implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	**/
	private Integer id;

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

	/**
	 * 产品Id
	**/
	private Integer productId;

	/**
	 * 产品风险等级
	**/
	private String productRisk;




}