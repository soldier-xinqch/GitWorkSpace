package com.xinqch.model;

/**
 * @Description: 封装模板信息查询条件
 * @author xinqch 
 * @date 2015年12月16日 下午1:31:23
 */
public class PrintTemplateCondition {

	/**
	 * 物流公司编码
	 */
	private String corpCode;
	/**
	 * 模板ID
	 */
	private Long TemplateId;
	/**
	 * 模板名称
	 */
	private String TemplateName;
	/**
	 * 面单类型
	 */
	private Integer papeType;
	/**
	 *  模板类型
	 */
	private Integer TemplateType;
	/**
	 *  打印动作类型
	 */
	private String printType;
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
	public Long getTemplateId() {
		return TemplateId;
	}
	public void setTemplateId(Long templateId) {
		TemplateId = templateId;
	}
	public String getTemplateName() {
		return TemplateName;
	}
	public void setTemplateName(String templateName) {
		TemplateName = templateName;
	}
	public Integer getPapeType() {
		return papeType;
	}
	public void setPapeType(Integer papeType) {
		this.papeType = papeType;
	}
	public Integer getTemplateType() {
		return TemplateType;
	}
	public void setTemplateType(Integer templateType) {
		TemplateType = templateType;
	}
	public String getPrintType() {
		return printType;
	}
	public void setPrintType(String printType) {
		this.printType = printType;
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
}
