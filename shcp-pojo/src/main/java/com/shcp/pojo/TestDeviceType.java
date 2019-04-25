package com.shcp.pojo;

public class TestDeviceType {
    private Long tdsid;

    private String tdsname;

    private Long did;

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

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }
}