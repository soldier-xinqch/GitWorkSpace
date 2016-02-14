package com.xinqch.model;

import com.xinqch.common.CommonEntity;

public class CustomerUrl extends CommonEntity {
	/*记录ID**/
    private String urlId;
    /*url名称/描述   **/
    private String urlName;
    /*url地址   **/
    private String urlAdress;
    /*所需要的角色ID，可省略  **/
    private String urlRolesId;
    /*所需要的角色，可省略  **/
    private String urlRoles;
    /*所需要的权限，可省略 **/
    private String permissions;
    /* shiro的验证机制 是anon 还是其他的验证拦截 */
    private String shiroValid;

    private static final long serialVersionUID = 1L;

    public String getUrlId() {
        return urlId;
    }

    public void setUrlId(String urlId) {
        this.urlId = urlId == null ? null : urlId.trim();
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName == null ? null : urlName.trim();
    }

    public String getUrlAdress() {
        return urlAdress;
    }

    public void setUrlAdress(String urlAdress) {
        this.urlAdress = urlAdress == null ? null : urlAdress.trim();
    }

    public String getUrlRolesId() {
        return urlRolesId;
    }

    public void setUrlRolesId(String urlRolesId) {
        this.urlRolesId = urlRolesId == null ? null : urlRolesId.trim();
    }

    public String getUrlRoles() {
        return urlRoles;
    }

    public void setUrlRoles(String urlRoles) {
        this.urlRoles = urlRoles == null ? null : urlRoles.trim();
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions == null ? null : permissions.trim();
    }

    public String getShiroValid() {
        return shiroValid;
    }

    public void setShiroValid(String shiroValid) {
        this.shiroValid = shiroValid == null ? null : shiroValid.trim();
    }
}