package com.jj.exam;

public class advaceFor {

	public static void main(String[] args) {
		//int 타입 배열 scores 선언
		int[] scores = {95,75,68,45,78};
		//배열 요소의 합을 저장 할 sum 변수 선언 후 0으로 초기화
		int sum = 0;
		//배열이 int 타입이기 때문에 int로 선언
		for(int score : scores) {
			//요소가 5개이기때문에 이 for문은 다섯번을 반복해서 이 요소를 저장 하게 될 것
			sum += score;
		}
		System.out.println("점수 총합 : " +sum);
		//평균을 구해보자              // 요소 수
		double avg= (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
		
		
		

	}

}
