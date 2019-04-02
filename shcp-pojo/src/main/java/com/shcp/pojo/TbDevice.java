package com.shcp.pojo;

import java.util.Date;

public class TbDevice {
    private Long dstid;

    private Long did;

    private Long tid;

    private Long uid;

    private String dstname;

    private Integer dsttype;

    private Date dsdatetime;

    private String dsipaddr;

    private Integer dsport;

    private String dsmac;

    public Long getDstid() {
        return dstid;
    }

    public void setDstid(Long dstid) {
        this.dstid = dstid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getDstname() {
        return dstname;
    }

    public void setDstname(String dstname) {
        this.dstname = dstname == null ? null : dstname.trim();
    }

    public Integer getDsttype() {
        return dsttype;
    }

    public void setDsttype(Integer dsttype) {
        this.dsttype = dsttype;
    }

    public Date getDsdatetime() {
        return dsdatetime;
    }

    public void setDsdatetime(Date dsdatetime) {
        this.dsdatetime = dsdatetime;
    }

    public String getDsipaddr() {
        return dsipaddr;
    }

    public void setDsipaddr(String dsipaddr) {
        this.dsipaddr = dsipaddr == null ? null : dsipaddr.trim();
    }

    public Integer getDsport() {
        return dsport;
    }

    public void setDsport(Integer dsport) {
        this.dsport = dsport;
    }

    public String getDsmac() {
        return dsmac;
    }

    public void setDsmac(String dsmac) {
        this.dsmac = dsmac == null ? null : dsmac.trim();
    }
}