package com.kh.exam14;

//Foreigner 상속
public class StudentB extends Foreigner implements Art {

	//아트의 드로우 구현하라고 에러 뜸
	//구현 됐음
	@Override
	public void draw() {
		System.out.println( this.getName() + "미술부는 그릴 수 있습니다.");

		
	}
	

}
