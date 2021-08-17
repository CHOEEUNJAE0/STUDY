package com.kh.exam11;
/*
 * 학생 클래스
 *    학생의 정보를 담아서 관리하기 위한 객체로 사용하기 위한 클래스
 * 
 *   속성(멤버 변수)
 *     이름, 성별, 나이, 과목정보(Subject 클래스의 인스턴스가 담겨있는 객체 배열)
 *   기능(메서드)
 *      getter/setter, 새로운 과목 추가/수정/삭제, 전체 점수 확인, 총점확인, 평균확인
 *   
 */

public class Student {
	//속성(멤버 변수) 작성
	private String name;
	private String gender;
	private int age;
	private Subject[] subjects;
	private int index;
	//과목은 객체 배열을 이용해준다.
	
	//이름,나이는 받아서 사용할거기 때문에 this로 받아주기 
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.subjects = new Subject[0]; // 객체 배열이 고정된 크기를 가지면 초기화 해주기
		                                //동적 배열을 하기 위해 0으로 만들어 줌 
	}

	public String getName() {
		return name; //리턴과 변수 사이에 this는 붙여도 되고 안 붙여도 된다.
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void addSubject(Subject subject) {
		//인덱스 부분에 계속 값을 넣어주는것 말고 위에 별도에 private index 작성 후 배열에 넣어주고 
		//인덱스를 증가 시켜 주면 더 효율적이다.
		Subject[] copy = new Subject[this.subjects.length+1];
		System.arraycopy(this.subjects,0,copy,0,this.subjects.length);
		copy[copy.length -1] = subject;
		this.subjects = copy; //얕은 복사로 채워주기
		
	  
	  }
		//등록된 과목의 총합을 반환한다.
	public int total() {
	 int tot = 0;
	 for(Subject s: subjects) {
		 tot += s.getJumsu();
	}
	 return tot;
	}
	//subjects 객체 배열에 저장된 과목들의 평균
	public double avg() {
		return 0.0;
	}
	//subjects 객체 배열에 저장된 과목의 점수를 반환한다.
	//과목 이름으로 검색하여 반환 할 수 있게 한다. 그래서 과목 이름이 매개 변수로 들어감
	//없는 이름이면 -1 반환
	public int getSubjectJumsu(String subjectName) {
		return 0;
	}
	
	//subjects 객체 배열에 저장된 과목의 이름을 반환
	//위치값으로 과목명을 반환 할 수 있다. (잘못 된 index 번호를 사용하면 null 반환)
	public String getSubjectName(int index) {
		return "";
	}
}
	

