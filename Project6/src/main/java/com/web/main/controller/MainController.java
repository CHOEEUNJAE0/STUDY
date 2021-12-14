package com.web.main.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.account.model.JoinDAO;
import com.web.account.model.JoinDTO;
import com.web.board.model.BoardDTO;
import com.web.board.model.BoardService;

//import com.web.account.model.JoinDAO;

@WebServlet("")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String view = "/WEB-INF/jsp/index.jsp";
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher(view).forward(request, response);
//		JoinDAO dao = new JoinDAO();
//		System.out.println(dao.findAccount(1)); //1번 아이디를 가져와라
//		JoinDTO data = dao.findAccount("aaaa");
//		System.out.println("id :" + data.getId());
//		System.out.println("password :" + data.getPassword());
//		System.out.println("email :" + data.getEmail());
//		System.out.println("joindate :" + data.getJoinDate());
//		System.out.println("logindate :" + data.getLoginDate());
//		dao.close();
		

	}
}