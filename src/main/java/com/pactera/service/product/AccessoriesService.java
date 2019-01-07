package com.pactera.service.product;

import com.pactera.entity.product.Accessories;

import java.util.List;

/**
 * Created by Administrator on 2018/9/29.
 */
public interface AccessoriesService {
    List<Accessories> selectAccessoriesByProductCode(Integer productCode);

    Accessories getAccessoriesById(Integer id);

    List<Accessories> getAccessoriesByDocumentTypeOrUploadTime(String documentType, String uploadTime,Integer productCode);

    Integer updateAccessories(Accessories accessories);

    Integer updateAccessoriesStatus(Integer status,Integer id);

    Integer addAccessories(Accessories accessories);
}
