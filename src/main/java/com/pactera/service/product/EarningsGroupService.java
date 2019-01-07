package com.pactera.service.product;

import com.pactera.entity.product.EarningsGroup;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface EarningsGroupService {
    List<EarningsGroup> queryEarningsGroup(Integer productCode);

    //检查分组名是否重复
    Boolean checkGroupName(String groupName);

    void addEarningsGroup(String groupName,Integer[] idArr);

    //取消分组
    Integer deleteGroup(String groupName);

    //验证该收益级别分组记录是否正在被营销项目引用
    Boolean checkGroupStatus(String groupName);

    Boolean checkCountByEarningsId(Integer earningsId);
}
