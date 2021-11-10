package com.web.account.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.account.model.*;



@WebServlet("/account/join")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//한글을 제대로 출력하기 위해선 항상 제일 먼저 이걸 작성 해줘야한다.
		response.setContentType("text/html; charset=utf-8");
		
		/*
		 * PrintWriter out = response.getWriter(); 
		 * out.write("<h1>헬로 서블릿</h1>");
		 * out.close();
		 */
		
		String path = "/WEB-INF/jsp/account/index.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(path);
		//request, response는 고정으로 
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		AccountDTO dto = new AccountDTO();
		dto.setUserid(userid);
		dto.setPassword(password);
		
		AccountService service = new AccountService(dto);
		
		String path=" ";
		RequestDispatcher rd = null;
		if(!service.isValid()) {
			path = "/WEB-INF/jsp/account/failed.jsp";
			rd = request.getRequestDispatcher(path);
		}else{
			try {
				if(service.join()) {
				//response.sendRedirect("./join_success.jsp")
					path = "/WEB-INF/jsp/account/success.jsp";
				rd = request.getRequestDispatcher(path);
		}else {
			path = "/WEB-INF/jsp/account/failed.jsp";
			rd = request.getRequestDispatcher(path);
		}
	}catch(SQLException e ) {
		e.printStackTrace();
	}
}
	rd.forward(request, response);
}
}
