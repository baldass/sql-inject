package com.shop.wechat.exercise.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 系统设置 entity
 */
@Table(name = "system_config")
@Entity
public class SystemEntity extends SuperEntity{
    @Column(length = 32)
    private String companyId;
    @Column
    private String url;
    @Column
    private String path;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
