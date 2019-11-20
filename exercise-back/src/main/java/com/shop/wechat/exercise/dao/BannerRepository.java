package com.shop.wechat.exercise.dao;

import com.shop.wechat.exercise.entity.BannerEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @description: banner_detail表
 * @auther: bald ass
 * @date: 2019/11/20 1:38
 */
public interface BannerRepository extends CrudRepository<BannerEntity, String> {
    Iterable<BannerEntity> findListByState(int state);
}
