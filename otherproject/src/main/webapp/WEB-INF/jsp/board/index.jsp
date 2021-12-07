<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"
		import="com.web.board.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
</head>
<body>
	<div>
		<button type="button" onclick="location.href='/board/add'">글쓰기</button>
	</div>
	<div>
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<% List<BoardDTO> datas = (List<BoardDTO>) request.getAttribute("datas"); %>
				<% for(BoardDTO data: datas) { %>
					<tr onclick="location.href='/board/detail?id=<%=data.getId() %>'">
						<th><%=data.getId() %></th>
						<th><%=data.getTitle() %></th>
						<th><%=data.getWriter() %></th>
						<th><%=data.getCreateDate() %></th>
						<th><%=data.getViewCount() %></th>
					</tr>
				<% } %>
			</tbody>
		</table>
	</div>
</body>
</html>