package com.kunintns.statisticData.intersectionInfo.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kunintns.statisticData.common.util.BoardUtil;
import com.kunintns.statisticData.intersectionInfo.service.IntersectionInfoService;
import com.kunintns.statisticData.intersectionInfo.vo.IntersectionInfoVO;

@Controller
@RequestMapping("/intersect")
public class IntersectionInfoController {

	private static final Logger logger = LoggerFactory.getLogger(IntersectionInfoController.class);

	@Autowired
	private IntersectionInfoService intersectionInfoService;

	@RequestMapping(value = "/listIntersect")
	public String listIntersect(@ModelAttribute("searchVO") IntersectionInfoVO vo, Model model, HttpSession session) {

		// 게시판 UTIL
		BoardUtil boardUtil = new BoardUtil();
		List<IntersectionInfoVO> listIntersect = null;

		try {

			/**
			 * 게시판 기능
			 */
			int totalRecordCount = 0; 								// 총 게시물 건수
			int currentPageNo = vo.getCurrentPageNo(); 				// 현재 클릭한 page번호
			int pageSize = vo.getPageSize(); 						// 페이지 리스트에 게시되는 페이지 건수
			int recordCountPerPage = vo.getRecordCountPerPage();	// 한 페이지당 게시되는 게시물 건 수

			// 게시물 조회 범위 연산
			HashMap<String, Integer> rangeMap = boardUtil.calcDataRange(currentPageNo, recordCountPerPage);
			vo.setStart(rangeMap.get("firstRecordIndex"));
			vo.setEnd(rangeMap.get("lastRecordIndex"));

			// 전체 검색 결과
			listIntersect = intersectionInfoService.selectIntersectList(vo);

			// 검색된 결과가 있는지 체크
			if (listIntersect.size() > 0) { 
				// 전체 검색 결과 게시물 건 수
				totalRecordCount = listIntersect.get(0).getTotalRecordCount();
			}

			// pager기능 모든 계산식 결과 정보 map에 담기
			HashMap<String, Integer> pagerMap = boardUtil.calcBoardPagerElement(currentPageNo, totalRecordCount, recordCountPerPage, pageSize);
			/**
			 * 게시판 END
			 */

			// model 세팅
			model.addAttribute("listIntersect", listIntersect);
			model.addAttribute("pagerMap", pagerMap);

		} catch (Exception e) {

			logger.info(e.getMessage());
			e.printStackTrace();
		}

		return "/IntersectionInfo/listIntersectionInfo";
	}
}