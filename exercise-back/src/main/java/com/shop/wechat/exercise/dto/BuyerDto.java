package com.shop.wechat.exercise.dto;

import com.shop.wechat.exercise.entity.BuyerEntity;

/**
 * @description: 顾客 dto
 * @auther: bald ass
 * @date: 2019/11/25 21:20
 */
public class BuyerDto {
    private String buyer_id;
    private String name;
    private String nick_name;
    private String avatar_url;
    private String address;
    private String express_default;
    private Integer credit;

    public static BuyerEntity createEntity(BuyerDto origin) {
        BuyerEntity entity = new BuyerEntity();
        entity.setId(origin.getBuyer_id());
        entity.setName(origin.getName());
        entity.setNickName(origin.getNick_name());
        entity.setAvatarUrl(origin.getAvatar_url());
        entity.setAddress(origin.getAddress());
        entity.setExpressDefault(origin.getExpress_default());
        entity.setCredit(origin.getCredit());
        return entity;
    }

    public static BuyerDto getBuyer(BuyerEntity origin) {
        BuyerDto buyer = new BuyerDto();
        buyer.setBuyer_id(origin.getId());
        buyer.setName(origin.getName());
        buyer.setNick_name(origin.getNickName());
        buyer.setAvatar_url(origin.getAvatarUrl());
        buyer.setAddress(origin.getAddress());
        buyer.setExpress_default(origin.getExpressDefault());
        buyer.setCredit(origin.getCredit());
        return buyer;
    }

    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExpress_default() {
        return express_default;
    }

    public void setExpress_default(String express_default) {
        this.express_default = express_default;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}
