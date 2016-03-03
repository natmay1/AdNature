package com.adnature.por.action.account;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.adnature.domain.user.entity.WebUser;
import com.adnature.framework.util.DESPlus;
import com.adnature.framework.util.DateUtils;
import com.adnature.framework.util.StringUtils;
import com.adnature.framework.util.Struts2Utils;
import com.adnature.framework.web.action.BaseAction;
import com.adnature.framework.web.freemarker.FeroFreemarkerProcessor;
import com.adnature.usermangent.service.WebUserService;
import com.adnature.utils.Constants;

/**
 * 个人中心首页
 * 
 * @author 
 */
@Namespace("/account")
@Results({ @Result(name = "index", location = "index.ftl", type = "freemarker")})
public class IndexAction extends BaseAction{

	private static final long serialVersionUID = 1L;
	
	/** 用户投资信息查询Service */
	@Autowired
	private WebUserService webUserService;
	
	@Autowired
	private FeroFreemarkerProcessor feroFreemarkerProcessor;
	
    private WebUser webUser;
    
	/**
	 * <p>个人中心首页初始化</p>.<br>
	 * author：<br>
	 *===================================
	 * @return
	 * @throws Exception
	 */
	@Action(value="index")
	@Override
	public String init() throws Exception {
		String userId = getLoginuser().getId();
		//用户基本信息
		webUser = webUserService.findOne(userId);		
		return "index";
	}
	
	public WebUser getWebUser() {
		return webUser;
	}

	public void setWebUser(WebUser webUser) {
		this.webUser = webUser;
	}

}
