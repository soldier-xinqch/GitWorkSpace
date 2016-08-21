package com.xinqch.website.model;

import java.io.Serializable;
import java.util.Date;

import com.xinqch.common.BasePojo;

import lombok.Data;

@Data
public class UserAuth extends BasePojo implements Serializable {
    private String id;

    private String userName;

    private String userPasswd;

    private String role;

    private String column1;

    private String column2;

    private String column3;

    private static final long serialVersionUID = 1L;

}