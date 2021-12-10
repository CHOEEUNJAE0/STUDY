package com.web.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.board.model.*;

@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String view = "/WEB-INF/jsp/board/index.jsp";
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type"); //서버에서 값을 받으면 type의 매개변수 값을 추출
		String search = request.getParameter("search");
		
		BoardService service = new BoardService();
		List<BoardDTO> datas = service.getList();
		List<BoardCategoryDTO> category = service.getCategory();
		
		request.setAttribute("type", type); //추출해서 request 객체에 추가 해주는 것
		request.setAttribute("datas", datas);
		request.setAttribute("category", category);
		
		request.getRequestDispatcher(view).forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}