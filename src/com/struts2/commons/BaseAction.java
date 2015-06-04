package com.struts2.commons;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware, SessionAware {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected Map session;
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
}
