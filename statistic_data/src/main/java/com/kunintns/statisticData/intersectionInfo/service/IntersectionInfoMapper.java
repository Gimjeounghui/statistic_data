package com.kunintns.statisticData.intersectionInfo.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kunintns.statisticData.intersectionInfo.vo.IntersectionInfoVO;

@Mapper
public interface IntersectionInfoMapper {

	public List<IntersectionInfoVO> selectIntersectList(IntersectionInfoVO vo);
		
}