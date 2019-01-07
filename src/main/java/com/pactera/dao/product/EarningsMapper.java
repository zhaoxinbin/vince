package com.pactera.dao.product;

import com.pactera.entity.product.Earnings;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * date : 2018-09-26 15:36:23
 * author : mapper generator
 * description : EarningsMapper数据库操作接口类
 * 
 **/
public interface EarningsMapper{

    List<Earnings> selectByProductCode(Integer productCode);

    Integer addEarnings(Earnings earnings);

     // 判断是否与数据库数据相等
    Integer checkInput(Earnings earnings);

    Integer delete(Integer id);

    Earnings getEarningsById(@Param("id") Integer id);

    Integer updateEarnings(Earnings earnings);

    //创建分组时，需要相同期限、期限单位
    List<Earnings> getTermAndTermUnit(Integer[] idArr);

    //改变收益级别状态
    Integer updEarningsStatus(@Param("status") Integer status,@Param("id") Integer id);

    Earnings getEarningsStatusById(@Param("id") Integer id);


}