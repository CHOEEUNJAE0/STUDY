package com.cs.diagram2;


class A {
	private B b;
	
	public void method(B b) {
		this.b = b;
		b.method();
	}
	
}

class B {
	public void method() {
	}
	
}


public class AssociationClass {
	// 클래스 다이어그램 연관관계 샘플용
	//연관관계를 하려면 클래스가 두개 이상 필요
}
	
