package com.shop.wechat.exercise.dto;

import com.shop.wechat.exercise.entity.BannerEntity;
import com.shop.wechat.exercise.utils.DateUtils;

import java.io.Serializable;

/**
 * @description: 轮播图dto
 * @auther: bald ass
 * @date: 2019/11/20 9:47
 */
public class BannerDto implements Serializable {
    private String title;
    private String url_address;
    private String forward_address;
    private String effect_date;
    private String expire_date;

    public static BannerEntity createEntity(BannerDto origin) {
        BannerEntity entity = new BannerEntity();
        entity.setTitle(origin.getTitle());
        entity.setUrlAddress(origin.getUrl_address());
        entity.setForwardAddress(origin.getForward_address());
        return entity;
    }

    public static BannerDto getBanner(BannerEntity origin) {
        BannerDto banner = new BannerDto();
        banner.title = origin.getTitle();
        banner.url_address = origin.getUrlAddress();
        banner.forward_address = origin.getForwardAddress();
        banner.effect_date = DateUtils.date2String(origin.getEffectDate());
        banner.expire_date = DateUtils.date2String(origin.getExpireDate());
        return banner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl_address() {
        return url_address;
    }

    public void setUrl_address(String url_address) {
        this.url_address = url_address;
    }

    public String getForward_address() {
        return forward_address;
    }

    public void setForward_address(String forward_address) {
        this.forward_address = forward_address;
    }

    public String getEffect_date() {
        return effect_date;
    }

    public void setEffect_date(String effect_date) {
        this.effect_date = effect_date;
    }

    public String getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(String expire_date) {
        this.expire_date = expire_date;
    }
}
