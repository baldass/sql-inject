package com.shop.wechat.exercise.controller;

import com.shop.wechat.exercise.entity.BannerDetail;
import com.shop.wechat.exercise.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 首页逻辑控制
 *
 * @author bald ass
 */
@RequestMapping("/banner")
@RestController
public class BannerController {
    @Autowired
    private IndexService indexService;

    @RequestMapping("/all")
    public List<BannerDetail> showBanner() {
        return indexService.getBannerList();
    }
}
