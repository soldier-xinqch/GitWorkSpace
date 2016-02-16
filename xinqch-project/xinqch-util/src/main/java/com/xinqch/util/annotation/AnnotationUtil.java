package com.xinqch.util.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  自定义注解
 * @author xinqch
 *
 */
// 将此注解包含在 javadoc 中 ，它代表着此注解会被javadoc工具提取成文档。
@Documented
/**
 *  ElemenetType.CONSTRUCTOR 构造器声明 
 *  ElemenetType.FIELD 域声明（包括 enum 实例） 
 *  ElemenetType.LOCAL_VARIABLE 局部变量声明
 *  ElemenetType.ANNOTATION_TYPE 作用于注解量声明
 *  ElemenetType.METHOD 方法声明
 *  ElemenetType.PACKAGE 包声明 
 *  ElemenetType.PARAMETER 参数声明 
 *  ElemenetType.TYPE 类，接口（包括注解类型）或enum声明 
 */
@Target({ElementType.METHOD,ElementType.TYPE})  
/**
 * RetentionPolicy.SOURCE 注解将被编译器丢弃 
 * RetentionPolicy.CLASS 注解在class文件中可用，但会被VM丢弃 
 * RetentionPolicy.RUNTIME VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息。
 */
@Retention(RetentionPolicy.RUNTIME)  
public @interface AnnotationUtil {
	
	public String name() default "";
	
	public String sex() default "男"; 	
}
