package com.kh.practice.point.model.vo;

//point의 상속 받음
public class Rectangle extends Point {
	private int width;
	private int height;
	public Rectangle() {}
	public Rectangle(int x, int y, int height, int width) {}

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
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ""
				+ ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	}


