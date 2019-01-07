package com.pactera.service.product;

import com.pactera.dao.product.EarningsGroupMapper;
import com.pactera.entity.product.EarningsGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
@Service
public class EarningsGroupServiceImpl implements EarningsGroupService {
    @Autowired
    private EarningsGroupMapper earningsGroupMapper;


    @Override
    public List<EarningsGroup> queryEarningsGroup(Integer productCode) {
        return earningsGroupMapper.queryEarningsGroup(productCode);
    }

    @Override
    public Boolean checkGroupName(String groupName) {
        Integer count = earningsGroupMapper.getGroupNameCount(groupName);
        return count == 0;
    }

    @Override
    public void addEarningsGroup(String groupName, Integer[] idArr) {
        for (Integer earningsId : idArr) {
            earningsGroupMapper.addEarningsGroup(groupName,earningsId);
        }
    }

    @Override
    public Integer deleteGroup(String groupName) {
        return earningsGroupMapper.deleteGroup(groupName);
    }

    @Override
    //状态为2:收益级别分组记录正在被营销项目引用
    public Boolean checkGroupStatus(String groupName) {
        List<EarningsGroup> list = earningsGroupMapper.queryGroupStatus(groupName);
        Boolean flag=null;
        for (EarningsGroup earningsGroup : list) {
            if(earningsGroup.getGroupStatus()!=1){
                return false;
            }else {
                flag=true;
            }
        }
        return flag;
    }

    @Override
    public Boolean checkCountByEarningsId(Integer earningsId) {
        Integer count = earningsGroupMapper.getCountByEarningsId(earningsId);
        return count==0;
    }
}
