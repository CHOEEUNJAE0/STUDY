package com.web.bookmark.model;


//dto 작성 후 다시 컨트롤러 페이지로 이동
public class BookMarkDTO {
	private String name;
	private String url;
	
	
	public BookMarkDTO() {}
	
	public BookMarkDTO(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
