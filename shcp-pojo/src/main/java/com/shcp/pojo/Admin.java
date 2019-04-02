package com.shcp.pojo;

public class Admin {
    private Long id;

    private String username;

    private String password;

    private String aemail;

    private String ahimg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail == null ? null : aemail.trim();
    }

    public String getAhimg() {
        return ahimg;
    }

    public void setAhimg(String ahimg) {
        this.ahimg = ahimg == null ? null : ahimg.trim();
    }
}