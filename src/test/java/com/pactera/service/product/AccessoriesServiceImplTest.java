package com.pactera.service.product;

import com.pactera.entity.product.Accessories;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/9/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccessoriesServiceImplTest {
    @Autowired
    private AccessoriesService accessoriesService;
    @Test
    public void selectAccessoriesByProductCode() throws Exception {
        List<Accessories> list = accessoriesService.selectAccessoriesByProductCode(1);
        for (Accessories accessories : list) {
            System.out.println(accessories);
        }
    }

}