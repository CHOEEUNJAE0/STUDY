package com.jj.exam;

public class ArrayExam2 {

	public static void main(String[] args) {
		//우선 변수만 선언 후 배열을 생성 하려면 new 연산자 사용
		int[] score;
		score = new int[] {83,90,78};
		int sum = 0;
		for(int i = 0; i <3; i++) {
			sum += score[i];
		
		}
		System.out.println("총합 : " + sum);
		
	}
}
