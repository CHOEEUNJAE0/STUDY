package com.kh.exam15;


public class Novel extends Book {

	private String name;
	private String company;
	private String genre;
	private String writer;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
	public Novel(String name, String company, String genre, String writer, int totalPageNum) {
		super(totalPageNum);
		this.name = name;
		this.company = company;
		this.genre = genre;
		this.writer = writer;
		
	}

	@Override
     public void read() {
		System.out.println(this.name + "책을 읽습니다.");
	}
     public void search(String search) {
    	System.out.println(search + "내용을" + this.name + "에서 검색합니다."); 
     }
     
     @Override 
 	public String toString() {
    		return "[소설책 : " + this.name + ", 출판사 : " +this.company + ", 작가 : " + this.writer + ", 장르 : " + this.genre + super.toString() + "]";
     }
     
}
