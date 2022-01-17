package com.newlecture.web.add;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF8");
		
		String x_ = request.getParameter("x");  //_를 뒤에 붙이는 이유는 임밑에 정수에int x를 붙여줄거기 때문에 여기서는 임시변수로 사용 하기위해서.
		String y_ = request.getParameter("y");  //request.getParameter라는걸 통해서 x,y의 키워드를 받아준다.
		int x = 0; //기본값 설정. 키워드는 있지만 빈 문자열이 올 수 있으니깐 빈 문자열이 왔을 때 기본값을 0으로 해준다.
		int y = 0;
		
		//조건검사를 해준다.
		//만약에(if) x가 가진것이 빈 문자열이 아니다. 그럴 경우에는 x값을 대체해준다(x = ). 형변환 해서 x값을 대입해준다.
		if(!x_.equals("")) x = Integer.parseInt(x_);
		if(!y_.equals("")) y = Integer.parseInt(y_);
		//조건 검사를 마친후 0 남거나 결과값이 남는다.
		
		int addresult = x + y; //여기에 더하기 값을 담아 줄 것이고.
		int minusresult = x - y;
		
		//result를 출력하기 위해서 response해서 getWriter를 얻어서 포멧팅 후 출력
		response.getWriter().printf(" 값 :  %d\n", addresult);
		response.getWriter().printf(" 값 :  %d\n", minusresult);// 포멧팅 해서 출력 해준다.
		
		
		
	}
}
	
