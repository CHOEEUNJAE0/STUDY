package com.kh.exam4;

public class Casting {

	public static void main(String[] args) {
	      int x = 100;
	      int y = 200;
	      //byte z = x + y; //바이트가 더 작다보니 이클립스가 타입이 안맞다고 빨간줄로 표시됨
	      byte z = (byte)(x + y); //손실 되는거 감수하기
	      
	      System.out.println(z);
	      
	      float f1 = z;
	      System.out.println(z);//float는 더 크니까 잘 출력 된다
	      
	      //int res = f1 + 10;//타입 안맞음
	      int res = (int)(f1 + 10);//이렇게 형변환
	      System.out.println(res);
	      
	      //이런 변환들은 기본데이터 타입일때 가능

	      
	      
	}

}
