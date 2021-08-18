package com.kh.exam14;

public class Sample1 {

	public static void main(String[] args) {
		//클래스와 인터페이스 구현 후 샘플에서 작업
		
		//1.모든 것은 person 객체로 상속으로 받고 있는 구조기 때문에 person으로 배열을 만들어 준다.
		
		Person[] p = new Person[5];
		p[0] = new StudentA();
		p[0].setName("홍길동"); p[0].setAge(16); p[0].setGender('남'); 
		
		p[1] = new StudentB();
		p[1].setName("이미자"); p[1].setAge(18); p[0].setGender('여'); 
		//외국인. 포리너로 다운캐스킹 해주고 채류기간 넣어줌
		((Foreigner)p[1]).setDurationDay(90);
		
		p[2] = new StudentC();
		p[2].setName("김짱구"); p[2].setAge(15); p[2].setGender('남'); 
		//((Foreigner)p[1]).setDurationDay(90);
		
		p[3] = new StudentA(); //같은 상속 관계라 그냥 반복 넣어줌(?)
		p[3].setName("김짱아"); p[3].setAge(14); p[0].setGender('여'); 
		//내국인 주민번호는 우선 스킵..
		
		p[4] = new StudentB();
		p[4].setName("안 산"); p[4].setAge(20); p[4].setGender('여'); 
		//((Foreigner)p[4]).setDurationDay(90);

		
		//외국인들한테 일일이 써 주지 않고 포문이랑 인스턴스오브를 활용해서 해도 돼
		for(Person ps : p) {
			if(ps instanceof Foreigner) {
				((Foreigner) ps).setDurationDay(90);
			}
		}
		for(Person ps : p) {
			if(ps instanceof Sports) {
				((Sports) ps).run();
				
			}
				if(ps instanceof Art) {
					((Art) ps).draw();
					
		}
		
	}

	}
}
