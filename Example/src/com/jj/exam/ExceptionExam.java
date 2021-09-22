package com.jj.exam;

public class ExceptionExam {
	
	public static void exceptionexam1() {
	String data = null;
	System.out.println(data.toString());
	}

	public static void arrayindexoutboundsexceptionexam1() {
		int[] arr = {1,2,3};
		int result = arr[0]+arr[3];
	}
	
	public static void numberformatexceptionexam() {
		
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		System.out.println(value1);
		
		int value2 = Integer.parseInt(data2);
		System.out.println(value2);
				
	}

	public static void main(String[] args) {
		//exceptionexam1();
		//arrayindexoutboundsexceptionexam1();
		numberformatexceptionexam();
		

		
	}


}


