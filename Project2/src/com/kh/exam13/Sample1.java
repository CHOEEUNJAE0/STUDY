package com.kh.exam13;

public class Sample1 {

	public static void main(String[] args) {
		//배열도 다형성 사용 가능
		Square[] sArr = new Square[2];
		sArr[0] = new Square(10,20); sArr[1] = new Square(20,30); 
		System.out.println(sArr[0].getArea() + "|" + sArr[1].getArea());
		
		Triangle[] tArr = new Triangle[2];
		tArr[0] = new Triangle(10,20); tArr[1] = new Triangle(20,30); 
		System.out.println(tArr[0].getArea() + "|" + tArr[1].getArea());
		
		
		Shape[] sArr1 = new Shape[2];
		sArr1[0] = new Square(10, 20); sArr1[1] = new Triangle(20, 30);
		

	}
}
