package com.web.join.model;

public class JoinDTO {
	private int id;
	private String username;
	private String password;
	private String email;
	
	//생성자도 필요하면 만들어 준다.
	
	//이건 유저네임만 담는 생성자
	public JoinDTO() {
		this("","",""); // 입력값 없으면 빈 문자열로 채워준다는 것  
	}
	
	public JoinDTO(String username) {
		this.username = username;
	}
	
	public JoinDTO(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public JoinDTO(int id, String username, String password) {
		this(username, password);
		this.id = id;
	}
	
	public JoinDTO(String username, String password, String email) {
		this(username, password);
		this.email = email;
	}
	
	public JoinDTO(int id, String username, String password, String email) {
		this(username, password, email);
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
