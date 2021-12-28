<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%--@ page import="javax.servlet.http.HttpSession"
		import="com.web.account.model.AccountDTO" --%>

<%--
	AccountDTO dto = new AccountDTO("", "", "");
	if(session.getAttribute("logined") != null) {
		dto = (AccountDTO) session.getAttribute("account_data");
		pageContext.setAttribute("dto", dto);
	}
--%>

<!DOCTYPE html>
<html>
<head lang="ko">
    <meta charset="UTF-8">
    <title>달자매의 (*ˊᵕˋo💐o HomeSweetHome(*ˊᵕˋo💐o </title>
    <c:url var="head_url" value="/WEB-INF/views/module/default_js_css.jsp" />
    <jsp:include page="${head_url}" flush="false" />
</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/views/module/top-navigation.jsp" flush="false" >
			<jsp:param name="logined" value="${empty sessionScope.logined ? false : true }" />
		</jsp:include>
	</header>
	<h3><%-- ${dto.getUsername() }--%>💖💖 님 환영이다옹ฅ^•ﻌ•^ฅ💐ฅ^•ﻌ•^ฅ</h3>
	<img alt="정적이미지 불러오기" src="/img/KakaoTalk_20211221_200919513.jpg">
</body>
</html>