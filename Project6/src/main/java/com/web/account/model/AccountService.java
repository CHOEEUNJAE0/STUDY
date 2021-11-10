package com.web.account.model;

import java.sql.SQLException;

public class AccountService {
	private AccountDTO dto;
	
	public AccountService(AccountDTO dto) {
		//초기 생성자 패스
		this.dto = dto;
	}
	public boolean join() throws SQLException {
		if(this.dto == null) {
			return false;
		}
		AccountDAO dao = new AccountDAO();
		int res = dao.createAccount(this.dto);
		if(res == 1) {
			return true;
		}
		return false;
	}
	
	//boolean형 리턴
	// isValid 안에서 전부 검사하는 걸로
	//return값은 true or false 
	public boolean isValid() {
		
		//검사하다 혹시 모르니깐
		if (this.dto == null) {
			return false;
		}
		if(!useridValid() || !passwordValid()) {
			return false;
		}
		 return true;
	}
		private boolean useridValid() {
		boolean isUseridValid = true;
		 if(this.dto.getUserid().length() >= 4 
				 && this.dto.getUserid().length() <= 16) {
             for(int i = 0; i < this.dto.getUserid().length(); i++) {
             	System.out.println(isUseridValid);
	                if(this.dto.getUserid().charAt(i) >= 'a' && this.dto.getUserid().charAt(i) <= 'z') {
	                	isUseridValid = true;
	                } else if(this.dto.getUserid().charAt(i) >= '0' && this.dto.getUserid().charAt(i) <= '9') {
	                	isUseridValid = true;
	                } else if(this.dto.getUserid().charAt(i) == '_') {
	                	isUseridValid = true;
	                } else {
	                	isUseridValid = false;
	                }
	                System.out.println(isUseridValid + "|" + this.dto.getUserid().charAt(i));
	                if(!isUseridValid) {
	                	break;
	                }
             }
             return isUseridValid;
         }
		 return false;
	}
		private boolean passwordValid() {
			boolean isPasswordValid = true;
			 if(this.dto.getPassword().length() >= 4 
					 && this.dto.getPassword().length() <= 16) {
	             for(int i = 0; i < this.dto.getPassword().length(); i++) {
	             	System.out.println(isPasswordValid);
		                if(this.dto.getPassword().charAt(i) >= 'a' && this.dto.getPassword().charAt(i) <= 'z') {
		                	isPasswordValid = true;
		                } else if(this.dto.getPassword().charAt(i) >= '0' && this.dto.getPassword().charAt(i) <= '9') {
		                	isPasswordValid = true;
		                } else if(this.dto.getPassword().charAt(i) == '_') {
		                	isPasswordValid = true;
		                } else {
		                	isPasswordValid = false;
		                }
		                System.out.println(isPasswordValid + "|" + this.dto.getPassword().charAt(i));
		                if(!isPasswordValid) {
		                	break;
		                }
	             }
	             return isPasswordValid;
	         }
			 return false;
	}
}
