package com.shop.wechat.exercise.entity;

import com.shop.wechat.exercise.common.SuperEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * @description: 顾客entity
 * @auther: bald ass
 * @date: 2019/11/25 17:01
 */
@Table(name = "buyer")
@org.hibernate.annotations.Table(appliesTo = "buyer", comment = "顾客表")
@Entity
public class BuyerEntity extends SuperEntity {
    @Column(length = 32, columnDefinition = "varchar(32) COMMENT '小程序的openid'")
    private String openid;
    @Column(length = 32, columnDefinition = "varchar(32) COMMENT '小程序的session_key'")
    private String sessionKey;
    @Column(length = 32, columnDefinition = "varchar(32) COMMENT '小程序的UnionID'")
    private String unionId;
    @Column(length = 32, columnDefinition = "varchar(32) COMMENT '姓名'")
    private String name;
    @Column(length = 32, columnDefinition = "varchar(32) COMMENT '昵称'")
    private String nickName;
    @Column(length = 255, columnDefinition = "varchar(255) COMMENT '头像Url'")
    private String avatarUrl;
    @Column(length = 255, columnDefinition = "varchar(255) COMMENT '住址'")
    private String address;
    @Column(length = 255, columnDefinition = "varchar(255) COMMENT '默认快递地址'")
    private String expressDefault;
    @Column(length = 4, columnDefinition = "int(4) COMMENT '信用'")
    private Integer credit;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExpressDefault() {
        return expressDefault;
    }

    public void setExpressDefault(String expressDefault) {
        this.expressDefault = expressDefault;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}
