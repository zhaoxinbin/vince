package com.pactera.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.pactera.entity.customer.CustomerContract;
import com.pactera.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/10/1.
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("getCustomerList")
    public String getCustomerList(Integer pageNum, Integer pageSize,Integer productCode,Integer projectId, Model model){
        PageInfo<CustomerContract> pageInfo = customerService.getCustomerList(pageNum,pageSize,productCode);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("projectId",projectId);
        model.addAttribute("productCode",productCode);
        return "customer_info";
    }

    @ResponseBody
    @RequestMapping("getCustomerContractDetail")
    public String getCustomerContractDetail(Integer contractId){
        CustomerContract cc = customerService.getCustomerContractDetail(contractId);
        String json = JSON.toJSONString(cc);
        System.out.println(json);
        return json;
    }

    @RequestMapping("conditionSelect")
    public String conditionSelect(Integer pageNum, Integer pageSize,Integer projectId, Integer productCode, String customerName, String contractNo, String stockStart, String stockEnd,String customerManager, String salesChannel,String isEmailNull,Model model){
        PageInfo<CustomerContract> pageInfo = customerService.conditionSelect(pageNum,pageSize,productCode,customerName,contractNo,stockStart,stockEnd,customerManager,salesChannel,isEmailNull);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("projectId",projectId);
        model.addAttribute("productCode",productCode);
        //用于查询关键词页面回显
        model.addAttribute("customerName",customerName);
        model.addAttribute("salesChannel",salesChannel);
        model.addAttribute("contractNo",contractNo);
        model.addAttribute("stockStart",stockStart);
        model.addAttribute("stockEnd",stockEnd);
        model.addAttribute("customerManager",customerManager);
        model.addAttribute("isEmailNull",isEmailNull);
        return "customer_info";
    }

}
