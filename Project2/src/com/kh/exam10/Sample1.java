package com.kh.exam10;

class Square {
 public int width ;
 public int height ;
 
 //s1 처럼 초기화를 시켜주기 위해 다시 작성해준다.
 public Square() {}
 
 //매개 변수가 있는 애들은 이런식으로 초기화 해줘야한다.
 public Square(int width, int height) {
	 this.width = width;
	 this.height = height;
 }
 
 public int area() {
	 return this.width * this.height;
}
}
//삼각형, 원에 대한 클래스 생성.

class Triangle{
	private int width;
	private int height;
	
	public Triangle() {};
	public Triangle(int number) {
		this.width = number;
		this.height = number;
	}
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int area() {
		return this.width * this.height / 2;
	}
	public void setWidth(int width) {
		this.width = width;
		
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	
}
}

public class Sample1 {

	public static void main(String[] args) {
		/*
		 * 클래스를 사용하여 인스턴스를 만들고 만들러진 인스턴스를 사용하는 코드를 
		 * 보고 해당 코드에 적합한 클래스를 작성해보도록 한다.
		 */
      Square s = new Square();
      s.width = 100;
      s.height = 50;
      
      // 위에서 변경한 width, heigh 속성으로 넣어 계산을 하여 리턴.
      int area = s.area();
      
      System.out.println("사각형의 너비는 " + s.width + "입니다.");
      System.out.println("사각형의 높이는 " + s.height + "입니다.");
      System.out.println("사각형의 넓이는 " + s.area() + "입니다.");
		
      Square s1 = new Square(10, 20);
      
      System.out.println("사각형의 너비는 " + s1.width + "입니다.");
      System.out.println("사각형의 높이는 " + s1.height + "입니다.");
      System.out.println("사각형의 넓이는 " + s1.area() + "입니다.");
		
      
	}
}


