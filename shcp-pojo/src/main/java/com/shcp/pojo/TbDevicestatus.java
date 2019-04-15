package com.shcp.pojo;

public class TbDevicestatus {
    private Long desid;

    private Long tid;

    private String desname;

    private String destype;

    private String desdefaultvalue;

    private String desminvalue;

    private String desmaxvalue;

    public Long getDesid() {
        return desid;
    }

    public void setDesid(Long desid) {
        this.desid = desid;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getDesname() {
        return desname;
    }

    public void setDesname(String desname) {
        this.desname = desname == null ? null : desname.trim();
    }

    public String getDestype() {
        return destype;
    }

    public void setDestype(String destype) {
        this.destype = destype == null ? null : destype.trim();
    }

    public String getDesdefaultvalue() {
        return desdefaultvalue;
    }

    public void setDesdefaultvalue(String desdefaultvalue) {
        this.desdefaultvalue = desdefaultvalue == null ? null : desdefaultvalue.trim();
    }

    public String getDesminvalue() {
        return desminvalue;
    }

    public void setDesminvalue(String desminvalue) {
        this.desminvalue = desminvalue == null ? null : desminvalue.trim();
    }

    public String getDesmaxvalue() {
        return desmaxvalue;
    }

    public void setDesmaxvalue(String desmaxvalue) {
        this.desmaxvalue = desmaxvalue == null ? null : desmaxvalue.trim();
    }
}