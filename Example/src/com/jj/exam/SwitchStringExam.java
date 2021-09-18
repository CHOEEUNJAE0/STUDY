package com.jj.exam;

public class SwitchStringExam {

	public static void main(String[] args) {
		String[] position = {"부장","과장","팀장","대리"};
		int num = (int)(Math.random()*4);
		switch (num) {
		case 1 :
			System.out.println(position[0]+"의"+"월 급여는 7,000,000원 입니다.");
			break;
		case 2 :
			System.out.println(position[1]+"의"+"월 급여는 6,000,000원 입니다.");
			break;
		case 3 : 
			System.out.println(position[2]+"의"+"월 급여는 5,000,000원 입니다.");
			break;
		case 4 : 
			System.out.println(position[3]+"의"+"월 급여는 4,000,000원 입니다.");
		default:
			System.out.println("사원 월 급여는 3,000,000입니다.");
			break;
		}

	}

}
