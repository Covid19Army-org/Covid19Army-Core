package com.covid19army.core.dtos;

import java.io.Serializable;

public class MobileVerificationQueueDto implements Serializable  {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4242290079694692722L;

	private long entityid;

	private String entitytype;

	private String mobilenumber;
	
	public long getEntityid() {
		return entityid;
	}

	public void setEntityid(long entityid) {
		this.entityid = entityid;
	}

	public String getEntitytype() {
		return entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
}
