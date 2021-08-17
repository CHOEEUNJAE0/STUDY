package com.kh.exam12;

class Person {
	private String name;
	private int age;
	
	public Person() {
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
		}
class Student extends Person {
	//매개변수가 있는 생성자를 만들어지면 기본생성자는 자동으로 만들어 지지 않는다.
	
	public Student(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
}

public class Sample1 {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 30);// 생성자는 상속이 안된다.
	    s.setName("홍길동"); s.setAge(30);
	    System.out.println(s);
		
	}

}
