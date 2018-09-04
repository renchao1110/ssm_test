package com.hl95.test.entity;

public class TUp {
    private Integer id;

    private String phone;

    private String msgcontent;

    private Integer spnumber;

    private Integer linkid;

    private String serviceup;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(String msgcontent) {
        this.msgcontent = msgcontent == null ? null : msgcontent.trim();
    }

    public Integer getSpnumber() {
        return spnumber;
    }

    public void setSpnumber(Integer spnumber) {
        this.spnumber = spnumber;
    }

    public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }

    public String getServiceup() {
        return serviceup;
    }

    public void setServiceup(String serviceup) {
        this.serviceup = serviceup == null ? null : serviceup.trim();
    }
}