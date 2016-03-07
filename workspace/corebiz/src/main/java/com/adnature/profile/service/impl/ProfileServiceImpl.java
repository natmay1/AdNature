package com.adnature.profile.service.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adnature.domain.profile.entity.Profile;
import com.adnature.domain.profile.repository.ProfileRepository;
import com.adnature.framework.util.StringUtils;
import com.adnature.profile.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	ProfileRepository profileRepository;
	
	@Override
	public Profile findProfileByUserId(String userId) {
		return profileRepository.findProfileByUserId(userId);
	}

	@Override
	public void dynamicUpdate(Profile profile) {
		profileRepository.dynamicUpdate(profile);
	}
	
	@Override
	public void insert(Profile profile) {
		profile.setId(StringUtils.getUUID());
		profileRepository.insert(profile);
	}
	
}