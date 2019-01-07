package com.pactera.dao.product;

import com.pactera.entity.product.EarningsGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface EarningsGroupMapper {

    List<EarningsGroup> queryEarningsGroup(Integer productCode);

    Integer getGroupNameCount(String groupName);

    //添加分组
    Integer addEarningsGroup(@Param("groupName") String groupName, @Param("earningsId") Integer earningsId);

    //取消分组
    Integer deleteGroup(String groupName);

    //验证该收益级别分组记录是否正在被营销项目引用
    List<EarningsGroup> queryGroupStatus(String groupName);

    Integer getCountByEarningsId(Integer earningsId);
}
