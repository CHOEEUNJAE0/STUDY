package com.kh.exam13;

public class Square extends Shape {
	public Square(int width, int height) {
		super(width, height);
		
		@override
		public int getArea() {
			return this.getWidth() * this.getHeight();
		}
		
		
		
		
		
	}

}
