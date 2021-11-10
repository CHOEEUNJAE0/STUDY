<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<script type="text/javascript" src="/static/js/myfunction.js"></script>
</head>
<body>
<!--서버 작성 후 전송-->
	<section>
		<!--이 두 속성은 반드시 작성 해 줘야한다. action에는 이 데이터를 처리 할 주소 작성(./현재위치에서. 이게 붙으면 html파일 이외에도 jsp파일이 하나 더 필요한것.)
		method는 get 아니면 post 중 하나 
		get : url에 주소에 사용자가 입력한 정보가 포함 되어 게시
		post : http 메세지 안에 별도에 공간 안에 포함 되어 전송
		사용자가 입력한 정보가 외부에 보여지느냐 아니냐의 차이 
		로그인과 관련 된 중요한 처리를 할 때에는 get보다 post가 낫다.
		사용자가 입력한 정보가 보여져도 상관이 없으면(데이터 입력과 같은..) get을 쓰면 된다.
		사용자가 입력한 정보를 전송하는데에 get은 4kb로 한정, 그걸 벗어나면 전송이 안된다.
		4kb 이상의 데이터를 전송하게 되면 꼭 post를 사용해야한다.  -->
		<form action="./join_process.jsp"  method="get">
		<div>
			<label>아이디</label><input type="text" name="username">
		</div>
		<div>
			<label>패스워드</label><input type="password" name="password">
		</div>
		<div>
			<label>성별 : </label>         <!--value값이 없으면 console 출력시 on으로만 뜨고 어떤 성별 체크 했는지 모르기때문에 value 값을 지정 해 준다. -->
			<input type="radio" name="gender" value="m"><label>남</label>
			<input type="radio" name="gender" value="f"><label>여</label>
		</div>
		<div>
			<label>광고 수신 동의 : </label>        
			<input type="checkbox" name="adv" value="sms"><label>SMS</label>
			<input type="checkbox" name="adv" value="e-mail"><label>E-MAIL</label>
			<input type="checkbox" name="adv" value="post"><label>우  편</label>
		</div>
		<div>
		<!-- name 작성 필수! -->
			<label>생년월일</label>
			<input type="number" name="year" min="1900-01-01" max="2021-12-31">
			<select name="month">
			<!-- 값이 전송 되어야 하니깐 value값 넣어 줌 -->
			<!-- 자스의 반복문을 이용해주면 더욱 간결하게 만들어 줄 수 있다. -->
				<!--  <option value="1">1월</option>
				<option value="2">2월</option>
				<option value="3">3월</option>
				<option value="4">4월</option>
				<option value="5">5월</option>
				<option value="6">6월</option>
				<option value="7">7월</option>
				<option value="8">8월</option>
				<option value="9">9월</option>
				<option value="10">10월</option>
				<option value="11">11월</option>
				<option value="12">12월</option>-->
			</select>
			<input type="number" name="day" min="1" max="31">
		</div>
		<div>
		<label>내용</label>
		<textarea name="context"></textarea>
		</div>
		<div>
		<!--submit 타입으로 해줘야 눌렀을때 위에 form의 action 동작-->
			<button type="submit">전송</button>
		</div>
		
		</form>
	</section>
</body>
</html>