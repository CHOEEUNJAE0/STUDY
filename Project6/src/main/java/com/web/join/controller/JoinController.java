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
		
		//원래 밑에 if와 else 부분에 계속 반복해서 작성했던 포워드 부분을 위로 빼주고 
		//밑에 if와 else 부분에는 rp.forward(request, response);로 코드를 정리 해 준다.
		request.setAttribute("initData", dto);
		
		String view = "/WEB-INF/jsp/join/index.jsp";
		RequestDispatcher rp = request.getRequestDispatcher(view);
		rp.forward(request, response);
		

				//유효성 검사
			if(service.isValid() == 0) {
				
			//유효성 검사가 제대로 통과하지 않았을때도 마찬가지로 포워드. 맨 밑에 else부분
				
			
			//패스워드 일치 검사		//같은지 보기위해 패스워드체크 넣어줌
			if(service.equalPassword(password_check)) {
				//동일한 패스워드 입력한 경우
			if(service.isDuplicated()) {
				//중복 된 아이디가 있는 경우
				//제출 한 양식을 다시 반환한다 -> 포워드 시켜라
				//그냥 포워드 시키면 안되고 비밀번호 제외한 모든 값 초기화 -> 만족시키기 위해 단순히 포워드로 끝내는게 아니라
				//request.setAttribute에 담아 준다 init에 담아주기
				rp.forward(request, response);
			}else {
				//중복 된 아이디가 없는 경우
				service.createJoin();
				//login 페이지로 이동
				response.sendRedirect("./login");
			}
				}else {
					//패스워드가 동일하지 않은 경우
					//여기도 마찬가지로 양식 제풀 해줘야 하니깐 포워드 해 준다. 
					rp.forward(request, response);
					
				}
			}else {
				rp.forward(request, response);
			}

				
	}

}
