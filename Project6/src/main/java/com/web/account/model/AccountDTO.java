package com.web.account.model;

public class AccountDTO {
	private int id;
	private String userid;
	private String password;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}
	//간단한 연산은 accountDTO에서 하고 복잡한 것은 Accountservice에서 작성
	public void setUserid(String userid) {
		this.userid = userid.toLowerCase();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password.toLowerCase();
	}
 }
