package com.jj.exam;

public class ArrayExam {

	public static void main(String[] args) {
		int[] score = {83,97,74};
		System.out.println("score[0] = " + score[0]);
		System.out.println("score[1] = " + score[1]);
		System.out.println("score[2] = " + score[2]);
		
		int sum =0;
		for(int i = 0; i <3; i++) {
			sum+= score[i];
			// for문을 빠져나오면 모든 요소의 합이 누적 될 것.
		}
		//출력을 해보자 
		System.out.println("총합 : " + sum);
		//double타입을 이용해서 평균을 구해보자
		//소숫점이 나올 수 있도록 sum을 double로 해 줌
		double avg = (double)sum / 3;
		System.out.println("평균 : " + avg);
	}

}
