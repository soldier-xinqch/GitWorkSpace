package com.xinqch.controller;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.net.URLCodec;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.xinqch.util.RestUtils;

/**
 *  验证
 * @author xinch
 *
 */
@Controller
@RequestMapping("/valid")
public class ValidController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);  
	
	private final String appid = "wx0c34b287aa04b15a";
	private final String appsecret = "543f4a8de564bfb171dc70764ddf5b3f";
	
	/**
	 *  获取accessToken
	 * @return
	 */
	@RequestMapping(value="getAccessToken",method=RequestMethod.GET)
	public @ResponseBody String getAccessToken(){
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+appsecret;
		String accessToken = "";//认证token
		String tokenExpires = "";//token 有效时间
		try {
			
			String returnStr = RestUtils.getJsonString(url);
			if(StringUtils.isEmpty(returnStr)&& " ".equals(returnStr)){
				logger.info("获取accessToken失败");
				return "获取accessToken失败！";
			}else{
				JSONObject tokenObj = JSONObject.parseObject(returnStr);
				if(tokenObj.containsKey("access_token")){
					accessToken = tokenObj.getString("access_token");
					tokenExpires = tokenObj.getString("expires_in ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 *  微信公众号接入url验证
	 * @return
	 */
	@RequestMapping(value="/validUrl" ,method=RequestMethod.GET)
	public @ResponseBody String validCertificationUrl(String signature,String timestamp,String nonce,String echostr){
		System.out.println(signature +"$$$" +timestamp +"**" +nonce +"@@" +echostr );
		if(StringUtils.isEmpty(signature)&& " ".equals(signature)){
			return "signature 为空！";
		}
		String token = "xinqch";
		String[] sortStr = {timestamp,nonce,token};
		Arrays.sort(sortStr);
		String str = "";
		for (int i = 0; i < sortStr.length; i++) {
			str += sortStr[i];
		}
		URLCodec urlCodec = new URLCodec(); 
		String validStr = "";
		try {
			String code = urlCodec.encode(str, CharEncoding.UTF_8);
			//使用common-codec 工具生成sha-1加密串
			validStr = DigestUtils.sha1Hex(code);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(validStr);
		if(signature.compareTo(validStr) == 0){
			System.out.println("匹配成功！");
			return echostr;
		}
		return "匹配失败";
	}
	
	/**
	 *  微信公众号接入url验证
	 * @return
	 */
	@RequestMapping(value="/validUrl" ,method=RequestMethod.POST)
	public @ResponseBody String returnMessageToWeChat(HttpServletRequest requset,HttpServletResponse response){
		try {
			InputStream in = requset.getInputStream();
			SAXReader saxReader = new SAXReader();
			Document doc = saxReader.read(in);
			Element root = doc.getRootElement();
			// 当前节点下面子节点迭代器  
			Iterator<Element> it = root.elementIterator();  
		    // 遍历子节点
			while (it.hasNext()) {  
				// 获取某个子节点对象  
				Element e = it.next();  
				// 对子节点进行遍历  
				System.out.println(e.getName());
			}  

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "匹配失败";
	}
}
