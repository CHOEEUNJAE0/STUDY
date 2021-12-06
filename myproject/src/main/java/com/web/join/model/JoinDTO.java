package com.web.join.model;


//매개변수명이 달라고 매개변수 수가 중복 되는 다른 생성자는 생성이 안된다. 중복 오류
//데이터베이스에 저장할 객체의 정보들을 적어주면 된다.
public class JoinDTO  { //없으면 빈 문자열
	private String userid;
	private String password;
	private String username;
	private String birthday;
	private String gender;
	private String email;
	
	public JoinDTO() {} //기본 생성자
	
	public JoinDTO(String userid) {
		this.userid = userid;
	}
	
	public JoinDTO(String userid, String password) {
		this.userid = userid;
		this.password = password;
	}
	
	
	public JoinDTO(String userid, String password, String username, String birthday, String gender, String email) {
		this(userid, password);
		this.username = username;
		this.birthday =  birthday;
		this.gender = gender;
		this.email = email;
	}
	
	
	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
}
	


	
	