package com.adnature.sport.service;

import java.util.List;

import com.adnature.domain.sport.criteria.SportCriteria;
import com.adnature.domain.sport.entity.Sport;
import com.adnature.domain.sport.entity.SportUser;

public interface SportService {
	
	public List<Sport> findAll();
	
	public List<Sport> findByCriteria(SportCriteria criteria);
	
	public List<Sport> findSportByUserId(String userId);
	
	public void insertSportUser(String[] sportIds, String userId);
	
	public void insertOtherSportUser(String[] sportNames, String userId);
	
	public void deleteSportUser(String[] sportIds, String userId);
	
	public void deleteOtherSportUser(String[] sportNames, String userId);
	
	public void dynamicUpdate(Sport sport);
	
	public void insert(Sport sport);

	public List<String> findSportLevelByUserId(String userId);
}
