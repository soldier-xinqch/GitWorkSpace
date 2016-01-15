package com.xinqch.shiro.pojo;

import java.util.Date;

import com.xinqch.common.CommonEntity;

public class UrlFilter extends CommonEntity {
	
    private String filterId;

    private String filterUrl;

    private String filterShiroPermissions;

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