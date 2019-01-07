package com.pactera.service.product;

import com.pactera.entity.product.Earnings;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/10/6.
 */
public interface EarningsService {
    List<Earnings> selectByProductCode(Integer productCode);

    Integer addEarnings(Earnings earnings);

    // 判断是否与数据库数据相等
    Integer checkInput(Earnings earnings);

    Integer delete(@Param("id") Integer id);

    Earnings getEarningsById(Integer id);

    Integer updateEarnings(Earnings earnings);

    //创建分组时，需要相同期限、期限单位
    Integer checkTermAndTermUnit(Integer[] idArr);

    //改变收益级别状态
    Integer updEarningsStatus(Integer status,Integer id);

    //检查收益级别状态
    Boolean checkEarningsStatus(Integer id);
}
