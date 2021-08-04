package com.kh.exam5;

class Other {
	int x;
	private int y;
	
	public Other() {
		//this는 인스턴스 자신을 나타내주는 의미로 사용되고, 참고 할 수 있는 주소 정보가 담겨 있는 객체이다.
		System.out.println("this -> " +this);
		
		
	} //생성자는 여러개 만들 수 있다 
	public Other(int x, int y) {
		//위에 class에도 같은 변수가 있기 때문에 구분을 해 주기 위해 this.을 붙여준다
		//this.을 습관처럼 붙이자..!
		
		this.x = x;
		this.y = y;
		
	}
	//매개 변수 명이 앞뒤로 다르다고 해서 오버로딩이 되는건 아님
//	public Other(int y, int x) {
//		
//		this.x = x;
//		this.y = y;
//	
	public int getY() {
		return this.y;
	}
	
}
public class SampleClass {

	public static void main(String[] args) {
		
		Other01 oth1 = new Other01();
		Other01 oth2 = new Other01(10,20);
		
		System.out.println(oth1.x + " | " + oth2.x);
		//oth1에 x는 따로 초기화를 하지 않았기 때문에 0으로 출력 
		//System.out.println(oth1.y + " | " + oth2.y);
		//y는 privite 되어 있어서 그냥은 출력이 안되니깐 생성자 하나를 더 만들어주고
		//거기에 return tihs.를 붙여주면 확인 할 수 있다.
		System.out.println(oth1.getY() + " | " + oth2.getY());
		

	}

}
