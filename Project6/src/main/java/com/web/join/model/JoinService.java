package com.web.join.model;

public class JoinService {
	
	JoinDTO dto = null;
	
	
	public JoinService() {}
	
	public JoinService(JoinDTO dto) {
		this.dto = dto;
	}
	
	public int isValid() {
		//필수 입력인지 아닌지 체크
		//다른거 더 체크하고 싶은게 있으면 더 작성 해 주면 된다.(아이디 길이, 사용가능문자 등등)
		if(this.dto.getUsername() == null) {
			return -1;
		}else if(this.dto.getPassword() == null){
			return -2;
		}else if(this.dto.getEmail() == null) {
			return -3;
		}
		//모든게 이상이 없으면
		return 0;
	}
	
	public boolean equalPassword(String password_check) {
		return this.dto.getPassword().equals(password_check);
		
	}
	
	public boolean isDuplicated() {
		//데이터 베이스 연결 필요 dto전달 dao 만들어줘야함
		JoinDAO dao = new JoinDAO();
		//중복체크 dao를 통해서 select검색할 때 검색했는데 결과가 있으면
		//username으로 셀렉트 했을 때 조회 된 DTO가 있냐 없냐
		//SELECT랑 CLOSE DAO에 생성해주기
		JoinDTO data  =  dao.select(this.dto.getUsername());
		//dao 사용하고 나면 
		dao.close();
		if(data == null) {
			//null이면 조회 된 것이 x 중복x
			return false;
		} //else 생각 가능
			//null이 아닐 떄 중복o
			return true;
		}

		//생성 여부만 확인 하면 되니깐 boolean
	public boolean createJoin() {
		JoinDAO dao = new JoinDAO();
		boolean res = dao.insert(this.dto); //몇개가 추가 되었냐 
		if(res) {
			dao.commit(); //성공하면 커밋
		}else {
			dao.rollback(); //실패하면 롤백
		}
		//성공하든 실패하든 작업이 다 끝나면
		dao.close();
		
		return res;
		
	}
		
	}


