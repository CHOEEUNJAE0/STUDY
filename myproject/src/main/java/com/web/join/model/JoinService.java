package com.web.join.model;

public class JoinService {
	//기본 생성자 만들어 주기
	JoinDTO dto = null;
	
	public JoinService() {}
	
	//dto를 받는 생성자도 만들어 주기
	public JoinService(JoinDTO dto) {
		this.dto = dto;
	
	}

	//boolean으로 바꿔주기 
	//데이터베이스가 필요함
	public boolean isDuplicated() {
		//데이터베이스는 JoinDAO를 이용 할 것 
		JoinDAO dao = new JoinDAO(); 
		//중복체크 dao를 통해서 select(넘겨줄때) this.dto.getUserid
		//전달해서 검색했는데 있으면 joindto에 저장
		JoinDTO data = dao.select(this.dto.getUserid());
		//전달해서 검색했는데 null이면 return 
		//dao 사용하고 나면 끝내줘야한다.
		dao.close();
		//DAO에 셀렉트랑 클로즈 만들어주기 
		
		if(data == null) {
			return false; //중복이 안됐다.
		}else {
			return true;  //중복 됨
		}
		
		
	}
	//생성 됐다 안됐다 정도만 체크 boolean
	public boolean createjoin() { 
		JoinDAO dao = new JoinDAO();
		boolean res = dao.insert(this.dto); //몇개가 됐는지를 알고 싶으면 앞에 int로 해준다.
		if(res) {
			dao.commit(); //성공
		}else {
			dao.rollback(); //실패
		}
		dao.close();
		//다 하고 inser commit rollback 메서드 만들어주기 
		return res;
		
	}

}
