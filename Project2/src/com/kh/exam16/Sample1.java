package com.kh.exam16;

import java.util.Arrays;

public class Sample1 {

	public static void main(String[] args) {
		String str = "동일 문자열 확인";
		boolean res = str.equals("동일 문자열 확인"); // 동일한 문자열인지 비교.
		System.out.println(res);
	
		str = "문자열에서 일부 문자만 추출";
		char resChar = str.charAt(2);// 원하는 문자열 인덱스 입력하면 된다.
		System.out.println(resChar);
		
		str = "문자열의 길이를 구함";
		int resInt = str.length();
		System.out.println(resInt);
		
		str = "문자열과 문자열 붙이기";
		// +를 써도 되긴 하지만 .concat이라는 메소드를 사용해주면 된다.
		String resStr = str.concat("이 문자열이 붙었습니다.");
		System.out.println(resStr);
		
		str = "문자열 사전순 비교";
		resInt = str.compareTo("가나다");
		System.out.println(resInt);
		//결과값이 3896으로 나오는데 "문자열 사전순 비교"랑 "가나다"를 비교 했을 떄 3896만큼 뒤에 있다는 뜻.
		str = "문자열 사전순 비교";
		resInt = str.compareTo("아자차");
		System.out.println(resInt);
		//결과값이 -2572으로 나오는데 "문자열 사전순 비교"랑 "아자차"를 비교 했을 떄 -2572만큼 앞에 있다는 뜻.
		str = "문자열 사전순 비교";
		resInt = str.compareTo("문자열 사전순 비교");
		System.out.println(resInt);
		//결과값이 0으로 나오는 이유는 기준인 "문자열 사전순 비교"랑 같기 때문.
		//양수인지 음수인지를 생각해보기
		
		str = "문자열에서 특정 문자열을 변경";
		resStr = str.replace("특정", "일부");//원래 문자, 변경 원하는 문자  새로운 공간에 "문자열에서 일부 문자열을 변경"을 저장. str에 적용해서 출력해주는 것.
		System.out.println(resStr);
		
		str = "문자열에서 특정 구분자를 기준으로 문자열 분리";
		String[] resStrArr = str.split(" "); // 분리 할 기준을 적어 주는 것. 여기에는 공백으로 분리하라고 써 준 것.
		System.out.println(Arrays.toString(resStrArr));
		str = "010-9783-8013";
		resStrArr = str.split("-");
		System.out.println(Arrays.toString(resStrArr));
		str = "username@sample.com";
		resStrArr = str.split("@");
		System.out.println(Arrays.toString(resStrArr));
		
		str = "분리된 문자열을 특정 구분자를 기준으로 다시 결합";
		resStrArr = str.split(" ");
		resStr = str.join("\t", resStrArr);
		System.out.println(resStr);
		str = "010-9783-8013";
		resStrArr = str.split("-");
		resStr = str.join("-", resStrArr); // 하이픈으로 다시 붙여줌
		System.out.println(resStr);
		
		str = "   불필요한 앞/뒤 공백을 제거    ";
		resStr = str.trim();
		System.out.println(resStr);
		str = "\t\t불필요한 앞/뒤 공백을 제거\t\t";
		resStr = str.trim();
		System.out.println(resStr);
		
		str = "문자열에서 일부 문자만 분리";
		resStr = str.substring(2);//2번부터 출력해라 라는 뜻
		System.out.println(resStr);
		
		str = "문자열에서 일부 문자만 분리";
		resStr = str.substring(0,5);//0~5번까지만 출력해라 라는 뜻
		System.out.println(resStr);
		
		str = "문자열에서 지정한 문자열의 위치 찾기";
		resInt = str.indexOf("위치");
		System.out.println(resInt);//15번 위치에 있다
		
		str = "문자열에서 지정한 문자열의 위치 찾기";
		resInt = str.indexOf("위치");                      //찾고자 하는 위치에 2글자를 반환 받겠다는 뜻
		System.out.println(resInt + "에 " + str.substring(resInt, resInt+2) + "가 있습니다.");
		resInt = str.indexOf("문자열");
		System.out.println(resInt);//0번에 있다.
		resInt = str.indexOf("문자열",1); //0번에 위치한 문자열을 찾은 후에 그 뒤에 다른 문자열은 몇번에 있는지 찾아라 라는 뜻.
		System.out.println(resInt);
		resInt = str.indexOf("문자열",resInt +1); //위랑 같은 의미. 이전에 찾은 위치 다음 인덱스부터 다시 찾기.
		System.out.println(resInt);
		
		str = "이 문자열에는 다양한 문자들이 포함 되어 있는 문자열 입니다.";
		resInt = str.indexOf("문자");//첫번째 문자 위치
		System.out.println(resInt);
		resInt = str.indexOf("문자",resInt +1);//두번째 문자 위치
		System.out.println(resInt);
		resInt = str.indexOf("문자",resInt +1);//세번째 문자 위치 
		System.out.println(resInt);
		resInt = str.indexOf("문자",resInt +1);//그 뒤에 더 이상 없어서 -1로 나옴
		System.out.println(resInt);
		
		//위에 과정을 이렇게 배열로도 할 수 있다.
		int[] resIntArr = new int[0];
		int idx = -1; // 0부터 시작해야하니깐 -1을 해 줌.
		while(true) {
			if(str.indexOf("문자", idx + 1 ) != -1 ) {//반복 할 때마다 다음 위치부터 찾을 수 있게 하기 위해 +1
				int[] temp = new int[resIntArr.length +1];
					System.arraycopy(resIntArr,  0, temp,0, resIntArr.length);
				idx = str.indexOf("문자", idx +1 );
				temp[temp.length - 1 ] = idx;
				resIntArr = temp;
				
			}else {
				break;
			}
		}
		System.out.println(Arrays.toString(resIntArr));
		
		//영문자에만 해당 하는 변수
		str = "영문자를 대문자/소문자로 변경. slkgjFHSJKH";
		resStr = str.toUpperCase();
		System.out.println(resStr);
		resStr = str.toLowerCase();
		System.out.println(resStr);
		
//		str = String.format("정수 포멧 : %d", 10);
//		System.out.println(str);
		
		str = "정수 포멧 : %d";
		resStr = String.format(str,  10);
		System.out.println(resStr);

		str = "천단위구분 포멧 : %,d";  //,로 천단위 구분
		resStr = String.format(str,  12345654);
		System.out.println(resStr);
		
		str = "천단위구분 포멧 : %,.2f";
		resStr = String.format(str,  123465.78945);
		System.out.println(resStr);
		
		str = "문자열 포멧 : %s";
		resStr = String.format(str,  "문자열");
		System.out.println(resStr);
		
		str = "일정한 영역에서 오른쪽 정렬 포멧 : %5d";// 다섯자리 비운다는 뜻(원하는 공백 만큼 지정 가능). run 해 보면 앞에 공백이 있는 것을 확인 할 수 있다.
		resStr = String.format(str, 123); 
		System.out.println(resStr);
		
		str = "일정한 영역에서 왼쪽 정렬 포멧 : %-5d";// 다섯자리 비운다는 뜻(원하는 공백 만큼 지정 가능). run 해 보면 앞에 공백이 있는 것을 확인 할 수 있다.
		resStr = String.format(str, 123); 
		System.out.println(resStr);
		
		str = "일정한 영역에서 오른쪽 정렬 포멧 : %5s";// 다섯자리 비운다는 뜻(원하는 공백 만큼 지정 가능). run 해 보면 앞에 공백이 있는 것을 확인 할 수 있다.
		resStr = String.format(str, "asd"); 
		System.out.println(resStr);
		
		str = "일정한 영역에서 왼쪽 정렬 포멧 : %-5s";// 다섯자리 비운다는 뜻(원하는 공백 만큼 지정 가능). run 해 보면 앞에 공백이 있는 것을 확인 할 수 있다.
		resStr = String.format(str, "asdf"); 
		System.out.println(resStr);

		str = "빈 공간을 0으로 채우기 포멧 : %05d";
		resStr = String.format(str, 123); 
		System.out.println(resStr);
		
		str = "%s의 나이는 %d 세 입니다.";
		resStr = String.format(str,"홍길동",23);
		System.out.println(resStr);
		
		str = "%2$s의 나이는 %1$d 세 입니다.";
		resStr = String.format(str,23, "홍길동");
		System.out.println(resStr);
		
		str = "아스키코드 %1$d는 아스키 문자 %1$c 입니다.";
		resStr = String.format(str,65);
		System.out.println(resStr);
		
		
		
	}
	
	

}
