package com.web.board.model;

import java.util.List;

public class BoardService {
	public List<BoardDTO> getList() {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> datas = dao.select();
		dao.close();
		return datas;
	}


}
