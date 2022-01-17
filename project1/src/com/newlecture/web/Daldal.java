package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Daldal extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//사용자로부터 전달 받아야 한다. 이걸 무턱대고 반환하다가 null이 발생한다
		//int cnt = Integer.parseInt(request.getParameter("cnt"));
		
		//null이 발생하지 않게 하기 위해서 위에 코드를 임시변수에 담아둔다. 임시변수로 담아 둘 때에는 String으로 담아둔다
		String cnt_ = request.getParameter("cnt");
		int cnt = 100; //기본값
		if(cnt_ != null && !cnt_.equals("")) //cnt가 null이 아니거나 "" 일 경우
			cnt = Integer.parseInt(cnt_);
		
		//사용자로 전달 받은 수 만큼 반복 해 준다.
		for(int i=0; i<cnt; i++) {
			out.println((i+1)+":안녕 servlet<br />");
		}
	}
	

}
