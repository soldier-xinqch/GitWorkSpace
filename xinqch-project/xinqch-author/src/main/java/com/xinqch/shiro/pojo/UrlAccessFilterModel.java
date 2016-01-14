package com.xinqch.shiro.pojo;

import com.xinqch.common.CommonEntity;
/**
 *  url连接访问拦截实体  持久进db中
 * @author xinqch
 *
 */
public class UrlAccessFilterModel extends CommonEntity{

	private static final long serialVersionUID = 5505213678185487922L;
	/*记录ID**/
	public String urlId;  
	/*url名称/描述   **/
	public String urlName; 
	/*url地址   **/
	public String urlAdress; 
	/*所需要的角色，可省略  **/
	public String UrlRoles; 
	/*所需要的权限，可省略 **/
    public String permissions; 
	public String getUrlId() {
		return urlId;
	}
	public void setUrlId(String urlId) {
		this.urlId = urlId;
	}
	public String getUrlName() {
		return urlName;
	}
	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
	public String getUrlAdress() {
		return urlAdress;
	}
	public void setUrlAdress(String urlAdress) {
		this.urlAdress = urlAdress;
	}
	public String getUrlRoles() {
		return UrlRoles;
	}
	public void setUrlRoles(String urlRoles) {
		UrlRoles = urlRoles;
	}
	public String getPermissions() {
		return permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
    
}
