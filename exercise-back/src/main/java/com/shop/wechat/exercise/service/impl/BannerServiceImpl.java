package com.shop.wechat.exercise.service.impl;

import com.shop.wechat.exercise.common.CompareEnum;
import com.shop.wechat.exercise.dao.BannerRepository;
import com.shop.wechat.exercise.dto.BannerDto;
import com.shop.wechat.exercise.entity.BannerEntity;
import com.shop.wechat.exercise.service.BannerService;
import com.shop.wechat.exercise.utils.CollectsUtils;
import com.shop.wechat.exercise.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerRepository bannerRepository;

    @Override
    public List<BannerEntity> getBannerList() {
        Iterable<BannerEntity> banners = bannerRepository.findAll();
        List<BannerEntity> list = CollectsUtils.iterable2List(banners);
        return list;
    }

    /*

     */
    @Override
    public Map saveBannerData(BannerDto param, String physAddress) {
        Map<String, Object> map = new HashMap<>();
        BannerEntity entity = BannerDto.createEntity(param);
        entity.setPhysAddress(physAddress);
        String effect = param.getEffect_date();
        if (!StringUtils.isEmpty(effect)) {
            try {
                entity.setEffectDate(DateUtils.string2Date(effect));
            } catch (ParseException e) {
                //格式不正确
            }
        }
        String expire = param.getExpire_date();
        if (!StringUtils.isEmpty(expire)) {
            try {
                entity.setEffectDate(DateUtils.string2Date(expire));
            } catch (ParseException e) {
                //格式不正确
            }
        }
        Date now = new Date();
        CompareEnum compare = DateUtils.compare(now, entity.getEffectDate());
        if (CompareEnum.SMALLER == compare) {
            entity.setState(1);
        } else {
            entity.setState(0);
        }
        BannerEntity save = bannerRepository.save(entity);
        String id = save.getId();
        if (StringUtils.isEmpty(id)) {
            map.put("code", "0");
            map.put("msg", "保存失败");
        } else {
            map.put("code", "1");
            map.put("msg", "保存成功!");
            map.put("data", save);
        }
        return map;
    }
}
