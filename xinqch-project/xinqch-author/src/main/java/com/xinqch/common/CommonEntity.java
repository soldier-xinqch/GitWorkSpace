package com.xinqch.common;

import java.io.Serializable;
import java.util.Date;

public class CommonEntity implements Serializable{

	private static final long serialVersionUID = 8135408609964593687L;

	public Date createTime;
	public String createUser;
	public String modifyTime;
	public String modifyUser;
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getModifyUser() {
		return modifyUser;
	}
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
}
