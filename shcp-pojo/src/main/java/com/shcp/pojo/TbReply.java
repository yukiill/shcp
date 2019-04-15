package com.shcp.pojo;

import java.util.Date;

public class TbReply {
    private Long rid;

    private Long fid;

    private Date rdatetime;

    private Long rrid;

    private String rcontent;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Date getRdatetime() {
        return rdatetime;
    }

    public void setRdatetime(Date rdatetime) {
        this.rdatetime = rdatetime;
    }

    public Long getRrid() {
        return rrid;
    }

    public void setRrid(Long rrid) {
        this.rrid = rrid;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent == null ? null : rcontent.trim();
    }
}