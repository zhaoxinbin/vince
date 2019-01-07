package com.pactera.service.product;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pactera.dao.product.NetvalueMapper;
import com.pactera.entity.product.Netvalue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/5.
 */
@Service
public class NetvalueServiceImpl implements NetvalueService {

    @Autowired
    private NetvalueMapper netvalueMapper;
    @Override
    public PageInfo<Netvalue> getNetvalueListByProductCode(Integer pageNum, Integer pageSize, Integer productCode) {
        if (null == pageNum) {
            pageNum = 1;
        }
        if (null == pageSize) {
            pageSize = 20;
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Netvalue> list = netvalueMapper.getNetvalueListByProductCode(productCode);
        PageInfo<Netvalue> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Netvalue> getNetvalueListByValuationDateAndBatch(Integer pageNum, Integer pageSize, Integer productCode, String startTime, String endTime, String batch) {
        if (null == pageNum) {
            pageNum = 1;
        }
        if (null == pageSize) {
            pageSize = 20;
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Netvalue> list = netvalueMapper.getNetvalueListByValuationDateAndBatch(productCode,startTime,endTime,batch);
        PageInfo<Netvalue> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
