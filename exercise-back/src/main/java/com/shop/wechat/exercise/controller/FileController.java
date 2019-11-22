package com.shop.wechat.exercise.controller;

import com.shop.wechat.exercise.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @description: 文件上传下载
 * @auther: bald ass
 * @date: 2019/11/22 15:12
 */
@Controller
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileService fileService;

    @RequestMapping("/download/{url}")
    public void getFile(@PathVariable String url, HttpServletResponse response) {
        fileService.downLoadFile(url, response);
    }

    @RequestMapping("/show/{url}")
    public void showFile(@PathVariable String url, HttpServletResponse response) {
        fileService.showFile(url, response);
    }
}
