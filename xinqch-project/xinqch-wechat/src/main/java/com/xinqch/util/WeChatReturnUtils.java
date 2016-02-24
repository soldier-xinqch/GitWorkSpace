package com.xinqch.util;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class WeChatReturnUtils {
	
	public static String returnTextMessage(String messageType){
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("xml");
		Element toUserName = doc.addElement("ToUserName");
		toUserName.addText("");
		Element fromUserName = root.addElement("FromUserName");
		fromUserName.addText("");
		Element createTime = root.addElement("CreateTime");
		createTime.addText("");
		Element msgType = root.addText("MsgType");
		msgType.addText("");
		if(messageType.equals("text")){
			setTextMsg(root);
		}
//		else if(){
//			
//		}else if(){
//			
//		}else if(){
//			
//		}else if(){
//			
//		}else if(){
//			
//		}
		doc.setXMLEncoding("UTF-8");
		return doc.asXML();
	}
	
	private static void setTextMsg(Element root){
		Element content = root.addText("Content");
		content.addText("");
	}
	
	private static void setPicMsg(Element root){
		Element image = root.addText("Image");
		Element mediaId = image.addElement("MediaId");
		mediaId.addText("");
	}
	
	private static void setVoiceMsg(Element root){
		Element voice = root.addText("Voice");
		Element mediaId = voice.addElement("MediaId");
		mediaId.addText("");
	}
	
	private static void setVideoMsg(Element root){
		Element video = root.addText("Video");
		Element mediaId = video.addElement("MediaId");
		mediaId.addText("");
		Element title = video.addElement("Title");
		title.addText("");
		Element description = video.addElement("Description");
		description.addText("");
	}
	
	private static void setMusicMsg(Element root){
		Element music = root.addText("Music");
		Element title = music.addElement("Title");
		title.addText("");
		Element description = music.addElement("Description");
		description.addText("");
		Element musicUrl = music.addElement("MusicUrl");
		musicUrl.addText("");
		Element hQMusicUrl = music.addElement("HQMusicUrl");
		hQMusicUrl.addText("");
		Element thumbMediaId = music.addElement("ThumbMediaId");
		thumbMediaId.addText("");
	}
	
	private static void setPicAndTextMsg(Element root){
		Element articleCount = root.addElement("ArticleCount");
		articleCount.addText("2");
		Element articles = root.addText("Articles");
		//item 可以有多个！TODO 这个稍后再弄
		Element item = articles.addElement("item");
		Element title = item.addElement("Title");
		title.addText("");
		Element description = item.addElement("Description");
		description.addText("");
		Element picUrl = item.addElement("PicUrl");
		picUrl.addText("");
		Element url = item.addElement("Url");
		url.addText("");
	}
	

}
