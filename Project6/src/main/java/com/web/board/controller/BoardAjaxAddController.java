package com.web.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.web.board.model.BoardDTO;
import com.web.board.model.BoardService;

@WebServlet("/board/ajax/add")
public class BoardAjaxAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//protected void doGet(HttpServletRequest request, HttpServletResponse response)
			//throws ServletException, IOException {

		
		
//		String val = request.getParameter("val");
//		System.out.println(val);
//		
//		response.setContentType("application/json; charset=utf-8"); //json으로 응답하고 있다는걸 response 객체에 넣어주는 것.json 형태로 보내준다. 웬만하면 이걸 가장 먼저 넣어줘야한다.
//		//response.setStatus(400); //HTTP Response 보낼 때 상태 코드를 설정하여 보내기 위해 사용
//		PrintWriter out = response.getWriter();
//		
//		JSONObject jsonObj = new JSONObject();// json객체 생성 import 해준다
//		jsonObj.put("firstName", "Duke");
//		jsonObj.put("lastName", "Java");
//		jsonObj.put("age", 18);
//		jsonObj.put("streetAddress", "100 Internet Dr");
//		jsonObj.put("city", "JavaTown");
//		jsonObj.put("state", "JA");
//		jsonObj.put("postalCode", "12345");
//		
//		//phonenumber는 배열이 필요하므로 배열 선언 import해준다
//		JSONArray jsonArr = new JSONArray();
//		
//		JSONObject obj1 = new JSONObject();
//		obj1.put("Mobile", "111-111-1111");
//		
//		JSONObject obj2 = new JSONObject();
//		obj2.put("Home", "222-222-2222");
//		
//		
//		
//		jsonArr.add(obj1);
//		jsonArr.add(obj2);
//		
//		jsonObj.put("phoneNumbers", jsonArr);
//		
//		 out.print(jsonObj.toJSONString()); //out = 내보냄 out은 위에 선언해준다 PrintWriter out = response.getWriter();
//		 out.flush();
		
//		String json = "{\"result\" : \"데이터를 잘 받았습니다.\"}";
//		out.print(json); 
//		out.flush(); // 작성을 끝내고 나면 이것도 마지막에 적어 준다.

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("applicationn/json; charset=utf-8");
		
		String bid = request.getParameter("bid");
		String title = request.getParameter("title");
		
		if(bid.equals("")) {
			bid = "0";
		}
		
		BoardDTO dto = new BoardDTO(bid, title);
		BoardService service = new BoardService();
		
		boolean res = service.create(dto);
		
		JSONObject json = new JSONObject();
		if(res) {
			json.put("bid", dto.getId());
			json.put("message", "저장됨!");
			json.put("status", "success");
		}else {
			json.put("bid", "");
			json.put("message", "저장실패!");
			json.put("status", "fail");
		}
		
			PrintWriter out = response.getWriter();
			out.print(json.toJSONString());
			out.flush();

	}

}
