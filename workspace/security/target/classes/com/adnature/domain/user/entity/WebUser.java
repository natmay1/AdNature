package com.adnature.domain.user.entity;

import java.io.Serializable;

import java.util.Date;

public class WebUser implements Serializable {

    /**
     * SVU
     */
    private static final long serialVersionUID = 1L;

    /**ID*/
    private String id;

    /**用户名*/
    private String login;

    /**手机号*/
    private String cellphone;

    /**邮箱*/
    private String email;

    /**密码*/
    private String password;

    /**秘钥*/
    private String passwordSalt;

    /**当前登陆时间*/
    private Date currentLoginAt;

    /**当前登陆IP*/
    private String currentLoginIp;

    /**失败登陆次数*/
    private Integer failedLoginCount;

    /**最后一次登陆时间*/
    private Date lastLoginAt;

    /**最后一次登陆IP*/
    private String lastLoginIp;

    /**登陆次数*/
    private Integer loginCount;

    /**注册IP*/
    private String registIp;

    /**状态*/
    private Long active;

    /**帐户有效flag*/
    private String validFlag;

    /**创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;

         
    public WebUser() {

    }

    /**获取ID*/
    public String getId() {
        return id;
    }

    /**设置ID*/
    public void setId(String id) {
        this.id = id;
    }
    /**获取用户名*/
    public String getLogin() {
        return login;
    }

    /**设置用户名*/
    public void setLogin(String login) {
        this.login = login;
    }
    /**获取手机号*/
    public String getCelphone() {
        return cellphone;
    }

    /**设置手机号*/
    public void setCelphone(String cellphone) {
        this.cellphone = cellphone;
    }
    /**获取邮箱*/
    public String getEmail() {
        return email;
    }

    /**设置邮箱*/
    public void setEmail(String email) {
        this.email = email;
    }
    /**获取密码*/
    public String getPassword() {
        return password;
    }

    /**设置密码*/
    public void setPassword(String password) {
        this.password = password;
    }
    /**获取秘钥*/
    public String getPasswordSalt() {
        return passwordSalt;
    }

    /**设置秘钥*/
    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }
    /**获取当前登陆时间*/
    public Date getCurrentLoginAt() {
        return currentLoginAt;
    }

    /**设置当前登陆时间*/
    public void setCurrentLoginAt(Date currentLoginAt) {
        this.currentLoginAt = currentLoginAt;
    }
    /**获取当前登陆IP*/
    public String getCurrentLoginIp() {
        return currentLoginIp;
    }

    /**设置当前登陆IP*/
    public void setCurrentLoginIp(String currentLoginIp) {
        this.currentLoginIp = currentLoginIp;
    }
    /**获取失败登陆次数*/
    public Integer getFailedLoginCount() {
        return failedLoginCount;
    }

    /**设置失败登陆次数*/
    public void setFailedLoginCount(Integer failedLoginCount) {
        this.failedLoginCount = failedLoginCount;
    }
    /**获取最后一次登陆时间*/
    public Date getLastLoginAt() {
        return lastLoginAt;
    }

    /**设置最后一次登陆时间*/
    public void setLastLoginAt(Date lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }
    /**获取最后一次登陆IP*/
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**设置最后一次登陆IP*/
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
    /**获取登陆次数*/
    public Integer getLoginCount() {
        return loginCount;
    }

    /**设置登陆次数*/
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }
    /**获取注册IP*/
    public String getRegistIp() {
        return registIp;
    }

    /**设置注册IP*/
    public void setRegistIp(String registIp) {
        this.registIp = registIp;
    }
    /**获取状态*/
    public Long getActive() {
        return active;
    }

    /**设置状态*/
    public void setActive(Long active) {
        this.active = active;
    }
    /**获取帐户有效flag*/
    public String getValidFlag() {
        return validFlag;
    }

    /**设置帐户有效flag*/
    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
    }
    /**获取创建时间*/
    public Date getCreateTime() {
        return createTime;
    }

    /**设置创建时间*/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**获取更新时间*/
    public Date getUpdateTime() {
        return updateTime;
    }

    /**设置更新时间*/
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String toString() {
        return "WebUser ["
        + ", id=" + id
        + ", login=" + login
        + ", cellphone=" + cellphone
        + ", email=" + email
        + ", password=" + password
        + ", passwordSalt=" + passwordSalt
        + ", currentLoginAt=" + currentLoginAt
        + ", currentLoginIp=" + currentLoginIp
        + ", failedLoginCount=" + failedLoginCount
        + ", lastLoginAt=" + lastLoginAt
        + ", lastLoginIp=" + lastLoginIp
        + ", loginCount=" + loginCount
        + ", registIp=" + registIp
        + ", active=" + active
        + ", validFlag=" + validFlag
        + ", createTime=" + createTime
        + ", updateTime=" + updateTime
        + "]";
    }

}
