package com.web.project7.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.project7.HomeController;


@Controller //꼭 써줘야 한다
@RequestMapping(value="") //임포트
//extends HttpServlet는 필요없으니깐 지워준다
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	//private static final long serialVersionUID = 1L;
	//private String view = "/WEB-INF/jsp/index.jsp"; 필요없으니깐 주석
	
	@RequestMapping(value="", method=RequestMethod.GET) //대신 여기에 매핑 주소 적어줘야한다
	//doGet은 필요없으니깐 바꿔준다 String=void doGet=mainPage
	protected String mainPage() {
		//request.getRequestDispatcher(view).forward(request, response);
		logger.info("메인 페이지 동작 확인");
		return "index"; //해주면 끝
	}
}