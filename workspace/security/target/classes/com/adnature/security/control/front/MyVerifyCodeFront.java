package com.adnature.security.control.front;

import javax.servlet.http.HttpServletRequest;

import com.adnature.framework.resource.MessageResourceBundle;
import com.adnature.framework.util.StringUtils;
import com.adnature.framework.util.VerifyCodeGenerator;
import com.adnature.framework.web.exception.CaptchaException;

public class MyVerifyCodeFront extends VerifyCodeGenerator {
	public static void checkVerifyCode(HttpServletRequest request) throws CaptchaException{
		String requestverifyCode = request.getParameter("verifyCode");
		String verifyCode = (String) request.getSession().getAttribute("verifyCode");

		if (StringUtils.isNotEmpty(requestverifyCode)) {

			if (!requestverifyCode.equals(verifyCode)) {
				throw new CaptchaException(MessageResourceBundle.getMessage("BLE008"));
			}

		} else {
			throw new CaptchaException(MessageResourceBundle.getMessage("BLE007"));
		}
	}
	
	
	public static void checkPhoneVerifyCode(HttpServletRequest request) throws CaptchaException{
		String requestverifyCode = request.getParameter("phoneVerifyCode");
		String verifyCode = (String) request.getSession().getAttribute("phoneVerifyCode");

		if (StringUtils.isNotEmpty(requestverifyCode)) {

			if (!requestverifyCode.equals(verifyCode)) {
				throw new CaptchaException(MessageResourceBundle.getMessage("BLE008"));
			}

		} else {
			throw new CaptchaException(MessageResourceBundle.getMessage("BLE007"));
		}
	}
}
