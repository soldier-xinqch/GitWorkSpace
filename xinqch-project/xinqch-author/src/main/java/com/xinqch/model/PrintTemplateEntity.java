package com.xinqch.model;


public class PrintTemplateEntity {
    private Long printTemplateId;

    private Long corpId;

    private String name;

    private Integer shortcut;

    private Integer disabled;

    private Integer width;

    private Integer height;

    private Integer hOffset;

    private Integer vOffset;

    private Integer templateType;

    private Integer isDefault;

    private String relateObjectCode;

    private Integer paperType;

    private String data;

    public Long getPrintTemplateId() {
        return printTemplateId;
    }

    public void setPrintTemplateId(Long printTemplateId) {
        this.printTemplateId = printTemplateId;
    }

    public Long getCorpId() {
        return corpId;
    }

    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getShortcut() {
        return shortcut;
    }

    public void setShortcut(Integer shortcut) {
        this.shortcut = shortcut;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer gethOffset() {
        return hOffset;
    }

    public void sethOffset(Integer hOffset) {
        this.hOffset = hOffset;
    }

    public Integer getvOffset() {
        return vOffset;
    }

    public void setvOffset(Integer vOffset) {
        this.vOffset = vOffset;
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public String getRelateObjectCode() {
        return relateObjectCode;
    }

    public void setRelateObjectCode(String relateObjectCode) {
        this.relateObjectCode = relateObjectCode == null ? null : relateObjectCode.trim();
    }

    public Integer getPaperType() {
        return paperType;
    }

    public void setPaperType(Integer paperType) {
        this.paperType = paperType;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}