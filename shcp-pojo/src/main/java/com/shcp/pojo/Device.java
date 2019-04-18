package com.shcp.pojo;

import java.util.Date;

public class Device {
    private Long deid;

    private Long uid;

    private Long detid;

    private Long did;

    private String dename;

    private String deipaddr;

    private Integer deport;

    private String demac;

    private Date gmtCreate;

    private Date gmtModify;

    public Long getDeid() {
        return deid;
    }

    public void setDeid(Long deid) {
        this.deid = deid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

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

    public String getDename() {
        return dename;
    }

    public void setDename(String dename) {
        this.dename = dename == null ? null : dename.trim();
    }

    public String getDeipaddr() {
        return deipaddr;
    }

    public void setDeipaddr(String deipaddr) {
        this.deipaddr = deipaddr == null ? null : deipaddr.trim();
    }

    public Integer getDeport() {
        return deport;
    }

    public void setDeport(Integer deport) {
        this.deport = deport;
    }

    public String getDemac() {
        return demac;
    }

    public void setDemac(String demac) {
        this.demac = demac == null ? null : demac.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}