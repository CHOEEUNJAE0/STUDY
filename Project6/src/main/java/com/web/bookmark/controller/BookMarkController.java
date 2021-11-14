package com.web.bookmark.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.web.bookmark.model.*;


@WebServlet("/bookmark")
public class BookMarkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//doGet이 왔을때 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//jsp파일의 경로를 적어준다.
		String view = "/WEB-INF/jsp/bookmark/index.jsp";
		//view에 대한 경로 정보 알려줌
		RequestDispatcher rd = request.getRequestDispatcher(view);
		//포워드 시켜줌
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// 서블릿에서 사용자기 입력한 데이터를 추출 할 때 jsp파일에 지정 해 준 이름과 동일하게 적어줘야한다.
		
		String name = request.getParameter("bookmark_name");
		String url = request.getParameter("bookmark_url");
		//이렇게만 해줘도 되지만 가급적이면 mvc 모델이 맞추어 작업을 해야하니깐 DTO를 만들어서 해 주는것이 좋다
		//dto로 이동
		
		
		//제대로 작동하는지 콘솔창으로 확인하는 용도
		System.out.println("bookmark_name : " + request.getParameter("bookmark_name"));
		System.out.println("bookmark_url : " + request.getParameter("bookmark_url"));
		
		
		//dto 작성해주기
		//dto 객체에 담아주기 
		BookMarkDTO dto = new BookMarkDTO(name, url);
		
		//dto에 잘 담겼는지 콘솔창으로 확인하는 용도
		System.out.println("bookmark_name : " + dto.getName());
		System.out.println("bookmark_url : " + dto.getUrl());

		//서비스를 만들어 주자
		
		BookMarkService service = new BookMarkService();
		//여러 종류의 서비스가 있겠지만 지금 여기에서는 
		// 저장 & 조회 & 유효성검사 서비스가 될 것이다.
		// 저장 하려면 유효성 검사 필수 
		// 지금은 url 주소가 올바른 것인지 정도의 유효성 검사 필요
		
		//dto에 대한 valid 검사 수행 여부
		//이것들을 service 페이지에 만들어 주러 가자
		if(service.isValid(dto)) {
			//유효성 검사 통과한 경우(valid 검사 했을 때 통과가 되면)
			if(service.save(dto)) {
				//저장이 되었을 때
			
			}else {
				//저장이 안 되었을 때 처리 방법 else에 넣어주기
			
			}
			
			}else {
				//유효성 검사에 실패한 경우
			
		}
		

	
	}

}
