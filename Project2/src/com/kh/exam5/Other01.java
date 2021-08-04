package com.kh.exam5;

public class Other01 {
	int x;
	private int y;
	
	
	public Other01() {
		System.out.println("this -> " + this);
	}
	
	public Other01(int x) {
		this.x = x;
	}
	//매개 변수 명과는 관계 없이 타입이 int로 동일하기 때문에 안된다.
//	public Other01(int y) {
//		this.y = y;
//	}
	
	public Other01(int x, int y ) {
		System.out.println("this -> " + this);
		this.x = x;
		this.y = y;
	}
	//매개변수 명이 다르다고 해서(순서만 다르고 이름이 같을때) 오버로딩이 되는건 아님
	
//	public Other01(int y, int x) {
//		this.y =y;
//		this.x =x;
//		
	public int getY( ) {
		 return this.y;
	}

	public static void main(String[] args) {
		Other01 oth1 = new Other01();
		System.out.println("oth1->" +oth1);
		
		Other01 oth2 = new Other01(10, 20);
		System.out.println("oth2->" +oth2);

		
		System.out.println(oth1.x + "|" + oth2.x);
		//System.out.println(oth1.y + "|" + oth2.y);
		System.out.println(oth1.getY() + "|" + oth2.getY());
		
		System.out.println("안녕");
	}

}
