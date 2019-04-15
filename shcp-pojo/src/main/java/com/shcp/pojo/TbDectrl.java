package com.shcp.pojo;

public class TbDectrl {
    private Long decid;

    private Long tid;

    private String decname;

    private String deckey;

    private String decvaluetype;

    public Long getDecid() {
        return decid;
    }

    public void setDecid(Long decid) {
        this.decid = decid;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
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

    public String getDecvaluetype() {
        return decvaluetype;
    }

    public void setDecvaluetype(String decvaluetype) {
        this.decvaluetype = decvaluetype == null ? null : decvaluetype.trim();
    }
}