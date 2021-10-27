package com.jj.exam;

public class OutputMethod {
	
	public static String a(String alph) {
		//이렇게 하면 a 메소드는 리턴 뒤의 내용이 된다.
		//return 뒤에 오는 데이터 값으로 static 뒤에 정의 해줘야한다.
		return alph;
	}
	//여기는 one의 값이 정수로 오게 할 것이기 때문에 void 자리를 int로 지정 해 준다.
	public static int one() {
		return 12;
		
	}
	/*
	 * java output 메서드의 핵심
	 * 1. return 값 뒤에 오는 값이 실행 결과가 되기 때문에 데이터 타입을 void 자리에 지정 해 준다.
	 * 2. return 값은 메서드를 종료 시키는 역할을 한다.
	 * 3. 메서드는 메서드의 return 값의 데이터 타입을 지정 해 줘야하는데 rerturn값의 데이터 타입이 없을
	 * 		경우 그냥 void로 지정 해 주면 된다.
	 */
	
	public static String printTwoTimes(String text, String delimeter) {
		String out = "";
		out = out + delimeter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
		
	}
	public static void main(String[] args) {
		
		System.out.println(one());
		a("b");
		printTwoTimes("a","&");
		System.out.println(printTwoTimes("a","&"));
	
	}

}
