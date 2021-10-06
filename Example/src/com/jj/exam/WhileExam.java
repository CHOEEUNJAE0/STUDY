package com.jj.exam;

public class WhileExam {
	
	public static void main(String[] args) {
		//int 변수를 선언 후 초기화 
		//int i = 1;
		//반복문 작성
		//while (i <= 10) {
			//System.out.println(i);
			//i++;
			//i++를 안 써주면 1만 무한 반복 된다. 증감식 꼭 써 주기!
			
			int sum =0;
			int j = 1;
			
			while(j<=100) {
				sum+=j;
				j++;
			}                  //100까지 나와야해서 101-1 해준것
		System.out.println("1~" +(j-1) + "합 : " + sum);
		}
		
	}


