package com.pactera.entity.product;
import lombok.Data;

import java.io.Serializable;


/**
 * 
 * date : 2018-09-26 15:36:23
 * author : mapper generator
 * description : 收益表
 * 
 **/
@Data
public class Earnings implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	**/
	private Integer id;

	/**
	 * 收益级别
	**/
	private String incomeLevel;

	/**
	 * 金额下限
	**/
	private Double lowerLimit;

	/**
	 * 金额上限
	**/
	private Double upperLimit;

	/**
	 * 预期收益率
	**/
	private Double expectedRate;

	/**
	 * 收益级别期限
	**/
	private Integer term;

	/**
	 * 收益级别期限单位
	**/
	private String termUnit;

	/**
	 * 备注
	**/
	private String note;


	private Integer productCode;

	private Integer status;

	private Integer source;

}