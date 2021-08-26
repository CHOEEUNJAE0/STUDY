package com.kh.exam17;

import java.util.*;

import java.util.Scanner;

public class Sample1 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void ex1() {

	 List<Integer> aList = new ArrayList<Integer>();
	 
	 //마지막 인덱스에 추가
	 aList.add(10);  aList.add(20);   aList.add(30); 
	 System.out.println(aList);
	 
	 //지정한 인덱스에 추가
	 aList.add(1, 40);
	 System.out.println(aList);
	 
	 //주어진 객체가 존재하는지 검색
	 boolean resBool = aList.contains(20);
	 System.out.println(resBool);
	 
	 //주어진 인덱스로 저장도니 객체 검색
	 int resInt = aList.get(0);
	 System.out.println(resInt);
	 
	 //인덱스의 범위를 벗어나면 에러 발생
//	 resInt = aList.get(5);
//	 System.out.println(resInt);
	 
	 //interator()
	 Iterator<Integer> iter = aList.iterator();
	 while(iter.hasNext()) {
		 System.out.println("Iterator 로 추출 -> " + iter.next());
	 }
	 for(Integer i : aList) {
		 System.out.println("for each 로 추출 ->" + i);
	 }
	 //컬랙션이 비어 있는지 조사
	 resBool = aList.isEmpty();
	 System.out.println("aList의 내용이 비어있습니까? -> " +resBool);
	 
	//저장 되어 있는 전체 객체의 수
	 resInt = aList.size();
	 System.out.println("aList의 객체의 수 ->" + resInt);
	 
	 //주어진 인덱스로 객체 삭제
	 //0번 인덱스의 내용을 지워라 그리고 반환해라 => 반환 후 삭제
	 resInt = aList.remove(0);
	 System.out.println(aList + "에서 " + resInt + "(이)가 삭제되어 " + aList + "가 남았음");
	 
	 //주어진 객체로 찾아서 삭제 // 그냥 22를 넣으면 인덱스로 인식하기 때문에 Wrapping 작업 해준 것.
	 resBool = aList.remove(Integer.valueOf(22));
	 // resBool = aList.remove(new Integer(22)); 라고 코드 생성해도 된다.
	 System.out.println(resInt + "이(가) 삭제되어" + aList + "가 남았습니다.");
	 
	 resBool = aList.remove(Integer.valueOf(22));
	 // resBool = aList.remove(new Integer(22)); 라고 코드 생성해도 된다.
	 System.out.println("객체 삭제가 되었습니까? -> " + resBool );
	}
	public static void ex2() {
		/*
		 * 사용자 입력으로 정수 데이터를 받아 ArrayList에 저장 후 
		 * ArrayList에 저장돈 모든 정수의 합을 구하여 출력한다.
		 * (단, 사용자 입력은 한 번만 사용한다.)
		 */
		 Scanner sc = new Scanner (System.in);
		 String[] inputs = sc.nextLine().split(" ");
		 System.out.println("정수 데이터 입력()공백을 구분자로 2개 이상 입력 가능) : ");
		 List<Integer> iList = new ArrayList<Integer>();
		 
		 for(String s : inputs) {
			 iList.add(Integer.parseInt(s));
		 }
		 int tot = 0;
		 for(int n : iList) {
			 tot += n;
		 }
		 System.out.println("사용자 입력 데이터 : " + iList);
		 System.out.println("사용자 입력 데이터의 총합 : " + tot);
	}
	 
	public static void ex3() {
		/*
		 * 사용자 입력으로 실수 데이터를 받아 ArrayList에 저장 후 
		 * ArrayList에 저장 된 모든 실수의 합을 구하여 출력한다.
		 * (단, 사용자 입력은 한 번만 사용한다.)
		 */
		Scanner sc = new Scanner (System.in);
		String[] inputs = sc.nextLine().split(" ");
		 System.out.println("실수 데이터 입력()공백을 구분자로 2개 이상 입력 가능) : ");
		 List<Double> dList = new ArrayList<Double>();
		 
		 for(String s : inputs) {
			 dList.add(Double.parseDouble(s));
		 }
		 int tot = 0;
		 for(Double n : dList) {
			 tot += n;
		 }
		 System.out.println("사용자 입력 데이터 : " + dList);
		 System.out.println("사용자 입력 데이터의 총합 : " + tot);
		 System.out.println("사용자 입력 데이터의 평균 : " + tot / dList.size());
	}
	public static void ex4() {
		/*
		 * 다음의 요구사항을 잘 보고 요구사항에 맞도록 구현한다.
		 *   - 사용자 입력으로 정수 데이터를 받아 ArrayList에 저장을 해야 한다.
		 *   - 사용자 입력으로 하나의 정수 데이터를 입력 할 수 있지만 2개 이상의 정수를 입력 하기도 한다.
		 *   - 동일한 정수 데이터는 ArrayList에 저장되지 않도록 한다.
		 */
		Scanner sc = new Scanner (System.in);
		 String[] inputs = sc.nextLine().split(" ");
		 System.out.println("정수 데이터 입력()공백을 구분자로 2개 이상 입력 가능) : ");
		 List<Integer> iList = new ArrayList<Integer>();
		 
		// 무조건 에드를 하면 안되어서 반복을 여러번 해 주어야 한다.
		 for(String s : inputs) {
			 int temp = Integer.parseInt(s);
			 if(!iList.contains(temp))
				 iList.add(temp);
			 iList.add(Integer.parseInt(s));
		 }
	}
	public static void ex5() {
		/*
		 * 사용자 입력으로 최소값, 최대값, 갯수 를 입력받아 다음 요구사항에 맞도록 구현한다.
		 * 	- 최소값, 최대값은 랜덤을 통해 생성할 값의 범위이다.
		 * 	- 갯수는 랜덤을 통해 생성할 값의 수량 이다.
		 * 	- 생성된 랜덤값은 ArrayList 에 저장한다.
		 * 	- ArrayList에 저장한 정수는 중복이 없어야 한다.
		 */
		Random rd = new Random();
	Scanner sc = new Scanner (System.in);
	 System.out.println("최소값 최대값 입력 : ");
	String[] minMax = sc.nextLine().split(" ");
	System.out.println("갯수 입력 : ");
	int min = Integer.parseInt(minMax[0]);
	int max = Integer.parseInt(minMax[1]);
	int count = sc.nextInt();
	
	 List<Integer> iList = new ArrayList<Integer>();
	 
	 while(iList.size() < count ) {
		 int temp = rd.nextInt(max - min + 1) +min;
		 if(!iList.contains(temp)) {
			 iList.add(temp);
		 }
	 }
	 System.out.println("사용자 입력 데이터 : " + iList);
	}
	public static void ex6() {
		/*
		 * 현재 날짜를 구한 후 ArrayList에 년, 월, 일, 시간, 분, 초 데이터가
		 * 저장되도록 한다.
		 */
		GregorianCalender gc = new GregorianCalender();
		List
		
	}
	public static void ex7() {
		/*
		 * 3초에 한번씩 정기적으로 1 ~ 99 사이의 랜덤값을 ArrayList에 저장하도록 한다.
		 * ArrayList에 저장하는 데이터는 10개로 제한한다.
		 */
	}
	public static void ex8() {
		
	}
	
	
	
	
	public static void main(String[] args) {
		//ex1();
		//ex2();
		//ex3();
		//ex4();
		ex5();
		//ex6();
		//ex7();
		//ex8();
	}

	}


