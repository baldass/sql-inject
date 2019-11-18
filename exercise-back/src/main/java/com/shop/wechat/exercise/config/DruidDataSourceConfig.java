package com.shop.wechat.exercise.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description: druid的数据源配置
 * @auther: bald ass
 * @date: 2019/11/18 9:19
 */
@PropertySource(value = "classpath:config/druid.properties")
@ConfigurationProperties(prefix = "druid")
@Configuration
public class DruidDataSourceConfig {
}
