package com.kh.exam14;

//NativePerson 상속
public class StudentA extends NativePerson implements Sports{

	//스포츠의 런을 구현하라고 에러 뜸
	//구현 됐음
	@Override
	public void run() {
		System.out.println(this.getName() +"운동부는 뛸 수 있습니다.");
		
		
	}
	


}
