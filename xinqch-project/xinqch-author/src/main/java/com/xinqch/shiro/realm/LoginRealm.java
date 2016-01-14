package com.xinqch.shiro.realm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xinqch.model.User;
import com.xinqch.service.UserService;

@Component("loginRealm")
public class LoginRealm extends AuthorizingRealm {
	
	@Autowired
	private UserService userService;

	/** 
     * 为当前登录的Subject授予角色和权限 
     * @see 经测试:本例中该方法的调用时机为需授权资源被访问时 
     * @see 经测试:并且每次访问需授权资源时都会执行该方法中的逻辑,这表明本例中默认并未启用AuthorizationCache 
     * @see 个人感觉若使用了Spring3.1开始提供的ConcurrentMapCache支持,则可灵活决定是否启用AuthorizationCache 
     * @see 比如说这里从数据库获取权限信息时,先去访问Spring3.1提供的缓存,而不使用Shior提供的AuthorizationCache 
     */  
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("授权时调用");
		//获取当前登录的用户名,等价于(String)principals.fromRealm(this.getName()).iterator().next()  
        String currentUsername = (String)super.getAvailablePrincipal(principals);  
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();  
        //实际中可能会像上面注释的那样从数据库取得  
        if(null!=currentUsername && "jadyer".equals(currentUsername)){  
            //添加一个角色,不是配置意义上的添加,而是证明该用户拥有admin角色    
            simpleAuthorInfo.addRole("admin");  
            //添加权限  
            simpleAuthorInfo.addStringPermission("admin:manage");  
            System.out.println("--已为用户[jadyer]赋予了[admin]角色和[admin:manage]权限");  
            return simpleAuthorInfo;  
        }else if(null!=currentUsername && "玄玉".equals(currentUsername)){  
            System.out.println("--当前用户[玄玉]无授权");  
            return simpleAuthorInfo;  
        }  
        //若该方法什么都不做直接返回null的话,就会导致任何用户访问/admin/listUser.jsp时都会自动跳转到unauthorizedUrl指定的地址  
        //详见applicationContext.xml中的<bean id="shiroFilter">的配置  
		return null;
	}
	/** 
     * 验证当前登录的Subject 
     * @see 经测试:本例中该方法的调用时机为LoginController.login()方法中执行Subject.login()时 
     */  
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		System.out.println("验证身份是调用");
		//获取基于用户名和密码的令牌  
        //实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的  
        //两个token的引用都是一样的,本例中是org.apache.shiro.authc.UsernamePasswordToken@33799a1e  
        UsernamePasswordToken token = (UsernamePasswordToken)authcToken;  
//        System.out.println("验证当前Subject时获取到token为" + ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));  
//      User user = userService.getByUsername(token.getUsername());  
//      if(null != user){  
//          AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), user.getNickname());  
//          this.setSession("currentUser", user);  
//          return authcInfo;  
//      }else{  
//          return null;  
//      }  
        //此处无需比对,比对的逻辑Shiro会做,我们只需返回一个和令牌相关的正确的验证信息  
        //说白了就是第一个参数填登录用户名,第二个参数填合法的登录密码(可以是从数据库中取到的,本例中为了演示就硬编码了)  
        //这样一来,在随后的登录页面上就只有这里指定的用户和密码才能通过验证  
       User user = userService.loginValid(token.getUsername(), token.getPassword().toString());
       if(null != user){
    	 AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(token.getUsername(), token.getUsername(), this.getName());  
         this.setSession("loginUser", token.getUsername());  
         return authcInfo;  
       }
//        if("jadyer".equals(token.getUsername())){  
//            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo("jadyer", "jadyer", this.getName());  
//            this.setSession("currentUser", "jadyer");  
//            return authcInfo;  
//        }else if("玄玉".equals(token.getUsername())){  
//            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo("玄玉", "xuanyu", this.getName());  
//            this.setSession("currentUser", "玄玉");  
//            return authcInfo;  
//        }  
        //没有返回登录用户名对应的SimpleAuthenticationInfo对象时,就会在LoginController中抛出UnknownAccountException异常  
        return null; 
	}
	
	/** 
     * 将一些数据放到ShiroSession中,以便于其它地方使用 
     * @see 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到 
     */  
    private void setSession(Object key, Object value){  
        Subject currentUser = SecurityUtils.getSubject();  
        if(null != currentUser){  
            Session session = currentUser.getSession();  
            System.out.println("Session默认超时时间为[" + session.getTimeout() + "]毫秒");  
            if(null != session){  
                session.setAttribute(key, value);
            }  
        }  
    }  
}
