package com.jj.exam;

public class arrStringExam {

	public static void main(String[] args) {
		//String 타입으로 배열을 만들어 보자
		//String 타입의 배열 변수 strArray를 선언 후 길이 [3]짜리를 생성 해서 대입
		String[] strArray = new String[3];
		strArray[0] = "Java"; //[0] 인덱스에 자바 대입
		strArray[1] = "Java"; //[1] 인덱스에 자바 대입
		//자바에서는 문자열 리터럴이 같은 경우 동일한 String 객체를 공유
		//0과 1의 저장된 번지수는 동일하다.
		strArray[2] = new String("Java"); //새로운 String 생성 후 같은 문자열 대입
		//0,1과의 번지수는 다르지만 문자열을 동일 
		// 비교문을 작성 해서 확인 출력 해 보자
		//인덱스 0이 참조하는 객체와 인덱스 1이 참조하는 객체가 같은지 확인
		System.out.println(strArray[0] == strArray[1]); //true
		//인덱스 0이 참조하는 객체와 인덱스 2이 참조하는 객체가 같은지 확인
		System.out.println(strArray[0] == strArray[2]); //new로 새로 만든것이라false
		System.out.println(strArray[0].equals(strArray[2]));
		//.equals로 비교하면 번지수가 아니라 !문자열만! 비교이기때문에 ture 

	}

}
