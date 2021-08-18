package com.kh.exam15;

public abstract class Book implements Page { //클래스 생성 후
	//2.접근제한자로 추상 객체 생성
     
	private int totalPageNum;
	private int currentPageNum;
	
	public Book(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}
	
	@Override
	public void read() {
		System.out.println("책을 읽습니다.");
		

	}
	
	  /*
	   *  a.전체 페이지 번호, 현재 페이지 번호 속성을 정의
	   *  b.page(), next(), prev() 메서드 정의
	   */
	   
  public void page(int pageNum) {
	  this.currentPageNum = pageNum;
	  //currentpagenum으로 이동한다고 적어주는 것
	  
  }
  public void next() {
	  //다음패이지라서 증가
  this.currentPageNum++;
  }
  
  public void prev() {
	  //전페이지라서 감소
	  this.currentPageNum--;
  }

public int getTotalPageNum() {
	return totalPageNum;
}

public int getCurrentPageNum() {
	return currentPageNum;
}

@Override
public String toString() {
	return this.totalPageNum + ", 현재페이지 :  " + this.currentPageNum;
}
}
