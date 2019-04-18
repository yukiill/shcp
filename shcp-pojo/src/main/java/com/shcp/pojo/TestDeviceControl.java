package com.shcp.pojo;

public class TestDeviceControl {
    private Long tdecid;

    private Long tdsid;

    private String tdecname;

    private String tdeckey;

    private String tdecvalue;

    public Long getTdecid() {
        return tdecid;
    }

    public void setTdecid(Long tdecid) {
        this.tdecid = tdecid;
    }

    public Long getTdsid() {
        return tdsid;
    }

    public void setTdsid(Long tdsid) {
        this.tdsid = tdsid;
    }

    public String getTdecname() {
        return tdecname;
    }

    public void setTdecname(String tdecname) {
        this.tdecname = tdecname == null ? null : tdecname.trim();
    }

    public String getTdeckey() {
        return tdeckey;
    }

    public void setTdeckey(String tdeckey) {
        this.tdeckey = tdeckey == null ? null : tdeckey.trim();
    }

    public String getTdecvalue() {
        return tdecvalue;
    }

    public void setTdecvalue(String tdecvalue) {
        this.tdecvalue = tdecvalue == null ? null : tdecvalue.trim();
    }
}