package com.shop.wechat.exercise.common.wechat.code;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 微信小程序错误码
 */
public class ErrCode {
    private final static Map<String, String> map;

    static {
        map = new HashMap<>();
        map.put("-1", "系统繁忙，请稍候再试");
        map.put("40029", "code 无效");
        map.put("45011", "频率限制，每个用户每分钟100次");
    }

    private ErrCode() {
    }

    public static String getMsg(String code) {
        return map.get(code);
    }
}
