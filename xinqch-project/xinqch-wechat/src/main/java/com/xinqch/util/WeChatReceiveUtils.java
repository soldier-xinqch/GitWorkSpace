package com.xinqch.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class WeChatReceiveUtils {
	
	public static String returnTextMessage(InputStream in){
		Map<String,String> map = new HashMap<String,String>();
		
		SAXReader saxReader = new SAXReader();
		Document doc = null;
		try {
			doc = saxReader.read(in);
			Element root = doc.getRootElement();
			// 当前节点下面子节点迭代器  
			Iterator<Element> it = root.elementIterator();  
		    // 遍历子节点
			while (it.hasNext()) {  
				// 获取某个子节点对象  
				Element e = it.next();  
				// 对子节点进行遍历  
				System.out.println(e.getName());
				map.put(e.getName(), e.getText());
			}  
		} catch (DocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return doc.asXML();
	}

}
