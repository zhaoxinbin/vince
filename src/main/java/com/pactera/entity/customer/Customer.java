package com.pactera.entity.customer;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * date : 2018-10-01 19:34:36
 * author : mapper generator
 * description : 
 * 
 **/
@Data
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	**/
	private Integer customerId;

	/**
	 * 客户名称
	**/
	private String customerName;

	/**
	 * 证件类型
	**/
	private String credentialsType;

	/**
	 * 证件号码
	**/
	private String certificateNumber;

	/**
	 * 证件有效期
	**/
	private Date certificateValidityPeriod;

	/**
	 * 生日
	**/
	private Date birthday;

	/**
	 * 性别
	**/
	private String gender;

	/**
	 * 国籍
	**/
	private String nationality;

	/**
	 * 婚姻状况
	**/
	private String maritalStatus;

	/**
	 * 是否事实客户
	**/
	private String isFact;

	/**
	 * 客户等级
	**/
	private String grade;

	/**
	 * 风险评级
	**/
	private String riskRating;

	/**
	 * 生肖
	**/
	private String zodiac;

	/**
	 * 星座
	**/
	private String constellation;

	/**
	 * 民族
	**/
	private String nation;

	/**
	 * 手机号码
	**/
	private String phoneNumber;

	/**
	 * 联系地址
	**/
	private String address;

	/**
	 * 电子邮箱
	**/
	private String email;

	/**
	 * 理财经理
	**/
	private String financialManager;

	/**
	 * 联系电话
	**/
	private String contactNumber;

	/**
	 * 职业
	**/
	private String job;

	/**
	 * 备注
	**/
	private String remark;

	/**
	 * 联系偏好
	**/
	private String contactPreference;
}