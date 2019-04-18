package com.shcp.pojo;

import java.util.Date;

public class DeveloperInfo {
    private Long dfid;

    private Long did;

    private Long aid;

    private String dcname;

    private String dcaddr;

    private String certificatetype;

    private String dcnumber;

    private Byte dcstatus;

    private Date gmtCreate;

    private Date gmtModify;

    private String positiveimg;

    private String negitiveimg;

    public Long getDfid() {
        return dfid;
    }

    public void setDfid(Long dfid) {
        this.dfid = dfid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getDcname() {
        return dcname;
    }

    public void setDcname(String dcname) {
        this.dcname = dcname == null ? null : dcname.trim();
    }

    public String getDcaddr() {
        return dcaddr;
    }

    public void setDcaddr(String dcaddr) {
        this.dcaddr = dcaddr == null ? null : dcaddr.trim();
    }

    public String getCertificatetype() {
        return certificatetype;
    }

    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype == null ? null : certificatetype.trim();
    }

    public String getDcnumber() {
        return dcnumber;
    }

    public void setDcnumber(String dcnumber) {
        this.dcnumber = dcnumber == null ? null : dcnumber.trim();
    }

    public Byte getDcstatus() {
        return dcstatus;
    }

    public void setDcstatus(Byte dcstatus) {
        this.dcstatus = dcstatus;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getPositiveimg() {
        return positiveimg;
    }

    public void setPositiveimg(String positiveimg) {
        this.positiveimg = positiveimg == null ? null : positiveimg.trim();
    }

    public String getNegitiveimg() {
        return negitiveimg;
    }

    public void setNegitiveimg(String negitiveimg) {
        this.negitiveimg = negitiveimg == null ? null : negitiveimg.trim();
    }
}