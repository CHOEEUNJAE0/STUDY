package com.kh.exam6;

import java.util.Scanner;

public class IFStatement1 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		
		System.out.println("정수값 입력 : ");
		a = sc.nextInt(); sc.nextLine();
		
		if(a>10) {
			System.out.println("a에 저장 된 값은 10보다 큽니다.");
		}
		
		int b;
		System.out.println("정수값 입력 : ");
		b = sc.nextInt(); sc.nextLine();
		
		if (b % 5 == 0) {
			System.out.println("b의 저장된 값은 5의 배수입니다.");
		}else {
			System.out.println("b에 저장된 값은 5의 배수가 아닙니다.");
		}

	}

}
