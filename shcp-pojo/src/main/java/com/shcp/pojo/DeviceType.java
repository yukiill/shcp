package com.shcp.pojo;

import java.util.Date;

public class DeviceType {
    private Long detid;

    private Long did;

    private String dsename;

    private Date gmtCreate;

    private Byte isOpen;

    public Long getDetid() {
        return detid;
    }

    public void setDetid(Long detid) {
        this.detid = detid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDsename() {
        return dsename;
    }

    public void setDsename(String dsename) {
        this.dsename = dsename == null ? null : dsename.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Byte getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Byte isOpen) {
        this.isOpen = isOpen;
    }
}