package com.mashibing.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 通过接口实现文件上传
 * 文件上传
 * 多文件批量上传
 */
@Controller
public class UploadController {

    @RequestMapping("/upload")//上传多文件用数组
    public String upload(@RequestParam("file") MultipartFile[] multipartFile,@RequestParam(value = "desc",required = false) String desc) throws IOException {
        System.out.println(desc);
        //获取文件名称,
        for (MultipartFile mu: multipartFile){
            if(!mu.isEmpty()){
                System.out.println(mu.getOriginalFilename());
                //上传到的  指定路径
                mu.transferTo(new File("d:\\file\\"+mu.getOriginalFilename()));
            }
        }
        return "success";
    }

}
