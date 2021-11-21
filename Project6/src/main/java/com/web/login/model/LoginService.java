package com.web.login.model;

public class LoginService {
	
	//6.
	private LoginDTO dto = null;
	
	public LoginService(LoginDTO dto) {
		this.dto = dto;
	}


	public boolean isExisted() {
		LoginDAO dao = new LoginDAO();
		//검색 동일 유저 아디이 있는지 없는지
		LoginDTO data = dao.select(this.dto.getUsername());
		dao.close();

		return data != null ? true : false;
		
	}

		public boolean confirmPassword() {
			
			LoginDAO dao = new LoginDAO();
			//검색 동일 유저 아디이 있는지 없는지
			LoginDTO data = dao.select(this.dto.getUsername());
			dao.close();
			
			if(data != null) {
				if(data.getPassword().equals(this.dto.getPassword())) {
					return true;
				}
			}
			return false;
		}
	}

