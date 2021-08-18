package com.kh.exam14;

//person 상속 받음. 
public class Foreigner extends Person {
	private String fNumber;
	private int durationDay;//채류기간
	
	public String getfNumber() {
		return fNumber;
	}

	public void setfNumber(String fNumber) {
		this.fNumber = fNumber;
	}

	public int getDurationDay() {
		return durationDay;
	}

	public void setDurationDay(int durationDay) {
		this.durationDay = durationDay;
	}

	public void extDuration(int day) { //채류기간 연장
		this.durationDay += day; //기존 채류기간에 += 해줌.
		
	}

}
