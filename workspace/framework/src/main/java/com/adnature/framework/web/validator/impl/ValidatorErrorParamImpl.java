package com.adnature.framework.web.validator.impl;

import java.util.Map;

import com.adnature.framework.web.validator.ValidatorErrorParam;

public class ValidatorErrorParamImpl implements ValidatorErrorParam {
	 private  Map<String, Object> parameters;

	public ValidatorErrorParamImpl(final Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	public   Object getFieldValue(String fieldName) {
		Object fieldValue = parameters.get(fieldName);
		if (fieldValue != null && fieldValue.getClass().isArray()) {
			String[] arr = (String[]) fieldValue;
			if (arr != null && arr.length > 0) {
				fieldValue = arr[0];
			}
		}
		return fieldValue;
	}
}
