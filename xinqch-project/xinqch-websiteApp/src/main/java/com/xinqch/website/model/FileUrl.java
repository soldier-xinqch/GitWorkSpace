package com.xinqch.website.model;

import java.io.Serializable;
import java.util.Date;

import com.xinqch.common.BasePojo;

import lombok.Data;

@Data
public class FileUrl extends BasePojo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

    private String fileName;

    private String fileUrl;

    private String modelId;

    private Integer fileSize;

    private String fileType;

}