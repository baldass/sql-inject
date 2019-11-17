package com.shop.wechat.exercise.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 首页页面控制
 * @author bald ass
 */
@Controller
public class IndexViewController {
    @Value("${welcome.words}")
    private String welcome;

    @RequestMapping(value = "")
    @ResponseBody
    public String welcomePage() {
        return welcome;
    }
}
