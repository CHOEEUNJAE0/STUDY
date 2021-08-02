package com.kh.exam6;

import java.util.Scanner;

public class PracIF1 {

	static Scanner sc = new Scanner(System.in);
	public static void ex1() {
		System.out.println("문제 1.");
		/*
		 * 영문자 알파벳 범위의 ASCII 코드 번호를 입력받은 경우에만 해당하는 문자를
		 * 출력하고 범위를 벗어난 경우에는 "ASCII 코드 영문자 범위를 벗어났습니다."
		 * 라는 메시지를 출력한다. 
		 */
		int code;
		System.out.println("영문자 범위의 ASCII 코드 번호 입력 : ");
		code = sc.nextInt(); sc.nextLine();
		
		if ( code >= 'A' && code <= 'Z') {
			System.out.printf("입력한 ASCII 코드 %d의 영문자는 %c 입니다.\n", code, code);
			//if문에 code가 두개 들어갔기때문에 syso에도 code를 두번 넣어줘야한다.
		}else if( code >= 'a' && code <='z') {
			System.out.printf("입력한 ASCII코드 %d의 영문자는 %c 입니다.\n" , code, code);
		}else {
			System.out.println("ASCII 코드 영문자 범위를 벗어났습니다. ");
		}
		

	}
	public static void ex2() {
		System.out.println("문제 2.");
		/*
		 * 국어, 영어, 수학 세 과목의 시험 점수를 입력 받아 총점과 평균을 구하고
		 * 평균이 60점 이상인 경우에 "합격입니다." 메시지를 출력하고 60점 이상이
		 * 아닌 경우에 "불합격입니다." 메시지를 출력한다.
		 */
		
		double kor,eng,mth;
		double tot, avg;
		String msg = "불합격";
		
		System.out.println("국어 : ");
		kor = sc.nextDouble(); sc.nextLine();
		
		System.out.println("영어 : ");
		eng = sc.nextDouble(); sc.nextLine();
		
		System.out.println("수학 : ");
		mth = sc.nextDouble(); sc.nextLine();

		tot = kor+eng+mth ;
		avg = (kor+eng+mth)/3.0;
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		
		if (avg >= 60) {
			msg = "합격";
		}
		System.out.println(msg + "입니다.");
			
		}
		
	public static void ex3() {
		System.out.println("문제 3.");
		/*
		 * 2021년 7월에 한하여 1 ~ 31 일 범위의 일자값을 입력받고 해당 일자의
		 * 요일을 출력하게 한다. 입력값의 범위를 벗어난 경우 "1 ~ 31 사이의 값을
		 * 입력하세요." 라는 메시지를 출력한다.
		 */
	   int day;
	   
	   System.out.println("요일 입력(1~31) : ");
	   day =sc.nextInt(); sc.nextLine();
	   
	   if(day >=1 && day <=31 ) {
		   if(day % 7 == 0) {
			   System.out.println("수요일 입니다.");
		   }else if(day % 7 == 1) {
			   System.out.println("목요일 입니다.");
		   }else if(day % 7 == 2) {
			   System.out.println("금요일 입니다.");
		   }else if(day % 7 == 3) {
			   System.out.println("토요일 입니다.");
		   }else if(day % 7 == 4) {
			   System.out.println("일요일 입니다.");
		   }else if(day % 7 == 5) {
				System.out.println("월요일 입니다.");
		   }
		   }else {
			   System.out.println("1~31 사이의 값을 입력하세요.");
		   }

	   }
	   //switch 문으로 바꿔서 쓸 수도 있다.
//		   switch(day % 7) {
//		   case 0 :
//			   System.out.println("수요일 입니다.");
//		   case 1 :
//			   System.out.println("목요일 입니다.");
//		   case 2 :
//			   System.out.println("금요일 입니다.");
//		   case 3 :
//			   System.out.println("토요일 입니다.");
//		   case 4 :
//			   System.out.println("일요일 입니다.");
//		   case 5 :
//			   System.out.println("월요일 입니다.");
//		   }
//		   switch (day % 7) {
//		   //여러 케이스를 작성.
//		   case 3 : case 4 :
//			   System.out.println("주말입니다."); break;
//			   default :
//				   System.out.println("주중입니다.");
//		   }
//	   }else {
//		   System.out.println("1~31 사이의 값을 입력하세요.");
//	   }
	
	public static void ex4() {
		/*
		 * 나이를 입력하면 해당 나이대를 출력하도록 한다.
		 * 
		 * 예 1.)
		 * 		나이 입력 : 21
		 * 		20대 입니다.
		 * 
		 * 예 2.)
		 * 		나이 입력 : 12
		 * 		청소년 입니다.
		 * 
		 * 1 ~ 4 세까지는 영유아, 5 ~ 9 세까지는 어린이, 10 ~ 19 세까지는 청소년
		 * 20 ~ 100 까지는 20대, 30대, 40대, 50대 형식으로 변환하여 출력한다.
		 */

		int age;
		
		System.err.println("나이 입력(1~00) : ");
		age = sc.nextInt(); sc.nextLine();
		
		if (age >=1 && age <=4) {
			System.out.println("영유아 입니다.");
		}else if (age >=5 && age <=9) {
			System.out.println("어린이 입니다.");
		}else if (age >=10 && age <=19) {
			System.out.println("청소년 입니다.");
		}else if (age >=20 && age <=29) {
			System.out.println("20대 입니다.");
		}else if (age >=30 && age <=39) {
			System.out.println("30대 입니다.");
		}else if (age >=40 && age <=49) {
			System.out.println("40대 입니다.");
		}else if (age >=50 && age <=59) {
			System.out.println("50대 입니다.");
		}else if (age >=60 && age <=69) {
			System.out.println("60대 입니다.");
		}else if (age >=70 && age <=79) {
			System.out.println("20대 입니다.");
		}else if (age >=80 && age <=89) {
			System.out.println("80대 입니다.");
		}else if (age >=90 && age <=99) {
			System.out.println("90대 입니다.");
		//}
		//20대~90대까지는
		//else if (age >=20 && age <=100 )
		//System.out.println(age / 10 * 10 + "대 입니다.");
		// 와 같이 공식을 찾아서 해주면 간략하게 쓸 수 있음.
	    } else {
	    	System.out.println("1~100사이의 값을 입력하세요.");
	    }

	}
	public static void ex5() {
		/*
		 * 키(cm)와, 체중(kg)을 입력하여 BMI 지수를 구하고 BMI 지수에 해당하는 정상, 과체중,
		 * 비만, 고도비만 등의 정보를 출력하도록 한다.
		 * 
		 * BMI 지수의 계산식 -> BMI = 체중(kg) / (키(m) * 키(m))
		 * 
		 * BMI 지수에 따른 정보
		 * 		18.5 미만 : 저체중
		 * 		18.5 이상 ~ 23 미만 : 정상
		 * 		23 이상 ~ 25 미만 : 과체중
		 * 		25 이상 ~ 30 미만 : 비만
		 * 		30 이상 : 고도비만
		 */
	double tall, weight;
	double bmi;
	
	System.out.println("키 입력(cm) : ");
	tall = sc.nextDouble(); sc.nextLine();
	tall = tall /100.0; //cm->m로 변환
	
	System.out.println("몸무게 입력(kg) : ");
	weight = sc.nextDouble(); sc.nextLine();
	
	bmi = weight/ (tall*tall);
	
   System.out.println("bmi : " + bmi + "->");
    if(bmi < 18.5) {
    	System.out.println("저체중 입니다.");
    }else if (bmi >=18.5 && bmi < 23) {
    	System.out.println("정상입니다.");
    }else if (bmi >=23 && bmi < 25) {
    	System.out.println("과체중 입니다.");
    }else if (bmi >=25 && bmi < 30) {
    	System.out.println("비만 입니다.");
    }else if (bmi >= 30) {
    	System.out.println("고도비만 입니다.");
      }
	}
	public static void ex6() {
		/*
		 * 시간과 분을 따로 입력받고 추가로 분을 더 입력받아 입력받은 시간에서 추가로 입력한 분의
		 * 더한 시간을 출력하도록 한다. 입력 시간은 24시간 형식을 입력 받고 출력 시간은 오전/오후
		 * 를 구분하는 12시간 형식을 출력하도록 한다.
		 * 		- 24시간 형식의 12시 30분은 12시간 형식의 오후 12시 30분 이다.
		 * 		- 24시간 형식의 00시 30분은 12시간 형식의 오전 12시 30분 이다.
		 * 		- 24시간 형식의 23시 30분은 12시간 형식의 오후 11시 30분 이다.
		 * 		- 24시간 형식의 11시 30분은 12시간 형식의 오전 11시 30분 이다.
		 * 
		 * 예 1.)
		 * 		시간 입력 : 23
		 * 		분 입력 : 50
		 * 		추가 분 입력 : 20
		 * 		입력 시간에서 20분을 추가한 시간은 오전 12시 10분 입니다.
		 * 
		 * 0 ~ 23 시간의 입력 범위를 넘기면 지정한 범위의 값을 입력하도록하는 메시지 출력
		 */
	
		int  hour, minute, addMinute;
		
		System.out.println("시간 입력 : ");
		hour = sc.nextInt(); sc.nextLine();
		
		System.out.println("분 입력 : ");
		minute = sc.nextInt(); sc.nextLine();
		
		System.out.println("추가 분 입력 : ");
		addMinute = sc.nextInt(); sc.nextLine();
		

		if(hour >= 0 && hour <= 23) {
			if(minute >= 0 && minute < 60) {
				
				// 입력 분에 추가분 더함.
				minute = minute + addMinute;
				
				// 추가분을 더한 결과가 60을 넘으면 시간으로 환원시키기 위해 작성된 코드
				if(minute >= 60) {
					hour = hour + (minute / 60);
					minute = minute % 60;
				}
				
				// 24 시간이 넘어가면 24로 나머지 계산하여 나머지 값만 취함.
				if(hour >= 24) {
					hour = hour % 24;
				}

				if(hour == 0) {
					System.out.printf("입력 시간에서 %d 분을 추가한 시간은 오전 12시 %d분 입니다.",
							addMinute, minute);
				} else if(hour == 12) {
					System.out.printf("입력 시간에서 %d 분을 추가한 시간은 오후 12시 %d분 입니다.",
							addMinute, minute);
				} else if(hour >= 1 && hour <= 11) {
					System.out.printf("입력 시간에서 %d 분을 추가한 시간은 오전 %d시 %d분 입니다.",
							addMinute, hour, minute);
				} else if(hour >= 13 && hour <= 23) {
					System.out.printf("입력 시간에서 %d 분을 추가한 시간은 오후 %d시 %d분 입니다.",
							addMinute, hour - 12, minute);
				}

			} else {
				System.out.println("0 ~ 59 사이의 분을 입력하세요.");
			}
		} else {
			System.out.println("0 ~ 23 사이의 시간을 입력하세요.");
		}
	}
	public static void ex7() {
		char op;
		
		System.out.print("사칙연산 기호를 입력하세요. : ");
		
		// 문자 입력 받기
		op = sc.nextLine().charAt(0);
		
		switch(op) {
			case '+':
				System.out.println("더하기 기호를 입력했습니다.");	break;
			case '-':
				System.out.println("빼기 기호를 입력했습니다.");	break;
			case '*':
				System.out.println("곱하기 기호를 입력했습니다.");	break;
			case '/':
				System.out.println("나누기 기호를 입력했습니다.");	break;
			default:
				System.out.println("사친연산 기호가 아닙니다.");
		}
	}
	public static void ex8() {
		String op;
		
		System.out.println("더하기, 빼기, 곱하기, 나누기중 하나를 선택하여 입력하세요.");
		System.out.print(": ");
		
		op = sc.nextLine();
		
		switch(op) {
			case "더하기":
				System.out.println("더하기는 + 기호를 사용합니다.");	break;
			case "빼기":
				System.out.println("빼기는 - 기호를 사용합니다.");		break;
			case "곱하기":
				System.out.println("곱하기는 * 기호를 사용합니다.");	break;
			case "나누기":
				System.out.println("나누기는 / 기호를 사용합니다.");	break;
			default:
				System.out.println("더하기, 빼기, 곱하기, 나누기중 하나를 입력하세요.");
		}
	}
	
	public static void ex9() {
		/*
		 * 단위 변환 프로그램 만들기
		 * 
		 * 1. cm -> m 로 변환 또는 m -> cm 로 변환 하는 기능을 만든다.
		 * 2. g -> kg 으로 kg -> g 으로 변환하는 기능을 만든다.
		 * 3. Byte -> MByte 로 MByte 를 Byte로 변환하는 기능을 만든다.
		 * 
		 * 각각의 기능은 처음 입력하는 단위가 무엇인가에 따라 바뀌게 된다.
		 * 
		 * 예 1.)
		 * 		단위변환 입력 : cm
		 * 		cm 값을 입력하면 m 값으로 변환 합니다.
		 * 		cm 입력 : 100
		 * 		결과 : 1.0m 입니다.
		 * 
		 * 예 2.)
		 * 		단위변환 입력 : KByte
		 * 		KByte 값을 입력하면 Byte 값으로 변환 합니다.
		 * 		KByte 입력 : 1
		 * 		결과 : 1024.0Byte 입니다.
		 */
		String unit;
		double value;
		
		System.out.print("단위변환 입력 : ");
		unit = sc.nextLine();
		
		switch(unit) {
			case "cm":
				System.out.println("cm 값을 입력하면 m 값으로 변환 합니다.");
				System.out.print(unit + " 입력 : ");
				value = sc.nextDouble();	sc.nextLine();
				System.out.println("결과 : " + value / 100.0 + "m 입니다.");
				break;
			case "m":
				System.out.println("m 값을 입력하면 cm 값으로 변환 합니다.");
				System.out.print(unit + " 입력 : ");
				value = sc.nextDouble();	sc.nextLine();
				System.out.println("결과 : " + value * 100.0 + "cm 입니다.");
				break;
			case "g":
				System.out.println("g 값을 입력하면 kg 값으로 변환 합니다.");
				System.out.print(unit + " 입력 : ");
				value = sc.nextDouble();	sc.nextLine();
				System.out.println("결과 : " + value / 1000.0 + "kg 입니다.");
				break;
			case "kg":
				System.out.println("kg 값을 입력하면 g 값으로 변환 합니다.");
				System.out.print(unit + " 입력 : ");
				value = sc.nextDouble();	sc.nextLine();
				System.out.println("결과 : " + value * 1000.0 + "g 입니다.");
				break;
			case "Byte":
				System.out.println("Byte 값을 입력하면 KByte 값으로 변환 합니다.");
				System.out.print(unit + " 입력 : ");
				value = sc.nextDouble();	sc.nextLine();
				System.out.println("결과 : " + value / 1024.0 + "KByte 입니다.");
				break;
			case "KByte":
				System.out.println("KByte 값을 입력하면 Byte 값으로 변환 합니다.");
				System.out.print(unit + " 입력 : ");
				value = sc.nextDouble();	sc.nextLine();
				System.out.println("결과 : " + value * 1024.0 + "Byte 입니다.");
				break;
			default:
				System.out.println("단위를 잘못 입력하였습니다.");
		}
	}
	
	
				
	
     public static void main(String[] args) {
  


          //ex1();
          //ex2();
          //ex3();
          //ex4();
          //ex5();
          //ex6();
          //ex7();
          ex8();
    	//ex9();
          
          
    }
}