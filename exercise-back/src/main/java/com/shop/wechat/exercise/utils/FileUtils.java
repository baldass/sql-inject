package com.shop.wechat.exercise.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @description: 文件控制类
 * @auther: bald ass
 * @date: 2019/11/22 16:35
 */
public class FileUtils {
    /**
     *
     * @author cgj
     */
    public static void readFile(HttpServletResponse response, File file) {
        BufferedInputStream inputStream = null;
        FileInputStream fileInputStream = null;
        OutputStream outputStream = null;
        byte[] buff = new byte[1024];
        try {
            fileInputStream = new FileInputStream(file);
            inputStream = new BufferedInputStream(fileInputStream);
            outputStream = response.getOutputStream();
            int i = inputStream.read(buff);
            while (i != -1) {
                outputStream.write(buff);
                i = inputStream.read(buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
