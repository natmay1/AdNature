package com.adnature.framework.web.validator;

import java.util.Map;

public interface ValidatorErrorParam {
	/**
	 * 取得request变量值
	 * @param fieldName
	 * @return
	 */
	public Object getFieldValue(String fieldName);
}
