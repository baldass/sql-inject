package com.shop.wechat.exercise.common.wechat;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 微信登陆
 *
 * @author cgj
 */
@Component
public class WxLogin {
    private String url;
    private String appid;
    private String secret;
    private String grant_type;

    public JSONObject login(String code) {
        Map<String, String> param = new HashMap<>();
        param.put("appid", appid);
        param.put("secret", secret);
        param.put("js_code", code);
        param.put("grant_type", grant_type);
        String response = HttpUtil.stringResponse(url, param);
        return JSONObject.parseObject(response);
    }

    @Value("https://api.weixin.qq.com/sns/jscode2session")
    public void setUrl(String url) {
        this.url = url;
    }

    @Value("${wechat.appid}")
    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Value("${wechat.appsecret}")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Value("authorization_code")
    public String getGrant_type() {
        return grant_type;
    }

    public String getUrl() {
        return url;
    }

    public String getAppid() {
        return appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }
}
