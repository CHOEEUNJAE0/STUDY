<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>  <%--자바 임포트 --%>

<%--선언--%>
<%!
	private int num = 10;
	private Random rand = new Random();
%>
<!DOCTYPE html>
<html>
<head lang="ko">
<meta charset="UTF-8">
<title>First JSP</title>
</head>
<body>
	<%--INCLUDE라는 지시자 file ="현재위치/상대경로/"(URL 형태로 작성)  --%>
	<%@ include file = "./module/header.jsp" %>
	<p>
	<%--<%= num %>  스크립트 태그 표현식 num을 출력해라 --%>
	<%--표현식에는 세미콜론 넣을 필요가 없다 표현식을 제외한 나머지 부분에는 세미콜론 필수!--%>
	<%= rand.nextInt(10) %>
	</p>
	<p>
	<%
	//스크립트 안에서의 주석은 자바에서 쓰던것과 동일하게 사용하면 된다.
	if(rand.nextInt(10) % 2 == 0) {
		out.print("짝수입니다.");
	}else {
		out.print("홀수입니다.");
	}
	%>
	</p>
	<!-- jsp로 1 ~ 9 까지의 목록 만들기 -->
	<ul>
	<%
	for(int i = 1; i <10; i++) {
		//out.print("<li>"+i+"</li>");
	%> 
	<%--이런식으로 해 줘도 된다. --%>
		<li><%=i %></li>
	<%
	}
	%>	
	</ul>
</body>
</html>