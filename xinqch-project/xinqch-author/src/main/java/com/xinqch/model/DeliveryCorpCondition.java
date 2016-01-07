package com.xinqch.model;

import java.util.List;

public class DeliveryCorpCondition {
	
	private List<Long> deliveryCorpIds;
	/**
	 * 物流公司编码
	 */
	private String corpCode;
	/**
	 *  记录条数
	 */
	private Integer pageNo;
	/**
	 * 页面数据条数
	 */
	private Integer pageSize;
	/**
	 * 排序字段
	 */
	private String sortField;
	/**
	 * 是否倒序
	 */
	private Boolean sortDesc;
	/**
	 * 模板删除标识
	 */
	private boolean deleteType;
	public String getCorpCode() {
		return corpCode;
	}
	public void setCorpCode(String corpCode) {
		this.corpCode = corpCode;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String getSortField() {
		return sortField;
	}
	public void setSortField(String sortField) {
		this.sortField = sortField;
	}
	public Boolean getSortDesc() {
		return sortDesc;
	}
	public void setSortDesc(Boolean sortDesc) {
		this.sortDesc = sortDesc;
	}
	public boolean isDeleteType() {
		return deleteType;
	}
	public void setDeleteType(boolean deleteType) {
		this.deleteType = deleteType;
	}
	public List<Long> getDeliveryCorpIds() {
		return deliveryCorpIds;
	}
	public void setDeliveryCorpIds(List<Long> deliveryCorpIds) {
		this.deliveryCorpIds = deliveryCorpIds;
	}

}
