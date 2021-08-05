package com.kh.exam6;

/*
 *  아래의 클래스를 만든 후 동작 확인이 되면, 각각의 클래스를 동일 패키지안에 개별 파일로 안들어서도
 *  동일하게 동작이 되는지 확인을 한다.
 *  
 *  동일 패키지안에 개별 파일로도 동작이 되는것을 확인하면, 다른 패키지로도 분리하여 작성했을 때도 
 *  동작이 되게 만들어 본다.
 *  
 *  패키지는 다음과 같이 분리하여 동작 시킨다.
 *     Member 클래스는 com,kh.exam6.member 패키지 안에 넣는다.
 *     Producr 클래스는 com.kh.exam6.product 패키지 안에 넣는다.
 *     Circle 클래스는 com.kh.exam6.shape 패키지 안에 넣는다.
 *  
 */


	//생성자
	//public Member() {} //별 다른 구현 내용(매개변수) 없으면 괄호만 치고 완성


class Circle {
	
	private double PI = 3.14;
	private int radius = 1;
	


  public Circle() {}

  public void incrementRadius() {
	  
  }
  public void getAreaOfCircle() {
	  
  }
  
  public void getSizeOfCircle() {
	  
  }
  

public class SampleClass {

	public static void main(String[] args) {
//		//인스턴스 화 ,를 통해서 클래서와 메서드에 접근 
//		  Member m = new Member();
//		  m.changeName("홍길동");
//		  m.printName();
		
//	  Product p = new Product();
//	  p.information();
		
      Circle c = new Circle();
      c.incrementRadius();
      c.getAreaOfCircle();
      c.getSizeOfCircle();
      
     
	
		 

	}
}
}
