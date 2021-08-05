package com.kh.exam7;

class Other {
	public void method() {
		System.out.println("메서드 실행이 잘 되었습니다."); 
	}
	
	public static void function() {
		System.out.println("함수 실행이 잘 되었습니다.");
	}
	public final void method1() {
		System.out.println("final은 상속 관계에서 오버라이딩(덮어씀)을 하지 못하게 한다.");
		//한번 초기화 한 것은 다른 데이터로 초기화 시키는 것을 못하게 되는 것.
		//변수에서도 final을 쓰는데 동일하게 작동
		//int final x =1; 이면 x에 다른 값을 초기화 할 수 없다.
		//메서드와 변수의 final의 차이는 메서드는 상속관계라는게 하나 더 들어 간다.
	}
}

public class Sample1 {
	public static void ex1() {
		System.out.println("문제 1.");
	}
	
	

	public static void main(String[] args) {
		Other oth = new Other(); // 클래스 아더를 사용하기 위해선 인스턴스 화를 시켜줘야한다.
        oth.method();//메서드 안에 syso를 출력 하기 위해 써 줌
        
        Other.function();
        //위에 펑션은 static을 붙여 줬기 때문에 별도의 인스턴스화를 거치지 않아도 메인에서 사용 할 수 있다.
        
        ex1(); // java 기본 코드 문제 풀 때 사용 해봄
        //자신의 클래스 안에 정의 도니 static메서드 이기 떄문에
        //자신의 클래스 이름은 생략해도 되었던 것.
        
        Sample1.ex1();
        
        
	}
	
}