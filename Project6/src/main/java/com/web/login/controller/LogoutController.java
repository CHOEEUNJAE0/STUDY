package com.web.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logout")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Cookie[] cookie = request.getCookies();
		
		HttpSession session = request.getSession();
		// session.removeAttribute("login_name"); // 세션 객체에 생성된 데이터 삭제
		session.invalidate(); // 세션 객체 만료
		
		
		for(Cookie c : cookie) {
						//해당 쿠키의 이름을 가져와라 
			if(c.getName().equals("login_name")) {
				c.setMaxAge(0);	//만료 시간을 0으로 설정하여 제거하도록 한다.
				response.addCookie(c);
				//쿠키는 클라이언트에서 제거가 되게 해야하는데 만료시간을 0으로 설정해서 보내는 방법이 있다.
				response.sendRedirect("/"); //다시 메인으로 돌려보내줌

			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}

}
