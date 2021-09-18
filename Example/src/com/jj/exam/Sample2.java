package com.jj.exam;

public class Sample2 {

	public static void main(String[] args) {
		int score = 85;
		
		// 초기화 값이 85 이므로 false가 됨.
		if( score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("A 등급입니다.");
		// 초기화 값이 85 이므로 true. else를 실행 해 줌	
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("B 등급입니다.");
		// if문 빠져나와서 "종료"까지 출력 해주고 끝.
		}
		System.out.println("종료");
		
	

	}

}
