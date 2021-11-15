package com.web.guestbook.model;

import java.sql.SQLException;
import java.util.List;


public class GuestBookService {
	private GuestBookDAO dao = null;

	//필요한 기능을 넣어주자!!
	//아직 리턴 타입을 모르니깐 일단 void로 작성
	
	//방명록에 추가 add 추가를 시켜주기 위한 데이터가 필요 그것이 guestbook dto
	//public boolean add(GuestBookDTO dto) {
		//우선 return 값 false로 지정
		//저장이 진행 되어야 하니깐 이때 dao를 써주자
		//GuestBookDAO dao = null;
		
	public GuestBookService() {
	
		this.dao = new GuestBookDAO() ;
	}
		
		public boolean add(GuestBookDTO dto) {
			// insert는 dao에 구현 해줘야한다. 
			
			// 검색과 관련해서 생성. 조건 없이 전체 조회 하기 위해 select
			// 조회를 하고 난 뒤에 데이터 반황 받아야하기때문에 반환시 똑같이 list로 받아서 처리
			// select 없으니깐 게스트북dao에 생성
			boolean res = dao.insert(dto);
			if(res) {
				dao.commit();
			}else {
				dao.rollback();
			}
			dao.close();
			return res;
	}
	//출력 넘겨받을 자료 없음
	//getList니깐 반환값 List<반환내용>
	public List<GuestBookDTO> getList() {
		//조회 한 결과는 돌려줘야함
		//아직 리턴 내용 없어서 null
	
		List<GuestBookDTO> datas = dao.select();
		dao.close();
		return datas;
	}
	public boolean modify(GuestBookDTO dto) {
		// 1. 기존에 저장 된 데이터를 조회해야 한다. -> 별도로 만들어주자
		// 2. 조회한 데이터에 수정 된 데이터로 교제한다.
		// 3. 교체 된 데이터로 저장
		GuestBookDTO data = getData(dto.getId());
		data.setContext(dto.getContext());
		return update(data);
	}
    public boolean delete(GuestBookDTO dto) {
    	// 1. 기존에 저장된 데이터를 조회한다.
    	// 2. 조회된 데이터를 확인 후 삭제.
    	GuestBookDTO data = getData(dto.getId());
    	dao = new GuestBookDAO();
    	boolean res = false;
    	if(data.getId() != 0) {
    		res = dao.delete(data);
    	}
    	if(res) {
    		dao.commit();
    	} else {
    		dao.rollback();
    	}
    	dao.close();

    	return res;
    }
	
	//리턴값 DTO  그리고 ID를 받아온다
	public GuestBookDTO getData(int id) {
		dao = new GuestBookDAO();
		GuestBookDTO data = dao.select(id);
		dao.close();
		return data;
	}
	
	private boolean update(GuestBookDTO dto) {
		dao = new GuestBookDAO();
		boolean res = dao.update(dto);
		if(res) {
			dao.commit();
		}else {
			dao.rollback();
		}
		dao.close();
		return res;
		
	}

}
