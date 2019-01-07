package com.pactera.entity.project;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * date : 2018-09-27 17:38:06
 * author : mapper generator
 * description : 
 * 
 **/
@Data
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 项目代码，主键唯一非空
	**/
	private Integer projectId;

	/**
	 * 项目名称
	**/
	private String projectName;

	/**
	 * 项目外文名称
	**/
	private String projectEnglishName;

	/**
	 * 项目规模
	**/
	private Integer size;

	/**
	 * 期限
	**/
	private Integer timeLimit;

	/**
	 * '期限单位'
	**/
	private String timeLimitUnit;

	/**
	 * 项目成立日期
	**/
	private Date buildDate;

	/**
	 * 项目到期日期
	**/
	private Date endDate;

	/**
	 * '产品分类（投资领域：房地产，金融。。）'
	**/
	private String productType;

	/**
	 * '项目来源方'
	**/
	private String projectCompany;

	/**
	 * '来源方对接人A'
	**/
	private String dockingPeopleA;

	/**
	 * '来源方对接人B'
	**/
	private String dockingPeopleB;

	/**
	 * '来源方对接人C'
	**/
	private String dockingPeopleC;

	/**
	 * '产品经理A'
	**/
	private String productManagerA;

	/**
	 * '产品经理B'
	**/
	private String productManagerB;

	/**
	 * '项目类型'
	**/
	private String projectType;

	/**
	 * 投资方式
	**/
	private String investMethod;

	/**
	 * 资金投向
	**/
	private String moneyTo;

	/**
	 * 募集币种
	**/
	private String raiseCurrency;

	/**
	 * 投资币种
	**/
	private String investCurrency;

	/**
	 * 是否结构化
	**/
	private String isStructuring;

	/**
	 * 收益分配方式
	**/
	private String incomeDistributionMethod;

	/**
	 * 收益分配频度
	**/
	private String incomeDistributionFrequency;

	/**
	 * 资产管理报告频度
	**/
	private String assetManagementReportFrequency;

	/**
	 * 融资方
	**/
	private String financier;

	/**
	 * 管理人
	**/
	private String administrator;

	/**
	 * 来源方部门
	**/
	private String projectCompanyDepartment;

	/**
	 * 保管账号
	**/
	private String custodyAccount;

	/**
	 * 保管银行
	**/
	private String custodyBank;

	/**
	 * 保管户名
	**/
	private String custodyUserName;

	/**
	 * 募集账号

	**/
	private String investAccount;

	/**
	 * 募集银行
	**/
	private String investBank;

	/**
	 * 募集户名
	**/
	private String investUserName;

	/**
	 * 备注
	**/
	private String note;

	/**
	 * 默认为0:系统接口（TA）
1:手工录入（外采）
	**/
	private String projectDataFrom;

	/**
	 * 项目的状态0已删除 ,1正常
	**/
	private Integer status;


}