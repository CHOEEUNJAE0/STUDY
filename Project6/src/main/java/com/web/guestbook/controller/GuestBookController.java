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
	
	private GuestBookService service = new GuestBookService();

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
					//post에서 수정과 추가를 함께 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//한글 깨지지 않도록 
		//사용자가 보낸 요청 내용은 UTF-8이다 UTF-8로 인코딩 해라 라는 뜻.
		//request : 사용자요청 response : 사용자요청 서버응답
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String context = request.getParameter("context");
			//ip주소
		String ipaddr = request.getRemoteAddr();
		
		if(id == null) {
		
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
		}else {
			// 수정 작업 주의 사항
			// 1. 기존에 저장 된 데이터를 조회해야 한다
			// 2 . 조회된 데이터에 수정 된 데이터로 교헤
			// 3. 교체된 데이터로 저장
					//수정이니깐 modify 
				//modify 안에 수정 할 내용 전달 해 줘야하니깐.
			GuestBookDTO dto = new GuestBookDTO();
			dto.setId(id);
			dto.setContext(context);
			if(service.modify(dto)) { //dto전달
			//id값 int 아닌 string으로 받아왔으니깐 DTO에 오버라이드 해준다
			response.sendRedirect("/guest");
		}else {
			response.sendRedirect("/guest");
		}
	
		//시스템에 출력 할 것인지
		//System.out.println(context);
		//System.out.println("IP 주소 : " + ipaddr);
		//클라이언트에 출력 할 것인지
		//response.getWriter().write(context);

     	}
	}
}

