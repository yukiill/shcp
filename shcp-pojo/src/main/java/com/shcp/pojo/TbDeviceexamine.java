package com.shcp.pojo;

import java.util.Date;

public class TbDeviceexamine {
    private Long dsexid;

    private Long did;

    private String dsexname1;

    private Date dsexdatetime;

    private Boolean dsexstatus;

    public Long getDsexid() {
        return dsexid;
    }

    public void setDsexid(Long dsexid) {
        this.dsexid = dsexid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDsexname1() {
        return dsexname1;
    }

    public void setDsexname1(String dsexname1) {
        this.dsexname1 = dsexname1 == null ? null : dsexname1.trim();
    }

    public Date getDsexdatetime() {
        return dsexdatetime;
    }

    public void setDsexdatetime(Date dsexdatetime) {
        this.dsexdatetime = dsexdatetime;
    }

    public Boolean getDsexstatus() {
        return dsexstatus;
    }

    public void setDsexstatus(Boolean dsexstatus) {
        this.dsexstatus = dsexstatus;
    }
}