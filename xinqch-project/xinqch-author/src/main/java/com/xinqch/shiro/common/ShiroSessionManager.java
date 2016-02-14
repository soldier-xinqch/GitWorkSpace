package com.xinqch.shiro.common;

import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.stereotype.Component;

@Component
public class ShiroSessionManager extends DefaultWebSessionManager {
	
	public ShiroSessionManager() {
		super();
		//设置会话的全局过期时间（毫秒为单位）一周
		this.setGlobalSessionTimeout(7*24*60*60*60);
	}

}
