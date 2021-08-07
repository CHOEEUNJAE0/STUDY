package com.kh.exam01;

class Kukmin {//클래스를 하나 만들어 줌 
	//클래스를 추상화 한 내용 
	//아무 값도 들어 있지 않은 상태.
	//변수는 단어가 바뀔때마다 대문자로 해줘야한다.
	private String pNo;
	private String name;
	private char gender;
	private String address;
	private String phone;
	private int age;
	
	public void method() {
		
		  name = "김철수";
	      pNo = "123456-789456";
	      gender = 'm';
	      address = "서울시 강남구 역삼동";
	      age = 30;
		
	}
	
}

public class ClassSample {

	public static void main(String[] args) {
	    //상단의 추상화 내용에 new 연산자를 붙여서 구체화 시켜준다.	
        Kukmin kim1 = new Kukmin(); // 메모리에 등록해주는 과정
        Kukmin kim2 = new Kukmin(); //클래스를 하나 생성하고 나면 동일한 이름에 
       kim1.method();               //번호를 부여하고 new생성자로 여러개 만들 수 있어서 효율성이 올라간다. 
		                           //그럼 숫자만큼 객체가 생성이 되었다고 한다. 여기는 2개의 객체가 생성 되었다고 한다.
		
	}

}
