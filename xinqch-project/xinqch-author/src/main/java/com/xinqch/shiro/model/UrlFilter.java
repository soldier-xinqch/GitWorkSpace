package com.xinqch.shiro.model;

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

}