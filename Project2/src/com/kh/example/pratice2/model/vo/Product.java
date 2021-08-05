package com.kh.example.pratice2.model.vo;

public class Product {
	
	private String pName = "키보드";
	private int price = 250000;
	private String brand = "레오타드";
	
	public Product() {}
	
	public void information() {
		System.out.println("제품명 : " +this.pName);
		System.out.println("가 격 : " +this.price);
		System.out.println("브랜드 : " +this.brand);
		
	}
	
	
}


