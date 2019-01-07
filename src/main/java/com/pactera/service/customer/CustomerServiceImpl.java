package com.pactera.service.customer;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pactera.dao.customer.CustomerMapper;
import com.pactera.entity.customer.CustomerContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/1.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public PageInfo<CustomerContract> getCustomerList(Integer pageNum, Integer pageSize, Integer productCode) {
        if (null == pageNum) {
            pageNum = 1;
        }
        if (null == pageSize) {
            pageSize = 7;
        }
        PageHelper.startPage(pageNum, pageSize);
        List<CustomerContract> list = customerMapper.getCustomerList(productCode);
        PageInfo<CustomerContract> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public CustomerContract getCustomerContractDetail(Integer contractId) {
        return customerMapper.getCustomerContractDetail(contractId);
    }

    @Override
    public PageInfo<CustomerContract> conditionSelect(Integer pageNum, Integer pageSize, Integer productCode, String customerName, String contractNo, String stockStart, String stockEnd,String customerManager, String salesChannel,String isEmailNull) {
        if (null == pageNum) {
            pageNum = 1;
        }
        if (null == pageSize) {
            pageSize = 7;
        }
        PageHelper.startPage(pageNum, pageSize);
        List<CustomerContract> list = customerMapper.conditionSelect(productCode,customerName,contractNo,stockStart,stockEnd,customerManager,salesChannel,isEmailNull);
        return new PageInfo<>(list);
    }


}
