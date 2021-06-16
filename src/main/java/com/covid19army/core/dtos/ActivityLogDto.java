package com.covid19army.core.dtos;



public class ActivityLogDto {
	private long entityid;

	private String entitytype;
	
	private long fromUserid;

	private long toUserid;
	
	private String activitytype;

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

	public long getFromUserid() {
		return fromUserid;
	}

	public void setFromUserid(long fromUserid) {
		this.fromUserid = fromUserid;
	}

	public long getToUserid() {
		return toUserid;
	}

	public void setToUserid(long toUserid) {
		this.toUserid = toUserid;
	}

	public String getActivitytype() {
		return activitytype;
	}

	public void setActivitytype(String activitytype) {
		this.activitytype = activitytype;
	}
	
	
}
