package com.kh.exam3;

public class EscapeChar {

	public static void main(String[] args) {
		/*
		 *  이스케이프 문자
		 *    프로그래밍 코드에서 사용하는 문자가 문자열에 사용하는 문자와 충돌 되는 경우
		 *    프로그램이 충돌의 의미를 제대로 구분하지 못하기 때문에 구분 할 수 있는 추가 문자
		 *    로 이스케이프 문자라는 것을 사용한다.
		 *    
		 *    이스케이프 문자는 \(약슬래쉬)+문자 의 조랍으로 만들어진다.
		 *    \n : 문자열 안에서 개행(엔터)의 기능을 사용하기 위해 쓰인다.
		 *    \r : 문자열 안에서 커서의 위치를 해당 줄의 앞으로 이동시ㅣ기 위해 쓰인다.
		 *    \t : 문자열 안에서 탭 공백(8칸의 공백)을 사용하기 위해 쓰인다.
		 *         테이블 or 표를 만들 때 사용한다.
		 *    \" : 문자열 안에서 쌍따움표 문자를 사용하기 위해 쓰인다.
		 *    \' : 문자열 안에서 홀따옴표 문자를 사용하기 위해 쓰인다.
		 *    \\ : 문자열 안에서 역슬래쉬 문자를 사용하기 위해 쓰인다.
		 *    
		 */
		System.out.print("안녕하세요! \n반갑습니다! \n");
		System.out.println("abcd\r123"); //이클립스 안에서 실행x 확인불가
		System.out.println("abcd\t");
		System.out.println("ab\t");
		System.out.println("a\t");
		System.out.println("문자열 안에 \"쌍따옴표\"를 사용 ");
		System.out.println("문자열 안에 \'홀따옴표\'를 사용 ");
		System.out.println("안녕하세요! \\ 반갑습니다!");
		

	}

}
