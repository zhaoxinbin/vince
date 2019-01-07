package com.pactera.service.customer;

import com.github.pagehelper.PageInfo;
import com.pactera.entity.customer.CustomerContract;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/10/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceImplTest {

    @Autowired
    private  CustomerService customerService;
    @Test
    public void getCustomerList() throws Exception {

        PageInfo<CustomerContract> pageInfo = customerService.getCustomerList(1,5,1);
        List<CustomerContract> list = pageInfo.getList();
        for (CustomerContract customerContract : list) {
            System.out.println(customerContract);
        }
    }
    @Test
    public void getCustomerContractDetail() throws Exception {
        CustomerContract customerContract = customerService.getCustomerContractDetail(3);
        System.out.println(customerContract);
    }


}