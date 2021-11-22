package com.web.login.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.login.model.LoginDTO;
import com.web.login.model.LoginService;


@WebServlet("/login")
public class LoginControlloer extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//요청이 들어오면 get으로 먼저 들어옴
		//포워드 시켜 준다.0         
		String view = "/WEB-INF/jsp/login/index.jsp";
		RequestDispatcher rp = request.getRequestDispatcher(view);
		rp.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//2.
		String username = request.getParameter("username");
	 	String password = request.getParameter("password");
		
		//3.이러한 내용들은 가급적 DTO에 담아두면 사용하기 편하니깐
		LoginDTO dto = new LoginDTO(username,password);
		//4.dto 임포트 후 기본 생성자가 dto에 없으니깐 dto에 생성해주기
		
		//5.담은 후 서비스를 통해서  		//dto 통해서 사용할거니깐 매개변수로 dto //loginservice도 생성자 만들어주기 
		LoginService service = new LoginService(dto);
		
		
		//9.잘못되었을 경우 해 줄 포워드
		String view = "/WEB-INF/jsp/join/index.jsp";
		RequestDispatcher rp = request.getRequestDispatcher(view);
		
		
		if(service.isExisted()) {
			//7. 아이디 있는지 없는지 확인
		if(service.confirmPassword()) {
			//8.패스워드가 일치하는 경우 //리다이렉트 해주기

			Cookie cookie = new Cookie("login_name", dto.getUsername());
			cookie.setMaxAge(60 * 30); // 만료시간 설정 
			response.addCookie(cookie);
			
			// true: 이미 세션정보가 있으면 있는 정보로 반환하고 없으면 새로 생성한다.
			// false: 이미 세션정보가 있으면 있는 정보로 반환하고 없으면 null로 반환한다.
			HttpSession session = request.getSession();
			session.setAttribute("login_name", dto.getUsername());
			response.sendRedirect("/");
		}else {
			//패스워드 불일치 //다시 로그린 화면을 포워드 해줘야한다(메세지를 담아서).
			request.setAttribute("login_error", "패스워드를 잘 못 입력했습니다.");
			System.out.println("패스워드를 잘 못 입력 했습니다.");
			rp.forward(request, response);
	}
		}else {
			//아이디 불일치
			request.setAttribute("login_error", "해당 아이디가 했습니다.");
			System.out.println("해당 아이디가 없습니다.");
			rp.forward(request, response);
		}
			
			
		}
		
	}


