package com.kh.exam16;

import java.util.Arrays;
import java.util.Scanner;

public class Sample3 {

	public static Scanner sc = new Scanner(System.in);
       public static void ex1() {
		//사용자 입력 한 번에 여러 데이터를 입력 받기.
//		String userInput1 = sc.nextLine();
//		int userInput2 =sc.nextInt();
//		
//		System.out.println(userInput1 + "|" + userInput2);
		
		String input = sc.nextLine();
		String[] inputs = input.split(" "); //공백을 넣어줌
		int[] intArr = new int[inputs.length];
		
		for(int i = 0; i < inputs.length; i++) {
			//intArr의 i번쨰
			intArr[i] = Integer.parseInt(inputs[i]);
		
		System.out.println(Arrays.toString(intArr));
		
		}
       }
       public static void ex2() {
    	   //영문자는 소문자로만 입력 받기 
    	   System.out.println("소문자로만 입력하세요. : ");
    	   String input = sc.nextLine();
    	   input = input.toLowerCase();
    	   System.out.println(input);
       }
       public static void ex3() {
    	   //금지어가 입력되는 것을 막음
    	   System.out.println("유튜브, 네이버, 카카오 는 금지어 입니다. ");
    	   System.out.print("입력 : ");
    	   String input = sc.nextLine();
    	   //크거나 같으면 금지어가 있는 것.
    	   if(input.indexOf("유튜브") >= 0 || input.indexOf("네아버") >= 0
    			   || input.indexOf("카카오")  >= 0) {
    		   System.out.println("금지어가 발견되었습니다. 다시 입력하세요. ");
    	   }
    	   
       }
       public static void ex4() {
    	   //금지어가 있는 문자열을 찾아서 *****로 변경하기.
    	   System.out.println("유튜브, 네이버, 카카오 는 금지어 입니다. ");
    	   System.out.print("입력 : ");
    	   String input = sc.nextLine();
    	   //크거나 같으면 금지어가 있는 것.
    	   input = input.replace("유튜브", "*****")
    	               .replace("카카오", "*****")
    	               .replace("네이버", "*****");
    	                System.out.println(input);
    	   }
       
       public static void ex5() {
    	   //4번을 어렵게 만들기 
    	   //금지어가 있는 문자열을 찾아서 *****로 변경하기.
    	   //배열 활용하기
    	   String[] words = new String[] {"유튜브", "카카오", "네이버"};
    	   //String.join 메소드 추가        //입력값  //배열비교  
    	   System.out.println(String.join(", " , words) + "는 금지어입니다.");
    	   System.out.print("입력 : ");
    	   String input = sc.nextLine();
    	   //반복문 활용 
    	  for(String s : words) {
    		  input = input.replace(s,  "*****");
    	  }
    	  
    	  System.out.println(input);
    	   }
    	   
       
		public static void main(String[] args) {	
			//ex1();
			//ex2();
			//ex3();
			//ex4();
			ex5();
			
	}

}
