package com.adnature.profile.service;

import com.adnature.domain.profile.entity.Profile;

public interface ProfileService {
	
	public Profile findProfileByUserId(String userId);
	
	public void dynamicUpdate(Profile profile);
	
	public void insert(Profile profile);
}
