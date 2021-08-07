package com.kh.practice.snack.model.vo;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {}
		
	public Snack(String kind) {
		this.kind =kind;
		}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return this.kind;
	}
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return this.name;
	}
	public void setFlavor (String flavol) {
		this.flavor = flavor;
	}
	public String  getFlavor() {
		return this.flavor;
	}
	public void setNumOf (int numOf) {
		this.numOf=numOf;
	}
	public int getNumOf() {
		return this.numOf;
	}
	public void setPrice(int price) {
		this.price =price;
	}
	public int getPrice() {
		return this.price;
	}
	
	public String info() {
		String text = "";
		text+="Á¾·ù: " + this.kind + "\n";
		text+="ÀÌ¸§: " + this.name + "\n";
		text+="¸À: " + this.flavor + "¸À\n";
		text+="°¹¼ö: " + this.numOf + "°³\n";
		text+="°¡°Ý: " + this.price + "¿ø\n";
		
		
		
	}
	

}




	