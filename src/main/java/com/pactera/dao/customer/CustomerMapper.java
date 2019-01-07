package com.pactera.dao.customer;

import com.pactera.entity.customer.CustomerContract;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/10/1.
 */
public interface CustomerMapper {

    List<CustomerContract> getCustomerList(@Param("productCode") Integer productCode);

    CustomerContract getCustomerContractDetail(@Param("contractId") Integer contractId);

    List<CustomerContract> conditionSelect(@Param("productCode") Integer productCode,@Param("customerName") String customerName,@Param("contractNo") String contractNo,@Param("stockStart") String stockStart, @Param("stockEnd")String stockEnd,@Param("customerManager") String customerManager,@Param("salesChannel") String salesChannel,@Param("isEmailNull") String isEmailNull);
}
