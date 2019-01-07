package com.pactera.service.product;

import com.github.pagehelper.PageInfo;
import com.pactera.entity.product.Netvalue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/10/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NetvalueServiceImplTest {

    @Autowired
    private NetvalueService netvalueService;
    @Test
    public void getNetvalueListByProductCode() throws Exception {
        PageInfo<Netvalue> pageInfo = netvalueService.getNetvalueListByProductCode(1,5,1);
        List<Netvalue> list = pageInfo.getList();
        for (Netvalue netvalue : list) {
            System.out.println(netvalue);
        }
    }

    @Test
    public void getNetvalueListByValuationDateAndBatch() throws Exception {
        PageInfo<Netvalue> pageInfo = netvalueService.getNetvalueListByValuationDateAndBatch(1,5,1,"2018-07-03","2018-10-05","第1批次");
        List<Netvalue> list = pageInfo.getList();
        for (Netvalue netvalue : list) {
            System.out.println(netvalue);
        }

    }


}