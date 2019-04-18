package com.shcp.pojo;

public class DeviceLimit {
    private Long delid;

    private Long detid;

    private String delkey;

    private String delvalue;

    private String delname;

    public Long getDelid() {
        return delid;
    }

    public void setDelid(Long delid) {
        this.delid = delid;
    }

    public Long getDetid() {
        return detid;
    }

    public void setDetid(Long detid) {
        this.detid = detid;
    }

    public String getDelkey() {
        return delkey;
    }

    public void setDelkey(String delkey) {
        this.delkey = delkey == null ? null : delkey.trim();
    }

    public String getDelvalue() {
        return delvalue;
    }

    public void setDelvalue(String delvalue) {
        this.delvalue = delvalue == null ? null : delvalue.trim();
    }

    public String getDelname() {
        return delname;
    }

    public void setDelname(String delname) {
        this.delname = delname == null ? null : delname.trim();
    }
}