package com.pactera.service.product;

import com.pactera.dao.product.EarningsMapper;
import com.pactera.entity.product.Earnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/10/6.
 */
@Service
public class EarningsServiceImpl implements EarningsService {
    @Autowired
    public EarningsMapper earningsMapper;

    @Override
    public List<Earnings> selectByProductCode(Integer productCode) {
        return earningsMapper.selectByProductCode(productCode);
    }

    @Override
    public Integer addEarnings(Earnings earnings) {
        return earningsMapper.addEarnings(earnings);
    }

    @Override
    public Integer checkInput(Earnings earnings) {
        return earningsMapper.checkInput(earnings);
    }

    @Override
    public Integer delete(Integer id) {
        return earningsMapper.delete(id);
    }

    @Override
    public Earnings getEarningsById(Integer id) {
        return earningsMapper.getEarningsById(id);
    }

    @Override
    public Integer updateEarnings(Earnings earnings) {
        return earningsMapper.updateEarnings(earnings);
    }

    @Override
    public Integer checkTermAndTermUnit(Integer[] idArr) {
        List<Earnings> list = earningsMapper.getTermAndTermUnit(idArr);

        List<String> termList = new ArrayList<String>();
        Integer result = null;
        if (null != list) {
            for (Earnings earnings : list) {
                termList.add(earnings.getTerm() + earnings.getTermUnit());
            }
            String team1 = termList.get(0);
            for (String team : termList) {
                System.out.println(team);
                if (team.equals(team1)) {
                    result = 1;
                } else {
                    return 0;
                }
            }
        }
        return result;
    }

    @Override
    public Integer updEarningsStatus(Integer status, Integer id) {
        return earningsMapper.updEarningsStatus(status, id);
    }

    @Override
    public Boolean checkEarningsStatus(Integer id) {
        Earnings earnings = earningsMapper.getEarningsStatusById(id);
        return earnings.getStatus() == 1;
    }
}
