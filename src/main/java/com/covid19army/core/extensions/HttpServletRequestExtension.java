package com.covid19army.core.extensions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

public class HttpServletRequestExtension {

	@Autowired
	HttpServletRequest _request;
	
	public String getAuthenticatedUser() {
		return _request.getHeader("X-Auth-User");
	}
}
