package com.web.project7.account.model;

public class AccountService {

	public boolean join(AccountDTO dto) {
		AccountDAO dao = new AccountDAO();
		boolean result = dao.createAccount(dto); //boolean으로 결과값을 받아 온다
		
		if(result) {
			dao.commit(); //성공하면 commit
		} else {
			dao.rollback();	//실패하면 rollback
		}
			dao.close(); // 로직이 끝나면 close
		return return;
		//dao도 만들어주자 
	}

}
