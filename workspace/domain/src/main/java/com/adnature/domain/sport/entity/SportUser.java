
package com.adnature.domain.sport.entity;

import java.io.Serializable;

public class SportUser implements Serializable {

    /**
     * SVU
     */
    private static final long serialVersionUID = 1L;

    private String id;

    private String sportId;
    
    private String userId;

    private String type;

         
    public SportUser() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

	public String getSportId() {
		return sportId;
	}

	public void setSportId(String sportId) {
		this.sportId = sportId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
