package com.kh.exam14;
                                        //인터페이스때메 구현해줘야함
public class StudentC extends Foreigner implements Sports, Art {

	//art랑 run 구현해줌
	
	@Override
	public void draw() {
		System.out.println(this.getName() + "미술부는 그릴 수 있습니다.");
		System.out.println(this.getAge() + "중고등부 입니다.");
		
	}

	@Override
	public void run() {
		System.out.println(this.getName() + "운동부는 뛸 수 있습니다.");
	
		
	}
	

}
