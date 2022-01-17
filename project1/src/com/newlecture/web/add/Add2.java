package com.newlecture.web.add;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class Add2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF8");
		
		String[] num_ = request.getParameterValues("num"); //_을 붙이는 이름은 임시로 사용하기 위해
								//동일한 이름이 여러개 올 때는 getParameterVlues로 
		int result = 0; // 그리고 기본값을 설정 해 준다.
		
		//그리고 반복문 작성
		for(int i =0; i<num_.length; i++) {
			int num = Integer.parseInt(num_[i]); //문자열->정수로 형변환을 선언 해 준다. for문 안에서 연산이 아니라 선언이 아니기때문에 반복하기 전에 먼저 만들어져야 한번만 만들어지고 선언이 반복되는 일이 없다. 지역적으로만 쓰기 위해 for문안에 작성해주고 지역변수로 사용하는 것이다.
			result+=num; 									//[i]를 넣어줘서 그때그때 하나씩 바뀌게 될 것이다.	
		}	//result에 num값을 누적시켜준다.
		
		
		response.getWriter().printf(" 값 :  %d\n", result);// 포멧팅 해서 출력 해준다.
		
		
		
	}
}
	
