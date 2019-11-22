package com.shop.wechat.exercise.utils;

import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

/**
 * @description:
 * @auther: bald ass
 * @date: 2019/11/22 16:45
 */
public class TestUtils {
    public static void showResponseDetail(HttpServletResponse response) {
        Collection<String> headers = response.getHeaderNames();
        System.out.println("Headers==>");
        for (String header : headers) {
            System.out.println("key:" + header + "\t value:" + response.getHeader(header));
        }
        String contentType = response.getContentType();
        System.out.println("content-type:==>\n" + contentType);
    }
}
