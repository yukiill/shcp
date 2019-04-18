package com.shcp.pojo;

import java.util.Date;

public class Feedback {
    private Long fid;

    private String ftitle;

    private String fcontent;

    private Byte isCheck;

    private Byte isReply;

    private Long fromUserId;

    private Byte fromUserType;

    private Long toUserId;

    private Date gmtCreate;

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getFtitle() {
        return ftitle;
    }

    public void setFtitle(String ftitle) {
        this.ftitle = ftitle == null ? null : ftitle.trim();
    }

    public String getFcontent() {
        return fcontent;
    }

    public void setFcontent(String fcontent) {
        this.fcontent = fcontent == null ? null : fcontent.trim();
    }

    public Byte getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Byte isCheck) {
        this.isCheck = isCheck;
    }

    public Byte getIsReply() {
        return isReply;
    }

    public void setIsReply(Byte isReply) {
        this.isReply = isReply;
    }

    public Long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Byte getFromUserType() {
        return fromUserType;
    }

    public void setFromUserType(Byte fromUserType) {
        this.fromUserType = fromUserType;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}