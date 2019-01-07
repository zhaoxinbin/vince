package com.pactera.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.pactera.entity.product.Product;
import com.pactera.entity.project.Project;
import com.pactera.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/9/26.
 */
@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

//    @RequestMapping("toTop")
//    public String toTop(){
//        return "top_nav";
//    }

    //用于"取消"操作返回
//    @RequestMapping("toProductSearch")
//    public String toProductSearch() {
//        return "redirect:/product/selectProduct";
//    }

    @RequestMapping("selectProduct")
    public String selectProduct(Integer pageNum, Integer pageSize, Model model) {

        PageInfo<Product> pageInfo = productService.selectProduct(pageNum, pageSize);
        model.addAttribute("pageInfo", pageInfo);
//        List<Product> list = pageInfo.getList();
//        for (Product product : list) {
//            System.out.println(product);
//        }
        return "product_search";
    }

    @RequestMapping("selectProductDetail")
    public String selectProductDetail(Integer projectId, Integer productCode, Model model) {
        Product product = productService.selectProductDetail(projectId, productCode);
        model.addAttribute("product", product);
        return "product_info";
    }

    @RequestMapping("keywordSelectProduct")
    public String keywordSelectProduct(Model model, Integer pageNum, Integer pageSize, String productCode, String productName, String productRisk, String revenueType, String salesChannels) {
        PageInfo<Product> pageInfo = productService.keywordSelectProduct(pageNum, pageSize, productCode, productName, productRisk, revenueType, salesChannels);
        model.addAttribute("pageInfo", pageInfo);
        //页面查询关键词回显
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("productCode", productCode);
        model.addAttribute("productName", productName);
        model.addAttribute("productRisk", productRisk);
        model.addAttribute("revenueType", revenueType);
        model.addAttribute("salesChannels", salesChannels);
        return "product_search";
    }


    @PostMapping("getProjectModal")
    public String getProjectModal(String projectType, String projectName, Model model) {
        Project project = productService.getProjectModal(projectType, projectName);
        model.addAttribute("project", project);
        System.out.println(project);
        return "product_add";
    }

    @PostMapping("addProduct")
    public String addProduct(Product product, Model model) {
        Integer n = productService.addProduct(product);
        System.out.println("新建:" + n);
        if (n > 0) {
            model.addAttribute("info", "新建成功");
        } else {
            model.addAttribute("info", "新建失败");
        }
        return "redirect:/product/selectProduct";
    }

    @RequestMapping("updateProductPage")
    public String updateProductPage(Integer projectId, Integer productCode, Model model) {
        Product product = productService.selectProductDetail(projectId, productCode);
        model.addAttribute("product", product);
        return "product_modify";
    }

    @PostMapping("updateProduct")
    public String updateProduct(Product product, Model model) {
        Integer n = productService.updateProduct(product);
        System.out.println("修改:" + n);
        System.out.println(product);
        if (n > 0) {
            model.addAttribute("info", "修改成功");
        } else {
            model.addAttribute("info", "修改失败");
        }
        return "forward:/product/selectProduct";
    }

    @RequestMapping("deleteProduct")
    public String deleteProduct(Integer productCode) {
        Integer n = productService.updateProductStatus(productCode, 0);
        System.out.println("删除:" + n);
        return "redirect:/product/selectProduct";
    }

    @ResponseBody
    @PostMapping("checkProductName")
    public String checkProductName(String productName) {
        Integer n = productService.checkProductName(productName);
        Map<String, String> map = new HashMap<>();
        if (n == 0) {
            map.put("message", "y");
        } else {
            map.put("message", "n");
        }
        String json = JSON.toJSONString(map);
        System.out.println(productName);
        System.out.println(json);
        return json;
    }
}
