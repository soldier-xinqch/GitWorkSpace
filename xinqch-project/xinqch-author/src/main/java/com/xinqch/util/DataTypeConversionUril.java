//package com.xinqch.util;
//
//import java.beans.BeanInfo;
//import java.beans.Introspector;
//import java.beans.PropertyDescriptor;
//import java.io.UnsupportedEncodingException;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// *  数据类型转换工具类
// * @author xinqch
// *
// */
//public class DataTypeConversionUril {
//	
//	private static Logger logger = LoggerFactory.getLogger(DataTypeConversionUril.class);
//	
//	/**
//	 *   map 转换beans
//	 * @param map
//	 * @param xinqch
//	 * @return
//	 */
//	public static <T> T converter(Map<String, Object> map, Class<T> clz) {
//	    T obj = null;
//	    try {
//	        obj = clz.newInstance();
//	        BeanInfo beanInfo = Introspector.getBeanInfo(clz);
//	        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
//	        for (PropertyDescriptor property : propertyDescriptors) {
//	            String key = property.getName();
//	            if (map.containsKey(key)) {
//	                Object value = map.get(key);
//	                // property对应的setter方法
//	                Method setter = property.getWriteMethod();
//	                setter.invoke(obj, value);
//	            }
//	        }
//	    } catch (Exception e) {
//	        logger.error("map转{}异常", clz.getName(), e);
//	    }
//	    return obj;
//	}
//	
//	public static <T> List<T> converter(List<Map<String, Object>> list, Class<T> clz) {
//	    List<T> rst = new ArrayList<>();
//	    for (int i = 0; i < list.size(); i++) {
//	        rst.add(converter(list.get(i), clz));
//	    }
//	    return rst;
//	}
////			解决参数值中文乱码
////	        String orgName = new String (dto.getUnitRecordVo().getOrgName().getBytes("ISO-8859-1"), "utf-8");
//	
//	public static void main(String[] args){
//		
//	}
//
//}
