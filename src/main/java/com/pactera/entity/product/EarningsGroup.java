package com.pactera.entity.product;

import lombok.Data;

/**
 * Created by Administrator on 2018/10/12.
 */
@Data
public class EarningsGroup {

    private Integer id;
    private String groupName;
    private Integer earningsId;
    private Integer groupStatus;
    //---------------------------------------
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

}
