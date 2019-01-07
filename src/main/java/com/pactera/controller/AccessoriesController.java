package com.pactera.controller;

import com.pactera.entity.product.Accessories;
import com.pactera.service.product.AccessoriesService;
import com.pactera.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2018/9/29.
 */
@Controller
@RequestMapping("accessories")
public class AccessoriesController {
    @Autowired
    private AccessoriesService accessoriesService;

    @RequestMapping("selectAccessoriesByProductCode")
    public String selectAccessoriesByProductCode(Integer projectId, Integer productCode, Model model) {
        List<Accessories> list = accessoriesService.selectAccessoriesByProductCode(productCode);
        model.addAttribute("list", list);
        model.addAttribute("projectId", projectId);
        model.addAttribute("productCode", productCode);
//        for (Accessories accessories : list) {
//            System.out.println(accessories);
//        }
        return "attachment";
    }

    @RequestMapping("getAccessoriesById")
    public String getAccessoriesById(Integer id, Integer projectId, Model model) {
        Accessories accessories = accessoriesService.getAccessoriesById(id);
        model.addAttribute("accessories", accessories);
        model.addAttribute("projectId", projectId);
        return "attachment_modify";
    }

    @RequestMapping("getAccessoriesByDocumentTypeOrUploadTime")
    public String getAccessoriesByDocumentTypeOrUploadTime(Integer projectId, Integer productCode, String documentType, String uploadTime, Model model) {
        List<Accessories> list = accessoriesService.getAccessoriesByDocumentTypeOrUploadTime(documentType, uploadTime, productCode);
        model.addAttribute("projectId", projectId);
        model.addAttribute("productCode", productCode);
        //查询关键词回显
        model.addAttribute("documentType", documentType);
        model.addAttribute("uploadTime", uploadTime);
        model.addAttribute("list", list);
        return "attachment";
    }

    @PostMapping("updateAccessories")
    public String updateAccessories(Accessories accessories, Integer projectId, Model model) {
        Integer n = accessoriesService.updateAccessories(accessories);
        System.out.println(accessories);
        System.out.println("附件修改" + n);
        if (n > 0) {
            model.addAttribute("info", "修改成功");
        } else {
            model.addAttribute("info", "修改失败");
        }
        Integer productCode = accessories.getProductCode();

        return "redirect:/accessories/selectAccessoriesByProductCode?productCode=" + productCode + "&projectId=" + projectId;
    }

    @RequestMapping("deleteAccessories")
    public String deleteAccessories(Integer id, Integer productCode, Integer projectId, Model model) {
        Integer n = accessoriesService.updateAccessoriesStatus(0, id);
        System.out.println("附件删除:" + n);
        model.addAttribute("productCode", productCode);
        model.addAttribute("projectId", projectId);
        return "forward:/accessories/selectAccessoriesByProductCode";
    }

    @RequestMapping("toAccessoriesAdd")
    public String toAccessoriesAdd(Integer productCode, Integer projectId, Model model) {
        model.addAttribute("productCode", productCode);
        model.addAttribute("projectId", projectId);
        return "attachment_add";
    }


    @PostMapping("addAccessories")
    @ResponseBody
    public ModelAndView addAccessories(@RequestParam("file") MultipartFile file, Accessories accessories, Integer projectId, HttpServletRequest request, Model model) {
        //String contentType = file.getContentType();
        String originalFileName= file.getOriginalFilename();
        //生成uuid作为文件名称
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        //获得文件后缀名
        String suffixName=originalFileName.substring(originalFileName.indexOf(".")-1,originalFileName.length());
        //String suffixName=contentType.substring(contentType.indexOf("/")+1);
        //得到文件名
        String fileName=uuid+suffixName;

        long fileSize = file.getSize() / 1000;
        //String filePath = request.getSession().getServletContext().getRealPath("fileupload");
        String filePath = "F:\\vince\\src\\main\\resources\\static\\fileupload\\";
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //数据库存储文件路径
        String path="/static/fileupload/"+fileName;
        accessories.setFilePath(path);
        accessories.setFileSize((double) fileSize);
        accessoriesService.addAccessories(accessories);
        Integer productCode = accessories.getProductCode();
        model.addAttribute("productCode", productCode);
        model.addAttribute("projectId", projectId);
        return new ModelAndView("forward:/accessories/toAccessoriesAdd");
        //"<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/></head><body onload='JavaScript:history.go(-1)'></body></html>";
    }
}
