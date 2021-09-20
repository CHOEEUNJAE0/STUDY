package com.jj.exam;

public class ArrayExam3 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		//arr1의 요소에는 어떤 값이 있는지 확인 하기 위해 for문 작성
		//인덱스는 0부터 시작하고 마지막 인덱스가 2이니깐 3미만일때까지 반복해라라고 지정
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" +i + "] : "+arr1[i]);
		}
		//이미 생성된 배열에 값을 변경 해 보자 
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" +i + "] : "+arr1[i]);

	}
		double[] arr2 = new double[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" +i + "] : "+arr2[i]);
   }
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" +i + "] : "+arr2[i]);
		System.out.println("arr2[" + i + "] : "+arr2[i]);
   }
		String[] arr3 = new String[3];
		for(int i = 0; i < 3; i++) {
		System.out.println("arr3[" +i + "] : "+arr3[i]);
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" +i + "] : "+arr3[i]);
			}
 }
}