package com.kh.exam09;

public class Prac1 {
	
	public void isEven (int number) {
		if(number %2 ==0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	public void isOdd (int number) {
			if(number % 2 == 1) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
	}
			
	public void isMulti1 (int number) {
		 if(number % 2 == 0) {
			System.out.println("ture");
		   } else {
			System.out.println("false");
				}
		 //어차피 isEven이랑 같은 노직이기 때문에 
		 //this.isEven(x); 라고 적어도 된다.
	}
	public void isMulti2 (int h, int multi) {
			if(h % multi == 0) {
				System.out.println(true);
			  } else {
				System.out.println(false);
			}	 
	}
	public void isMulti3 (int k, int multi) {
			if(k % multi == 0) {
			 System.out.println(true);
			} else {
				System.out.println(false);
		}

	       }
	public void max (int num1, int num2) {
		if (num1 > num2 ) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	public void max(int[] numbers) {
		int m =  numbers[0]; 
	for(int i = 1; i < numbers.length; i++) {
		if(m >numbers[i]) {
			m= numbers[i];
		}
		System.out.println(m);
	}
}
	public void min(int num1, int num2) {
		if (num1 < num2 ) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
		public int min(int[] numbers) {
			int m = numbers[0];
			for(int i = 1; i < numbers.length; i++) {
				if(m > numbers[i]) {
					m = numbers[i];
				}
			}
			return m;
		}
	}





