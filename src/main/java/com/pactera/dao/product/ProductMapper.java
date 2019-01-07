package com.pactera.dao.product;

import com.pactera.entity.product.Product;
import com.pactera.entity.project.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * date : 2018-09-26 15:36:23
 * author : mapper generator
 * description : ProductMapper数据库操作接口类
 **/
public interface ProductMapper {

    List<Product> queryAll();

    List<Product> selectProduct();

    Product selectProductDetail(@Param("projectId") Integer projectId, @Param("productCode") Integer productCode);

    List<Product> keywordSelectProduct(@Param("productCode") String productCode, @Param("productName") String productName, @Param("productRisk") String productRisk, @Param("revenueType") String revenueType, @Param("salesChannels") String salesChannels);

    //点新建产品按钮,弹出Modal框处理
    Project getProjectModal(@Param("projectType") String projectType, @Param("projectName") String projectName);

    //新增产品
    Integer addProduct(Product product);

    //修改产品信息
    Integer updateProduct(Product product);

    //删除产品(只改变产品状态,不是直接从数据库删除)
    Integer updateProductStatus(@Param("productCode") Integer productCode,@Param("status") Integer status);

    //验证产品名称是否重复
    Integer checkProductName(@Param("productName") String productName);
}