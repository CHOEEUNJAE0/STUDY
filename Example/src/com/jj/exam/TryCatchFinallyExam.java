package com.jj.exam;

public class TryCatchFinallyExam {

	public static void main(String[] args) {
		//String str = null;
		//System.out.println(str.length());
		
		                     //문자열 선언을 하게 되면
		//매개값으로 정해진 문자열을 가지고 클래스를 찾게 된다.
		//찾으면  clazz라는 이름으로 참조 하게 해주고 
		//찾을 수 없으면 class not found오류 발생. 
		//일반적인 오류이기 때문에 예외처리를 요구하게 된다.
		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println("항상 실행");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}

}
