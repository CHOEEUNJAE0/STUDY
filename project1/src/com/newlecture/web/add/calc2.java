package com.newlecture.web.add;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc2")
public class calc2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		ServletContext application = request.getServletContext();
		HttpSession session = request.getSession();//session을 변수화 하는 방법.import
		Cookie[] cookies = request.getCookies();
		
		
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF8");
		
		//사용자에게 전달하는 값은 하나만 사용한다. 그리고 오퍼레이터값을 같이 전달한다.
		String v_ = request.getParameter("v");
		String op = request.getParameter("operator"); 
		
		
		int v = 0; //기본값 설정. 값을 입력하지 않았을 경우 0으로 대처 
		//조건검사를 해준다.
		//만약에(if) x가 가진것이 빈 문자열이 아니다. 그럴 경우에는 x값을 대체해준다(x = ). 형변환 해서 x값을 대입해준다.
		if(!v_.equals("")) v = Integer.parseInt(v_);
		
		//덧뺄셈 버튼을 누를수도 결과값을 보여주는 = 버튼을 누르게 될 수도 있다.
		//op가 무엇이냐에 따라서 저장을 해야할수도 계산을 해야 할 수도 있다.
		//우선 =로 해 본다.그 이유는 +,-는 하는 일이 값하고 op후 저장인데 =의 역할은 저장이다.
		
		//계산
		if(op.equals("=")) {
			//=이 오면 계산하는걸로한다.
			
			//int x = (Integer)application.getAttribute("value"); //앞에 입력한 값을 꺼내서 x라고 하고 빨간줄은 형변환해준다
			//int x = (Integer)session.getAttribute("value");
			
			int x = 0; //찾은 쿠키 값을 담아야 할 그릇. 0으로 초기화 해 준다. 
			for(Cookie c : cookies) 
				if(c.getName().equals("value")) { // 내가 설정해준 이름을 찾아야하니깐 밑에 작성한 이름으로 비교
					x = Integer.parseInt(c.getValue()); // 찾은 값을 x에 넣어줘야한다. 형변화도 해주고. 한번만 찾는게 아니니깐 for문을 돌려준다.
						break; //찾았으면 break
			}
				

				
			
			int y =v; //지금 사용자가 저장한 value 값이라 v로 
			//String operator = (String)application.getAttribute("op"); //이걸 어플리케이션 저장소에서 읽어와야하니깐 섭ㄹ릿콘텍스트를 맨 위로 빼준다.
			//String operator = (String)session.getAttribute("op");
			String operator="";
			for(Cookie c : cookies) 
				if(c.getName().equals("op")) { // 내가 설정해준 이름을 찾아야하니깐 밑에 작성한 이름으로 비교
					operator = c.getValue(); // 찾은 값을 x에 넣어줘야한다. 형변화도 해주고. 한번만 찾는게 아니니깐 for문을 돌려준다.
						break; //찾았으면 break
			}	
			
			
			
			
			int result = 0; //여기에 더하기 값을 담아 줄 것이고.
			//앞에 저장한 값을 꺼내서 +할지 -할지는 =말고 op값을 꺼내서 확인해야하는 것
			if(operator.equals("+")) 
				result = x+y;
			else
				result = x-y;
			
			//result를 출력하기 위해서 response해서 getWriter를 얻어서 포멧팅 후 출력
			response.getWriter().printf(" 값 :  %d\n", result );
			
		}
		else { //+,-은 저장하는 걸로 하고 
			//이 값을 저장 해야함. request.getServletContext()는 어플리케이션의 저장소이기때문에
			//ServletContext라는 변수를 하나 만들어서 application이름을 저장하고 거기에 담아준다.
			//어떻게 저장하느나. 컬랙션이라고 생각해주고 아래와 같이 작성해준다.이 내용을 두고두고 꺼내서 쓸 수 있게 된다.
			//application.setAttribute("value", v);
			//application.setAttribute("op", op);
			//session.setAttribute("value", v);
			//session.setAttribute("op", op);
			
			Cookie valueCookie = new Cookie("value", String.valueOf(v));
			Cookie opCookie = new Cookie("op", op);
			valueCookie.setPath("/calc2"); // valueCookie가 어느 경우에 사용자에게 전달 되어야 하는지에 대한 옵션 설정
			valueCookie.setMaxAge(24*60*60); //24시간 60분 60초 를 작성 해 준것
			opCookie.setPath("/calc2");
			response.addCookie(valueCookie); //클라이언트에서 보내 주기 위한 코드
			response.addCookie(opCookie); //클라이언트에서 보내 주기 위한 코드 response Header에서 심어지는 형태로 보내지게 된다.
			
			response.sendRedirect("calc2.html");


		}

	}
}
	
