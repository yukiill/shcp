package com.shcp.pojo;

public class TbDevicelimit {
    private Long dslid;

    private Long tid;

    private String dslname;

    private String dslkey;

    public Long getDslid() {
        return dslid;
    }

    public void setDslid(Long dslid) {
        this.dslid = dslid;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getDslname() {
        return dslname;
    }

    public void setDslname(String dslname) {
        this.dslname = dslname == null ? null : dslname.trim();
    }

    public String getDslkey() {
        return dslkey;
    }

    public void setDslkey(String dslkey) {
        this.dslkey = dslkey == null ? null : dslkey.trim();
    }
}