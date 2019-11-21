package com.shop.wechat.exercise.service.impl;

import com.shop.wechat.exercise.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String upLoadFile(MultipartFile file) {
        String filename = file.getOriginalFilename();
        String filePath = "D:/temp/";
        File tempFile = new File(filePath + filename);
        try {
            file.transferTo(tempFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "文件上传未实现";
    }
}
