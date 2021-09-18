package com.jj.exam;

public class Sample3 {

	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 90~100입니다.");
			System.out.println("A 등급입니다.");
		}else if(score >= 80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("B 등급입니다.");
		}else if(score >= 70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("C 등급입니다.");
		}else {                             
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("D 등급입니다.");
			
		}

	}

}
