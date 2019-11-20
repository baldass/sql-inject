package com.shop.wechat.exercise.controller;

import com.shop.wechat.exercise.dto.BannerDto;
import com.shop.wechat.exercise.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 首页数据控制
 * @auther: bald ass
 * @date: 2019/11/20 9:12
 */
@RequestMapping("/index")
@RestController
public class IndexLogicController {
    @Autowired
    private IndexService indexService;

    @RequestMapping("/banners")
    public List<BannerDto> getBanners() {
        return indexService.getBannerList();
    }
}
