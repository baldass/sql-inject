package com.shop.wechat.exercise.dao;

import com.shop.wechat.exercise.entity.BuyerEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @description: buyer表
 * @auther: bald ass
 * @date: 2019/11/25 19:17
 */
public interface BuyerRepository extends CrudRepository<BuyerEntity, String> {
    BuyerEntity findByOpenid(String openId);

}
