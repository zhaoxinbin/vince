package com.pactera.service.product;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pactera.dao.product.ProductMapper;
import com.pactera.entity.product.Product;
import com.pactera.entity.project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/9/26.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<Product> queryAll() {
        return productMapper.queryAll();
    }

    @Override
    public PageInfo<Product> selectProduct(Integer pageNum, Integer pageSize) {
        if (null == pageNum) {
            pageNum = 1;
        }
        if (null == pageSize) {
            pageSize = 5;
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Product> list = productMapper.selectProduct();
        PageInfo<Product> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Product selectProductDetail(Integer projectId, Integer productCode) {
        return productMapper.selectProductDetail(projectId, productCode);
    }

    @Override
    public PageInfo<Product> keywordSelectProduct(Integer pageNum, Integer pageSize, String productCode, String productName, String productRisk, String revenueType, String salesChannels) {
        if (null == pageNum) {
            pageNum = 1;
        }
        if (null == pageSize) {
            pageSize = 5;
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Product> list = productMapper.keywordSelectProduct(productCode, productName, productRisk, revenueType, salesChannels);
        PageInfo<Product> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Project getProjectModal(String projectType, String projectName) {
        return productMapper.getProjectModal(projectType, projectName);
    }

    //新增产品
    @Override
    public Integer addProduct(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Integer updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }

    @Override
    public Integer updateProductStatus(Integer productCode,Integer status) {
        return productMapper.updateProductStatus(productCode,status);
    }

    @Override
    public Integer checkProductName(String productName) {
        return productMapper.checkProductName(productName);
    }
}
