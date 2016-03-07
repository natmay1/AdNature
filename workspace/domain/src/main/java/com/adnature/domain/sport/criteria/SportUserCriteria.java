
package com.adnature.domain.sport.criteria;

import com.adnature.framework.dao.BaseCriteria;
import com.adnature.framework.dao.Column;
import com.adnature.framework.dao.Table;

@Table(name = "SPORT_USER")
public class SportUserCriteria extends BaseCriteria {

    @Column(name="ID")
    private String id;

    @Column(name="SPORT_ID")
    private String sportId;

    @Column(name="USER_ID")
    private String userId;

    @Column(name="TYPE")
    private String type;

    public SportUserCriteria() {
    	
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

    public String getSportId() {
		return sportId;
	}

	public void setSportId(String sportId, Operator ... oper) {
		this.sportId = sportId;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("sportId", param);
            }
        }
		this.sportId = sportId;
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
		this.userId = userId;
	}

    public String getType() {
        return type;
    }

    public void setType(String type, Operator ... oper) {
        this.type = type;
        if (oper != null) {
            for (Operator param : oper) {
                this.operatorMap.put("type", param);
            }
        }
    }

    public static enum OrderField implements OrderColumn {

        id("ID"),
        sportId("SPORT_ID"),
        userId("USER_ID"),
        type("CREATE_TIME");

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
