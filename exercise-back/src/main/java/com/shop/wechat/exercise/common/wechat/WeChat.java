package com.shop.wechat.exercise.common.wechat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description: 微信相关
 * @auther: bald ass
 * @date: 2019/11/25 22:12
 */
@Component
public class WeChat {

    private String appid;

    private String secret;

    public String getAppid() {
        return appid;
    }

    @Value("${wechat.appid}")
    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    @Value("${wechat.appsecret}")
    public void setSecret(String secret) {
        this.secret = secret;
    }
}
