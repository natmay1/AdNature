package com.adnature.por.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.adnature.contentmanagent.service.AboutUsService;
import com.adnature.domain.cms.criteria.ArticleCriteria;
import com.adnature.domain.cms.criteria.ArticleCriteria.OrderField;
import com.adnature.domain.cms.dto.AboutUsDto;
import com.adnature.framework.dao.BaseCriteria.Operator;
import com.adnature.framework.dao.BaseCriteria.SortType;
import com.adnature.framework.web.action.BaseAction;
import com.adnature.utils.Constants;

/**
 * <p>关于我们</p>
 * @author 
 * @date 2015-10-21 17:03
 */
@Namespace("/")
@Results({ 
			@Result(name = BaseAction.INIT, location = "map.ftl", type = "freemarker")
        })

public class MapAction extends BaseAction{

    private static final long serialVersionUID = -91279158110519603L;

    @Action(value="map")
    public String init() {
        return INIT;
    }

}
