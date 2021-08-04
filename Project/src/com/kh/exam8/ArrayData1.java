package com.kh.exam8;

import java.util.Arrays;

public class ArrayData1 {
	
	public static void sample1() {
		/*
		 * 2차 배열
		 *    배열 안에 요소가 배열로 구성되어 있는 것을 말한다.(표, 테이블과 같은 구조)
		 */
		
		//배열 안에 또 배열이라 대괄호를 두개 써 준다.
		int[][] arr = new int[3][4];
		//배열[3]개 안에 각각 [4]의 배열이 있는것 
		
		for(int i=0; i < arr.length; i++) { //부모for문이 세번 반복하는 동안
			for(int j= 0; j < arr[i].length; j++) {//자식 for문은 네번 반복하는 것
				arr[i][j] = i+j;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	public static void sample2() {
		
		//이런식으로 초기화 해도 된다. //결과값은 sample1이랑 동일한 형태로 나온다. 이중for문을 사용하지 않아도 된다.
		int [][] arr = new int [] [] {{1,2,3}, {4,5,6}};
		
		for(int i = 0; i < arr.length; i++)
			System.out.println(Arrays.toString(arr[i]));
	}
	
	public static void sample3() {
//		//2차 배열의 복사
//         int [] [] arr = { {1,2,3}, {4,5,6}, {7,8,9} };
//         int [] [] arrCopy;
//         
//         arrCopy = arr;// 이렇게만 하면 얕은 복사
//         arr[0][1]=20;// 얕은 복사만 하면 이렇게 써주면 값이 바뀌어 버린다.
//         
//         
//         System.out.println(Arrays.toString(arrCopy[0]));
//         System.out.println(Arrays.toString(arrCopy[1]));
//         System.out.println(Arrays.toString(arrCopy[2]));
//		
		int [] [] arr = { {1,2,3}, {4,5,6}, {7,8,9} };
        int [] [] arrCopy = new int[3][3];
        
        //2차 배열에서 깊은 복사를 하려면 반복문을 써서 복사를 해줘야한다.
        for(int i = 0; i < arr.length; i++) {
        	System.arraycopy(arr[i], 0, arrCopy[i], 0, arr[i].length);
        }
        arr[0][1] = 20;
      
      System.out.println(Arrays.toString(arrCopy[0]));
      System.out.println(Arrays.toString(arrCopy[1]));
      System.out.println(Arrays.toString(arrCopy[2]));

	}
	public static void sample4() {
	
	}
	
	public static void sample5() {
		//2차 배열 (동적배열)
		int[][] arr = new int[3][];
		
		arr[0] = new int[] {1,2,3,4};
		arr[1] = new int[] {5,6,7,8,9,10};
		arr[2] = new int[] {11,12,13};
		
		int [][] arrCopy = new int[arr.length + 1][];
		for(int i = 0; i < arr.length; i++) {
			arrCopy[i] = arr[i].clone();//System.arraycopy(arrOdd, 0, arrOddCopy, 0, arrOdd.length); 이거 대신 .clone으로 쓸수도있다.
		}
        arr = arrCopy;
        
        arr[arr.length - 1] = new int[] {14,15,16,17,18};

		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(arrCopy));
		
		
		//replace = 문자열 배열 변경 때 써 준다.
	}
	
	
	public static void main(String[] args) {
		//sample1();
		//sample2();
		//sample3();
	    sample4();
	    sample5();
	}
}
