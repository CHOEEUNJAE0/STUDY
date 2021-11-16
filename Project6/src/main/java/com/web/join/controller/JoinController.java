package com.web.join.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.join.model.*;


@WebServlet("/join")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		//포워드 경로
		String view = "/WEB-INF/jsp/join/index.jsp";
		RequestDispatcher rp = request.getRequestDispatcher(view);
		rp.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//유효성 검사
		//기존에 만들었던 것들은 DTO에 만들어준것이 있으니 지워준다.
		//그리고 DTO에 담아준다
		String password_check = request.getParameter("password_check");

		//모델과 관련 된 유효성 검사 DTO 
		//DTO
		
		JoinDTO dto = new JoinDTO (
				request.getParameter("username"),
				request.getParameter("password"),
				request.getParameter("email"));
		
		JoinService service = new JoinService(dto);

				//유효성 검사
			if(service.isValid() == 0) {
				
			
			//패스워드 일치 검사		//같은지 보기위해 패스워드체크 넣어줌
			if(service.equalPassword(password_check)) {
				//동일한 패스워드 입력한 경우
			if(service.isDuplicated()) {
				//중복 된 아이디가 있는 경우
				
			}else {
				//중복 된 아이디가 없는 경우
			}
				}else {
					//패스워드가 동일하지 않은 경우
				}
			}

				
	}

}
