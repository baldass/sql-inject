package com.shop.wechat.exercise.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @description: 文件上传下载 service
 * @auther: bald ass
 * @date: 2019/11/20 14:24
 */
public interface FileService {
    String upLoadFile(MultipartFile file);
}
