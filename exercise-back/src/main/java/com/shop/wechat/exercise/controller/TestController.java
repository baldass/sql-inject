package com.shop.wechat.exercise.controller;

import com.shop.wechat.exercise.dao.BuyerRepository;
import com.shop.wechat.exercise.entity.BuyerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 测试
 * @auther: bald ass
 * @date: 2019/11/27 21:41
 */
@RequestMapping("/test")
@RestController
public class TestController {
    @Autowired
    private BuyerRepository buyerRepository;

    @RequestMapping("/start")
    public Object test() {
        String openid = "www";
        Map<String, Object> map = new HashMap<>();
        BuyerEntity buyer = buyerRepository.findByOpenid(openid);
        if (buyer == null) {
            //新用户,直接自动注册
            buyer = new BuyerEntity();
            buyer.setOpenid(openid);
            buyer.setSessionKey("session_key");
            buyer.setName("新用户");
            buyer.setNickName("新用户");
            buyer.setCredit(0);
            BuyerEntity save = buyerRepository.save(buyer);
            String id = save.getId();
            map.put("id", id);
            map.put("is_new", "1");
        } else {
            //老用户返回id
            map.put("id", buyer.getId());
            map.put("is_new", "0");
        }
        return map;
    }
}
