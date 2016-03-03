
package com.adnature.domain.profile.criteria;

import java.util.Date;

import com.adnature.framework.dao.BaseCriteria;
import com.adnature.framework.dao.Column;
import com.adnature.framework.dao.Table;

@Table(name = "PROFILE")
public class ProfileCriteria extends BaseCriteria {

    @Column(name="ID")
    private String id;

    @Column(name="ADDRESS")
    private String address;
    
    @Column(name="PROVINCE")
    private String province;
    
    @Column(name="CITY")
    private String city;
    
    @Column(name="USER_ID")
    private String userId;

    @Column(name="CREATE_TIME")
    private Date createTime;

    @Column(name="UPDATE_TIME")
    private Date updateTime;

    @Column(name="CREATE_USER_ID")
    private String createUserId;

    @Column(name="UPDATE_USER_ID")
    private String updateUserId;

    @Column(name="VERSION")
    private Integer version;
    
    
         
    public ProfileCriteria() {
    	
	}

	public String getId() {
        return id;
    }

    public void setId(String id, Operator ... oper) {
        this.id = id;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("id", param);
            }
        }
    }

    public String getProvince() {
		return province;
	}

	public void setProvince(String province, Operator ... oper) {
		this.province = province;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("province", param);
            }
        }
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city, Operator ... oper) {
		this.city = city;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("city", param);
            }
        }
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address, Operator ... oper) {
		this.address = address;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("address", param);
            }
        }
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId, Operator ... oper) {
		this.userId = userId;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("userId", param);
            }
        }
	}
	
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime, Operator ... oper) {
        this.createTime = createTime;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("createTime", param);
            }
        }
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime, Operator ... oper) {
        this.updateTime = updateTime;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("updateTime", param);
            }
        }
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId, Operator ... oper) {
        this.createUserId = createUserId;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("createUserId", param);
            }
        }
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId, Operator ... oper) {
        this.updateUserId = updateUserId;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("updateUserId", param);
            }
        }
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version, Operator ... oper) {
        this.version = version;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("version", param);
            }
        }
    }

	public static enum OrderField implements OrderColumn {

        id("ID"),
        address("ADDRESS"),
        province("PROVINCE"),
        city("CITY"),
        userId("USER_ID"),
        updateTime("UPDATE_TIME"),
        createUserId("CREATE_USER_ID"),
        updateUserId("UPDATE_USER_ID"),
        version("VERSION");

    	private String value = "";
    	private OrderField(String value){
    		this.value = value;
    	}

		@Override
		public String getValue() {
			return value;
		}
    }

}
