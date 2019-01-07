package com.pactera.controller;

import com.alibaba.fastjson.JSON;
import com.pactera.entity.product.Earnings;
import com.pactera.entity.product.EarningsGroup;
import com.pactera.service.product.EarningsGroupService;
import com.pactera.service.product.EarningsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/6.
 */
@Controller
@RequestMapping("earnings")
public class EarningsController {

    @Autowired
    private EarningsService earningsService;
    @Autowired
    private EarningsGroupService earningsGroupService;

    @RequestMapping("selectByProductCode")
    public String selectByProductCode(Integer productCode,Integer projectId, Model model){
        List<Earnings> list = earningsService.selectByProductCode(productCode);
        List<EarningsGroup> groups = earningsGroupService.queryEarningsGroup(productCode);
        model.addAttribute("list",list);
        model.addAttribute("groups",groups);
        model.addAttribute("projectId",projectId);
        model.addAttribute("productCode",productCode);
        return "income_level";
    }

    @RequestMapping("addEarnings")
    public String addEarnings(Earnings earnings,Integer projectId,Model model){
        Integer n = earningsService.addEarnings(earnings);
        System.out.println("添加:"+n);
        Integer productCode = earnings.getProductCode();
        model.addAttribute("projectId",projectId);
        model.addAttribute("productCode",productCode);
        return "forward:/earnings/selectByProductCode";
    }


    @ResponseBody
    @PostMapping("checkInput")
    public String checkInput(Earnings earnings){
        Integer n = earningsService.checkInput(earnings);
        Map<String, String> map = new HashMap<>();
        if (n == 0) {
            /**
             * 不重复
             */
            map.put("message", "y");
        } else {
            /**
             * 重复
             */
            map.put("message", "n");
        }
        String json = JSON.toJSONString(map);
        System.out.println(json);
        return json;
    }

    @RequestMapping("delete")
    public String delete(Integer id,Integer productCode,Integer projectId,Model model){
        Integer n = earningsService.delete(id);
        System.out.println("删除收益级别信息"+n);
        model.addAttribute("projectId",projectId);
        model.addAttribute("productCode",productCode);
        return "forward:/earnings/selectByProductCode";
    }

    @ResponseBody
    @RequestMapping("getEarningsById")
    public String getEarningsById(Integer id){
        Earnings earnings = earningsService.getEarningsById(id);
        String json = JSON.toJSONString(earnings);
        System.out.println(json);
        return json;
    }

    @PostMapping("updateEarnings")
    public String updateEarnings(Earnings earnings,Integer projectId,Model model){
        Integer n = earningsService.updateEarnings(earnings);
        if(n>0){
            model.addAttribute("info","保存成功");
        }else {
            model.addAttribute("info","保存失败");
        }
        System.out.println("收益级别编辑"+n);
        Integer productCode = earnings.getProductCode();
        model.addAttribute("productCode",productCode);
        model.addAttribute("projectId",projectId);
        return "forward:/earnings/selectByProductCode";
    }

    @ResponseBody
    @PostMapping("checkTermAndTermUnit")
    public String checkTermAndTermUnit(Integer[] idArr){
        Integer result = earningsService.checkTermAndTermUnit(idArr);
        Map<String, String> map = new HashMap<>();
        if (result == 1) {
            // 相同
            map.put("message", "y");
        } else {
            // 不相同
            map.put("message", "n");
        }
        String json = JSON.toJSONString(map);
        System.out.println(json);
        return json;
    }

    @ResponseBody
    @PostMapping("checkGroupName")
    public String checkGroupName(String groupName){
        Boolean flag = earningsGroupService.checkGroupName(groupName);
        Map<String, String> map = new HashMap<>();
        if(flag){
            map.put("message", "y");
        }else {
            map.put("message", "n");
        }
        String json = JSON.toJSONString(map);
        System.out.println(json);
        return json;
    }


    @ResponseBody
    @PostMapping("addEarningsGroup")
    public String addEarningsGroup(String groupName, Integer[] idArr){
        earningsGroupService.addEarningsGroup(groupName,idArr);
        //添加分组.收益级别状态改为2.用于后期收益级别删除时判断此收益级别是否被分组
        for (Integer id : idArr) {
            earningsService.updEarningsStatus(2,id);
        }
        Map<String, String> map = new HashMap<>();
        map.put("message", "success");
        String json = JSON.toJSONString(map);
        System.out.println(json);
        return json;
    }

    @ResponseBody
    @PostMapping("checkGroupStatus")
    public String checkGroupStatus(String groupName){
        Boolean flag=earningsGroupService.checkGroupStatus(groupName);
        Map<String, String> map = new HashMap<>();
        if(flag){
            map.put("message", "y");
        }else {
            map.put("message", "n");
        }
        String json = JSON.toJSONString(map);
        System.out.println(json);
        return json;
    }

    @RequestMapping("deleteGroup")
    public String deleteGroup(String groupName,Integer productCode,Integer projectId,Model model){
        Integer n = earningsGroupService.deleteGroup(groupName);
        System.out.println("取消分组"+n);
        model.addAttribute("productCode",productCode);
        model.addAttribute("projectId",projectId);
        return "forward:/earnings/selectByProductCode";
    }

    //验证收益级别状态,如果该收益级别被分组,则不能删除
    @ResponseBody
    @PostMapping("checkEarningsStatus")
    public String checkEarningsStatus(Integer id){
        Boolean flag = earningsService.checkEarningsStatus(id);
        Map<String, String> map = new HashMap<>();
        if(flag){
            map.put("message", "y");
        }else {
            map.put("message", "n");
        }
        String json = JSON.toJSONString(map);
        System.out.println(json);
        return json;
    }

    @ResponseBody
    @PostMapping("checkCountByEarningsId")
    public String checkCountByEarningsId(Integer earningsId){
        Boolean flag = earningsGroupService.checkCountByEarningsId(earningsId);
        Map<String, String> map = new HashMap<>();
        if(flag){
            map.put("message", "y");
        }else {
            map.put("message", "n");
        }
        return JSON.toJSONString(map);
    }
}
