package com.kh.exam10;

import java.util.Scanner;

public class Sample3 {
	

static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	// GRPGame 클래스로 가위바위보 게임 흐름에 맞는 동작(로직)을 작성
	CRPGame game = new CRPGame();
	String player = "";

	while(!game.exitFlag) {
		do {
			System.out.print("가위, 바위, 보 중 하나 입력(게임 종료를 원하면 종료 입력) : ");
			player = sc.nextLine();
			if(player.equals("종료")) {
				game.exitFlag = true;
				break;
			}
			game.setPlayer(player);
		} while(!game.checkValue(player));

		game.setComputer();

		switch(game.compare()) {
			case -1:	System.out.println("컴퓨터 승");	break;
			case 0:	System.out.println("무승부");	break;
			case 1:	System.out.println("플레이어 승");
		}

		System.out.println(game.getScore());
	}


}

}