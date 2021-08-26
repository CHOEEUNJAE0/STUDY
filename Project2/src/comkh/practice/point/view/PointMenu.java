package comkh.practice.point.view;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	private GregorianCalendar gc = new GregorianCalendar();
	private SimpleDateFormat dt = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS");

	public void mainMenu() {
		String date = dt.format(gc.getTime());
		String menu = "===== 메뉴 =====\n";
		menu += "1. 원\n";
		menu += "2. 사각형\n";
		menu += "9. 끝내기\n";
		menu += "메뉴 번호 : ";
		System.out.println(date + " 시간에 프로그램이 시작하였습니다.");
		while(true) {
			System.out.print(menu);
			switch(this.sc.nextInt()) {
				case 1:
					sc.nextLine();	this.circleMenu();	break;
				case 2:
					sc.nextLine();	this.rectangleMenu();	break;
				case 9:
					this.gc = new GregorianCalendar();
					date = dt.format(gc.getTime());
					System.out.println(date + " 시간에 프로그램이 종료되었습니다.");
					return;
			}
		}
	}
	
	public void circleMenu() {
		String menu = "===== 원 메뉴 =====\n";
		menu += "1. 원 둘레\n";
		menu += "2. 원 넓이\n";
		menu += "9. 메인으로\n";
		menu += "메뉴 번호 : ";
		System.out.print(menu);
		switch(this.sc.nextInt()) {
			case 1:
				sc.nextLine();	this.calcCircum();	break;
			case 2:
				sc.nextLine();	this.calcCircleArea();	break;
			case 9:
				return;
		}
	}
	
	public void rectangleMenu() {
		String menu = "===== 사각형 메뉴 =====\n";
		menu += "1. 사각형 둘레\n";
		menu += "2. 사각형 넓이\n";
		menu += "3. 사각형 쪼개기\n";
		menu += "9. 메인으로\n";
		menu += "메뉴 번호 : ";
		System.out.print(menu);
		switch(this.sc.nextInt()) {
			case 1:
				sc.nextLine();	this.calcPerimeter();	break;
			case 2:
				sc.nextLine();	this.calcRectArea();	break;
			case 3:
				sc.nextLine();	this.calcRectSplit();	break;
			case 9:
				return;
		}
	}
	
	private int[] multiInput(int count) {
		int[] inputs = new int[] {1, 1, 1};
		
		String[] temp = this.sc.nextLine().split(" ");
		
		int idx = 0;
		for(String s: temp) {
			if(idx < inputs.length) {
				inputs[idx++] = Integer.parseInt(s);
			} else {
				break;
			}
		}
		return inputs;
	}
	
	public void calcCircum() {
		int[] inputs = new int[] {1, 1, 1};
		
		System.out.println("공백을 구분자로 사용하여 다음 내용에 맞은 데이터를 입력하세요.");
		System.out.print("x, y 좌표, 반지름을 순서대로 입력하세요. : ");
		inputs = multiInput(3);
		
		String circum = cc.calcCircum(inputs[0], inputs[1], inputs[2]);
		System.out.println(circum);
	}
	
	public void calcCircleArea() {
		int x, y, radius;
		
		System.out.print("x 좌표 : ");
		x = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("y 좌표 : ");
		y = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("반지름 : ");
		radius = this.sc.nextInt();	sc.nextLine();
		
		String area = cc.calcArea(x, y, radius);
		System.out.println(area);
	}
	
	public void calcPerimeter() {
		int x, y, width, height;
		
		System.out.print("x 좌표 : ");
		x = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("y 좌표 : ");
		y = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("높이 : ");
		height = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("너비 : ");
		width = this.sc.nextInt();	sc.nextLine();
		
		String perimeter = rc.calcPerimeter(x, y, height, width);
		System.out.println(perimeter);
	}
	
	public void calcRectArea() {
		int x, y, width, height;
		
		System.out.print("x 좌표 : ");
		x = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("y 좌표 : ");
		y = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("높이 : ");
		height = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("너비 : ");
		width = this.sc.nextInt();	sc.nextLine();
		
		String area = rc.calcArea(x, y, height, width);
		System.out.println(area);
	}
	
	public void calcRectSplit() {
		int x, y, width, height, split;
		
		System.out.print("x 좌표 : ");
		x = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("y 좌표 : ");
		y = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("높이 : ");
		height = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("너비 : ");
		width = this.sc.nextInt();	sc.nextLine();
		
		System.out.print("분리 갯수 : ");
		split = this.sc.nextInt();	sc.nextLine();
		
		String sp = rc.calcSplit(x, y, height, width, split);
		System.out.println(sp);
	}
}