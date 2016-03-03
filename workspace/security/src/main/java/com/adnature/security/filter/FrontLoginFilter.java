package com.adnature.security.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.adnature.security.control.front.MyVerifyCodeFront;

public class FrontLoginFilter extends UsernamePasswordAuthenticationFilter {

	public FrontLoginFilter() {

	}

	private String verifyCodeFieldName = "verifyCode";

	public String getVerifyCodeFieldName() {
		return verifyCodeFieldName;
	}

	public void setVerifyCodeFieldName(String verifyCodeFieldName) {
		this.verifyCodeFieldName = verifyCodeFieldName;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request,
			HttpServletResponse response) throws AuthenticationException {
		// 保存用户名称
//		request.getSession(false).setAttribute(getUsernameParameter(),
//				obtainUsername(request));

		//yVerifyCodeFront.checkVerifyCode(request);
		return super.attemptAuthentication(request, response);
	}
}
