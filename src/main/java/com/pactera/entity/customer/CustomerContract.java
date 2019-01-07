package com.pactera.entity.customer;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/10/1.
 */
@Data
public class CustomerContract {

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
    private String certificateValidityPeriod;

    /**
     * 生日
     **/
    private String birthday;

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

//--------------------------------------------------------
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
    private String expiryDate;

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
    private String signingTime;

    /**
     * 认购金额
     **/
    private BigDecimal subscriptionAmount;

}
