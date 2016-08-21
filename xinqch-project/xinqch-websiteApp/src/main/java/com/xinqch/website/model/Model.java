package com.xinqch.website.model;

import java.io.Serializable;
import java.util.Date;

import com.xinqch.common.BasePojo;

import lombok.Data;

@Data
public class Model extends BasePojo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

    private String modelName;

    private String parentId;

    private String parentName;

    private String userId;

}