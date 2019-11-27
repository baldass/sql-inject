package com.shop.wechat.exercise.common.wechat;

import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/**
 * http请求工具类
 */
public class HttpUtil {

    public static String stringResponse(String url, Map<String, String> params) {
        String result = null;
        try {
            InputStream is = streamResponse(url, params);
            BufferedReader in = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = in.readLine()) != null) {
                buffer.append(line);
            }
            result = buffer.toString();
        } catch (Exception e) {
            return null;
        }
        return result;
    }

    private static InputStream streamResponse(String url, Map<String, String> params) {
        if (StringUtils.isEmpty(url)) {
            return null;
        }
        InputStream is = null;
        try {
            StringBuffer urlSb = new StringBuffer(url);
            if (params != null && params.size() > 0) {
                urlSb.append("?");
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    String key = URLEncoder.encode(entry.getKey(), "UTF-8");
                    String value = URLEncoder.encode(entry.getValue(), "UTF-8");
                    urlSb.append(key).append('=').append(value).append('&');
                }
                urlSb.deleteCharAt(urlSb.length() - 1);
            }
            URL u = new URL(urlSb.toString());
            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Accept-Charset", "UTF-8");
            conn.setRequestProperty("contentType", "utf-8");
            conn.setConnectTimeout(50000);
            conn.setReadTimeout(50000);
            conn.setDoInput(true);// 设置请求方式，默认为GET
            conn.setRequestMethod("GET");
            is = conn.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return is;
    }
}
