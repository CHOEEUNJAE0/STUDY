package com.jj.exam;

public class ArrayCopyExam {

	public static void main(String[] args) {
		
		int[] oldIntArray = { 1, 2, 3 };
		// 두 개의 공간으 더 늘리고 싶어서 새로운 배열을 만들고 거기에 복사를 해 줄 것임.
		int[] newIntArray = new int[5];
		
		for(int i  = 0; i <oldIntArray.length; i++) {
			//원본 배열의 i 인덱스의 값을 읽어서 새로운 배열의 i 인덱스에 그 값을 저장 하라느 ㄴ의미
			newIntArray[i] = oldIntArray[i];
		}
		for(int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ",");
		}
	}

}
