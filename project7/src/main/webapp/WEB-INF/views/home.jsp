<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%--@ page session="false" 세션 사용하지 않겠다는건데 나중에 사용할거니깐 주석 처리 위에 fmt,functions는 추가 해준것 기존 jsp처럼--%>
<html>
<head>
	<title>Home</title>
	<!-- servlet-context.xml에 resourses mapping을 먼저 해줘야한다. -->
	<link type="text/css" rel="stylesheet" href="/static/bs-5.1.3/css/bootstrap.min.css">
	<script type="text/javascript" src="/static/bs-5.1.3/js/popper.min.js"></script>
	<script type="text/javascript" src="/static/bs-5.1.3/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/static/jquery/jquery-3.6.0.min.js"></script>
		
</head>
<body>
<h3>💖온달이 반달이💖</h3>

<P>  The time on the server is ${serverTime}. </P>
	<img alt="정적이미지 불러오기" src="/img/KakaoTalk_20211221_200919513.jpg">
</body>
</html>
