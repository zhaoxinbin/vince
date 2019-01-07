package com.pactera.service.product;

import com.github.pagehelper.PageInfo;
import com.pactera.entity.product.Product;
import com.pactera.entity.project.Project;

import java.util.List;

/**
 * Created by Administrator on 2018/9/26.
 */
public interface ProductService {

    List<Product> queryAll();

    PageInfo<Product> selectProduct(Integer pageNum, Integer pageSize);

    Product selectProductDetail(Integer projectId, Integer productCode);

    PageInfo<Product> keywordSelectProduct(Integer pageNum, Integer pageSize, String productCode, String productName, String productRisk, String revenueType, String salesChannels);

    //点新建产品按钮,弹出Modal框处理
    Project getProjectModal(String projectType, String projectName);

    //新增产品
    Integer addProduct(Product product);

    //修改产品信息
    Integer updateProduct(Product product);

    //删除产品(只改变产品状态,不是直接从数据库删除)
    Integer updateProductStatus(Integer productCode,Integer status);

    //验证产品名称是否重复
    Integer checkProductName(String productName);

}
