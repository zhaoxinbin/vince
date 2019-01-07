package com.pactera.service.customer;

import com.github.pagehelper.PageInfo;
import com.pactera.entity.customer.CustomerContract;

/**
 * Created by Administrator on 2018/10/1.
 */
public interface CustomerService {
    PageInfo<CustomerContract> getCustomerList(Integer pageNum, Integer pageSize, Integer productCode);

    CustomerContract getCustomerContractDetail(Integer contractId);

    PageInfo<CustomerContract> conditionSelect(Integer pageNum, Integer pageSize, Integer productCode,String customerName, String contractNo, String stockStart, String stockEnd, String customerManager, String salesChannel,String isEmailNull);


}
