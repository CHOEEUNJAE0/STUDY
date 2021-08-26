package com.kh.exam16;

import java.util.StringTokenizer;

public class Sample5 {

	public static void main(String[] args) {
		String str = "StringTokenizer로 문자열을 분리하는 예제";
		StringTokenizer st = new StringTokenizer(str, " ");// 공백으로 분리
		
		while(st.hasMoreTokens()) {//공백뒤에 내용이 더 있을 때(true)
			System.out.println(st.nextToken()); //계속해서 다음 내용 가져와라 
		}
		//이걸 위에 while문으로 간단하게 작성 가능 
//		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.hasMoreTokens());
//		System.out.println(st.nextToken());
	}

}
