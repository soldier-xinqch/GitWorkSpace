package com.xinqch.model;

import java.io.Serializable;

public class ChannelDeliveryCenterEntity implements Serializable {
    private Long deliveryCenterId;

    private Long channelId;

    private String outerId;

    private String name;

    private String province;

    private String city;

    private String country;

    private String address;

    private String region;

    private String contactName;

    private String zip;

    private String phone;

    private String mobile;

    private Integer getDef;

    private Integer cancelDef;

    private Integer state;

    private String companyName;

    private static final long serialVersionUID = 1L;

    public Long getDeliveryCenterId() {
		return deliveryCenterId;
	}

	public void setDeliveryCenterId(Long deliveryCenterId) {
		this.deliveryCenterId = deliveryCenterId;
	}

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId == null ? null : outerId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getGetDef() {
        return getDef;
    }

    public void setGetDef(Integer getDef) {
        this.getDef = getDef;
    }

    public Integer getCancelDef() {
        return cancelDef;
    }

    public void setCancelDef(Integer cancelDef) {
        this.cancelDef = cancelDef;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }
}