package com.kh.exam7;

import java.util.Scanner;

public class PracFOR {
static Scanner sc = new Scanner(System.in);

public static void ex1() {
	/*
	 * 정수값을 입력받아 1 부터 입력받은 값까지 1씩 증가된 값을 출력하는
	 * 코드를 작성한다.
	 * 
	 * 예)
	 * 		정수 입력 : 3
	 * 		1
	 * 		2
	 * 		3
	 */
	int num;
	
	System.out.print("정수 입력 : ");
	num = sc.nextInt();	sc.nextLine();
	
	for(int i = 1; i <= num; i++) {
		System.out.println(i);
	}
}

public static void ex2() {
	/*
	 * 정수값을 입력받고 입력받은 값부터 1씩 감소된 값을 출력하는 코드를 작성한다.
	 * 
	 * 예)
	 * 		정수 입력 : 3
	 * 		3
	 * 		2
	 * 		1
	 */
	int num;
	
	System.out.print("정수 입력 : ");
	num = sc.nextInt();	sc.nextLine();
	
	for(int i = num; i >= 1; i--) {
		System.out.println(i);
	}
}

public static void ex3() {
	/*
	 * 정수값을 입력받을 때 지정된 범위의 입력값이 아닌 경우 최대 3번 다시
	 * 입력 받을 수 있도록하는 코드를 작성한다.
	 * (지정된 범위는 1 ~ 100 사이의 값이다.)
	 */
	int num = 0;
	
	for(int i = 1; i <= 3; i++) {
		System.out.print("정수 입력(1 ~ 100) : ");
		num = sc.nextInt();	sc.nextLine();
		
		if(num >= 1 && num <= 100) {
			System.out.println("정상적으로 입력하였습니다.");
			break;
		} else {
			if(i != 3) {
				System.out.println("다시 입력하세요. 1 ~ 100 까지 만 입력해야 합니다.");
			} else {
				System.out.println("주어진 기회를 모두 소모하였습니다.");
			}
		}
	}
	
	// System.out.println("사용자가 입력한 값은 " + num + " 입니다.");
}
public static void ex4() {
	/*
	 * ex1() 처럼 동작하는 코드를 작성한다. 단, 출력 메시지는 다음과 같이 나오도록 한다.
	 * 
	 * 예)
	 * 		정수 입력 : 3
	 * 		1 2 3 
	 */
	int num;
	String text = "";	// 빈 문자열
	
	System.out.print("정수 입력 : ");
	num = sc.nextInt();	sc.nextLine();
	
	for(int i = 1; i <= num; i++) {
		// System.out.print(i + " ");
		text = text + i + " ";
	}
	System.out.println(text);
}
public static void ex5() {
	/*
	 * ex4() 처럼 동작하는 코드를 작성한다. 단, 1 부터 시작하는 값이 아닌 100 부터 시작하는
	 * 형태로 나오게 한다.
	 * 
	 * 예)
	 * 		정수 입력 : 3
	 * 		100 101 102
	 */
	int num;
	String text = "";	// 빈 문자열
	
	System.out.print("정수 입력 : ");
	num = sc.nextInt();	sc.nextLine();
	
	for(int i = 100; i < 100 + num; i++) {
		// System.out.print(i + " ");
		text = text + i + " ";
	}
	System.out.println(text);
}


  public static void ex7() {
	/*
	 * 정수값을 입력받아 1 부터 입력받은 값까지 출력을 하는 코드를 작성한다. 단, 3의 배수에
	 * 해당하는 값만을 출력하도록 한다.
	 * 
	 * 예)
	 * 		정수 입력 : 10
	 * 		3 6 9
	 */
	int num;
	String text = "";	// 빈 문자열
	
	System.out.print("정수 입력 : ");
	num = sc.nextInt();	sc.nextLine();
	
	for(int i = 3; i <= num; i += 3) {
		text = text + i + " ";
	}
	
	System.out.println(text);
}
  public static void ex8() {
	/*
	 * 사용자가 입력한 문자열을 기반으로 파일명이 자동으로 생성되는 프로그램을 만들려고 한다.
	 * 다음의 요구 사항을 파악하여 사용자가 원하는 기능이 동작하도록 코드를 작성하시오.
	 * 
	 * 1. 임의의 파일명을 입력할 수 있어야 한다.
	 * 2. 파일은 1개를 생성할 수도 있지만 원하는 경우 2개 이상도 생성할 수 있다.
	 * 3. 만약 2개 이상의 파일을 생성하는 경우 2번째 파일 부터는 파일명 뒤에 "[2]" 접미사가 붙는다.
	 * 4. 3번 요구사항의 접미사 숫자값은 2 로 고정하는 것이 아니라 파일 수에 맞추어 1씩 증가해야 한다.
	 * 
	 * 예 1.)
	 * 		파일명 입력 : newFile
	 * 		생성 파일수 : 1
	 * 		결과
	 * 			newFile 생성 완료!
	 * 
	 * 예 2.)
	 * 		파일명 입력 : newFile
	 * 		생성 파일수 : 3
	 * 		결과
	 * 			newFile 생성 완료!
	 * 			newFile[2] 생성 완료!
	 * 			newFile[3] 생성 완료!
	 */
	String fileName;
	String text = ""; 
	
	System.out.print("파일명 입력 : ");
	fileName = sc.nextLine();
	
	int count;
	System.out.print("생성 파일수 : ");
	count = sc.nextInt();	sc.nextLine();
	
	if(count >= 1) {
		text = text + fileName + " 생성 완료!\n";
	}
	
	for(int i = 2; i <= count; i++) {
		text = text + fileName + "[" + i + "]" + " 생성 완료!\n";
	}
	
	System.out.println(text);
	
}
  public static void ex9() {
	/*
	 * 사칙연산 계산기 프로그램
	 * 간단한 사칙 연산을 수행하는 계산기 프로그램 코드를 작성하시오.
	 * 이 프로그램은 계속 동작이 이루어 지도록 한다. 필요한 경우
	 * 연사자 입력에서 z 를 입력하면 종료가 되도록 한다.
	 * 
	 * 예 1.)
	 * 		숫자 입력1 : 10
	 * 		연산자 입력 : +
	 * 		숫자 입력2 : 20
	 * 		결과
	 * 			10 + 20 = 30
	 * 
	 * 예 2.)
	 * 		숫자 입력1 : 10
	 * 		연산자 입력 : /
	 * 		숫자 입력2 : 20
	 * 		결과
	 * 			10 / 20 = 0.5
	 */
	int num1, num2, res;
	double res1;
	char op;
	
	for(;;) {	
		for(;;) {
			System.out.print("숫자 입력 1 : ");
			if(sc.hasNextInt()) {
				num1 = sc.nextInt();	sc.nextLine();
				break;
			} else {
				System.out.println("정수로만 입력하세요.");
				sc.nextLine();	// 잘못 입력한 내용을 버퍼에서 제거하기 위해 사용.
			}
		}
		
		System.out.print("연산자 입력 : ");
		op = sc.nextLine().charAt(0);
		
		if(op == 'z') {
			System.out.println("사칙연산 프로그램을 종료 합니다.");
			break;
		}
		
		System.out.print("숫자 입력 2 : ");
		num2 = sc.nextInt();	sc.nextLine();
		
		switch(op) {
			case '+':
				res = num1 + num2;
				System.out.printf("%d %c %d = %d\n", num1, op, num2, res);
				break;
			case '-':
				res = num1 - num2;
				System.out.printf("%d %c %d = %d\n", num1, op, num2, res);
				break;
			case '*':
				res = num1 * num2;
				System.out.printf("%d %c %d = %d\n", num1, op, num2, res);
				break;
			case '/':
				res1 = (double)num1 / num2;
				System.out.printf("%d %c %d = %.2f\n", num1, op, num2, res1);
		}
		
	}
}

public static void ex10() {
	/*
	 * 출력을 다음과 같이 나오도록 한다.
	 * 
	 * 1 2 3 4 5 6 7
	 * 8 9 10 11 12 13 14
	 * 15 16 17 18 19 20 21
	 * 22 23 24 25 26 27 28
	 * 29 30 31 32 33 34 35
	 * 36 37 38 39 40 41 42
	 */
	int num = 1;
	
	for(int i = 1; i <= 6; i++) {
		for(int j = 1; j <= 7; j++) {
			System.out.print(num + " ");
			num++;
		}
		System.out.print("\n");
	}
	
	System.out.print("\n");
	
	for(int i = 0; i < 6; i++) {
		for(int j = 1; j <= 7; j++) {
			System.out.print((i * 7) + j + " ");
		}
		System.out.print("\n");
	}
	
}

   public static void main(String[] args) {
	 //ex1();
	// ex1();
	// ex2();
	// ex3();
	// ex4();
	   //ex();
		// ex7();
		// ex8();
		// ex9();
		// ex10();
	   
	   
   }
}