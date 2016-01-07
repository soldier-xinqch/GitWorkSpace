package com.xinqch.model;

public class ChannelDeliveryCenterCondition {

	/**
	 * 发货地址ID
	 */
	private Long channelDeliveryCenterId;
	/**
	 * 店铺ID
	 */
	private Long channelId;
	/**
	 * 当前记录数
	 */
	private int pageNo;
	/**
	 * 页面数据条数
	 */
	private int pageSize;
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
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
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
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public Long getChannelDeliveryCenterId() {
		return channelDeliveryCenterId;
	}
	public void setChannelDeliveryCenterId(Long channelDeliveryCenterId) {
		this.channelDeliveryCenterId = channelDeliveryCenterId;
	}
	public Long getChannelId() {
		return channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
}
