package com.kh.exam1;

// 1. 편의점에서 판매하는 커피 상품에 대한 클래스를 작성
// 2. 임의의 직업에 대한 클래스
// 멤버 메서드에 대해서는 구체화 된 기능은 필요 x, 메서드 이름만 작성
//메서드의 경우는 public method(); 형식으로 작성
//멤버 변수는 최소 5개, 멤버 메서드는 최소 3개 정도 작성한다.
class Coffee {// 객체 주제에 대한 내용을 추상화 한 것.
	private String name;
	private int price; 
	private String taste; 
	private String brand; 
	private int size; 

//객체를 가지고 할 수 있는 동작하는 기능이 메소드이다.
public void 뚜껑열기 () {}   
public void 뚜껑닫기 () {}
public void 마시기 () {}
}

class 개발자 {
	
	private String 분야;
	private int 월급;
	private int 근무시간;
	private String 근무지역;
	private String 직급;
	
	public void 출근 () {}   
	public void 퇴근 () {}
	public void 야근 () {}
	
}





public class ClassPrac1 {

	public static void main(String[] args) {
		//만든 클래스 사용 방법
		
		Coffee c = new Coffee();
		c.뚜껑열기();
		
		개발자 노예1 = new 개발자();
		노예1.출근();
		
		
		
		
	}

}
