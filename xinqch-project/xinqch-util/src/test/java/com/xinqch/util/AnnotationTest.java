package com.xinqch.util;

import java.lang.reflect.Method;

import com.xinqch.util.annotation.AnnotationUtil;

@AnnotationUtil(sex = "男", name = "张飞")
public class AnnotationTest {
	
	@AnnotationUtil(sex = "男", name = "Fly")  
    public void setFly() {
		
    } 

	@AnnotationUtil(sex = "女", name = "李明")  
    public void setLiMing() {
		 
    }
	
	public static void main(String[] args) {  
        //检查类MyAnnotationTest是否含有@AnnotationTest注解  
        if (AnnotationTest.class.isAnnotationPresent(AnnotationUtil.class)) {  
            //若存在就获取注解  
        	AnnotationUtil annotation =AnnotationTest.class.getAnnotation(AnnotationUtil.class);  
            System.out.println(annotation);  
            //获取注解属性  
            System.out.println(annotation.sex());  
            System.out.println(annotation.name());  
            System.out.println("///////////////////////////////////////////");  
            Method[] _methods = AnnotationTest.class.getDeclaredMethods();  
            for (Method method : _methods) {  
                System.out.println(method);  
                if (method.isAnnotationPresent(AnnotationUtil.class)) {  
                	AnnotationUtil test = method.getAnnotation(AnnotationUtil.class);  
                    System.out.println("AnnotationTest(method=" + method.getName() + ",name=" + test.name() + ",sex=" + test.sex() + ")");  
                }  
            }  
        }  
    }  
}
