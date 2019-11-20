package com.shop.wechat.exercise.service.impl;

import com.shop.wechat.exercise.dao.BannerRepository;
import com.shop.wechat.exercise.dto.BannerDto;
import com.shop.wechat.exercise.entity.BannerEntity;
import com.shop.wechat.exercise.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<BannerDto> getBannerList() {
        Iterable<BannerEntity> itr = bannerRepository.findListByState(1);
        List<BannerDto> list = new ArrayList<>();
        for (BannerEntity item : itr) {
            BannerDto param = BannerDto.getBanner(item);
            list.add(param);
        }
        return list;
    }
}
