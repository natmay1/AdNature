package com.adnature.domain.user.criteria;

import java.util.Date;

import com.adnature.framework.dao.BaseCriteria;
import com.adnature.framework.dao.Column;
import com.adnature.framework.dao.Table;

@Table(name = "WEB_USER")
public class WebUserCriteria extends BaseCriteria {

    /**ID*/
    @Column(name="ID")
    private String id;

    /**用户名*/
    @Column(name="LOGIN")
    private String login;

    /**手机号*/
    @Column(name="CELLPHONE")
    private String cellphone;

    /**邮箱*/
    @Column(name="EMAIL")
    private String email;

    /**密码*/
    @Column(name="PASSWORD")
    private String password;

    /**秘钥*/
    @Column(name="PASSWORD_SALT")
    private String passwordSalt;

    /**当前登陆时间*/
    @Column(name="CURRENT_LOGIN_AT")
    private Date currentLoginAt;

    /**当前登陆IP*/
    @Column(name="CURRENT_LOGIN_IP")
    private String currentLoginIp;

    /**失败登陆次数*/
    @Column(name="FAILED_LOGIN_COUNT")
    private Integer failedLoginCount;

    /**最后一次登陆时间*/
    @Column(name="LAST_LOGIN_AT")
    private Date lastLoginAt;

    /**最后一次登陆IP*/
    @Column(name="LAST_LOGIN_IP")
    private String lastLoginIp;

    /**登陆次数*/
    @Column(name="LOGIN_COUNT")
    private Integer loginCount;

    /**注册IP*/
    @Column(name="REGIST_IP")
    private String registIp;

    /**状态*/
    @Column(name="ACTIVE")
    private Long active;

    /**帐户有效flag*/
    @Column(name="VALID_FLAG")
    private String validFlag;

    /**创建时间*/
    @Column(name="CREATE_TIME")
    private Date createTime;

    /**更新时间*/
    @Column(name="UPDATE_TIME")
    private Date updateTime;

         
    public WebUserCriteria() {

    }

    /**获取ID*/
    public String getId() {
        return id;
    }

    /**设置ID*/
    public void setId(String id, Operator ... oper) {
        this.id = id;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("id", param);
            }
        }
    }
    /**获取用户名*/
    public String getLogin() {
        return login;
    }

    /**设置用户名*/
    public void setLogin(String login, Operator ... oper) {
        this.login = login;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("login", param);
            }
        }
    }
    /**获取手机号*/
    public String getCelphone() {
        return cellphone;
    }

    /**设置手机号*/
    public void setCelphone(String cellphone, Operator ... oper) {
        this.cellphone = cellphone;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("cellphone", param);
            }
        }
    }
    /**获取邮箱*/
    public String getEmail() {
        return email;
    }

    /**设置邮箱*/
    public void setEmail(String email, Operator ... oper) {
        this.email = email;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("email", param);
            }
        }
    }
    /**获取密码*/
    public String getPassword() {
        return password;
    }

    /**设置密码*/
    public void setPassword(String password, Operator ... oper) {
        this.password = password;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("password", param);
            }
        }
    }
    /**获取秘钥*/
    public String getPasswordSalt() {
        return passwordSalt;
    }

    /**设置秘钥*/
    public void setPasswordSalt(String passwordSalt, Operator ... oper) {
        this.passwordSalt = passwordSalt;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("passwordSalt", param);
            }
        }
    }
    /**获取当前登陆时间*/
    public Date getCurrentLoginAt() {
        return currentLoginAt;
    }

    /**设置当前登陆时间*/
    public void setCurrentLoginAt(Date currentLoginAt, Operator ... oper) {
        this.currentLoginAt = currentLoginAt;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("currentLoginAt", param);
            }
        }
    }
    /**获取当前登陆IP*/
    public String getCurrentLoginIp() {
        return currentLoginIp;
    }

    /**设置当前登陆IP*/
    public void setCurrentLoginIp(String currentLoginIp, Operator ... oper) {
        this.currentLoginIp = currentLoginIp;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("currentLoginIp", param);
            }
        }
    }
    /**获取失败登陆次数*/
    public Integer getFailedLoginCount() {
        return failedLoginCount;
    }

    /**设置失败登陆次数*/
    public void setFailedLoginCount(Integer failedLoginCount, Operator ... oper) {
        this.failedLoginCount = failedLoginCount;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("failedLoginCount", param);
            }
        }
    }
    /**获取最后一次登陆时间*/
    public Date getLastLoginAt() {
        return lastLoginAt;
    }

    /**设置最后一次登陆时间*/
    public void setLastLoginAt(Date lastLoginAt, Operator ... oper) {
        this.lastLoginAt = lastLoginAt;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("lastLoginAt", param);
            }
        }
    }
    /**获取最后一次登陆IP*/
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**设置最后一次登陆IP*/
    public void setLastLoginIp(String lastLoginIp, Operator ... oper) {
        this.lastLoginIp = lastLoginIp;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("lastLoginIp", param);
            }
        }
    }
    /**获取登陆次数*/
    public Integer getLoginCount() {
        return loginCount;
    }

    /**设置登陆次数*/
    public void setLoginCount(Integer loginCount, Operator ... oper) {
        this.loginCount = loginCount;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("loginCount", param);
            }
        }
    }
    /**获取注册IP*/
    public String getRegistIp() {
        return registIp;
    }

    /**设置注册IP*/
    public void setRegistIp(String registIp, Operator ... oper) {
        this.registIp = registIp;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("registIp", param);
            }
        }
    }
    /**获取状态*/
    public Long getActive() {
        return active;
    }

    /**设置状态*/
    public void setActive(Long active, Operator ... oper) {
        this.active = active;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("active", param);
            }
        }
    }
    /**获取帐户有效flag*/
    public String getValidFlag() {
        return validFlag;
    }

    /**设置帐户有效flag*/
    public void setValidFlag(String validFlag, Operator ... oper) {
        this.validFlag = validFlag;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("validFlag", param);
            }
        }
    }
    /**获取创建时间*/
    public Date getCreateTime() {
        return createTime;
    }

    /**设置创建时间*/
    public void setCreateTime(Date createTime, Operator ... oper) {
        this.createTime = createTime;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("createTime", param);
            }
        }
    }
    /**获取更新时间*/
    public Date getUpdateTime() {
        return updateTime;
    }

    /**设置更新时间*/
    public void setUpdateTime(Date updateTime, Operator ... oper) {
        this.updateTime = updateTime;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("updateTime", param);
            }
        }
    }

    /**
     * 排序字段枚举定义
     */
    public static enum OrderField implements OrderColumn {

        id("ID"),
        login("LOGIN"),
        cellphone("CELLPHONE"),
        email("EMAIL"),
        password("PASSWORD"),
        passwordSalt("PASSWORD_SALT"),
        currentLoginAt("CURRENT_LOGIN_AT"),
        currentLoginIp("CURRENT_LOGIN_IP"),
        failedLoginCount("FAILED_LOGIN_COUNT"),
        lastLoginAt("LAST_LOGIN_AT"),
        lastLoginIp("LAST_LOGIN_IP"),
        loginCount("LOGIN_COUNT"),
        registIp("REGIST_IP"),
        active("ACTIVE"),
        validFlag("VALID_FLAG"),
        createTime("CREATE_TIME"),
        updateTime("UPDATE_TIME");

    	private String value = "";
    	private OrderField(String value){
    		this.value = value;
    	}

		@Override
		public String getValue() {
			return value;
		}
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
