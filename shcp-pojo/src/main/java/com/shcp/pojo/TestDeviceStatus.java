package com.shcp.pojo;

public class TestDeviceStatus {
    private Long tdesid;

    private Long tdsid;

    private String tdesname;

    private String tdestype;

    private String tdesdefaultvalue;

    private String tdesminvalue;

    private String tdesmaxvalue;

    public Long getTdesid() {
        return tdesid;
    }

    public void setTdesid(Long tdesid) {
        this.tdesid = tdesid;
    }

    public Long getTdsid() {
        return tdsid;
    }

    public void setTdsid(Long tdsid) {
        this.tdsid = tdsid;
    }

    public String getTdesname() {
        return tdesname;
    }

    public void setTdesname(String tdesname) {
        this.tdesname = tdesname == null ? null : tdesname.trim();
    }

    public String getTdestype() {
        return tdestype;
    }

    public void setTdestype(String tdestype) {
        this.tdestype = tdestype == null ? null : tdestype.trim();
    }

    public String getTdesdefaultvalue() {
        return tdesdefaultvalue;
    }

    public void setTdesdefaultvalue(String tdesdefaultvalue) {
        this.tdesdefaultvalue = tdesdefaultvalue == null ? null : tdesdefaultvalue.trim();
    }

    public String getTdesminvalue() {
        return tdesminvalue;
    }

    public void setTdesminvalue(String tdesminvalue) {
        this.tdesminvalue = tdesminvalue == null ? null : tdesminvalue.trim();
    }

    public String getTdesmaxvalue() {
        return tdesmaxvalue;
    }

    public void setTdesmaxvalue(String tdesmaxvalue) {
        this.tdesmaxvalue = tdesmaxvalue == null ? null : tdesmaxvalue.trim();
    }
}