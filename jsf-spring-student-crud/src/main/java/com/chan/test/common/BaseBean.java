package com.chan.test.common;

import java.util.Map;
import java.util.ResourceBundle;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.servlet.ServletContext;

public class BaseBean {
	/**
	 * Get faces context.
	 * 
	 * @return faces context
	 */
	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}

	/**
	 * Get application context.
	 * 
	 * @return application context
	 */
	protected Application getApplicationContext() {
		return getFacesContext().getApplication();
	}

	/**
	 * Get request map.
	 * 
	 * @return request map
	 */
	protected Map getRequestMap() {
		return getFacesContext().getExternalContext().getRequestMap();
	}

	/**
	 * Get bundle.
	 * 
	 * @return bundle
	 */
	protected ResourceBundle getBundle() {
		return ResourceBundle.getBundle(getApplicationContext().getMessageBundle(),
				getFacesContext().getViewRoot().getLocale());
	}

	/**
	 * Get system path.
	 * 
	 * @return system path
	 */
	protected String getSystemPath() {
		Object context = FacesContext.getCurrentInstance().getExternalContext().getContext();
		String systemPath = ((ServletContext) context).getRealPath("/");
		return systemPath;
	}

	/**
	 * Get flash.
	 * 
	 * @return flash
	 */
	protected Flash getFlash() {
		return getFacesContext().getExternalContext().getFlash();
	}
}
