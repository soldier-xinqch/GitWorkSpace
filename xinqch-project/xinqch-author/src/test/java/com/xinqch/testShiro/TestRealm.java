package com.xinqch.testShiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.Realm;

public class TestRealm implements Realm{

	@Override
	public AuthenticationInfo getAuthenticationInfo(AuthenticationToken arg0)
			throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return "testRealm";
	}

	@Override
	public boolean supports(AuthenticationToken token) {
		 //仅支持UsernamePasswordToken类型的Token  
        return token instanceof UsernamePasswordToken; 
	}
	

}
