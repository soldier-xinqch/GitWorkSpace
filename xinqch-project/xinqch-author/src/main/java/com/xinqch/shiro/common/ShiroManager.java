package com.xinqch.shiro.common;

import javax.annotation.PostConstruct;

import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xinqch.shiro.realm.LoginRealm;

@Component
public class ShiroManager extends DefaultWebSecurityManager {
	
	@Autowired
	private LoginRealm loginRealm;
	@Autowired
	private ShiroSessionManager shiroSessionManager;
//	@Autowired
//	private MemoryConstrainedCacheManager cacheManager;
//	private EhCacheManager cacheManager;
	/**
	 *  添加缓存，和验证机制支持
	 */
	public ShiroManager() {
		super();
	}
	
	@PostConstruct 
	public void setParams(){
		/**缓存器**/
//		this.setCacheManager(cacheManager);
		/**认证中心**/
		this.setRealm(loginRealm);
		/**session管理器**/
		this.setSessionManager(shiroSessionManager);
//		this.setRememberMeManager(rememberMeManager);
	}
}
