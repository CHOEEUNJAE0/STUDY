package com.jj.exam;

public class systemArrayCopyExam {

	public static void main(String[] args) {
		//system.arraycopy를 이용한 배열 복사
		//String 타입 배열 변수 선언
		String[] oldStrArray = { "java", "array", "copy" };
		//길이 5짜리의 새로운 배열을 만들어 준다.
		String[] newIntArray = new String[5];
		                //원본배열 ,복사시작할 인덱스번호,복사할배열,붙여넣기할인덱스, 복사 할 수량입력.우리는 원본 배열 길이만큼 할거라 length
		System.arraycopy(oldStrArray, 0, newIntArray, 0, oldStrArray.length);
		
		for(int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ",");
		}
		System.out.println("newIntArray [0]  = " + newIntArray[0]);
		System.out.println("newIntArray [1]  = " + newIntArray[1]);
		System.out.println("newIntArray [2]  = " + newIntArray[2]);
		System.out.println("newIntArray [3]  = " + newIntArray[3]);
		System.out.println("newIntArray [4]  = " + newIntArray[4]);
		

	}

}
