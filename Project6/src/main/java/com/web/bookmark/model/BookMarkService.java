package com.web.bookmark.model;

import java.util.List;

public class BookMarkService {
	
	// 처음에 화면이 뜨려면
	/*
	 * 1. url 주소 요청
	 * 2. 요청 한 주소의 매핑 된 콘트롤러 동작
	 * 3. jsp페이지 포워드 시켜줌
	 */
	//이것들을 할라면 필수적으로 콘트롤러페이지에서 매핑 정보를 만들어주어야 한다 ->콘트롤러 페이지로 이동
	
	//DAO
	private BookMarkDAO dao;
	
	
	public BookMarkService() {
		this.dao = new BookMarkDAO();
	}
	
	//검사 진행을 위해 매개변수는 bookmarkDTO로 받아온다
	public boolean isValid(BookMarkDTO dto) {
		return true;
		
	}
	//조회해서 불러오는 것  조회 할 때는 List로 반환
	public List<BookMarkDTO> getBookMarkList() {
		//dao이용해서 select 
		dao.select();
		return null;
		//이제 dao를 만들러 가 주자
	}
	
	public boolean save(BookMarkDTO dto) {
		//dao를 통해서 서비스가 저장되도록 해 주자
		dao.insert(dto);
		return true;
	}

}
