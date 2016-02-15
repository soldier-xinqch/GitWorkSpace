package com.xinqch.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xinqch.service.IUserService;

//@ParentPackage("basePackage")
//@Action(value="strust2Test")//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
//@Namespace("/")//使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
@Controller("userAction")
public class UserAction {
	
	@Autowired      
	private IUserService userService;
	
	public String test(){
		System.out.println("进入TestAction");
		return "success";
	}
	
//	public String reg() {          
//		user.setId(UUID.randomUUID().toString());          
//		user.setRegtime(new Date());          
//		try {                 
//			userService.addUser(user);              
//			ServletActionContext.getContext().getSession().put("user", user);              
//			ServletActionContext.getContext().getSession().put("msg", "注册成功了，可以去登陆了");              
//			return "success";                        
//		} catch (Exception e) {              
//			e.printStackTrace();              
//			ServletActionContext.getContext().getSession().put("msg", "注册失败了");              
//			return "error";          
//		}      
//	} 
	

}
