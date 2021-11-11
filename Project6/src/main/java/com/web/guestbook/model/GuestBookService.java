package com.web.guestbook.model;

import java.sql.SQLException;
import java.util.List;

public class GuestBookService {
	//필요한 기능을 넣어주자!!
	//아직 리턴 타입을 모르니깐 일단 void로 작성
	
	//방명록에 추가 add 추가를 시켜주기 위한 데이터가 필요 그것이 guestbook dto
	public boolean add(GuestBookDTO dto) {
		//우선 return 값 false로 지정
		//저장이 진행 되어야 하니깐 이때 dao를 써주자
		GuestBookDAO dao = null;
		try {
			// insert는 dao에 구현 해줘야한다. 
			dao = new GuestBookDAO();
			if(dao.insert(dto)) {
				dao.commit();
				return true;
			}else {
				dao.rollback();
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//출력 넘겨받을 자료 없음
	//getList니깐 반환값 List<반환내용>
	public List<GuestBookDTO> getList() {
		//조회 한 결과는 돌려줘야함
		//아직 리턴 내용 없어서 null
		return null;
		
	}

}
