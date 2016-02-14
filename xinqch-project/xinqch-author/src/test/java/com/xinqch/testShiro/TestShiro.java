package com.xinqch.testShiro;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.ModularRealmAuthorizer;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;



public class TestShiro {
	
	@Test
	public void testHelloworld() {
	    //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
	    Factory<org.apache.shiro.mgt.SecurityManager> factory =
	            new IniSecurityManagerFactory("classpath:testConfig/shiro.ini");
	    //2、得到SecurityManager实例 并绑定给SecurityUtils
	    org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
	    SecurityUtils.setSecurityManager(securityManager);
	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
	    Subject subject = SecurityUtils.getSubject();
	    UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");

	    try {
	        //4、登录，即身份验证
	        subject.login(token);
	    } catch (AuthenticationException e) {
	        //5、身份验证失败
	    }

	    System.out.println(subject.isAuthenticated());
	    Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录

	    //6、退出
	    subject.logout();
	}
	
    @Test
    public void testAllSuccessfulStrategyWithSuccess() {
    	//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
	    Factory<org.apache.shiro.mgt.SecurityManager> factory =
	            new IniSecurityManagerFactory("classpath:testConfig/shiro.ini");
	    //2、得到SecurityManager实例 并绑定给SecurityUtils
	    DefaultSecurityManager securityManager = (DefaultSecurityManager) factory.getInstance();
	    
	    ModularRealmAuthorizer ss = new ModularRealmAuthorizer();
	    TestRealm se = new TestRealm();
	    Collection<Realm> realm = new ArrayList<Realm>();
	    realm.add(se);
	    ss.setRealms(realm);
	    
	    SecurityUtils.setSecurityManager(securityManager);
	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
	    Subject subject = SecurityUtils.getSubject();
	    UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");

        //4、登录，即身份验证
        subject.login(token);

        //得到一个身份集合，其包含了Realm验证成功的身份信息
        PrincipalCollection principalCollection = subject.getPrincipals();
        Assert.assertEquals(2, principalCollection.asList().size());
    }
}
