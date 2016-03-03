
package com.adnature.domain.sport.entity;

import java.io.Serializable;

import java.util.Date;

public class Sport implements Serializable {

    /**
     * SVU
     */
    private static final long serialVersionUID = 1L;

    private String id;

    private String name;
    
    private String fitnessLevel;

    private Date createTime;

    private Date updateTime;

    private String createUserId;

    private String updateUserId;

    private Integer version;

         
    public Sport() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }
    
    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFitnessLevel() {
		return fitnessLevel;
	}

	public void setFitnessLevel(String fitnessLevel) {
		this.fitnessLevel = fitnessLevel;
	}

}
