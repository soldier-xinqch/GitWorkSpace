package com.xinqch.website.model;

import java.io.Serializable;
import java.util.Date;

import com.xinqch.common.BasePojo;

import lombok.Data;

@Data	
public class PicUrl extends BasePojo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String id;

    private String picName;

    private String picUrl;

    private String column1;

    private String column2;

    private String column3;

    private String modelId;

}