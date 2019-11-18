package com.shop.wechat.exercise.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @description: 首页轮播图详情
 * @auther: bald ass
 * @date: 2019/11/18 1:03
 */
@Entity
public class BannerDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String 
}
