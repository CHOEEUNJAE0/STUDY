package com.kh.exam12;


class Humen {
	
	public String name;
	public int age;
	public String gender;
	/*
	 * **접근제어자를 부모것과 같거나 넓은 범위로 변경 해야한다.
	 * 
	ex) 부모 PRIVATE 했다면 default/public/protected/private 를 써야한다.

	    부모 PROTECTED 헸다면 protected/public 만 가능하다.

	   부모( DEFAULT )헸다면 (default)/protected/public 만 가능하다.

	    부모 PUBLIC 헸다면 public 만 가능하다.
	 */

public Humen() {  //매개 변수가 없는 생산자를 만들어 주고 
	               //getter, setter 로 값을 받을 수 있게 해주고
	
	
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

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

@Override                      //오버라이딩 해주고 
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
}


}

class Worker extends Humen {    //자식 메소드가 부모 메소드에게 상속 받는다고 선언
	public Worker(String name, int age, String gender) {

	this.setName(name);             //set으로 받아준다
	this.setAge(age);
	this.setGender(gender);
}
}
public class Sample2 {

	public static void main(String[] args) {
		
		Worker w = new Worker("최은재", 32, "여자");
		w.setName("최은재"); w.setAge(32); w.setGender("여자");
	    System.out.println(w);
		
		
		
	}

}
