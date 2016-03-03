package com.adnature.framework.web.freemarker;

import java.io.IOException;

import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.adnature.framework.exception.FreemarkerTemplateExceptionHandler;

import freemarker.template.TemplateException;

public class MyFreeMarkerConfigurer extends FreeMarkerConfigurer {

	@Override
	public void afterPropertiesSet() throws IOException, TemplateException {
		if (getConfiguration() == null) {
			setConfiguration(createConfiguration());
		}
		getConfiguration().setTemplateExceptionHandler(
				new FreemarkerTemplateExceptionHandler());
	}
}
