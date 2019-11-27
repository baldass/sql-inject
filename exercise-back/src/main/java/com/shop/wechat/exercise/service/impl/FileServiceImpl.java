package com.shop.wechat.exercise.service.impl;

import com.shop.wechat.exercise.common.SystemParam;
import com.shop.wechat.exercise.service.FileService;
import com.shop.wechat.exercise.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private SystemParam systemParam;

    @Override
    public String upLoadFile(MultipartFile file) {
        String filename = file.getOriginalFilename();
        String filePath = "D:/temp/";
        StringBuffer physAddress = new StringBuffer();
        try {
            physAddress.append(filePath).append(filename);
            File tempFile = new File(filePath + filename);
            file.transferTo(tempFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return physAddress.toString();
    }

    @Override
    public void showFile(String url, HttpServletResponse response) {
        String fileName = "C:/Users/40857/Pictures/Saved Pictures/test (1).jpg";
        //todo 验证文件夹和文件是否存在
        File file = new File(fileName);
        //配置文件展示
        response.setHeader("Content-Length", String.valueOf(file.length()));
        response.setContentType("image/jpeg");//todo 这里要根据图片格式更改,具体的要查一下
        //
        FileUtils.readFile(response, file);
    }


    @Override
    public void downLoadFile(String url, HttpServletResponse response) {
        String fileName = "C:/Users/40857/Pictures/Saved Pictures/test (2).jpg";
        //todo 验证文件夹和文件是否存在
        File file = new File(fileName);
        // 配置文件下载
        response.setHeader("content-type", "application/octet-stream");
        response.setContentType("application/octet-stream");
        // 下载文件能正常显示中文
        try {
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        FileUtils.readFile(response, file);
    }

    @Override
    public String dowLoadBase64File(String url) {
        String fileName = "C:/Users/40857/Pictures/Saved Pictures/test (3).jpg";
        File file = new File(fileName);
        return null;
    }


}
