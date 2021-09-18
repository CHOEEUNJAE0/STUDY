package com.jj.exam;

public class ForExam {

	public static void main(String[] args) {
		//1~100까지 합을 구해보자
		// 합을 구할 변수 sum 선언 후 0으로 초기화
		int sum = 0;
		   //반복을 어디서 할 건지 지정/어디까지 반복 할 것인지/반복 할때마다 얼마나 증가 할 것인가
		for( int i = 0; i <=100; i++) {
			//sum 변수에 복합연산자 +=로 i 값 누적
			 sum = sum +i;
			System.out.println("1~100의 합 : " + sum);
		}
		
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		
	}
}

