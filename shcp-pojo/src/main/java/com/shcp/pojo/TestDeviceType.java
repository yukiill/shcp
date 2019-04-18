package com.shcp.pojo;

public class TestDeviceType {
    private Long tdsid;

    private String tdsname;

    public Long getTdsid() {
        return tdsid;
    }

    public void setTdsid(Long tdsid) {
        this.tdsid = tdsid;
    }

    public String getTdsname() {
        return tdsname;
    }

    public void setTdsname(String tdsname) {
        this.tdsname = tdsname == null ? null : tdsname.trim();
    }
}