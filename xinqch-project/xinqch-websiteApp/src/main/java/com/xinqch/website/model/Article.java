package com.xinqch.website.model;

import java.io.Serializable;
import java.util.Date;

import com.xinqch.common.BasePojo;

import lombok.Data;


@Data
public class Article extends BasePojo implements Serializable {
    private String id;

    private String articleName;

    private String articleContext;

    private String articleUrl;

    private String modelId;

    private static final long serialVersionUID = 1L;
}