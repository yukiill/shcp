package com.shcp.pojo;

import java.util.Date;

public class DeviceExamine {
    private Long deid;

    private Long tdeid;

    private String ename;

    private Date gmtCreate;

    private Date gmtModify;

    private String einfo;

    public Long getDeid() {
        return deid;
    }

    public void setDeid(Long deid) {
        this.deid = deid;
    }

    public Long getTdeid() {
        return tdeid;
    }

    public void setTdeid(Long tdeid) {
        this.tdeid = tdeid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
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

    public String getEinfo() {
        return einfo;
    }

    public void setEinfo(String einfo) {
        this.einfo = einfo == null ? null : einfo.trim();
    }
}