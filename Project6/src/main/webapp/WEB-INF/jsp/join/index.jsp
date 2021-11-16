<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.web.join.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>
   <link type="text/css" rel="stylesheet" href="/static/css/join.css">
<!-- 자스 연동 -->
<script type="text/javascript" src="/static/js/join.js" ></script>
</head>
<body>
	<%
		JoinDTO initData = new JoinDTO();
		if(request.getAttribute("initData") != null) {
			initData = (JoinDTO) request.getAttribute("initData");
		}
	%>



	<!-- 양식을 join으로 제출해야하니깐 action에 join -->
	<form action="./join" method="post">
	<div>
	<label>아이디</label> 
	<input type="text" name="username" value="<%=initData.getUsername() %>" placeholder="아이디" required>
	</div>
	<div>
	<label>패스워드</label>  
	<input type="password" id="id_pass1" name="password" placeholder="패스워드" required>
	</div>
	<div>
	<label>패스워드 확인</label>  
	<input type="password" id="id_pass2" name="password_check" placeholder="패스워드 확인" required>
	<div><label></label></div>
	
	<div>
	<label>이메일</label>  
	<input type="email" name="eamil" value="<%=initData.getUsername() %>" placeholder="이메일" required>
	</div>
	<div>
	<button type="submit">가입</button>
	</div>
	</form>




</body>
</html>