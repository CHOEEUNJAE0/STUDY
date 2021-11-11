package com.web.guestbook.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.guestbook.model.*;


@WebServlet("/guest")
public class GuestBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//페이지 + 조회목록 전달
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 위치 작성
		
		GuestBookService service = new GuestBookService();

		request.setAttribute("datas", service.getList());
		
		String view = "/WEB-INF/jsp/guestbook/index.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	
	}
	
	//저장 처리
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//한글 깨지지 않도록 
		//사용자가 보낸 요청 내용은 UTF-8이다 UTF-8로 인코딩 해라 라는 뜻.
		//request : 사용자요청 response : 사용자요청 서버응답
		request.setCharacterEncoding("UTF-8");
		
		String context = request.getParameter("context");
			//ip주소
		String ipaddr = request.getRemoteAddr();
		
		//dto 만들어주기(import)
		GuestBookDTO dto = new GuestBookDTO(ipaddr, context);
		GuestBookService service = new GuestBookService();
		
		if(service.add(dto)) {
			//저장 완료
			response.sendRedirect("/guest");
		} else {
			//저장실패
			//기존의 포워드 시켜줬던 코드 그래도 복붙 
			   					//"속성명", "속성값" 형태로 담아준다
			request.setAttribute("init", "dto");
			request.setAttribute("datas", service.getList());
			String view = "/WEB-INF/jsp/guestbook/index.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(view);
			rd.forward(request, response);
		}
		
	
		//시스템에 출력 할 것인지
		//System.out.println(context);
		//System.out.println("IP 주소 : " + ipaddr);
		//클라이언트에 출력 할 것인지
		//response.getWriter().write(context);

	
	}

}
