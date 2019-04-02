package com.shcp.pojo;

import java.util.Date;

public class TbUser {
    private Long uid;

    private Long did;

    private String username;

    private String password;

    private String uintroduce;

    private String uemail;

    private Date cdate;

    private String uhimg;

    private Date ubirth;

    private Byte utype;

    private Short ulimit;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUintroduce() {
        return uintroduce;
    }

    public void setUintroduce(String uintroduce) {
        this.uintroduce = uintroduce == null ? null : uintroduce.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getUhimg() {
        return uhimg;
    }

    public void setUhimg(String uhimg) {
        this.uhimg = uhimg == null ? null : uhimg.trim();
    }

    public Date getUbirth() {
        return ubirth;
    }

    public void setUbirth(Date ubirth) {
        this.ubirth = ubirth;
    }

    public Byte getUtype() {
        return utype;
    }

    public void setUtype(Byte utype) {
        this.utype = utype;
    }

    public Short getUlimit() {
        return ulimit;
    }

    public void setUlimit(Short ulimit) {
        this.ulimit = ulimit;
    }
}