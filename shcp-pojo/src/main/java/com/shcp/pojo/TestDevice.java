package com.shcp.pojo;

import java.util.Date;

public class TestDevice {
    private Long tdeid;

    private Long did;

    private Long tdsid;

    private String tdename;

    private String tdeipaddr;

    private Integer tdeport;

    private String demac;

    private Date gmtCreate;

    private Date gmtModify;

    public Long getTdeid() {
        return tdeid;
    }

    public void setTdeid(Long tdeid) {
        this.tdeid = tdeid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public Long getTdsid() {
        return tdsid;
    }

    public void setTdsid(Long tdsid) {
        this.tdsid = tdsid;
    }

    public String getTdename() {
        return tdename;
    }

    public void setTdename(String tdename) {
        this.tdename = tdename == null ? null : tdename.trim();
    }

    public String getTdeipaddr() {
        return tdeipaddr;
    }

    public void setTdeipaddr(String tdeipaddr) {
        this.tdeipaddr = tdeipaddr == null ? null : tdeipaddr.trim();
    }

    public Integer getTdeport() {
        return tdeport;
    }

    public void setTdeport(Integer tdeport) {
        this.tdeport = tdeport;
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