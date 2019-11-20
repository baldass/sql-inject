package com.shop.wechat.exercise.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @description: 首页轮播图详情
 */
@Table(name = "banner_detail")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
@Entity
public class BannerEntity {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "banner_id", length = 32)
    private String id;
    @Column(name = "title", length = 64)
    private String title;
    @Column(name = "phys_address", nullable = false)
    private String physAddress;
    @Column(name = "url_address")
    private String urlAddress;
    @Column(name = "forward_address")
    private String forwardAddress;
    @Column(length = 2)
    @ColumnDefault("0")
    private Integer state;
    @Column(name = "update_date", columnDefinition = "datetime ON UPDATE CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date updateDate;
    @Column(name = "effects_date", columnDefinition = "datetime")
    private Date effectDate;
    @Column(name = "expire_date", columnDefinition = "datetime")
    private Date expireDate;
    private String remark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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
