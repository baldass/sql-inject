package com.shop.wechat.exercise.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 集合工具
 * @auther: bald ass
 * @date: 2019/11/20 2:41
 */
public class CollectsUtils {

    public static <E> List<E> iterable2List(Iterable<? extends E> iterable) {
        List<E> list = new ArrayList<>();
        if (iterable != null) {
            iterable.forEach(item -> list.add(item));
        }
        return list;
    }
}
