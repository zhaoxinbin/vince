package com.pactera.dao.product;

import com.pactera.entity.product.Accessories;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

/**
 * 
 * date : 2018-09-26 15:36:23
 * author : mapper generator
 * description : AccessoriesMapper数据库操作接口类
 * 
 **/
public interface AccessoriesMapper{

    List<Accessories> selectAccessoriesByProductCode(@Param("productCode") Integer productCode);

    Accessories getAccessoriesById(@Param("id") Integer id);

    List<Accessories> getAccessoriesByDocumentTypeOrUploadTime(@Param("documentType") String documentType, @Param("uploadTime") String uploadTime,@Param("productCode") Integer productCode);

    Integer updateAccessories(Accessories accessories);

    Integer updateAccessoriesStatus(@Param("status") Integer status,@Param("id") Integer id);

    @SelectKey(statement="select LAST_INSERT_ID()", keyProperty="id", before=false, resultType=int.class)
    Integer addAccessories(Accessories accessories);
}