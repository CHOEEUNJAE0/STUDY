<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 진행 결과</title>
</head>
<body>
	<section>
		<h1>회원 가입 진행 결과</h1>
		<%--스크립트 태그 작성 --%>
		<%
		//서버의 콘솔에 출력 하겠다고 작성 한 것
			System.out.println("username :"+request.getParameter("username"));
			System.out.println("password :"+request.getParameter("password"));
			System.out.println("gender : "+request.getParameter("gender"));
			//체크 한 모든 항목을 불러 오기 위해서는 getParameter뒤에 Values 를 붙여줘야한다.
			//이렇게만 해주면 배열 참조 주소가 뜬다. 문자열이 제대로 출력 하기 위해서는 반복문을 작성 해 준다.
			//System.out.println("adv : "+request.getParameterValues("adv"));
			System.out.println("ads : "); 
			//null값이 아닐때 실행 되어야 하니깐 if문 하나 넣어주고 
			if(request.getParameterValues("adv")!=null) {
				String[] adv = request.getParameterValues("adv");
			for(String s : adv) {
				System.out.print(s + "");
			}
			System.out.println();
			}
			System.out.println("year :"+request.getParameter("year"));
			System.out.println("month :"+request.getParameter("month"));
			System.out.println("day : "+request.getParameter("day"));
			System.out.println("textarea : "+request.getParameter("context"));
			
		%>
		<p>
			<%=request.getParameter("username")%> 정보를 잘 받았습니다.
		</p>
	</section>

</body>
</html>