package com.kh.exam16;

import java.sql.Date;

public class Sample2 {

	public static void main(String[] args) {
		// 문자열을 기본 자료형으로 변환
		int resInt = Integer.parseInt("12345");
		System.out.println(resInt + 10);

		double resDouble = Double.parseDouble("123.456");
		System.out.println(resDouble + 10);

		// 기본 자료형을 문자열로 변환(기존 방법)
		String resStr = "" + resInt;
		System.out.println(resStr + ".");

		resStr = "" + resDouble;
		System.out.println(resStr + ".");

		// 기본 자료형을 문자열로 변환(Wrapper 이용하는 방법)
		resStr = Integer.valueOf(resInt).toString();
		System.out.println(resStr + ".");

		resStr = Double.valueOf(resDouble).toString();
		System.out.println(resStr + ".");

		// 성능 측정
		Date start, end;

		start = new Date();
		for(int i = 0; i < 99999999; i++) {
			resStr = "" + resInt;
		}
		end = new Date();
		System.out.println("성능 측정 결과 : " + (end.getTime() - start.getTime()) / 1000.0 + "초");

		start = new Date();
		for(int i = 0; i < 9999999; i++) {
			resStr = Integer.valueOf(resInt).toString();
		}
		end = new Date();
		System.out.println("성능 측정 결과 : " + (end.getTime() - start.getTime()) / 1000.0 + "초");
	}

}
