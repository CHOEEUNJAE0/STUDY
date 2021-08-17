package comkh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {

	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainmenu() {
		String menu = "";
		menu += "1.원 \n";
		menu += "2.사각형 \n";
		menu += "9. 끝내기 \n";
		menu += "메뉴 번호 :  \n";
		System.out.print(menu);
		switch(this.sc.nextInt()) {
		case 1:
			sc.nextLine();	this.circleMenu();  break;
		case 2:
			sc.nextLine();  this.rectangleMenu();  break;
		case 9:
			return;
		}
	}

	public void circleMenu() {
			String menu = "";
			menu += "1.원 둘레\n";
			menu += "2. 원 넓이 \n";
			menu += "9. 메인으로 \n";
			menu += "메뉴 번호 : ";
			System.out.print(menu);
			switch(this.sc.nextInt()) {
			case 1:
				sc.nextLine();  this.calcCircum();  break;
			case 2:
				sc.nextLine();  this.calcCircleArea();  break;
			case 9:
				return;
	}
		}
	
	public void rectangleMenu() {
	}
	
	public void calcCircum() {
	}
	
	public void calcCircleArea() {
		
	}
	
	public void calcPerimeter() {
		
	}
	public void calcArea() {
		
	}
}
