package com.shop.wechat.exercise.controller;

import com.shop.wechat.exercise.common.exception.DockingException;
import com.shop.wechat.exercise.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @description: 顾客controller
 * @auther: bald ass
 * @date: 2019/11/25 19:14
 */
@RequestMapping("/buyer")
@RestController
public class BuyerController {
    @Autowired
    private BuyerService buyerService;


    @RequestMapping("/login")
    public Map<String, Object> login(String code) throws DockingException {
        return buyerService.login(code);
    }
}
