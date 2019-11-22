package com.shop.wechat.exercise.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * @description: 文件上传下载 service
 * @auther: bald ass
 * @date: 2019/11/20 14:24
 */
public interface FileService {
    /**
     * 上传图片
     */
    String upLoadFile(MultipartFile file);

    /**
     * 下载图片
     */
    void showFile(String url, HttpServletResponse response);

    /**
     * 下载图片
     */
    void downLoadFile(String url, HttpServletResponse response);

    /**
     * 将图片转成Base64个数输出
     */
    String dowLoadBase64File(String url);
}
