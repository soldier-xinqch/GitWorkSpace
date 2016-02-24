package com.xinqch.util.mail;

import java.security.Security;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Provider;
import javax.mail.Session;
import javax.mail.Transport;

import org.junit.Test;

public class MailUtilsTest {

	@Test
	public void testCreateSimpleMail() throws Exception {
        Properties props = System.getProperties();
        // 开启debug调试  
        props.setProperty("mail.debug", "true");  
        // 发送服务器需要身份验证  
        props.setProperty("mail.smtp.auth", "true");  
        // 设置邮件服务器主机名  
        props.setProperty("mail.host", "smtp.163.com");  
        // 发送邮件协议名称  
        props.setProperty("mail.transport.protocol", "smtp");  
        
		String sendFrom = "xinchao32119@163.com";
		String sendTo = "328937646@qq.com";
		String subject = "创建一封只包含文本的邮件";
		String obj = "创建一封只包含文本的邮件——123456789==createSimpleMail";
		
		//使用JavaMail发送邮件的5个步骤
		//1、创建session
		Session session = Session.getInstance(props, new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("xinchao32119@163.com", "xqc193414qq");
            }});
		//开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
		session.setDebug(true);
		//2、通过session得到transport对象
		Transport ts = session.getTransport();
		//3、连上邮件服务器
		ts.connect("smtp.163.com","xinchao32119@163.com", "xqc193414qq");
		//4、创建邮件
		Message message =MailUtils.createSimpleMail(session, sendFrom, sendTo, subject, obj, null, null);
		//5、发送邮件
		ts.sendMessage(message, message.getAllRecipients());
		ts.close();
	}

	@Test
	public void testCreateImageMail() throws Exception {
		Properties props = System.getProperties();
        // 开启debug调试  
        props.setProperty("mail.debug", "true");  
        // 发送服务器需要身份验证  
        props.setProperty("mail.smtp.auth", "true");  
        // 设置邮件服务器主机名  
        props.setProperty("mail.host", "smtp.163.com");  
        // 发送邮件协议名称  
        props.setProperty("mail.transport.protocol", "smtp");  
        
		String sendFrom = "xinchao32119@163.com";
		String sendTo = "328937646@qq.com";
		String subject = "创建一封只包含文本的邮件";
		String obj = "创建一封只包含文本的邮件——123456789==createSimpleMail";
		
		//使用JavaMail发送邮件的5个步骤
		//1、创建session
		Session session = Session.getInstance(props, new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("xinchao32119@163.com", "xqc193414qq");
            }});
		//开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
		session.setDebug(true);
		//2、通过session得到transport对象
		Transport ts = session.getTransport();
		//3、连上邮件服务器
		ts.connect("smtp.163.com","xinchao32119@163.com", "xqc193414qq");
		//4、创建邮件
		Message message =MailUtils.createImageMail(session, sendFrom, sendTo, subject, obj, null, null, obj, obj);
		//5、发送邮件
		ts.sendMessage(message, message.getAllRecipients());
		ts.close();
	}

	@Test
	public void testCreateAttachMail() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testCreateMixedMail() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
