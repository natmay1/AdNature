package com.adnature.domain.sport.query;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.adnature.domain.sport.entity.Sport;

public interface SportQuery {

	List<Sport> findSportByUserId(@Param("userId") String userId);

}
