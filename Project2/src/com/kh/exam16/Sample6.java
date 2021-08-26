package com.kh.exam16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Sample6 {

	
	public static void ex1() {
		Date date = new Date();
		System.out.println(date);// 이렇게 하면 현재 시간 출력
		
		//1970년 1월 1일 0시 0분 0초 0000밀리초를 기준으로 얼마나 지났는지 표기 
		System.out.println(date.getTime());

		String sDate = "%tY년";
		System.out.println(String.format(sDate,  date));
		sDate = "%tm월";
		System.out.println(String.format(sDate,  date));
		sDate = "%td일";
		System.out.println(String.format(sDate,  date));
		sDate = "%tH시";
		System.out.println(String.format(sDate,  date));
		sDate = "%tM분";
		System.out.println(String.format(sDate,  date));
		sDate = "%tS초";
		System.out.println(String.format(sDate,  date));
		sDate = "%tL밀리초";
		System.out.println(String.format(sDate,  date));
		sDate = "%tY-%tm-%td %tH:%tM:%tS.%tL";
		System.out.println(String.format(sDate,  date));
	}
	public static void ex2() {
		Calendar date = Calendar.getInstance();
		
		int year = date.get(Calendar.YEAR);
		System.out.println(year + "년");
		int month = date.get(Calendar.MONTH);
		System.out.println(month + "월");
		int day = date.get(Calendar.DATE);
		System.out.println(day + "일");
		int hour = date.get(Calendar.HOUR);
		System.out.println(hour + "시");
		int minute = date.get(Calendar.MINUTE);
		System.out.println(minute + "분");
		int second = date.get(Calendar.SECOND);
		System.out.println(second + "초");
		int mills = date.get(Calendar.MILLISECOND);
		System.out.println(mills + "밀리초");
		
		System.out.println("현재 날짜 : " +  date.getTime());
		date.add(Calendar.YEAR, 1);
		System.out.println("다음 년도 날짜 : " + date.getTime());
		
		//다시 추가 해 줄려면 genInstance 통해서 날짜 다시 받아와야함
		date = Calendar.getInstance();
		date.add(Calendar.MONTH, 2);
		System.out.println("2개월 뒤 : " + date.getTime());
		
		date = Calendar.getInstance();
		date.add(Calendar.DATE, 7);
		System.out.println("일주일 뒤 : " + date.getTime());
		
	}

	public static void ex3() {
		GregorianCalendar gc = new GregorianCalendar();
		
		GregorianCalendar date;
		int year = date.get(Calendar.YEAR);
		System.out.println(year + "년");
		int month = date.get(Calendar.MONTH);
		System.out.println(month + "월");
		int day = date.get(Calendar.DATE);
		System.out.println(day + "일");
		int hour = date.get(Calendar.HOUR);
		System.out.println(hour + "시");
		int minute = date.get(Calendar.MINUTE);
		System.out.println(minute + "분");
		int second = date.get(Calendar.SECOND);
		System.out.println(second + "초");
		int mills = date.get(Calendar.MILLISECOND);
		System.out.println(mills + "밀리초");
		System.out.println("현재 날짜 : " +  date.getTime());
		date.add(Calendar.YEAR, 1);
		System.out.println("다음 년도 날짜 : " + date.getTime());
		
		//다시 추가 해 줄려면 genInstance 통해서 날짜 다시 받아와야함
		date = new GregorianCalendar();
		date.add(Calendar.MONTH, 2);
		System.out.println("2개월 뒤 : " + date.getTime());
		
		date = new GregorianCalendar();
		date.add(Calendar.DATE, 7);
		System.out.println("일주일 뒤 : " + date.getTime());
		
		System.out.println(date.getTimeZone());
	    date.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		date= new GregorianCalendarr(TimeZone.getTimeZone("America/Los_Angeles");
		System.out.println(date.getTime());
	}
	public static void ex4() {
	    GregorianCalendar gc = new GregorianCalendar();
	    SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
	    
	    String date = dFormat.format(gc.getTime());
	    System.out.println(date);
	    
	    dFormat.applyPattern("yyyy-MM-dd HH:mm:ss.SSS");
	    date = dFormat.format(gc.getTime());
	    System.out.println(date);
	    
	 
}
	
	
       public static void main(String[] args) {
    	   //ex1();
    	   //ex2();
    	   //ex3();
    	   ex4();
       }
}
