<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
<script type="stylesheet" href="/static/js/login.js"></script>
</head>
<body>
<form action="./login" method="post">
	<div>
	<input type="text" name="username" placeholder="아이디">
	</div>
	<div>
	<input type="password" name="password" placeholder="패스워드">
	</div>
	<div>
	<button type="submit">로그인</button>
	</div>
</form>
</body>
</html>