package com.kunintns.statisticData.intersectionInfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kunintns.statisticData.intersectionInfo.vo.IntersectionInfoVO;

@Service("intersectionInfoService")
public class IntersectionInfoServiceImpl implements IntersectionInfoService {

	@Autowired
	private IntersectionInfoMapper intersectionInfoMapper;

	@Override
	public List<IntersectionInfoVO> selectIntersectList(IntersectionInfoVO vo) {

		return intersectionInfoMapper.selectIntersectList(vo);
	}
}