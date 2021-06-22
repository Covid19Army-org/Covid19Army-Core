package com.covid19army.core.utilities;

import com.covid19army.core.dtos.ActivityLogDto;

public class Helper {

	public static ActivityLogDto createActivityLogDto(long entityid, String entity, String action, long fromuserid, long touserid) {
		ActivityLogDto dto = new ActivityLogDto();
		dto.setActivitytype(action);
		dto.setFromUserid(fromuserid);
		dto.setToUserid(touserid);
		dto.setEntitytype(entity);
		dto.setEntityid(entityid);
		return dto;		
	}
}
