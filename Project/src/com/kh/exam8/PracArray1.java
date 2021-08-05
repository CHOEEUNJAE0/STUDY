package com.kh.exam8;

import java.util.Arrays;

public class PracArray1 {
	
	public static void ex1() {
		/*
		 * 다음의 정수 배열이 있다.
		 * 		37, 92, 58, 46, 94, 29, 25, 58 (요소라고한다)
		 * 
		 * 위 배열에서 짝수에 해당하는 값과 홀수에 해당하는 값을 별도의 짝수값만 저장하는 짝수배열
		 * 홀수값만 저장하는 홀수배열로 분리하여 저장하도록 한다.(동적배열을 쓰는게 좋다)
		 * 
		 */
		//1. 어떤 변수를 사용할지
		//2. 조건문/반복문 어떤걸 사용할지
		//3. 짝수/홀수 구분하기 위한 코드
		
		int arr[] = new int[] {37, 92, 58, 46, 94, 29, 25, 58 };//짝수&홀수를 나누기 위해 하단에 공간값 0인 even과 odd 배열을 생성 해 준다.//1번 
		//3번순서로 동적배열을 생성 해 준다.
		int[] arrEven = new int[0]; //정적배열이고, 공간이 0인 짝수인 배열, 여기에는 값을 입력 할 수 없어서 동적배열로 베열 길이를 늘려서 복사해준다. arrevencopy
		int[] arrOdd = new int[0]; //공간이 0인 홀수인 배열
		
		for(int i =0; i <arr.length; i ++) { //인덱스를 1씩 증가 시켜서 해야하니깐 반복문.//2번순서. 반복문과 조건문을 먼저 써 주고 
		if(arr[i] %2 == 0) { //0번째 인덱스를 2로 나눴을때 0이면 짝수 아니면 홀수 조건문.
			int[] arrEvenCopy = new int[arrEven.length + 1]; //4번 :arreven을 복사한 임시공간 기존 arr보다 한칸 늘리는 것.
			                  //복사 받을 배열 ,복사시작할인덱스번호, 복사 해 올 배열 복사시작할인덱스번호 복사 받을 배열의 길이만큼
			System.arraycopy(arrEven,         0,           arrEvenCopy,  0,           arrEven.length); // 임시 공간에서 arrEven으로 복사
			//위의 과정을 거치고 나면 arreven과 arrevncopy의 값이 같아 진다.
			arrEven = arrEvenCopy;  //arrEvenCopy 값을 arrEVEN에 넣어준것
			arrEven[arrEven.length - 1] =arr[i];

		}else { //홀수
			int[] arrOddCopy = new int[arrOdd.length+1];
			
                           			
			System.arraycopy(arrOdd, 0, arrOddCopy, 0, arrOdd.length);
			arrOdd = arrOddCopy;
			arrOdd[arrOdd.length - 1] =arr[i];

		}	
	}      //arrays.tostring 하면 좀 더 보기 좋게 출력이 된다.
		System.out.println(Arrays.toString(arrEven));
		System.out.println(Arrays.toString(arrOdd));
	}
    public static void ex2() {
    	/*
		 * 다음의 정수 배열이 있다.
		 * 		37, 92, 58, 46, 94, 29, 25, 58
		 * 
		 * 위 배열에서 가장 큰값과 가장 작은 값만을 분리하여 별도의 배열에 저장하도록 한다.
		 */
    	int[] arr = new int[] {37, 92, 58, 46, 94, 29, 25, 58};
    	int[] minMax = new int[2]; //크기가 2인 배열을 생성해주면 동적배열 없이 가능하다.
    	
    	//큰 값/작은값에 대한 비교를 위해 미리 0번 인덱스의 값을 배열에 넣는다.
    	//밑에 이 작업을 하지 않고 출력 하면 [0,0] 이라고만 출력이 될 것이다. 왜냐면 계속 0부터 비교하기 때문에 작은값은 구할 수가 없게 된다.
    	minMax[0] = arr[0];// 0번 인덱스인 37부터 비교를 하기 위해 0번을 넣어줌
    	minMax[1] = arr[0];// 위에 이미 0번 인덱스가 들어 가 있기 때문에 1번 인덱스인 92부터 비교를 하기 위해 1번을 넣어준다.

    	//이미 0번 인덱스의 값은 배열 안에 넣어 두었기 때문에 1번 인덱스부터 반복을 진행한다.
    	for(int i =1; i <arr.length; i++) {
    		//minMax의 0번 인덱스에는 가장 작은 값만을 저장하기 위해 아래와 같은 비교식을 사용
    		if(minMax[0] > arr[i]) { //0번 인덱스 37보다 작으면 비교했던 그 값으로 출력이 되고 그 값보다 또 작은 수가 나오면 계속 변화 출력 된다.
    			minMax[0] = arr[i]; //0번 인덱스 37과 같은 수가 나오면 넘어간다.
    		}
    		if(minMax[1] < arr[i]) {
    			minMax[1] = arr[i];
    		}
    	}
    	System.out.println(Arrays.toString(minMax));	
    	}
    	
           public static void ex4() {
        	   /*
       		 * 다음의 정수 배열이 있다.
       		 * 		37, 92, 58, 46, 94, 29, 25, 58 (요소 라고한다)
       		 * 
       		 * 위 배열에서 짝수에 해당하는 값과 홀수에 해당하는 값을 별도의 짝수값만 저장하는 짝수배열
       		 * 홀수값만 저장하는 홀수배열로 분리하여 저장하도록 한다.(정적배열)
       		 */
	      
        	    int[] arr = new int[] {37, 92, 58, 46, 94, 29, 25, 58};
        	    int[][] arrEvenOdd = new int[2][8];
        	    //arrEvenodd[0] :짝수 저장
        	    //arrEvenOdd[1] : 홀수 저장 
        	    //별도의 인덱스를 만들어줘야한다
        	    
        	    int idx1= 0; //짝수용 인덱스
        	    int idx2 = 0; //홀수용 인덱스
        	    		

        		for(int i =0; i <arr.length; i ++)  
        		if(arr[i] %2 == 0) {
        			//짝수
        			arrEvenOdd[0][idx1] = arr[i];
        			idx1++;
        		}else {
        			//홀수
        			arrEvenOdd[1][idx2] = arr[i];
        			idx2++;
        		}
        	System.out.println(Arrays.toString(arrEvenOdd[0]));
        	System.out.println(Arrays.toString(arrEvenOdd[1]));
 
           }
           
           public static void ex5() {
        	    /*
          		 * 다음의 정수 배열이 있다.
          		 * 		37, 92, 58, 46, 94, 29, 25, 58 (요소 라고한다)
          		 * 
          		 * 위 배열에서 짝수에 해당하는 값과 홀수에 해당하는 값을 별도의 짝수값만 저장하는 짝수배열
          		 * 홀수값만 저장하는 홀수배열로 분리하여 저장하도록 한다.(동적배열)
          		 */
        	   int[] arr = new int[] {37, 92, 58, 46, 94, 29, 25, 58};
       	       int[][] arrEvenOdd = new int[2][];//정적배열때와 다르게 두번째 대괄호를 공란으로 둔다.
       	    
       	         //arrEvenodd[0] :짝수 저장
    	        //arrEvenOdd[1] : 홀수 저장 
       		int[] arrEven = new int[0]; //정적배열이고, 공간이 0인 짝수인 배열, 여기에는 값을 입력 할 수 없어서 동적배열로 베열 길이를 늘려서 복사해준다. arrevencopy
    		int[] arrOdd = new int[0]; //공간이 0인 홀수인 배열
    		
    		for(int i =0; i <arr.length; i ++) { //인덱스를 1씩 증가 시켜서 해야하니깐 반복문.//2번순서. 반복문과 조건문을 먼저 써 주고 
    		if(arr[i] %2 == 0) { //0번째 인덱스를 2로 나눴을때 0이면 짝수 아니면 홀수 조건문.
    			int[] arrEvenCopy = new int[arrEven.length + 1]; //4번 :arreven을 복사한 임시공간 기존 arr보다 한칸 늘리는 것.
    			                  //복사 받을 배열 ,복사시작할인덱스번호, 복사 해 올 배열 복사시작할인덱스번호 복사 받을 배열의 길이만큼
    			System.arraycopy(arrEven,         0,           arrEvenCopy,  0,           arrEven.length); // 임시 공간에서 arrEven으로 복사
    			//위의 과정을 거치고 나면 arreven과 arrevncopy의 값이 같아 진다.
    			arrEven = arrEvenCopy;  //arrEvenCopy 값을 arrEVEN에 넣어준것
    			arrEven[arrEven.length - 1] =arr[i];

    		}else { //홀수
    			int[] arrOddCopy = new int[arrOdd.length+1];
    			
                               			
    			System.arraycopy(arrOdd, 0, arrOddCopy, 0, arrOdd.length);
    			arrOdd = arrOddCopy;
    			arrOdd[arrOdd.length - 1] =arr[i];
       	       
       	       
    		}
           }
    		
    		arrEvenOdd[0] = arrEven;
    		arrEvenOdd[1] = arrOdd;
    		
    		System.out.println(Arrays.toString(arrEvenOdd[0]));
    		System.out.println(Arrays.toString(arrEvenOdd[1]));
    		//정적배열 사용 했을 때는 지정된 정수 배열 뒤에 0이 연달아 출력 되었는데(아까는 8자리라고 지정을 해 놨기 때문에)
    		//이렇게 동적 배열을 사용하면 우리가 출력하고자 하는 숫자만큼 출력이 된다.
           }
         
           
           public static void ex6() {
//        	   //가변 길이 배열 : 2차 배열의 길이가 다르게 구성된 배열
//        	   //[0,0,0,0], [0,0,0,0,0,0],[0,0,0] 의 형태로 출력이 된
//        	   int[][] arr = new int[3][];
//        	   arr[0] = new int[4];
//        	   arr[1] = new int[6];
//        	   arr[2] = new int[3];
//        	   
//        	   System.out.println(Arrays.deepToString(arr));
        	   
        	   
        	   
        	   int[][] arr = new int[3][];
        	   arr[0] = new int[4];
        	   arr[1] = new int[6];
        	   arr[2] = new int[3];
        	   
        	   for(int i =0; i < arr.length; i++) {
        		   for(int j =0; j < arr[i].length; j++) {
        			   System.out.println(arr[i][j] + ":" + i +"|" + j + "\t");
        		   }
        	   System.out.println();
        	  
           }
        	   System.out.println(Arrays.deepToString(arr)); //무조건 한줄로 출력이 된다.[[0, 0, 0, 0], [0, 0, 0, 0, 0, 0], [0, 0, 0]]
           }
           
           public static void ex7() {
        	   
        	   String ClassGroup [] = new String[4];
        	   ClassGroup[0] = "최은재" ;
        	   System.out.println(ClassGroup[0]);
        	   ClassGroup[0] = "서지우" ;
        	   System.out.println(ClassGroup.length);//길이만 출력
        	   ClassGroup[0] = "서온달" ;
        	   System.out.println(ClassGroup.length);
        	   ClassGroup[0] = "최반달" ;
        	   System.out.println(ClassGroup.length);
        	   
        	   
        	   
        	   
           }
           
	public static void main(String[] args) {
		
		
		//ex1();
		//ex2();
		//ex3();
		//ex4();
		//ex5();
		//ex6();
		ex7();		
	}
}

