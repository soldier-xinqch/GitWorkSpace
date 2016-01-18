package com.xinqch.shiro.model;

import java.io.Serializable;
import java.util.Date;

public class UrlFilter implements Serializable {
    private String filterId;

    private String filterUrl;

    private String filterShiroPermissions;

    private Boolean delFlag;

    private String createUser;

    private Date createTime;

    private String modifyUser;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public String getFilterId() {
        return filterId;
    }

    public void setFilterId(String filterId) {
        this.filterId = filterId == null ? null : filterId.trim();
    }

    public String getFilterUrl() {
        return filterUrl;
    }

    public void setFilterUrl(String filterUrl) {
        this.filterUrl = filterUrl == null ? null : filterUrl.trim();
    }

    public String getFilterShiroPermissions() {
        return filterShiroPermissions;
    }

    public void setFilterShiroPermissions(String filterShiroPermissions) {
        this.filterShiroPermissions = filterShiroPermissions == null ? null : filterShiroPermissions.trim();
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}