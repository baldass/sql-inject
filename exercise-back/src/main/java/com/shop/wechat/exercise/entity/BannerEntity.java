package com.shop.wechat.exercise.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @description: 首页轮播图详情
 */
@Table(name = "banner_detail")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Entity
public class BannerEntity extends SuperEntity {
    @Column(name = "title", length = 64)
    private String title;
    @Column(name = "phys_address", nullable = false)
    private String physAddress;
    @Column(name = "url_address")
    private String urlAddress;
    @Column(name = "forward_address")
    private String forwardAddress;

    @Column(name = "effects_date")
    @Temporal(TemporalType.TIME)
    private Date effectDate;
    @Column(name = "expire_date")
    @Temporal(TemporalType.TIME)
    private Date expireDate;
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
