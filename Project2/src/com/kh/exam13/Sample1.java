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
		
	
		//배열의 길이가 7인 Shape[] 객체 배열을 생성
		//삼각형, 사각형, 원 객체가 번갈아가며, 순차적으로 저장되도록 한다.
		//삼각형, 사각형의 경우 너비, 높이가 각 객체에 저장 후 넓이를 출력
		//원의 경우 반지름을 각 객체에 저장 후 넓이와 PI 값을 출력
		//너비,높이,반지름은 반복문이 반복 할 때 마다 3씩 증가하면서 커진 값이 사용 되도록 한다.
		
		
		Shape[] shapes = new Shape[7];
		int cnt = 0;
		for(int i = 0; i < shapes.length; i++) {
			int val = (i+1) +( i *3 ) ;// 마지막 지문의 3씩 증가하면서 커진 값 구하느라 *3
			
			if( i % 3 == 0 ) {
				shapes[i] = new Triangle(val, val);
			}else if( i % 3 == 1) {
				shapes[i] = new Square(val, val);
			}else if (i % 3 == 2) {
				shapes[i] = new Circle(val);
			}
			//for each 문 이용, 부모 자식이 같으면 너비 둘레 모두 출력 해달라고
		for(Shape s : shapes) {
			if(s instanceof Circle) {
				Circle c =(Circle) s; 
				System.out.println(c.getArea() + "|" + c.getPI());
			}else {
				System.out.println(s.getArea());
			}
		}
			
		}
	}
}
