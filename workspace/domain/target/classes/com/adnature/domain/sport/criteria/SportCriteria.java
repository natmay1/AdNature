
package com.adnature.domain.sport.criteria;

import java.util.Date;

import com.adnature.framework.dao.BaseCriteria;
import com.adnature.framework.dao.Column;
import com.adnature.framework.dao.Table;

@Table(name = "SPORT")
public class SportCriteria extends BaseCriteria {

    @Column(name="ID")
    private String id;

    @Column(name="NAME")
    private String name;

    @Column(name="FITNESS_LEVEL")
    private String fitnessLevel;

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
    
    
         
    public SportCriteria() {
    	
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

    public String getName() {
		return name;
	}

	public void setName(String name, Operator ... oper) {
		this.name = name;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("name", param);
            }
        }
		this.name = name;
	}

	public String getFitnessLevel() {
		return fitnessLevel;
	}

	public void setFitnessLevel(String fitnessLevel, Operator ... oper) {
		this.fitnessLevel = fitnessLevel;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("fitnessLevel", param);
            }
        }
		this.fitnessLevel = fitnessLevel;
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
        name("NAME"),
        fitnessLevel("FITNESS_LEVEL"),
        createTime("CREATE_TIME"),
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
