package com.xinqch.util.common;

public interface CommonEnum {

	public enum MAIL_METHOD implements CommonEnum{
		/**
		 *   纯文本
		 */
		TEXT(1),
		/**
		 *  内嵌图片和文本
		 */
		IMAGE_TEXT(2),
		/**
		 *  附件和文本
		 */
		ATTACH_TEXT(3),
		/**
		 *  附件和内嵌图片和文本
		 */
		ATTACH_TEXT_IMAGE(4);
		
		private Integer value;
		MAIL_METHOD(Integer value){
			this.value = value;
		}
		public Integer getValue(){
			return value;
		}
		
	}
}
