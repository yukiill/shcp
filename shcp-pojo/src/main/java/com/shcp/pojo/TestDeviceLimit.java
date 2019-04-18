package com.shcp.pojo;

public class TestDeviceLimit {
    private Long tdelid;

    private Long tdsid;

    private String tdelkey;

    private String tdelvalue;

    public Long getTdelid() {
        return tdelid;
    }

    public void setTdelid(Long tdelid) {
        this.tdelid = tdelid;
    }

    public Long getTdsid() {
        return tdsid;
    }

    public void setTdsid(Long tdsid) {
        this.tdsid = tdsid;
    }

    public String getTdelkey() {
        return tdelkey;
    }

    public void setTdelkey(String tdelkey) {
        this.tdelkey = tdelkey == null ? null : tdelkey.trim();
    }

    public String getTdelvalue() {
        return tdelvalue;
    }

    public void setTdelvalue(String tdelvalue) {
        this.tdelvalue = tdelvalue == null ? null : tdelvalue.trim();
    }
}