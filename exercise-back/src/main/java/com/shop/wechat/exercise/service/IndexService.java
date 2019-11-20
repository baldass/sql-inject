package com.shop.wechat.exercise.service;

import com.shop.wechat.exercise.dto.BannerDto;

import java.util.List;

/**
 * @description: 首页service
 * @auther: bald ass
 * @date: 2019/11/20 1:17
 */
public interface IndexService {
    List<BannerDto> getBannerList();
}
