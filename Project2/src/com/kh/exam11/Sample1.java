package com.kh.exam11;
import java.util.Scanner;
public class Sample1 {
	
	static Scanner sc = new Scanner`(System.in);
	
	public static void main(String[] args) {
		Subject[] subjects = new Subject[3];
		subjects[0] = new Subject("국어", 70);
		subjects[1] = new Subject("영어", 80);
		subjects[2] = new Subject("수학", 90);

		// 사용자 입력을 받아서 과학 과목과 점수 85 를 입력받아서 배열의 마지막 인덱스에 추가
		// 1. 사용자 입력을 받아서 과학 과목과 점수 85 를 입력받아서 배열의 마지막 인덱스에 추가
		// 단 점수의 경우 0 ~ 100 사이의 입력이 아니면 계속 입력	받을 수 있게 한다.
		// 과목명에서 종료라는 문자열이 입력되기 전까지 계속 정보를 입력받아 Subject 클래스의

		// 2. 과목명에서 종료라는 문자열이 입력되기 전까지 계속 정보를 입력받아 Subject 클래스의
		// 인스턴스가 Subjects 객체 배열에 추가될 수 있게 한다.(동적 배열)

		// 3. 새로운 과목을 추가 할 때 기존에 저장된 과목이 이미 존재하는 경우 다시 과목명을 입력
		// 하도록 한다.(배열에 저장된 Subject 객체를 전체 탐색해야 함. - 반복 필요.)
		while(true) {
			boolean existed = false;
			System.out.print("과목명 입력 : ");
			String name = sc.nextLine();
			if(!name.equals("종료")) {
				Subject[] copy = new Subject[subjects.length + 1];
				System.arraycopy(subjects, 0, copy, 0, subjects.length);

				int last = copy.length - 1;
				copy[last] = new Subject(name, -1);
				while(!copy[last].isValid()) {
					System.out.print(copy[last].getName() + " 점수 : ");
					copy[last].setJumsu(sc.nextInt());	sc.nextLine();
					if(!copy[last].isValid()) {
						System.out.println("점수는 " + Subject.getRangeJumsu()[0] +
								" ~ " + Subject.getRangeJumsu()[1] + "범위로 입력해야 합니다.");
				for(int i = 0; i < subjects.length; i++) {
					if(name.equals(subjects[i].getName())) {
						existed = true;
					}
				}
				if(!existed) {
					Subject[] copy = new Subject[subjects.length + 1];
					System.arraycopy(subjects, 0, copy, 0, subjects.length);
					int last = copy.length - 1;
					copy[last] = new Subject(name, -1);
					while(!copy[last].isValid()) {
						System.out.print(copy[last].getName() + " 점수 : ");
						copy[last].setJumsu(sc.nextInt());	sc.nextLine();
						if(!copy[last].isValid()) {
							System.out.println("점수는 " + Subject.getRangeJumsu()[0] +
									" ~ " + Subject.getRangeJumsu()[1] + "범위로 입력해야 합니다.");
						}
					}
					subjects = copy;
				} else {
					System.out.println("이미 존재하는 과목명 입니다.");
				}
				subjects = copy;
			} else {
				break;
			}
		}
		
		
		
		for(int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i].getName() + " 점수 : " +
					subjects[i].getJumsu());
			System.out.println("등급 : " + subjects[i].getGrade());
		}
	}
			
				Student std = new Student("홍길동", 30);
				
				//과목 추가 추가니깐 add 붙여주기,
				Subject sub = new Subject("국어", 70); // 필요한 과목 정보 추가
			    std.addSubject(sub);                  //바로 위에 sub를 넣어 줌 //student 클래스에 퍼블릭~ 으로 적어주기
			    sub = new Subject("영어", 65);
			    std.addSubject(sub);
			    sub = new Subject("수학", 85);
			    std.addSubject(sub);
			    sub = new Subject("과학", 71);
			    std.addSubject(sub);
			    sub = new Subject("사회", 80);
			    std.addSubject(sub);
			    
			    System.out.println(std.getName() + "학생의 총점은" + std.total()+ "입니다.");
			    
			}
}
}