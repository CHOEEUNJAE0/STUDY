<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.web.join.model.*" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>❤달자매 공간에 들어가기 ❤</title>
<script type="text/javascript" src="/static/js/join.js"></script> 
<link rel="stylesheet" href="/static/css/join.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jua&display=swap" rel="stylesheet">
</head>

<body>

	<%
		JoinDTO initData = new JoinDTO(); //object가 있는지 없는지 먼저 파악
		if(request.getAttribute("initData") != null) {
			initData =(JoinDTO) request.getAttribute("initData"); //다운캐스팅
		}
	%>
	<form action="./join" method="post" onsubmit="idpwCheck"> 
	<div class="header">
    <img src="https://ggsing.com/yeook/190425_mainlogo1.png">
	</div>
    <h3>회원가입</h3>
    <div class ="joinform"> 	
        <label>아이디</label>
        <div class = "inline-input">
            <input type="text"id="userid"name="userid" value="<%=initData.getUserid()%>"maxlength="20" >
        </div> 
        <div><span id="idMsg"></span></div>

        <label>비밀번호</label>
        <div class = "inline-input">
            <input type="password" name="password" id="pass1"  >
        </div>

        <label>비밀번호 확인</label>
        <div class = "inline-input">
            <input type="password" name="password_check" id="pass2" >
        </div>
        <div><span id="check"></span></div>

        <label>이름</label>
        <div class = "inline-input">
            <input type="text" name="username" id="username" value="<%=initData.getUsername()%>" required>
        </div>
        
        <label>생년월일</label>
        <div class = "inline-input">
            <input type="date"  name="birthday" id="birthday" value="<%=initData.getBirthday()%>" min="1900-01-01" max="2021-12-31">
        </div>
        
        <label>성별</label>
        <div class = "inline-input">
            <select name="gender" id="birthday">
                <option value="g">성별</option>
                <option value="f">여자</option>
                <option value="m">남자</option>
                </select>
        </div>

        <label>이메일</label>
        <div class = "inline-input">
            <input type="text" name="email" id="email" value="<%=initData.getEmail()%>" required>
        </div>

        <div class="btn">
            <button type="submit">가입하기</button>
        </div>

    </div>
    </div>
    </form>
</body>
</html>