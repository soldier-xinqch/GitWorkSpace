package com.xinqch.shiro.common;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.AccessControlFilter;
import org.springframework.stereotype.Component;

@Component
public class ShiroValidFilter extends AccessControlFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest arg0,
			ServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest arg0, ServletResponse arg1)
			throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
