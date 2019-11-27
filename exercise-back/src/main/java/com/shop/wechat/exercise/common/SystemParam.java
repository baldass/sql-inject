package com.shop.wechat.exercise.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 系统参数
 *
 * @author cgj
 */
@Component
public class SystemParam {
    @Value("${project.path}")
    private String path;
    @Value("${project.url}")
    private String url;
    @Value("${wechat.appid}")
    private String appid;

    @Value("${wechat.appsecret}")
    private String secret;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "SystemParam{" +
                "path='" + path + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
