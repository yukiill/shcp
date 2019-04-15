package com.shcp.pojo;

public class TbUserlimit {
    private Short lid;

    private String lname;

    public Short getLid() {
        return lid;
    }

    public void setLid(Short lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }
}