package com.kh.exam3;

import com.kh.exam2.NoAccessClass;// public쓰지 않고 디폴트로 하면 해당 클래스에서만 볼 수 있다.
import com.kh.exam2.OtherClass;

public class OtherPackage {

	public static void main(String[] args) {
		OtherClass other = new OtherClass();
		System.out.println("OtherClass 접근 가능 ->" + other.attribute);
		
		NoAccessClass noAccess = new NoAccessClass();
		System.out.println("NoAccessClass 접근 가능 ->" + noAccess.attribute);
		
	}

}
