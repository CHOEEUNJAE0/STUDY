package com.kh.exam10;

import java.util.Random;
import java.util.Scanner;

class CRPGame {
	private Random rd = new Random();
	public String player;
	public String computer;
	public int[] score = new int[3];
	public String[] CRP = {"가위", "바위", "보"};
	public boolean exitFlag = false;

	public void setPlayer(String crp) {
		this.player = crp;
	}

	public boolean checkValue(String crp) {
		for(int i = 0; i < this.CRP.length; i++) {
			if(crp.equals(this.CRP[i])) {
				return true;
			}
		}
		return false;
	}

	public void setComputer() {
		this.computer = this.CRP[this.rd.nextInt(3)];
	}

	public int compare() {
		if(this.player.equals("가위")) {
			if(this.computer.equals("바위")) {
				this.score[1] += 1;
				return -1;	// 컴퓨터 승
			} else if(this.computer.equals("보")) {
				this.score[0] += 1;
				return 1;	// 플레이어 승
			} else {
				this.score[2] += 1;
				return 0;	// 무승부
			}

		} else if(this.player.equals("바위")) {
			if(this.computer.equals("바위")) {
				this.score[2] += 1;
				return 0;
			} else if(this.computer.equals("보")) {
				this.score[1] += 1;
				return -1;
			} else {
				this.score[0] += 1;
				return 1;
			}

		} else {
			if(this.computer.equals("바위")) {
				this.score[0] += 1;
				return 1;
			} else if(this.computer.equals("보")) {
				this.score[2] += 1;
				return 0;
			} else {
				this.score[1] += 1;
				return -1;
			}
		}
	}

	public String getScore() {
		return "현재 플레이어의 스코어는 : " + this.score[0] + " 승 "
				+ this.score[1] + " 패 " + this.score[2] + " 무 입니다.";
	}
}