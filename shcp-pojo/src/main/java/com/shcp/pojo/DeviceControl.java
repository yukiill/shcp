package com.shcp.pojo;

public class DeviceControl {
    private Long decid;

    private Long detid;

    private String decname;

    private String deckey;

    private String decvalue;

    public Long getDecid() {
        return decid;
    }

    public void setDecid(Long decid) {
        this.decid = decid;
    }

    public Long getDetid() {
        return detid;
    }

    public void setDetid(Long detid) {
        this.detid = detid;
    }

    public String getDecname() {
        return decname;
    }

    public void setDecname(String decname) {
        this.decname = decname == null ? null : decname.trim();
    }

    public String getDeckey() {
        return deckey;
    }

    public void setDeckey(String deckey) {
        this.deckey = deckey == null ? null : deckey.trim();
    }

    public String getDecvalue() {
        return decvalue;
    }

    public void setDecvalue(String decvalue) {
        this.decvalue = decvalue == null ? null : decvalue.trim();
    }
}