package com.adnature.framework.web.ui;


import java.lang.reflect.Method;
import java.util.List;

import org.springframework.util.ReflectionUtils;

import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

public class GetEnumControl implements TemplateMethodModel{
	private static final String ENUM_PACKAGE = "com.adnature.framework.enumpack";
	
	private static final String ENUM_PACKAGE_OTHER = "com.adnature.payment.enumtype";
	private static final String ENUM_PACKAGE_PAYSELL = "com.adnature.domain.payment.marketorder.enumpack";

	@Override
	public Object exec(List argList) throws TemplateModelException {
		try {
			String enumName = argList.get(0).toString();
			String code = argList.get(1).toString();
			Class<? extends Enum<?>> e = (Class<? extends Enum<?>>) Class.forName(ENUM_PACKAGE + "." + enumName);
			Method method = ReflectionUtils.findMethod(e, "getEnumByKey", String.class);
			return ReflectionUtils.invokeMethod(method, e, code);
		} catch (ClassNotFoundException e1) {
			
			try {
				String enumName = argList.get(0).toString();
				String code = argList.get(1).toString();
				Class<? extends Enum<?>> e;
				e = (Class<? extends Enum<?>>) Class.forName(ENUM_PACKAGE_OTHER + "." + enumName);
				Method method = ReflectionUtils.findMethod(e, "getEnumByKey", String.class);
				return ReflectionUtils.invokeMethod(method, e, code);
			} catch (ClassNotFoundException e2) {
				try{
					String enumName = argList.get(0).toString();
					String code = argList.get(1).toString();
					Class<? extends Enum<?>> e;
					e = (Class<? extends Enum<?>>) Class.forName(ENUM_PACKAGE_PAYSELL + "." + enumName);
					Method method = ReflectionUtils.findMethod(e, "getEnumByKey", String.class);
					return ReflectionUtils.invokeMethod(method, e, code);
				}catch(ClassNotFoundException e3){
					try{
						String enumName = argList.get(0).toString();
						String code = argList.get(1).toString();
						Class<? extends Enum<?>> e;
						e = (Class<? extends Enum<?>>) Class.forName("com.adnature.marketing.constants" + "." + enumName);
						Method method = ReflectionUtils.findMethod(e, "getType", String.class);
						return ReflectionUtils.invokeMethod(method, e, code);
					}catch(ClassNotFoundException e4){
						e3.printStackTrace();
					}
				}
			}
			
		} 
		
		return null;
	}

}
