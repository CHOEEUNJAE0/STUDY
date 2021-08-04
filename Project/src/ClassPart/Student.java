package ClassPart;

//public 접근제어자(주로 사용한다)
public class Student { //클래스 이름은 대문자로
	int studentID;    //여러 클래스를 가질 수 있지만	
	String studentName;      //public 클래스는 단 하나이다.
	int grade;        //모든 코드는 클래스 내부에 위치    
	String address;
	
	
	public void showStudentInfo() {
		System.out.println(studentName + ","  + address);
		
	}
	//시작해야하는 코드를 따로 만들어줘야한다.
	//student 클래스를 돌리기 위해서 만들어 주는 메인 메소드.
	public static void main(String[] args) {
		Student studentlee = new Student();
		studentlee.studentName = "이순신";
		studentlee.address="서울시 서초구 서초동";
		
		studentlee.showStudentInfo();
		
	}
	
}
