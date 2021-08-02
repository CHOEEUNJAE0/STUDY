package com.kh.exam4;

import java.util.Scanner;

public class Prac1 {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 입력 받아서 총점과 평균을
		 * 출력하는 코드를 작성하시오.
		 *  (점수는 반드시 실수형으로 입력 받고
		 *   총점은 반드시 정수로 저장하고 출력 해야한다.)
		 */
		double kor, eng, mth, avg;
		int tot;
		
		System.out.println("국어 : ");
		kor = sc.nextDouble(); sc.nextLine();
		
		System.out.println("영어 : ");
		eng = sc.nextDouble(); sc.nextLine();
		
		System.out.println("수학 : ");
		mth = sc.nextDouble(); sc.nextLine();
		
		tot = (int)(kor+eng+mth); //정수로 출력하기 위해 int를 붙여준다
		avg = (kor+eng+mth)/3.0;
		
		System.out.println("총점 : " + tot);
		System.out.printf("평균 : %%.2\f", avg);
		
		

	}

}
