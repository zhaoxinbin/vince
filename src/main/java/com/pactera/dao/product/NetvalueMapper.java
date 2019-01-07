package com.pactera.dao.product;

import com.pactera.entity.product.Netvalue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * date : 2018-09-26 15:36:23
 * author : mapper generator
 * description : NetvalueMapper数据库操作接口类
 * 
 **/
public interface NetvalueMapper{

    List<Netvalue> getNetvalueListByProductCode(@Param("productCode") Integer productCode);

    //条件查询
    List<Netvalue> getNetvalueListByValuationDateAndBatch(@Param("productCode") Integer productCode,@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("batch")String batch);




}