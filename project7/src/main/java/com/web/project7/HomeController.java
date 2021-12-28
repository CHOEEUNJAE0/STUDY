package com.web.project7;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//여기에 이렇게 적어주고 나면
@RequestMapping(value="/board")
public class HomeController {
	
	//로그 기능
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	//@RequestMapping(value = "/board", method = RequestMethod.GET) //@WebServlet("/") method=doGet,doPost
	//1.이런식으로
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//로그 출력
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date(); //날짜설정해서
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); // =request.setAttribute("serverTime", formattedDate) 했던것과 동일한것
		
		return "home"; //WEB-INF 안에 VIEWS->HOME.JSP를 쓰겠다는 것.prefix/WEB-INF/views로 들어 가 있는 것.
	}
	
	//예전에는 doGet, doPost만 작성 가능했는데 이제는 한 controller에 여러가지 mapping 정보를 작성 해 줄 수 있다.
	//@RequestMapping(value = "/guest", method = RequestMethod.GET) //@WebServlet("/") method=doGet,doPost
	//2.계층 구조 형태로도 적어 줄 수 있다
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String boardAdd(Locale locale, Model model) {
		//로그 출력
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date(); //날짜설정해서
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); // =request.setAttribute("serverTime", formattedDate) 했던것과 동일한것
		
		return "home"; //WEB-INF 안에 VIEWS->HOME.JSP를 쓰겠다는 것.prefix/WEB-INF/views로 들어 가 있는 것.
	}
	
	
}
