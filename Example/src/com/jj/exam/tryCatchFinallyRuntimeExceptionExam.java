package com.jj.exam;

public class tryCatchFinallyRuntimeExceptionExam {

	public static void main(String[] args) {
		//string 타입의 data1 선언 후 null로 초기화
		String data1 = null;
		String data2 = null;
               //args는 실행 매개값으로 들어온 값
		//실행 매개값이 들어온게 없어서 에러 발생
		//try-catch를 작성 해 준다.
		try {
		 data1 = args[0];
		 data1 = args[1];
		}catch(Exception e) {
			System.out.println("실행 매개 값의 수가 부족합니다.");
			return;
		}
		
		
		//data1에 들어오는 문자열을 정수로 변환해서 저장해 주 는 것.
		try { 
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1+value2;
		System.out.println(data1+ "+" + data2+"=" +result);
		}catch( NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없습니다.");
		}finally {
			System.out.println("다시 실행 하세요");
		}
	}
}
