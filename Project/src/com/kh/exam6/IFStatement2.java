package com.kh.exam6;

import java.util.Scanner;

public class IFStatement2 {

	
	static Scanner sc =new Scanner (System.in);
	public static void main(String[] args) {
		
		int a;
		
		System.out.println("1~12월 입력 : ");
		a = sc.nextInt(); sc.nextLine();
		
		
		
		if(a > 0 && a <= 3) {
			System.out.println("1분기 입니다.");
		}else if(a > 3 && a <= 6) {
			System.out.println("2분기 입니다.");
	   }else if(a > 6 && a <= 9) {
		   System.out.println("3분기 입니다.");

       }else if (a > 9  && a <= 12) {
    	   System.out.println("4분기 입니다.");
       }else {
    	   System.out.println("1~12사이의 숫자를 입력하세요.");
       }
		
		//규칙을 찾아서 공식화 한 코드
		a = a -1;
		if( a >= 0 && a< 12) {
			System.out.printf("%d 분기입니다.\n" ,(a / 3) +1);
		}else {
			System.out.println("1~12 사이의 숫자를 입력하세요.");
			
		}
}
}
