package com.shop.wechat.exercise.controller;

import com.shop.wechat.exercise.dto.BannerDto;
import com.shop.wechat.exercise.entity.BannerEntity;
import com.shop.wechat.exercise.service.BannerService;
import com.shop.wechat.exercise.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 首页逻辑控制
 *
 * @author bald ass
 */
@RequestMapping("/banner")
@RestController
public class BannerController {
    @Autowired
    private BannerService bannerService;
    @Autowired
    private FileService fileService;

    @RequestMapping("/all")
    public List<BannerEntity> showBanner() {
        return bannerService.getBannerList();
    }

    @RequestMapping("/save/one")
    public Map saveBanner(BannerDto param) {
        String physAddress = fileService.upLoadFile();
        return bannerService.saveBannerData(param, physAddress);
    }
}
