package com.kh.exam2;

//DEFAULT 접근제한자를 사용하는 다른 패키지의 클래스 정보를 가져오지 못함. 
//import.com.kh.exam2.oth.NoAccessClass;


public class Sample {

	public static void main(String[] args) {
		OtherClass other = new OtherClass();
		System.out.println("OtherClass 접근 가능 ->" + other.attribute);
		
		NoAccessClass noAccess = new NoAccessClass();
		System.out.println("NoAccessClass 접근 가능 ->" + noAccess.attribute);
		/*
		 * 클래스 접근 제한자
		 *     PUBLIC : 모든 영역에서 사용 가능
		 *     DEFAULT : 동일 패키지 영역에서만 사용 가능
		 */
		
		
	}

}
