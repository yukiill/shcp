package com.shcp.pojo;

import java.util.Date;

public class Developerinfo {
    private Long dcid;

    private Long did;

    private String dcname;

    private String dcaddr;

    private String dcnumber;

    private Date dcdatetime;

    private Byte dcstatus;

    private Long dcaid;

    public Long getDcid() {
        return dcid;
    }

    public void setDcid(Long dcid) {
        this.dcid = dcid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
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

    public String getDcnumber() {
        return dcnumber;
    }

    public void setDcnumber(String dcnumber) {
        this.dcnumber = dcnumber == null ? null : dcnumber.trim();
    }

    public Date getDcdatetime() {
        return dcdatetime;
    }

    public void setDcdatetime(Date dcdatetime) {
        this.dcdatetime = dcdatetime;
    }

    public Byte getDcstatus() {
        return dcstatus;
    }

    public void setDcstatus(Byte dcstatus) {
        this.dcstatus = dcstatus;
    }

    public Long getDcaid() {
        return dcaid;
    }

    public void setDcaid(Long dcaid) {
        this.dcaid = dcaid;
    }
}