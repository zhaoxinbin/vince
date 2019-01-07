package com.pactera.service.product;

import com.github.pagehelper.PageInfo;
import com.pactera.entity.product.Product;
import com.pactera.entity.project.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/9/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {


    @Autowired
    private ProductService productService;

    @Test
    public void queryAll() throws Exception {
        List<Product> list = productService.queryAll();
        if (list != null) {
            for (Product product : list) {
                System.out.println(product);
            }
        }
    }

    @Test
    public void selectProductDetail() throws Exception {
        Product product = productService.selectProductDetail(1, 1);
        System.out.println(product);
    }

    @Test
    public void keywordSelectProduct() throws Exception {
        PageInfo<Product> pageInfo = productService.keywordSelectProduct(1, 5, "", "", "高", "", "");
        List<Product> list = pageInfo.getList();
        for (Product product : list) {
            System.out.println(product);
        }
    }

    @Test
    public void getProjectModal() throws Exception {
        Project project = productService.getProjectModal("信托", "信托");
        System.out.println(project);
    }

}