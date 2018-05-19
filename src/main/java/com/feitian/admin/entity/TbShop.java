package com.feitian.admin.entity;

import java.util.Date;

/**
 * 淘宝店铺表
 */
public class TbShop {
    private Integer userid;

    private String nick;

    private Date lastupdatetime;

    private String expiresin;

    private String expiresinr1;

    private String expiresinr2;

    private String expiresinw1;

    private String expiresinw2;

    private String reexpiresin;

    private Date authorizetime;

    private String sessionkey;

    private Integer isDelete;

    private Integer status;

    private Long createUserid;

    private String createUsername;

    private Date createTime;

    private Long updateUserid;

    private String updateUsername;

    private Date updateTime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getExpiresin() {
        return expiresin;
    }

    public void setExpiresin(String expiresin) {
        this.expiresin = expiresin == null ? null : expiresin.trim();
    }

    public String getExpiresinr1() {
        return expiresinr1;
    }

    public void setExpiresinr1(String expiresinr1) {
        this.expiresinr1 = expiresinr1 == null ? null : expiresinr1.trim();
    }

    public String getExpiresinr2() {
        return expiresinr2;
    }

    public void setExpiresinr2(String expiresinr2) {
        this.expiresinr2 = expiresinr2 == null ? null : expiresinr2.trim();
    }

    public String getExpiresinw1() {
        return expiresinw1;
    }

    public void setExpiresinw1(String expiresinw1) {
        this.expiresinw1 = expiresinw1 == null ? null : expiresinw1.trim();
    }

    public String getExpiresinw2() {
        return expiresinw2;
    }

    public void setExpiresinw2(String expiresinw2) {
        this.expiresinw2 = expiresinw2 == null ? null : expiresinw2.trim();
    }

    public String getReexpiresin() {
        return reexpiresin;
    }

    public void setReexpiresin(String reexpiresin) {
        this.reexpiresin = reexpiresin == null ? null : reexpiresin.trim();
    }

    public Date getAuthorizetime() {
        return authorizetime;
    }

    public void setAuthorizetime(Date authorizetime) {
        this.authorizetime = authorizetime;
    }

    public String getSessionkey() {
        return sessionkey;
    }

    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey == null ? null : sessionkey.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Long createUserid) {
        this.createUserid = createUserid;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername == null ? null : createUsername.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(Long updateUserid) {
        this.updateUserid = updateUserid;
    }

    public String getUpdateUsername() {
        return updateUsername;
    }

    public void setUpdateUsername(String updateUsername) {
        this.updateUsername = updateUsername == null ? null : updateUsername.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}