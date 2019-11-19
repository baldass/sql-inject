package com.shop.wechat.exercise.repository;

import com.shop.wechat.exercise.entity.BannerDetail;
import org.springframework.data.repository.CrudRepository;

/**
 * @description: banner_detail表
 * @auther: bald ass
 * @date: 2019/11/20 1:38
 */
public interface BannerRepository extends CrudRepository<BannerDetail, String> {
}
