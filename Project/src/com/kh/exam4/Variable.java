package com.kh.exam4;

public class Variable {

	public static void main(String[] args) {
		boolean b1 = true;
		byte b2 = 127; //128인 경우 오버플로우 127이상은 int형으로 쓰기
		char c1 = 'a'; //문자니깐 홀따옴표
		char c2 = 97; //ASCII 코드에서 문자에 해당하는 숫자가 출력
		short s1 = 128;
		int i1 = 1024;
		long l1 =4096;
		float f1 = 3.14f; //literal(리터럴) 더블형을 기분으로 보기때문에 f를 붙여줘야 실행된다.
		double d1 = 3.14;
		String str1 = "문자열"; //String은 클래스이기도 해서 처음에 대문자로 작성해야한다.
		String str2 = "문자열"+1;
		String str3 = 123+"문자열";
		String str4 = "기차" +123+45+"출발";
		String str5 = 123+45+"기차"+"출발";
		  //연산을 할때 앞에서 두개씩 연산을 함 그래서 숫자와 문자 순서에 따라 출력값이 다르게 나옴
	      //중간 숫자를 먼저 연산하고 싶으면 ()소가로로 묶어주면 됨
	      //앞 숫자를 문자로 출력하고 싶으면 > "" / 숫자하나면 > ''
		System.out.println(b1);
	       System.out.println(b2);
	       System.out.println(c1);
	       System.out.println(c2);
	       System.out.println(s1);
	       System.out.println(i1);
	       System.out.println(l1);
	       System.out.println(f1);
	       System.out.println(d1);
	       System.out.println(str1);
	       System.out.println(str2);
	       System.out.println(str3);
	       System.out.println(str4);
	       System.out.println(str5);
		

		
	}

}
