package com.kh.exam15;

public class Magazine extends Book {
	
	
	private String name;
	private String company;
	private String editor;
	private String type;
	
	public Magazine(String name, String company, String editor, String type, int totalPageNum) {
	
	
	super(totalPageNum);
	this.name = name;
	this.company = company;
	this.editor = editor;
	this.type = type;
	
	}
	@Override
	public void read() {
		System.out.println(this.name + "잡지를 읽습니다.");
	}
	@Override
	public String toString() {
//   	return "[잡지 : " + this.name + ", 출판사 : " +this.company + ", 에디터 : " + this.editor + ", 종류 : " + this.type + "총페이지 : " +this.getTotalPageNum()
//   	 + ", 현재페이지 : " + this.getCurrentPageNum() + "]";
   	return "[잡지 : " + this.name + ", 출판사 : " +this.company + ", 에디터 : " + this.editor + ", 종류 : " + this.type + super.toString() + "]";
   	//총페이지~부터 끝까지는 super.으로 채워준다. book에다가 이미 작성 해줬기때문에 그 변수를 가져 온 것 
	}

}


