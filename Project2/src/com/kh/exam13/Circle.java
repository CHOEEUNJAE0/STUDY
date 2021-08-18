package com.kh.exam13;

public class Circle extends Shape {

	private int radius;
	private double PI = 3.141592;
	
	public double getPI() {
		return this.PI;
	}

	public void setPI(double pi) {
		this.PI = pi;
	}

	public Circle(int radius) {
		super(radius, radius);
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	//오버라이드를 사용하여 
	//setWidth(), setHeight();
	//radius 멤버 변수의 값을 추가 저장하는 것으로 재정의

	@Override
	public void setWidth(int radius) {
	   super.setWidth(radius);
	   this.radius = radius;
	}
	
	//PI 값에 대한 추가 속성을 정의 후 
	//setter/getter 생성.- 완료
	


}