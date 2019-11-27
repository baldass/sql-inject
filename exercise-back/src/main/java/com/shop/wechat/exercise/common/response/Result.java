package com.shop.wechat.exercise.common.response;

/**
 * 请求响应类
 *
 * @author cgj
 */
public interface Result<T> {
    void setMsg(String msg);

    void setData(T t);
}
