<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="com.web.guestbook.model.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
<!-- 자스 사용할거니깐 자스 등록 -->
<script type="text/javascript" src="/static/js/guestScript.js"></script>
</head>
<body>
   <header>
        <h1>네비게이션 메뉴 영역</h1>
    </header>
    <section>
        <section>
            <form action="./guest" method="post">
                <div>
                <%
                    GuestBookDTO dto = new GuestBookDTO();
                    if(request.getAttribute("init") != null) {
                        dto = (GuestBookDTO)request.getAttribute("init");
                    }
                %>
                    <textarea name="context"><%=dto.getContext() %></textarea>
                </div>
                <div>
                    <button type="submit">작성</button>
                </div>
            </form>
        </section>
        <section>
            <table>
                <thead>
                    <tr>
                        <th>번호</th>
                        <th>IP주소</th>
                        <th colspan="2">내용</th>
                        <th>날짜</th>
                    </tr>
                </thead>
                <tbody>
                <%
                List<GuestBookDTO> datas = (List<GuestBookDTO>) request.getAttribute("datas");
                for(GuestBookDTO data : datas) {
                %>
                    <tr>
                        <td><%=data.getId() %></td>
                        <td><%=data.getIpaddr() %></td>
                        <td><%=data.getContext() %></td>
                        <td>	<!--수정 버튼을 누르면 textarea로 바꿔주는 작업. ->javascript로 해야한다.
                        		 앞에 인덱스 번호도 바뀔 수 있게(input type=hidden으로 인덱스번호는 보여질필요없어서)  
                        		 수정 누른 후 삭제 버튼은 취소 버튼으로 바뀌게 그럼 textarea였던게 일반 텍스트입력창으롷 바뀔 수 있게-->
                        		 <!-- javascript 사용하기 위해 onclick넣어줌 this.parentElement 부모객체 지정 -->
                        	<button onclick="guestModify(this.parentElement);">수정</button>
                        	<button onclick="guestDelete(this.parentElement);">삭제</button>
                        </td>
                        <td><%=data.getDate() %></td>
                    </tr>
                    <%
             			   }
                    %>
                </tbody>
            </table>
        </section>
    </section>
    <footer>
        <h2>사이트 정보 영역</h2>
    </footer>
</body>
</html>