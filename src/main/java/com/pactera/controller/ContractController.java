package com.pactera.controller;

import com.alibaba.fastjson.JSON;
import com.pactera.service.customer.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/14.
 */
@Controller
@RequestMapping("contract")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @ResponseBody
    @PostMapping("checkCountByProductCode")
    public String checkCountByProductCode(Integer productCode){
        Boolean flag=contractService.checkCountByProductCode(productCode);
        Map<String, String> map = new HashMap<>();
        if(flag){
            map.put("message", "y");
        }else {
            map.put("message", "n");
        }
        return JSON.toJSONString(map);
    }
}


