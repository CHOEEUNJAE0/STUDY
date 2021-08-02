package com.kh.exam4;

import java.util.Scanner;

public class InputScanner {

	//sc는 클래스 변수라고 함 : 지정 클래서 안에서라면 항상 사용 가능
	static Scanner sc = new Scanner(System.in); 
	//메서드 : 지역변수는 소속 된 메서드 안에서만 쓸 수 있음
	public static void main(String[] args) {
		System.out.println("당신의 이름을 입력하세요 : ");
		String name = sc.nextLine(); 
		
		System.out.println("딩신의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.printf("당신의 나이는 %s 입니다.\n" , name);
		System.out.printf("당신의 나이는 %d 입니다.\n", age);
		//System.out.printf("%형식",변수 등) : 정해져 있는 형식에 맞춰서 맞는 값을 줄바꿈 하지 않고 출력 
		
		
		
		

	}

}
