package com.pactera.entity.product;
import lombok.Data;

import java.io.Serializable;


/**
 * 
 * date : 2018-09-26 15:36:23
 * author : mapper generator
 * description : 净值表
 * 
 **/
@Data
public class Netvalue implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 表自身Id
	**/
	private Integer id;

	/**
	 * 产品代码
	**/
	private Integer productCode;

	private String batch;

	/**
	 * 净值
	**/
	private Double netValue;

	/**
	 * 累计净值
	**/
	private Double cumulativeNetValue;

	/**
	 * 估值日期
	**/
	private String valuationDate;

	private String releaseDate;

	/**
	 * 管理人
	**/
	private String operator;

	/**
	 * 操作时间
	**/
	private String operationTime;



}