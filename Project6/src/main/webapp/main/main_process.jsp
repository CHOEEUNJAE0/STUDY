<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.web.account.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
</head>
<body>
<section>
	<% 
		request.setCharacterEncoding("UTF-8");
		// 유효성 검사(제대로 입력 되었는지 콘솔에 확인) 진행
		/*
		- 문제가 있는 경우
		 1. 아이디가 회사 정책에 위반 하는 경우(자릿수, 제한된 특수 문자 등)
		 2. 패스워드가 외사 정책에 위반하는 경우(자릿수, 제한된 특수 문자 등)
		*/
		
		//유효성 검사
		String userid = request.getParameter("userid").toLowerCase();     //항상 소문자로 인식해주는 것
		String password = request.getParameter("password").toLowerCase();
		
		//길이 : 4 ~ 16 사이의 문자열
		//문자 종류(옵션 : (세가지를 꼭 다 포함 시키지 x, 소문자로만 숫자로만 이루어져도 가능한걸로)) : 소문자, 숫자, 특수문자(_) 
		
		//길이먼저체크
		//참 거짓을 봐야하니깐 boolean 넣어주기
		boolean isUseridValid = true;
		boolean isLower = true;
		boolean isNumber = true;
		boolean isUnder = true;
		if(userid.length() >= 4 && userid.length() <= 16) {
			//아스키코드 범위체크 반복문 필요
			for(int i = 0; i <userid.length(); i++) {
				//소문자 a보다 크거나 같은지 z보다 작거나 같은지 비교 아스키코드
				//이 세가지 경우가 참일 경우에는 해줄게 딱히 없어서 
				//유효하지 않을 경우 일때를 설정 해주자
				// 앞에 ! 을 붙여서 not으로 표현
			if(!(userid.charAt(i) >='a' && userid.charAt(i) <='z')) {	
				isUseridValid = true;
			}else if(!(userid.charAt(i) >='0' && userid.charAt(i) <='9')) {
				isUseridValid = true;				
			}else if(!(userid.charAt(i) == '_')) {
				isUseridValid = true;
			}else{
				isUseridValid = false;
			}
			System.out.println(isUseridValid + "|" + userid.charAt(i));
			if(!isUseridValid) {
				break;
			}
		}
	}else {
		isUseridValid = false;
	}
		boolean isPasswordValid = true;
		
		if(password.length() >= 4 && password.length() <= 16) {
			//아스키코드 범위체크 반복문 필요
			for(int i = 0; i <userid.length(); i++) {
				//소문자 a보다 크거나 같은지 z보다 작거나 같은지 비교 아스키코드
				//이 세가지 경우가 참일 경우에는 해줄게 딱히 없어서 
				//유효하지 않을 경우 일때를 설정 해주자
				// 앞에 ! 을 붙여서 not으로 표현
			if(!(password.charAt(i) >='a' && password.charAt(i) <='z')) {	
				isPasswordValid = true;
			}else if(!(password.charAt(i) >='0' && password.charAt(i) <='9')) {
				isPasswordValid = true;
			}else if(!(password.charAt(i) == '_')) {
				isPasswordValid = true;
			}else {
				isPasswordValid = false;
			}
			System.out.println(isPasswordValid + "|" + password.charAt(i));
			if(!isPasswordValid) {
				break;
		}
			}
	}else {
		isPasswordValid = false; 
	}
		//유효성 검사 끝난 이후에 
	AccountDTO dto = new AccountDTO();
		dto.setUserid(userid);
		dto.setPassword(password);
		
		
		
		System.out.println("userid : " + request.getParameter("userid"));
		System.out.println("password : " + request.getParameter("password"));
		System.out.println("passwordcheck : " + request.getParameter("passwordcheck"));
		System.out.println("username : " + request.getParameter("username"));
		System.out.println("year : " + request.getParameter("year"));
		System.out.println("month : " + request.getParameter("month"));
		System.out.println("day : " + request.getParameter("day"));
		System.out.println("gender : " + request.getParameter("gender"));
		System.out.println("mailcheck : " + request.getParameter("mailcheck"));
		System.out.println("phone_code : " + request.getParameter("phone_code"));
		System.out.println("phone_number : " + request.getParameter("phone_number"));
		System.out.println("auth_num : " + request.getParameter("auth_num"));

	%>
	<p>
	<%--로그인 성공 부분 --%>
	<% if(!isUseridValid) { 
	%> 
		사용자 계정 및 패스워드가 잘 못 되었습니다. <br>
		계정은 4 ~16자, 소문자, 숫자, 특수문자(_) 의 조합만 사용 할 수 있습니다. <br>
		패스워드는 4 ~16자, 소문자, 숫자, 특수문자(_) 의 조합만 사용 할 수 있습니다.
	<% }else {
		//정상적으로 처리 되었을 때
		//데이터베이스에 저장하기 위한 작업 처리
	//redirect : 다른 주소로 다시 요청해라.
	AccountDAO dao = new AccountDAO();
	//dto담아서 반환
	int res = dao.createAccount(dto);
	//반환되는 result 값에 따라서
	if(res == 1) {
	response.sendRedirect("./join_success.jsp");
	}else {
		out.print("저장 과정 중에 문제가 발생 하였습니다.");
	}
}
	%>
		
	</p>
	</section>
</body>
</html>