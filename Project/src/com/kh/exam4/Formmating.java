package com.kh.exam4;

public class Formmating {

	public static void main(String[] args) {
		int age = 32;
	      String name = "서지우";
	            
	         //System.out.printf("%s 님의 나이는 %d 입니다. \n", name , age);   
	       System.out.println(name + " 님의 나이는 " + age + " 세 입니다");
	       //위아래 둘다 가능함
	      
	      double temp = 37.8;
	      System.out.printf("현재의 온도는 %f 도 입니다.\n", temp);
	      System.out.printf("현재의 온도는 %.2f 도 입니다.\n", temp);
	      
	      
	   
	}

}
