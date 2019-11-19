package com.shop.wechat.exercise.service.impl;

import com.shop.wechat.exercise.entity.BannerDetail;
import com.shop.wechat.exercise.repository.BannerRepository;
import com.shop.wechat.exercise.service.IndexService;
import com.shop.wechat.exercise.utils.CollectsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @auther: bald ass
 * @date: 2019/11/20 1:19
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private BannerRepository bannerRepository;

    @Override
    public List<BannerDetail> getBannerList() {
        Iterable<BannerDetail> banners = bannerRepository.findAll();
        List<BannerDetail> list = CollectsUtils.iterable2List(banners);
        return list;
    }
}
