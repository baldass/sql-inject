package com.wechat.shop.exercise.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 首页controller层
 * @auther: bald ass
 * @date: 2019/10/21 21:52
 */
@Controller
public class IndexController {
    @Value("${welcome.words}")
    private String welcome;

    @RequestMapping(value = "")
    @ResponseBody
    public String welcomePage() {
        return welcome;
    }
}
