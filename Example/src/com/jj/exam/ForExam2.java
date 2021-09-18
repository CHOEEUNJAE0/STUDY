package com.jj.exam;

import sun.nio.fs.DefaultFileSystemProvider;

public class ForExam2 {

	public static void main(String[] args) {
		// 이중for문 작성해보기
		//바깥족 for문이 한번 반복 될때마다 안쪽 for문이 계속 반복. 
		//안쪽 for문이 끝나면 바깥쪽 for문의 증감식으로 돌아가서 다시 반복 시작.
		for(int m = 2; m <= 9; m++ ) {
			System.out.println("***" + m + "단***");
			for(int n =1; n <= 9; n++ ) {
				System.out.println(m + " * " + n + "=" + (m*n));
			}
		}
		

	}

}
