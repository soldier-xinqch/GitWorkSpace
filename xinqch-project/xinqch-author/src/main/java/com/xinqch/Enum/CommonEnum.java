package com.xinqch.Enum;

public interface CommonEnum {

	public enum SYSTEM_ENUM implements CommonEnum{
		LOGIN("login"),
		REGISTERED("registered");
		
		private String value;
		
		SYSTEM_ENUM(String value) {
			this.value = value;
		}
		public String getValue() {
			return value;
		}
	}
	
}
