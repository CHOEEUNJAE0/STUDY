<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="javax.servlet.http.HttpSession"
		 import="com.web.account.model.JoinDTO" %>    
		 
<%
	JoinDTO dto = new JoinDTO("","","");
	boolean logined = false; //밑에 삼항 연사자 해주면 이건 빼줘도 된다.
	
	if(session.getAttribute("logined") != null ) {
		logined = (boolean) session.getAttribute("logined");//밑에 삼항 연사자 해주면 이건 빼줘도 된다.
		dto = (JoinDTO) session.getAttribute("account_data");
	}
	
	//String username = dto.getUsername();
	//pageContext : 현재 JSP 페이지에서만 유효하게 사용된다.
	pageContext.setAttribute("username", dto.getUsername());
	pageContext.setAttribute("logined", logined);
%> 
		 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>❤달자매의 HomSweetHome ♡〜٩( ╹▿╹ )۶〜♡</title>
	<!-- 기존에 적어뒀어 링크랑 스크립트태그를 해당 경로안에 넣어준다. -->
	<jsp:include page="/WEB-INF/jsp/include/head.jsp" flush="false" />
</head>
<body>
	<header>
	<jsp:include page="/WEB-INF/jsp/module/top-navigation.jsp" flush="false" >
									<!-- 삼항연산자로 넣어 줄 수 도 있다 그냥 logined로 적어도 됨-->
		<jsp:param name="logined" value="${logined}" />
	</jsp:include>
	</header>

	<h6>❤${username }님 환영합니다❤</h6>
	
	

</body>
</html>