package com.shop.wechat.exercise.service;

import com.shop.wechat.exercise.dto.BannerDto;
import com.shop.wechat.exercise.entity.BannerEntity;

import java.util.List;
import java.util.Map;

/**
 * @description: 轮播图 service
 * @auther: bald ass
 * @date: 2019/11/20 9:18
 */
public interface BannerService {
    List<BannerEntity> getBannerList();

    Map saveBannerData(BannerDto param,String physAddress);
}
