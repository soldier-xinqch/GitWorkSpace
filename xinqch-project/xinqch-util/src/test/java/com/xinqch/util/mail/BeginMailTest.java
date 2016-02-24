package com.xinqch.util.mail;

import org.junit.Test;

import com.xinqch.util.common.CommonEnum.MAIL_METHOD;

public class BeginMailTest {

	@Test
	public void testSendMail() throws Exception {
		EmailPojo emailPojo = new EmailPojo();
		emailPojo.setSendFrom("xinchao32119@163.com");; 
		emailPojo.setSendTo("328937646@qq.com"); ;
		emailPojo.setSubject("测试邮件");
		emailPojo.setObj("来跟我读 12345678978945613123456789 ……………………………………………………………………");
		emailPojo.setSendFromUser("xinchao32119@163.com");
		emailPojo.setSendFromPassWord("xqc193414qq");
//		emailPojo.setImagePath("");
//		String[] ccs;
//		String[] bccs;
//		smtpHostName
//		List<String> attachFilePath = new ArrayList<String>();
		
		emailPojo.setSaveEmailPath("F:///mail/");
		Integer methodType = MAIL_METHOD.TEXT.getValue();
		emailPojo.setMethodType(methodType);
		BeginMail.sendMail(emailPojo);
	}

}
