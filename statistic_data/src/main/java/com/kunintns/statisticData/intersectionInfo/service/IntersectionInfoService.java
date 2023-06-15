package com.kunintns.statisticData.intersectionInfo.service;

import java.util.List;

import com.kunintns.statisticData.intersectionInfo.vo.IntersectionInfoVO;

public interface IntersectionInfoService {
	
	public List<IntersectionInfoVO> selectIntersectList(IntersectionInfoVO vo);
	
}