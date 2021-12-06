package com.web.join.controller;

//컨트롤러에서는 데이터 처리가 잘 되었는지 아닌지의 부분만 확인하면 된다.
//유호성 검사 부분 체크 
//유효성 검사의 세부 로직이 서비스로 이어지는 것 

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.web.join.model.*;

//웹페이지 접속 할 주소
@WebServlet("/join")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//forward 경로   //view 파일이 저장 된 경로 
		String view = "/WEB-INF/jsp/join/join.jsp";
		RequestDispatcher rp = request.getRequestDispatcher(view);
		rp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		
		//사용자가 입력한 데이터들도 회원가입에 필요한 정보들이니깐 
		//별도의 DTO 객체를 만들어서 담아주면 데이터 전달하기가 편해진다.
		request.setCharacterEncoding("UTF-8");
		
		String password_check = request.getParameter("password_check");
	     
	         JoinDTO dto = new JoinDTO(
	                  request.getParameter("userid"),
	                  request.getParameter("password"),
	                  request.getParameter("username"),
	                  request.getParameter("birthday"),
	                  request.getParameter("gender"),
	                  request.getParameter("email")
	                  );
	
	         //객체에 담은 후 서비스쪽에 dto를 담아서 객체 생성 해 주기
	         //가서스에 가서 생성자 만들어 주기 
	         JoinService service = new JoinService(dto);
	         
	         request.setAttribute("initData", dto);
	         String view = "/WEB-INF/jsp/join/index.jsp";
	        RequestDispatcher rp = request.getRequestDispatcher(view);
				
	         //빨간줄 뜨면 메서드 생성 눌러주자

	        	
	        	     //아이디 중복 검사도 진행 duplicate 중복
	   	         if(service.isDuplicated()) {
	   	        	 //아이디가 중복 되었을때 제출한 양식 다시 반환(포워드 시켜라)
	   	        	 //비밀번호를 제외한 모든 입력은 기존 입력값 초기화해서 포워드
	   	        	 //initData 초기 데이터 넘겨주기 (위에 만들어주고 여기에는 리퀘스트 리스폰스만)
	   	        	 
	   	        	rp.forward(request, response);
	   	        	 
	   	         }else {
	   	        	 //중복된 아이디가 없을 때 이때 저장이 되어야 함 메서드 만들어야함
	   	        	 service.createjoin(); //저장 된다는 가정하에 바로 로그인 할 수 있는 페이지로 이동
	   	        	 response.sendRedirect("./login");
	        		
	        	}
	        	
	        }

 }

//		String userid = request.getParameter("userid");
//		String password = request.getParameter("password");
		
//		String username = request.getParameter("username");
//		String email = request.getParameter("email");
//		String gender = request.getParameter("gender");
//		String date = request.getParameter("date");
//		
//		System.out.println(userid);
//		System.out.println(password);
//		System.out.println(password_check);	
//		System.out.println(username);
//		System.out.println(email);
//		System.out.println(date);
//		System.out.println(gender);
		
		
		

