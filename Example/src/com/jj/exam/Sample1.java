package com.jj.exam;

public class Sample1 {

	public static void main(String[] args) {
		// score 값을 93으로 초기화
		int score = 93;
		
		// IF문 안에 조건문이 TRUE이기 떄문에 두 줄 모두 출력.
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("A 등급 입니다.");
		}
		// IF문에 중괄호가 없으므로 바로 밑에줄까지만 해당 IF문의 범위
		// IF문에 적힌 조건식이 FALSE이기 때문에 그 밑에 등급 내용이 출력.
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
		    System.out.println("B 등급 입니다.");
		}

	}

}
