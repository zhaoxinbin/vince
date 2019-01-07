package com.pactera.service.product;

import com.pactera.entity.product.Earnings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/10/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EarningsServiceImplTest {


    @Autowired
    private EarningsService earningsService;
    @Test
    public void selectByProductCode() throws Exception {
        List<Earnings> list = earningsService.selectByProductCode(1);
        for (Earnings earnings : list) {
            System.out.println(earnings);
        }
    }

}