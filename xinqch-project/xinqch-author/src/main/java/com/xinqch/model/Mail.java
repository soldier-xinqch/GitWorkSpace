package com.xinqch.model;

import com.xinqch.common.CommonEntity;

public class Mail  extends CommonEntity  {
	
    private String mailId;

    private String sendto;

    private String cc;

    private String bcc;

    private String sendfrom;

    private String subject;

    private String mailContent;

    private String mailReceipt;

    private String mailSignature;

    private static final long serialVersionUID = 1L;

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId == null ? null : mailId.trim();
    }

    public String getSendto() {
        return sendto;
    }

    public void setSendto(String sendto) {
        this.sendto = sendto == null ? null : sendto.trim();
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc == null ? null : cc.trim();
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc == null ? null : bcc.trim();
    }

    public String getSendfrom() {
        return sendfrom;
    }

    public void setSendfrom(String sendfrom) {
        this.sendfrom = sendfrom == null ? null : sendfrom.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent == null ? null : mailContent.trim();
    }

    public String getMailReceipt() {
        return mailReceipt;
    }

    public void setMailReceipt(String mailReceipt) {
        this.mailReceipt = mailReceipt == null ? null : mailReceipt.trim();
    }

    public String getMailSignature() {
        return mailSignature;
    }

    public void setMailSignature(String mailSignature) {
        this.mailSignature = mailSignature == null ? null : mailSignature.trim();
    }
}