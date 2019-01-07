package com.pactera.controller;

import com.github.pagehelper.PageInfo;
import com.pactera.entity.product.Netvalue;
import com.pactera.service.product.NetvalueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/10/5.
 */
@Controller
@RequestMapping("netvalue")
public class NetvalueController {
    @Autowired
    private NetvalueService netvalueService;

    @RequestMapping("getNetvalueListByProductCode")
    public String getNetvalueListByProductCode(Integer pageNum, Integer pageSize, Model model, Integer productCode,Integer projectId) {
        PageInfo<Netvalue> pageInfo = netvalueService.getNetvalueListByProductCode(pageNum, pageSize, productCode);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("projectId",projectId);
        model.addAttribute("productCode",productCode);
//        List<Netvalue> list = pageInfo.getList();
//        for (Netvalue netvalue : list) {
//           model.addAttribute("netvalue",netvalue);
//        }
        return "net_value";
    }

    @RequestMapping("getNetvalueListByValuationDateAndBatch")
    public String getNetvalueListByValuationDateAndBatch(Integer pageNum, Integer pageSize, Integer productCode,Integer projectId, String startTime, String endTime, String batch,Model model){
        PageInfo<Netvalue> pageInfo = netvalueService.getNetvalueListByValuationDateAndBatch(pageNum,pageSize,productCode,startTime,endTime,batch);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("projectId",projectId);
        model.addAttribute("productCode",productCode);
        model.addAttribute("startTime",startTime);
        model.addAttribute("endTime",endTime);
        model.addAttribute("batch",batch);
        return "net_value";
    }
}


