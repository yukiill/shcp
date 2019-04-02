package com.shcp.pojo;

public class TbTestdevices {
    private Long dsexid;

    private Long did;

    private Long dstid;

    private String dstname;

    private Integer dsttype;

    private String dsipaddr;

    private Integer dsport;

    private String dsmac;

    private Short dsstatus;

    private Short dslimit;

    public Long getDsexid() {
        return dsexid;
    }

    public void setDsexid(Long dsexid) {
        this.dsexid = dsexid;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public Long getDstid() {
        return dstid;
    }

    public void setDstid(Long dstid) {
        this.dstid = dstid;
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

    public Short getDsstatus() {
        return dsstatus;
    }

    public void setDsstatus(Short dsstatus) {
        this.dsstatus = dsstatus;
    }

    public Short getDslimit() {
        return dslimit;
    }

    public void setDslimit(Short dslimit) {
        this.dslimit = dslimit;
    }
}