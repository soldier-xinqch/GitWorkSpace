package com.xinqch.common;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * pojo 基类
 * @author xinqch
 * Aug 21, 2016
 */
@Data
public class BasePojo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String createUser;

    private Date createTime;

    private String modifyUser;

    private Date modifyTime;

    private Byte delStatus;

    private String column1;

    private String column2;

    private String column3;

	@Override
	public String toString() {
		return super.toString();
	}

    
}
