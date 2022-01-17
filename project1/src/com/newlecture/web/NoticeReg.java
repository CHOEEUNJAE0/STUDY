package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice-reg")
public class NoticeReg extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		//request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		//DB를 연결 했다면 이 값을 DB에 저장 하거나 해야하는데 아직 DB 연결을 안했으니깐
		//일단 그냥 반환만 해주자 
		
		//내용을 잘 받았다 이것이 맞니? 하고 돌려 주는 것.
		out.println(title);
		out.println(content);
	
		
		
		}
	}
	

