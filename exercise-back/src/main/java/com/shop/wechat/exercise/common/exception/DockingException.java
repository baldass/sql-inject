package com.shop.wechat.exercise.common.exception;

/**
 * @description: 对接其他项目异常
 */
public class DockingException extends Exception {
    private String code;

    public DockingException(String code, String message) {
        super(message);
        this.code = code;
    }

    public String getCode(String code) {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
