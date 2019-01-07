package com.pactera.service.customer;

import com.pactera.dao.customer.ContractMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/14.
 */
@Service
public class ContractServiceImpl implements ContractService {
    private final ContractMapper contractMapper;

    @Autowired
    public ContractServiceImpl(ContractMapper contractMapper) {
        this.contractMapper = contractMapper;
    }

    @Override
    public Boolean checkCountByProductCode(Integer productCode) {
        Integer count = contractMapper.getCountByProductCode(productCode);
        return count == 0;
    }
}
