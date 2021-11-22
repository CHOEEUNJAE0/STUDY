<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import ="javax.servlet.http.Cookie" %>    

<!DOCTYPE html>
<html>
<head lang="ko">
<meta charset="UTF-8">
<title>메인 화면</title>
</head>
<!-- 쿠키 정보 가져오기 -->
<%
	Cookie[] cookie = request.getCookies();
	boolean logined = false;
	String username = "";
	
	//배열이니깐 반복문
	for(Cookie c : cookie) {
					//해당 쿠키의 이름을 가져와라 
		if(c.getName().equals("login_user")) {
			logined = true;
			username = c.getValue(); // 해당 쿠키의 값을 가져와라
		}
	}

%>

<body>
	<ul>
	<li><a href="/guest">방명록</a></li>
	
	<!-- 로그인 상태가 아닌 경우 -->
	<li><a href="/join">회원가입</a><li>
	<li><a href="/info">회원정보</a><li>
	
	<!-- 로그인 상태가 맞는 경우 -->
	<li><a href="/login">로그인</a><li>
	<li><a href="/logout">로그아웃</a><li>
	</ul>
	
</body>
</html>