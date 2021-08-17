package com.kh.practice.point.model.vo;
//point의 상속 이용 할 것
public class Circle extends Point {
       private int radius;
       //radius의 getter setter만 만들어 주면 된다.
       
       public Circle() {}
       
       public Circle(int x, int y, int radius) {}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}

       
}