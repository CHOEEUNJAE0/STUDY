package com.kh.exam13;

public class Triangle extends Shape {
	public Triangle(int width, int height) {
		super(width, height);

}

	@Override
	public int getArea() {
		return this.getWidth() * this.getHeight() / 2;
	}
	
	//오버라이드를 사용하여 
	//getArea() 메소드를 재정의
}
