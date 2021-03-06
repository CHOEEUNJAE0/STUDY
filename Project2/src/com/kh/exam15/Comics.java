package com.kh.exam15;

public class Comics extends Book {

	private String name;
	private String company;
	private String writer;
	private String illustrator;
	private int limitAge;
	
	public Comics(String name, String company, String writer, String illustrator, int limitAge,  int totalPageNum) {
	
	
	super(totalPageNum);
	this.name = name;
	this.company = company;
	this.writer = writer;
	this.illustrator = illustrator;
	this.limitAge = limitAge;
	
	}
	@Override
	public void read() {
		System.out.println(this.name + "만화를 읽습니다.");

}
	@Override 
	public String toString() {
	return "[만화책 : " + this.name + ", 출판사 : " +this.company + ", 글작가 : " + this.writer + ", 그림작가 : " + this.illustrator + super.toString() + "]";
}
}
