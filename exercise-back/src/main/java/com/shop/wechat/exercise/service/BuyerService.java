package com.shop.wechat.exercise.service;

import com.shop.wechat.exercise.common.exception.DockingException;
import com.shop.wechat.exercise.dto.BuyerDto;

import java.util.Map;

/**
 * @description: 顾客service
 * @auther: bald ass
 * @date: 2019/11/25 19:15
 */
public interface BuyerService {
    Map<String, Object> login(String code) throws DockingException;

    BuyerDto findBuyerByOpenId(String openId);

    String saveBuyerInfo(BuyerDto buyer);
}
