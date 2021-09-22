package com.jj.exam;

public class ArrArrExam {

	public static void main(String[] args) {
		//  행,열 구조로 배열을 생성
		// 기본적으로 배열은 타입에 따라서 초기값이 들어 가 있음.
		// int 타입이라 이 2차원배열에는 모두 0이 들어 가 있을 것.
		// 2차원배열의 행이 2개이고 열이3개이기때문에 모든 요소를 출력하기위해선 이중for문이 필요
		int[][] mathScores = new int[2][3];
		//바깥for문은 행 수를 반복, 안쪽 for문은 열 수를 반복
		mathScores [1][2] = 10;
		
		for(int i = 0; i < 2 ; i++ ) {
			for(int j = 0; j < 3; j++) {
			System.out.println("mathScores [" + i + "] [" + j + "] = "
					+ "" +mathScores[i][j] );
				
			}
		}
		// 이번에는 계단식으로 구해보자
		System.out.println();
		// 행의 값만 주어서 배열을 생성
		int[][] engScores = new int[2][];
		 //0헹은 길이 2짜리, 1행에는 열수가 3인 것을 참조하도록 만들어 주면
		// 계단식으로 만들기 가능
		engScores[0] = new int[2];
		engScores[1] = new int[3];
		for(int k = 0; k < 2 ; k++ ) {
			for(int h = 0; h < engScores[k].length; h++) {
				System.out.println("engScores [" + k + "] [" + h + "] = "
						+ "" +engScores[k][h] );

	}
		}
		System.out.println();
		
		//값의 목록을 가지고 2차원 배열을 만들어보자
		// 이 형태로 만들면 이건 2차원 배열을 참조 한다는 의미가 된다.
		//int[][] javaScores = {{},{}};
		//                     이렇게 해서 열,행의 값을 정해 준다. 이렇게 하면 2*2의 행열
		// 바깥 {}의 요소의 수 = 행의 수 & 안쪽 {} 의 요소의 수 = 열의 수 
		// 행,열이 같은 요소의 수면 행열타입의 배열이 되고 행,열 요소의 수가 다르면 계단식이 되는 것
		int[][] javaScores = {{65,100},{75,95,85}};
		//for문을 이용해서 값을 확인 해 보자 .
		for(int x = 0; x < 2; x++) {
			for(int y = 0; y < javaScores[x].length; y++) {
				System.out.println("javaScores[" + x + "][" +y+"] =" 
			+javaScores[x][y]);
			}
		}
		
}
}
