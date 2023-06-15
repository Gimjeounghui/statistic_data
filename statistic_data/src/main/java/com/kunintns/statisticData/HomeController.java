package com.kunintns.statisticData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/")
	public String home() {
	
		logger.info("@@@@index 페이지 실행@@@@");
		return "/IntersectionInfo/test";
	}
}