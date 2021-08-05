package com.kh.example.practice.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//생성자
	public Member() {} //별 다른 구현 내용(매개변수) 없으면 괄호만 치고 완성
	 
	public void changeName(String name) {
		this.memberName = name;
		
	}
    
		public void printName() { 
			System.out.println(this.memberName);
}

}

