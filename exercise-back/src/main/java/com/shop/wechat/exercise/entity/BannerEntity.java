package com.shop.wechat.exercise.entity;

import com.shop.wechat.exercise.common.SuperEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @description: 首页轮播图详情
 */
@Table(name = "banner_detail")
@org.hibernate.annotations.Table(appliesTo = "banner_detail", comment = "轮播图详情表")
@Entity
public class BannerEntity extends SuperEntity {
    @Column(name = "title", length = 64, columnDefinition = "varchar(64) COMMENT '标题'")
    private String title;
    @Column(name = "phys_address", nullable = false, columnDefinition = "varchar(255) COMMENT '物理地址'")
    private String physAddress;
    @Column(name = "url_address", columnDefinition = "varchar(255) COMMENT 'url地址'")
    private String urlAddress;
    @Column(name = "forward_address", columnDefinition = "varchar(255) COMMENT '转跳地址(点击这张图要调到哪里)'")
    private String forwardAddress;
    @Column(name = "effects_date", columnDefinition = "datetime COMMENT '生效时间'")
    private Date effectDate;
    @Column(name = "expire_date", columnDefinition = "datetime COMMENT '过期时间'")
    private Date expireDate;
    @Column
    private String remark;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhysAddress() {
        return physAddress;
    }

    public void setPhysAddress(String physAddress) {
        this.physAddress = physAddress;
    }

    public String getUrlAddress() {
        return urlAddress;
    }

    public void setUrlAddress(String urlAddress) {
        this.urlAddress = urlAddress;
    }

    public Date getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getForwardAddress() {
        return forwardAddress;
    }

    public void setForwardAddress(String forwardAddress) {
        this.forwardAddress = forwardAddress;
    }
}
