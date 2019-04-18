package com.shcp.pojo;

import java.util.Date;

public class UserLimit {
    private Short ulid;

    private String ulname;

    private Date gmtCreate;

    public Short getUlid() {
        return ulid;
    }

    public void setUlid(Short ulid) {
        this.ulid = ulid;
    }

    public String getUlname() {
        return ulname;
    }

    public void setUlname(String ulname) {
        this.ulname = ulname == null ? null : ulname.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}