package com.pactera.service.product;

import com.pactera.dao.product.AccessoriesMapper;
import com.pactera.entity.product.Accessories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/9/29.
 */
@Service
public class AccessoriesServiceImpl implements AccessoriesService {
    @Autowired
    private AccessoriesMapper accessoriesMapper;
    @Override
    public List<Accessories> selectAccessoriesByProductCode(Integer productCode) {
        return accessoriesMapper.selectAccessoriesByProductCode(productCode);
    }

    @Override
    public Accessories getAccessoriesById(Integer id) {
        return accessoriesMapper.getAccessoriesById(id);
    }

    @Override
    public List<Accessories> getAccessoriesByDocumentTypeOrUploadTime(String documentType, String uploadTime,Integer productCode) {
        return accessoriesMapper.getAccessoriesByDocumentTypeOrUploadTime(documentType,uploadTime,productCode);
    }

    @Override
    public Integer updateAccessories(Accessories accessories) {
        return accessoriesMapper.updateAccessories(accessories);
    }

    @Override
    public Integer updateAccessoriesStatus(Integer status, Integer id) {
        return accessoriesMapper.updateAccessoriesStatus(status,id);
    }

    @Override
    public Integer addAccessories(Accessories accessories) {
        return accessoriesMapper.addAccessories(accessories);
    }
}
