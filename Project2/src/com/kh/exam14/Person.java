package com.kh.exam14;

public abstract class Person { //추상클래스
	private int age;
	private String name;
	private char gender;
	//1.get/set 생성
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	

}
