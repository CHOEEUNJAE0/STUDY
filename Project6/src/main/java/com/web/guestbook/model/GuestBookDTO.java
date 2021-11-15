package com.web.guestbook.model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GuestBookDTO {
	private int id;
	private String ipaddr;
	private String context;
	private Date date; //데이터쪽의 데이트를 사용 할 것이기 때문에 java.sql.date를 import 해 준다.
	
	public GuestBookDTO() {}
	
	//getter setter 생성 시 생성자 없으면 불편하니깐 생성자 만들어주기
	public GuestBookDTO(String ipaddr, String context) {
		this.ipaddr = ipaddr;
		this.context = context;
	}
	
	//getter setter 만들어주기 source 탭 활용
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//오버라이드
	//int로 형변환 후 this.id에 넣어줌
	public void setId(String id) {
		this.id = Integer.parseInt(id);
	}
	
	
	public String getIpaddr() {
		return ipaddr;
	}
	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setResultSet(ResultSet res) throws SQLException {
    	this.id = res.getInt("G_ID");
    	this.context = res.getString("G_CONTEXT");
    	this.ipaddr = res.getString("G_IPADDR");
    	this.date = res.getDate("G_DATE");
	}
}
