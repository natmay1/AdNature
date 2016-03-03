package com.adnature.framework.web.validator;

import java.util.List;
import java.util.Map;

import com.adnature.framework.web.action.BaseAction;

public interface DataCheck {
	public List<String> check(BaseAction action, Map<String, Object> parameters) ;
}
