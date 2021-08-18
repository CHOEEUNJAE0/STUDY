package com.kh.exam13;

public abstract class Shape {

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	private int width;
	private int height;
	
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
//	public int getArea() {
//		return this.width * this.height;

    public abstract int getArea();
	//추상화, 오버라이딩 안해주면 오휴뜬다
    //square 클래스에 오버라이딩 해 준다 .
}
