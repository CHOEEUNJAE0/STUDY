  
package com.kh.exam8;

import java.util.Random;
import java.util.Scanner;

public class PracArray {

	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	
	public static void ex1() {
		/*
		 * 길이가 10 인 정수 배열을 선언하고 1 ~ 10까지의 값을 배열에
		 * 초기화하는 코드를 작성
		 */
		int[] iArr = new int[10];
		
		// 1. 초기화(인덱스 활용)
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		}
		
		// 2. 초기화(별도의 번수 활용)
		int val = 1;
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = val;
			val++;
		}
		
		// 3. 초기화(while 문 사용)
		int i = 0;
		while(i < iArr.length) {
			iArr[i] = i + 1;
			i++;
		}
		
		// 확인용 출력
		for(i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "] -> " + iArr[i]);
		}
	}
	
	public static void ex2() {
		/*
		 * 길이가 10 인 정수 배열을 선언하고 짝수에 해당하는 값을 배열에 순차적으로
		 * 초기화하는 코드를 작성
		 */
		int[] iArr = new int[10];
		
		// 1. 초기화(별도의 변수 활용)
		int val = 2;
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = val;
			val += 2;
		}
		
		// 2. 초기화(인덱스 활용)
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (i + 1) * 2;
		}
		
		// 3. 초기화(while 문 활용)
		int i = 0;
		while(i < iArr.length) {
			iArr[i] = (i + 1) * 2;
			i++;
		}
		
		// 확인용 출력
		for(i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "] -> " + iArr[i]);
		}
	}
	
	public static void ex3() {
		/*
		 * 길이가 20 인 정수 배열을 선언하고 홀수에 해당하는 값을 배열에 순차적으로
		 * 초기화하는 코드를 작성
		 * 단, 99 부터 역순으로 초기화값을 저장한다.
		 * 
		 * int[] iArr = new int[20];
		 * int[0] = 99;	int[1] = 97;
		 * int[2] = 95;	int[3] = 93;
		 * ...
		 */
		int[] iArr = new int[20];
		
		// 1. 초기화
		int val = 99;
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = val;
			val -= 2;
		}
		
		// 2. 초기화
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = 99 - i * 2;
		}
		
		// 3. 초기화
		int i = 0;
		while(i < iArr.length) {
			iArr[i] = 99 - i * 2;
			i++;
		}
		
		// 4. 초기화(배열의 끝 인덱스 부터 역순으로 초기화)
		for(i = iArr.length - 1; i >= 0; i--) {
			// System.out.println("DEBUG -> " + "iArr[" + i + "]:" + (99 - i * 2));
			iArr[i] = 99 - i * 2;
		}
		
		// 5. 초기화
		i = iArr.length - 1;
		while(i >= 0) {
			iArr[i] = 99 - i * 2;
			i--;
		}
		
		// 확인용 출력
		for(i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "] -> " + iArr[i]);
		}
	}
	
	public static void ex4() {
		/*
		 * 길이가 26 인 정수 배열을 선언하고 아스키 문자 영문자(대문자)를 순차적으로
		 * 초기화하는 코드를 작성
		 */
	}
	
	public static void ex5() {
		/*
		 * 생성할 배열의 크기를 사용자 입력을 이용하여 생성한 후 100 부터 배열의 크기만큼
		 * 초기화를 진행한다.
		 */
		int arrSize;
		
		System.out.print("생성할 배열 크기(정수) : ");
		arrSize = sc.nextInt();	sc.nextLine();
		
		int[] iArr = new int[arrSize];
		
		// 1. 초기화
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = 100 + i;
		}
		
		// 확인용 출력
		for(int i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "] -> " + iArr[i]);
		}
	}
	
	public static void ex6() {
		/*
		 * 생성할 배열의 크기를 사용자 입력을 이용하여 생성한 후 다시 사용자 입력을 이용하여
		 * 사용자가 직접 배열의 크기 만큼 초기화 할 수 있도록 한다.
		 * (생성 할 배열 타입은 문자열로 한다.)
		 */
		int arrSize;
		
		System.out.print("생성할 배열 크기(정수) : ");
		arrSize = sc.nextInt();	sc.nextLine();
		
		String[] sArr = new String[arrSize];
		
		// 1. 초기화
		for(int i = 0; i < sArr.length; i++) {
			System.out.print("초기값 입력[" + i + "] : ");
			sArr[i] = sc.nextLine();
		}
		
		// 확인용 출력
		for(int i = 0; i < sArr.length; i++) {
			System.out.println("iArr[" + i + "] -> " + sArr[i]);
		}
	}
	
	public static void ex7() {
		/*
		 * 2021년 7월에 한정하여 사용자 입력을 통해 일자 데이터를 입력 받고 해당하는 일자가
		 * 어떤 요일인지 알려주는 코드를 배열을 활용하여 작성한다.
		 */
		int day;
		String[] dayArr = new String[] {"수", "목", "금", "토", "일", "월", "화"};
		
		System.out.print("요일 입력(1 ~ 31) : ");
		day = sc.nextInt();	sc.nextLine();
		
		if(day >= 1 && day <= 31) {
			System.out.println(dayArr[day % 7] + "요일 입니다.");
		} else {
			System.out.println("1 ~ 31 사이의 값을 입력하세요.");
		}
	}
	
	public static void ex8() {
		// 가위바위보 게임 -> 사용자 입력으로 사용자가 가위 또는 바위 또는 보를 입력하는 것만으로 동작.
		
		/*
		 * 1. 사용자 / 컴퓨터가 임의의 가위, 바위, 보를 입력
		 *     - 사용자는 Scanner 를 사용하여 입력 (직접 가위, 바위, 보 중 하나 입력)
		 *     - 컴퓨터는 Random 를 사용하여 입력 (0, 1, 2 중 하나를 임의로 생성)
		 *     - Random 을 통해 생성된 0, 1, 2 의 값은 각각 가위, 바위, 보로 치환하여 동작하게 한다.
		 *
		 * 2. 승부 비교를 위한 조건문 작성
		 *     - 가위 : 바위 -> 바위 승, 가위 : 보 -> 가위 승, 가위 : 가위 -> 무승부
		 *     - 바위 : 바위 -> 무승부,  바위 : 보 -> 보 승,  바위 : 가위 -> 바위 승
		 *     - 보 : 바위 -> 보 승,    보 : 보 -> 무승부,   보 : 가위 -> 가위 승
		 *  
		 * 3. 2번 비교 결과에 따른 승, 패, 무 저장해두어 승률을 출력
		 */
		
		String player;
		String computer = "";
		int[] score = new int[3];	// 0: 승, 1: 패, 2: 무
		String[] sArr = {"가위", "바위", "보"};
		boolean exitFlag = false;
		
		while(true) {
			
			while(true) {
				System.out.print("가위, 바위, 보 중 하나 입력(게임 종료를 원하면 종료 입력) : ");
				player = sc.nextLine();
				if(player.equals("가위") || player.equals("바위") || player.equals("보")
						|| player.equals("종료")) {
					if(player.equals("종료")) {
						exitFlag = true;
					}
					break;
				}
			}
			
			if(exitFlag) {
				break;
			}
			
			computer = sArr[rd.nextInt(3)];
			
			if(player.equals("가위")) {
				if(computer.equals("바위")) {
					System.out.println("컴퓨터 승");
					score[1] += 1;
				} else if(computer.equals("보")) {
					System.out.println("플레이어 승");
					score[0] += 1;
				} else if(computer.equals("가위")) {
					System.out.println("무승부");
					score[2] += 1;
				}
				
			} else if(player.equals("바위")) {
				if(computer.equals("바위")) {
					System.out.println("무승부");
					score[2] += 1;
				} else if(computer.equals("보")) {
					System.out.println("컴퓨터 승");
					score[1] += 1;
				} else if(computer.equals("가위")) {
					System.out.println("플레이어 승");
					score[0] += 1;
				}
				
			} else if(player.equals("보")) {
				if(computer.equals("바위")) {
					System.out.println("플레이어 승");
					score[0] += 1;
				} else if(computer.equals("보")) {
					System.out.println("무승부");
					score[2] += 1;
				} else if(computer.equals("가위")) {
					System.out.println("컴퓨터 승");
					score[1] += 1;
				}
				
			}
			
			System.out.println("현재 플레이어의 스코어는 : " + score[0] + " 승 "
			+ score[1] + " 패 " + score[2] + " 무 입니다.");
		}
		
	}
	
	public static void ex9() {
		// 사용자 입력을 통해 과목 정보를 입력 받는다.
		// 사용자 입력이 계속 이루어 질 때마다 배열의 크기를 +1씩 늘려 입력한 만큼 저장하게 한다.
		// 사용자 입력이 "종료"인 경우 더 이상 입력을 받지 않고 최종 입력된 모든 과목 정보를 출력.
		/*
		 *  1. 배열의 크기가 0 인 문자열 배열을 생성
		 *  2. 사용자 입력을 계속 받을 수 있도록 무한 반복문 작성
		 *  3. 무한 반복문 안에서 사용자 입력을 받도록 작성
		 *  4. 사용자 입력값이 종료가 아니면 기존 배열 크기 +1을 한 새로운 배열 생성
		 *  5. 새로 생성한 배열에는 기존 배열의 데이터를 깊을 복사로 저장
		 *  6. 복사본의 참조 주소를 기존 배열 변수에서 사용할 참조 주소로 저장(얕은 복사)
		 *  7. 4번에서 입력받은 데이터를 새로 추가된 배열의 마지막 인덱스에 저장
		 *  8. 4번에서 입력받은 데이터가 종료인 경우 무한 반복문을 종료할 수 있게 한다.
		 *  9. 8번에서 최종 무한 반복이 종료되면 배열에 저장된 데이터를 출력.
		 */
		String[] sArr = new String[0];
		String subject = "";
		
		while(true) {
			System.out.print("과목명 입력 : ");
			subject = sc.nextLine();
			if(!subject.equals("종료")) {
				// 배열 크기를 늘려서 깊은 복사를 하기위한 영역
				String[] copyArr = new String[sArr.length + 1];
				for(int i = 0; i < sArr.length; i++) {
					copyArr[i] = sArr[i];
				}
				sArr = copyArr;
				sArr[sArr.length - 1] = subject;
			} else {
				break;
			}
		}
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.println("sArr[" + i + "]:" + sArr[i]);
		}
	}
	
	public static void ex10() {
		/*
		 * 1 ~ 49 사이의 정수 값을 사용자 입력을 통해 입력 받고 이를 정수 배열에 저장을 한다.
		 * -1 이 입력될 때 까지 배열의 크기를 +1씩 증가시키면서 사용자 입력 값을 배열에 저장을 하며
		 * -1 이 입력되어 더 이상 사용자 입력을 받지 않을 때 배열에 저장된 모든 값의 합을 출력한다.
		 */
		int[] iArr = new int[0];
		int num;
		
		while(true) {
			System.out.print("정수 입력(-1 입력하면 종료) : ");
			num = sc.nextInt();	sc.nextLine();
			
			if(num != -1) {
				int[] copyArr = new int[iArr.length + 1];
				
				for(int i = 0; i < iArr.length; i++) {
					copyArr[i] = iArr[i];
				}
				
				iArr = copyArr;
				
				iArr[iArr.length - 1] = num;
			} else {
				break;
			}
		}
		
		int tot = 0;
		for(int i = 0; i < iArr.length; i++) {
			tot += iArr[i];
		}
		System.out.println("사용자가 입력한 정수의 총합 : " + tot);
	}
	
	public static void ex11() {
		/*
		 * 사용자로 부터 임의의 문자열을 입력 받은 후
		 * a, e, i, o, u 문자가 포함되어 있을 때마다 문자 배열에 저장을 한 후 배열의 길이를
		 * 출력하여 얼마나 포함되어 있는지 확인하게 한다.
		 * 
		 * Tip 1.) 사용자가 입력한 문자열의 문자를 탐색하기 위해 .charAt(index) 메서드를
		 * 활용한다.
		 * 		String text = "hello";
		 * 		text.charAt(0); // 'h'
		 * 		text.charAt(1); // 'e'
		 * 		text.charAt(2); // 'l'
		 * 
		 * Tip 2.) 문자열의 길이를 알기 위해 .length() 메서드를 사용한다.
		 * 		String text = "hello";
		 * 		text.length(); // 5
		 * 
		 * System.arraycopy() 활용할 수 있으면 활용한다.
		 */
	}
	
	public static void ex12() {
		// 국어, 영어, 수학, 과학, 사회 과목정보가 있는 배열이 있다.
		// 위 배열에서 사용자가 제거하기 원하는 과목을 입력하면 배열에서 제거될 수 있도록 한다.
		
		// System.arraycopy() 활용할 수 있으면 활용한다.
	}
	
	public static void main(String[] args) {
		// 업앤 다운. -> 임의의 값을 하나 생성하고 사용자가 일정 범위의 정수값 안에서 정수를 입력하면
		//            미리 생성된 값과 비교를 통해 업 또는 다운 으로 힌트를 주어 최종 생성값을 맞추는 게임.
		// 바쁜 직장인들을 위해 미리 선정된 점심 메뉴를 임의로 선택하여 제공하는 프로그램.
		//     1. 미리 선정된 메뉴를 사용하여 임의로 제공.
		//     2. 사용자가 직접 메뉴를 입력하여 임의의 메뉴가 선택될 수 있도록 제공.
		
//		int i = rd.nextInt(5);	// 0 ~ 4 범위에서 생성.
//		System.out.println(i);
		ex10();
		// ex9();
		// ex8();
		// ex7();
		// ex6();
		// ex5();
		// ex3();
		// ex2();
		// ex1();
	}

}