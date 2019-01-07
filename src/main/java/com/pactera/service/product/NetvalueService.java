package com.pactera.service.product;

import com.github.pagehelper.PageInfo;
import com.pactera.entity.product.Netvalue;

/**
 * Created by Administrator on 2018/10/5.
 */
public interface NetvalueService {
    PageInfo<Netvalue> getNetvalueListByProductCode(Integer pageNum, Integer pageSize,Integer productCode);

    PageInfo<Netvalue> getNetvalueListByValuationDateAndBatch(Integer pageNum, Integer pageSize,Integer productCode,String startTime,String endTime,String batch);

}
