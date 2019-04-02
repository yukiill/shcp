package com.shcp.pojo;

import java.util.Date;

public class TbUserfeedback {
    private Long fid;

    private Long did;

    private Long uid;

    private Date fdatetime;

    private Byte fcheck;

    private Byte freply;

    private Short futype;

    private Integer fduid;

    private String fcontent;

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Date getFdatetime() {
        return fdatetime;
    }

    public void setFdatetime(Date fdatetime) {
        this.fdatetime = fdatetime;
    }

    public Byte getFcheck() {
        return fcheck;
    }

    public void setFcheck(Byte fcheck) {
        this.fcheck = fcheck;
    }

    public Byte getFreply() {
        return freply;
    }

    public void setFreply(Byte freply) {
        this.freply = freply;
    }

    public Short getFutype() {
        return futype;
    }

    public void setFutype(Short futype) {
        this.futype = futype;
    }

    public Integer getFduid() {
        return fduid;
    }

    public void setFduid(Integer fduid) {
        this.fduid = fduid;
    }

    public String getFcontent() {
        return fcontent;
    }

    public void setFcontent(String fcontent) {
        this.fcontent = fcontent == null ? null : fcontent.trim();
    }
}