package com.shcp.pojo;

import java.util.Date;

public class TbDeveloper {
    private Long did;

    private Long dcid;

    private String devname;

    private String password;

    private String demail;

    private Byte dstatus;

    private String dhimg;

    private Integer dlimit;

    private Date submitdatetime;

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public Long getDcid() {
        return dcid;
    }

    public void setDcid(Long dcid) {
        this.dcid = dcid;
    }

    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        this.devname = devname == null ? null : devname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDemail() {
        return demail;
    }

    public void setDemail(String demail) {
        this.demail = demail == null ? null : demail.trim();
    }

    public Byte getDstatus() {
        return dstatus;
    }

    public void setDstatus(Byte dstatus) {
        this.dstatus = dstatus;
    }

    public String getDhimg() {
        return dhimg;
    }

    public void setDhimg(String dhimg) {
        this.dhimg = dhimg == null ? null : dhimg.trim();
    }

    public Integer getDlimit() {
        return dlimit;
    }

    public void setDlimit(Integer dlimit) {
        this.dlimit = dlimit;
    }

    public Date getSubmitdatetime() {
        return submitdatetime;
    }

    public void setSubmitdatetime(Date submitdatetime) {
        this.submitdatetime = submitdatetime;
    }
}