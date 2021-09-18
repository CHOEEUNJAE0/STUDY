package com.jj.exam;

public class IfDiceExample {

	//임의의 주사위 눈을 출력하는 예제 
	public static void main(String[] args) {
		//Math.random : 0~1 사이의 임의의 실수를 리턴해준다.
		//System.out.println(Math.random());
		//Math.random()*6; //*6을 해 주면 0.0 <= ~ 6.0 까지 출력해준다.
		//6.0 이하로만 출력이 된다.
		System.out.println(Math.random()*6);
		//주사위 눈은 1~6인 정수이기 때문에 강제현변환 casting을 해 준다.
		//0~5까지만 출력이 된다.
		//System.out.println((int)(Math.random()*6));
		//0이 나오지 않도록 해보자!
		//0~5까지 출력이 되기 때문에 출력 되는 수에 +1씩 해주면
		//1~6까지 출력 되게 된다. 0도 더이상 출력 되지 않고 6까지 출력 가능!
		System.out.println((int)(Math.random()*6)+1);
		
		// int num 으로 Math.random을 초기화 해 준다.
		int num = (int)(Math.random()*6)+1;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if (num == 4){
			System.out.println("4번이 나왔습니다.");
		}else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
	}

}
