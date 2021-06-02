package com.covid19army.core.dtos;

public class RequestVolutneerStatusDto {

	long requestid;
	long volunteerid;
	boolean isaccepted;
	public long getRequestid() {
		return requestid;
	}
	public void setRequestid(long requestid) {
		this.requestid = requestid;
	}
	public long getVolunteerid() {
		return volunteerid;
	}
	public void setVolunteerid(long volunteerid) {
		this.volunteerid = volunteerid;
	}
	public boolean isIsaccepted() {
		return isaccepted;
	}
	public void setIsaccepted(boolean isaccepted) {
		this.isaccepted = isaccepted;
	}
	
	
}
