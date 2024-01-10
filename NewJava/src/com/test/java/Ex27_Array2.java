package com.test.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex27_Array2 {
	public static void main(String[] args) {
		
		/* 배열 (Array)
		  - 자료구조: 데이터를 저장하는 물리적인 구조
		  - 데이터의 집합 =>  변수들을 모아놓은 집합
		  - 같은 자료형을 저장하는 데이터의 집합	*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		//m14();
		//m15();
		// m16(); -> 2차원 배열
		m17(); // -> 3차원 배열
		//m18(); -> 다차원 배열 초기화 리스트, 비정형 배열
		// m19(); // -> 난수
		//m20(); 
		//m21(); 
		
		
		
	}
	

	private static void m21() { // 2차원 문제의 베이스

		int[][] nums = new int[5][5];
		int n = 1;
		
		// 2차원 배열에 값 넣기
		for (int i = 4; i >= 0; i--) { // i는 행
			for (int j = 4; j >= 0; j--) { // j는 열
				//nums[i][j] = n; // 가로로 접근
			  nums[j][i] = n; // 세로로 접근
				n++;
			}
			System.out.println();
			
		}
		
		// 출력
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", nums[i][j]);
				n++;
			}
			System.out.println();
			
		}
		
		
//		System.out.println(Arrays.toString(nums));
		
		
	}


	private static void m20() {
		//*** 배열의 길이는 불변하다.
		// - 한 번 만들어진 배열의 방은 절대 더 늘리거나 삭제할 수 없다.
		// - 처음 시작 길이를 동작 중 형성해서 정할 수 있다.
		
		int[] nums1 = new int[3]; // 정적
		
		// 배열의 길이에
		// - 상수 대입
		int length = 3;
		
		int[] nums = new int [length]; // 동적: 프로그램 동작 중 배열의 길이가 정해짐
		
		
		// 입력 받은 수 대입
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생 수: ");
		int length1 = scan.nextInt();
		
		int[] student = new int[length1];
		
		System.out.println(student.length);
		
		
	}


	private static void m19() {
		// 중복 없는 난수 
		
		for (int i = 0; i < 10; i++) { // 10번 출력
			
			System.out.println((int)(Math.random() * 100) + 1); // 1 ~ 100 사이의 난수
			
			
		}
		
		// 중복 없는 난수 = 출력 시 앞 숫자들과 비교해서 같은 값이면 버리고 다시 난수 만들기 -> 정렬 사용?
		
		
		
		
	}


	private static void m18() {
		/* 다차원 배열의 초기화 리스트 */
		
		int[] nums1 = {10, 20, 30};
		int[][] nums2 = 
			{
				{10, 20, 30}, 
				{40, 50, 60}
			};
		int[][][] nums3 = 
			{
				{
					{10, 20, 30}, 
					{40, 50, 60}
				}, 
				{
					{10, 20, 30}, 
					{40, 50, 60}
				}
			};
		
		/* Jagged Array (비정형 배열, 불규칙 배열)
		   - 
		   
		 */
		
		int[][] nums4 = new int[3][4]; // (X)
		
		// 비정형 배열은 초기화 리스트로만 생성 가능
		int[][] nums5 = 
			{
				{10, 20, 30}, 
				{40, 50}, 
				{60, 70, 80,90}
			};
		
		// Jagged Array 탐색: 2중 for문
		for (int i = 0; i < nums5.length; i++) {
			for(int j = 0; j < nums5[i].length; j++) {
				
				System.out.printf("%5d", nums5[i][j]);
				
			}
			System.out.println();	
		}
		
		//  10   20   30
		//  40   50
		//  60   70   80   90

	}


	private static void m17() { // 3차원 배열
		 
		// 3차원 배열
		int[][][] nums3 = new int[2][2][3];
		
		nums3[0][0][0] = 10; // 1동 1층 1호실
		nums3[0][0][1] = 20; // 1동 1층 1호실
		nums3[0][0][2] = 30; // 1동 1층 1호실
		
		nums3[0][1][0] = 40; // 1동 2층 1호실
		nums3[0][1][1] = 50; 
		nums3[0][1][2] = 60;
		
		nums3[1][0][0] = 70; 
		nums3[1][0][1] = 80; 
		nums3[1][0][2] = 90; 
		
		nums3[1][1][0] = 100; 
		nums3[1][1][1] = 110; 
		nums3[1][1][2] = 120; 
		
		
		// 3차원 배열의 탐색: 3중 for문
		for (int i = 0; i < nums3.length; i++) {
			
			for (int j = 0; j < nums3[0].length; j++) { // 2차원 배열
				
				for (int k = 0; k < nums3[0][0].length; k++) { // 1차원 배열
					System.out.printf("%5d", nums3[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
			
		}
		
		
		
		
	}


	private static void m16() {
		/* 배열의 차원
		  - 1차원, 2차원, 3차원 배열...*/
		
		// 1차원 배열
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		// System.out.println(Arrays.toString(nums)); // [10, 20, 30]
		
		
		
		// 2차원 배열
		int[][] nums2 = new int[2][3]; // [2차원][1차원] (층이 2, 칸이 3인 형태)
		
		// 1층 가로부터
		nums2[0][0] = 10;
		nums2[0][1] = 20;
		nums2[0][2] = 30;
		
		// 2층 가로부터
		nums2[1][0] = 40;
		nums2[1][1] = 50;
		nums2[1][2] = 60;
		
		
		// ***배열의 실제 구조
		// nums2의 자료형은? => int 2차원형 // 방 밖에서 보는 시각 (방문이 2개)
		// nums2[0]의 자료형은? => int 1차원형 // 
		// nums2[0][0]의 자료형은? => int형
		nums2[0][1] = 20;
		
		System.out.println(nums2.length); // 2, 방 밖에서 보는 시각 (방문이 2개)
		System.out.println(nums2[0].length); // 3, 방 안에 들어갔더니 각각의 방(index)가 있음 -> 첫 번째 방의 각 방(배열)의 길이
		System.out.println(nums2[0][0]); // length 없음 ->
		// 방문 2개(2차원 배열) 
		// -> 1번 방/2번 방에 작은 방 3개 
		// -> 3개의 방 중 한 방에 들어감
		
		
		
		//System.out.println(Arrays.toString(nums2)); (x)
		System.out.println(Arrays.deepToString(nums2)); // .deepToString 사용
		
		
		
		// 2차원 배열의 탐색: 2중 for문
		for (int i = 0; i < nums2.length; i++) { // [0][0] -> [1][0] / 2차원 배열의 변화 0 -> 1 그래서 i는 0, j는 1까지(2)
		
			for (int j = 0; j < nums2[0].length; j++) { //
				System.out.print(nums2[i][j] + "\t");
				
			}
			System.out.println(); // 층이 바뀜 -> 엔터
		}
		
		// 10  20  30	
		// 40  50  60	
		
		
	}


	private static void m15() {
		/* 배열 요소 삭제 (Deletion)
		  - 삭제할 요소의 오른쪽에서 부터 왼쪽(<-)으로 복사
		  - 맨 끝은 0으로 처리(초기화)
		  - Left Shift : 왼쪽으로 일괄적으로 이동한다.
		 */
		
		int[] nums = {1, 2, 3, 4, 5}; // 배열 
		
		int index = 1; // 삭제할 위치
		
		
		// 
		for (int i = index; i <= nums.length-2; i++) {
			
			nums[i] = nums[i+1]; // nums[i]는 왼쪽 방, nums[i+1]은 그 다음 오른쪽 방
			
		}
		
		nums[nums.length-1] = 0; // nums[]의 마지막 방(nums.length-1)에 0을 넣기
		
		System.out.println(Arrays.toString(nums)); // [1, 3, 4, 5, 0]
		
		
		
		
	}


	private static void m14() {
		/* 배열 조작
		  - 삽입, 삭제
		  - 비용 발생
		  - 
		  
		  배열 요소 삽입 (Insertion)
		  - 오른쪽(끝)에서 부터 오른쪽(->)으로 복사
		  - Right Shift : 오른쪽으로 일괄적으로 이동한다.
		  - ***삽입 이후의 요소들이 인덱스가 변경된다. (삽입 이전의 값들은 변경 X -> 삽입 이후 자리만 값이 이동했기 때문)
		  
		 */
		
		int[] nums = {1, 2, 3, 4, 5}; // 배열 
		
		int index = 1; // 삽입 위치
		int value = 9; // 삽입할 값
		
		// 삽입 전 확인
		System.out.println("nums[0] = " + nums[0]); // 1
		System.out.println("nums[3] = " + nums[3]); // 4
		
		
		System.out.println(Arrays.toString(nums)); // 원본: [1, 2, 3, 4, 5]
		
		// index(방)에 각 값 복사해서 넣기
		for (int i = nums.length-2; i >= index; i--) { // i는 nums.length-2 (=마지막에서 2번째 방)
			//System.out.println(i);
			nums[i+1] = nums[i];
			
			System.out.println(Arrays.toString(nums));
			/* [1, 2, 3, 4, 5]
			   [1, 2, 3, 4, 4]
			   [1, 2, 3, 3, 4]
			   [1, 2, 2, 3, 4] */
		}
		
		nums[index] = value; // 삽입할 위치(index)에 삽입할 값(value)을 대입
		
		System.out.println(Arrays.toString(nums)); // 삽입 후: [1, 9, 2, 3, 4]
		
		// 삽입 후 확인
		
		System.out.println("nums[0] = " + nums[0]); // 1
		System.out.println("nums[3] = " + nums[3]); // 3
		
		
	}


	private static void m13() {
		
		
		int nums[] = {5, 3, 1, 4, 2};
		
		String[] names = {"홍길동", "박명수", "아무개", "유재석", "박명뭐", "병아리", "도깨비", "강아지", "고양이", "집갈래"};
		
		
		// Quick Sort
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		
		
		
		
		
		
	}




	private static void m12() {
		/* 정렬
		  - 크기 비교 후 재배치
		  
		  1. 오름차순
		   (1) 숫자: 작은 수 -> 큰 수
		   (2) 문자열: 문자코드 값 순 (가나다...)
		   (3) 날짜시간: 과거-> 미래
		  
		  
		  2. 내림차순
		   (1) 숫자: 큰 수 -> 작은 수
		   (2) 문자열: 문자코드 값의 역순
		   (3) 날짜시간: 미래 -> 과거
		   
		  정렬 구현
		  1. 직접 구현 => 정렬 알고리즘
		  2. JDK 구현된 기능
		  
		  
		  버블 정렬 + swap
		  - swap: 두 공간의 데이터를 서로 바꾸는 작업*/
		
		int a = 18;
		int b = 5;
		//int temp;
		
		//temp = a;
		a = b;
		//b = temp;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		

		// 버블 정렬: 가지고 있는 (배열 길이 - 1)을 해야 함
		int nums[] = {5, 3, 1, 4, 2}; // 원본
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-1-i; j++) { 
				// nums.length-1-i = i가 0일때 j가 0123, i가 1일때 j가 012... 
				
				// 오름차순
				if (nums[j] > nums[j+1]) { // j와 j의 다음 숫자를 비교해서 j가 크면 둘이 자리 바꿈
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				
//				// 내림차순
//				if (nums[j] < nums[j+1]) { // j와 j의 다음 숫자를 비교해서 j가 작으면 둘이 자리 바꿈
//					int temp = nums[j];
//					nums[j] = nums[j+1];
//					nums[j+1] = temp;
				}
			}
		System.out.println(Arrays.toString(nums));

		
		
		
		// String은 참조형 -> 주소값끼리는 비교 X => 첫 번째 글자의 문자코드값을 비교
		
		String[] names = {"홍길동", "박명수", "아무개", "유재석", "박명뭐", "병아리", "도깨비", "강아지", "고양이", "집갈래"};
		
		
		for (int i = 0; i < names.length-1; i++	 ) {
			for (int j = 0; j < names.length-1-i; j++) {
				if (names[j].compareTo(names[j+1]) > 0) { // 오름차순 (가나다순)
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				
				}
			}
		}
		
		System.out.println(Arrays.toString(names));
		
		
//		String name1 = "홍길동";
//		String name2 = "아무개";
		
		// 두 단어의 첫 글자의 문자코드값 차이
		// .compareTo(비교값): 두 글자 중 누가 앞에 있는 문자인지, 둘이 같은 문자인지 확인해줌
//		System.out.println(name1.compareTo(name2)); // 4361
//		
//		System.out.println((int)'홍'); // 54861
//		System.out.println((int)'아'); // 50500
		// 문자코드 값이 클수록 뒷 순서의 문자
		
		
		
		
		
		
		
		
		

	}




	private static void m11() {
		/* 배열 초기화 리스트
		  (자동 초기화와 상관 없음)
		   - 
		   - 
		   
		   
		 */
		
		int[] nums1 = new int[5];
		
		nums1[0] = 95; // for문을 돌릴 수 있는 상황이면 이렇게 사용 (숫자가 중구난방이라 for문 사용 X)
		nums1[1] = 88;
		nums1[2] = 67;
		nums1[3] = 89;
		nums1[4] = 64;
		
		System.out.println(Arrays.toString(nums1)); 
		
		
		// 초기화 리스트
		// 1. 잘 안씀
		int[] nums2 = new int[] {95, 88, 67, 89, 64}; // 방의 길이 생략 {}; 추가
		
		System.out.println(Arrays.toString(nums2)); 
		
		// 2. 많이 씀
		int[] nums3 = {95, 88, 67, 89, 64}; // 

		
		
		String[] names1 = new String[3]; // 방의 길이 생략 {}; 추가
		
		names1[0] = "홍길동";
		names1[1] = "임꺽정";
		names1[2] = "도깨비";
		
		String[] names2 = {"홍길동", "임꺽정", "도깨비"};
		
		
		
		
	}

	private static void m10() {
		/* 배열 자동 초기화
		   - 배열은 생성 직후 모든 요소(방)가 초기화된다.
		   
		   초기화 규칙
		   1. 정수 배열: 0
		   2. 실수 배열: 0.0
		   3. 문자열: \0 (\u0000)
		   4. 논리 배열: false
		   5. 참조형 배열: null */
		
		
		int[] list1 = new int[3];
		System.out.println(Arrays.toString(list1)); // [0, 0, 0]
		
		double[] list2 = new double[3];
		System.out.println(Arrays.toString(list2)); // [0.0, 0.0, 0.0]
		
		boolean[] list3 = new boolean[3];
		System.out.println(Arrays.toString(list3)); // [false, false, false]
		
		char[] list4 = new char[3];
		System.out.println(Arrays.toString(list4)); // [null, null, null]
		
	}
	
	

	private static void m9() {
		/* Arrays 클래스
		  - 배열과 관련된 여러가지 기능을 구현한 클래스
		  - 배열을 조작하는 편리한 기능을 제공하는 역할
		 */
		
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		
		// 배열의 상태 확인
		
		System.out.println(nums); // 주소값이 출력됨 (쓸모없음)
		/* [I@2ff4acd0 
		   - [I : int[]
		   - @ : 아무 의미 X
		   - 2ff4acd0 : 메모리 주소*/
		
		printArray(nums); // 배열 상태 확인하는 메서드 (for문)
		
		// Arrays.toString 사용
		System.out.println(Arrays.toString(nums)); // 덤프(dump)
		
		
		// 깊은 복사
		int[] copy;
		
		copy = Arrays.copyOfRange(nums, 0, nums.length); // 원본 변수, 몇 번쨰 방에서, 몇 번째 방까지
		
		nums[0] = 100;
		System.out.println(copy[0]); // 10
		
	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			
			System.out.printf("%3d", nums[i]); // 10 20 30
			
		}
	}

	
	
	private static void m8() {
		/* 배열 복사
		  1. 얕은 복사 ( Shallow Copy)
		  - 주소값 복사
		  - Side Effect 발생
		  
		  2. 깊은 복사 (Deep Copy)
		  - 실제 배열을 복사
		  - Side Effect 발생 안함  */
		
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy = new int[3]; // 복사본 변수 생성
		
		for (int i = 0; i < nums.length; i++) {
			
			// 배열 안의 방과 방(요소)끼리의 복사 (배열의 복사 X, 값형의 복사임)
			copy[i] = nums[i];
			// int = int
			
		}
		
		nums[0] = 100;
		System.out.println(copy[0]); // 10
		// Side Effect 발생 X
		
		
		
		
		
	}

	private static void m7() {
		// TODO Auto-generated method stub
		
		int a = 10; // a는 지역변수, 값형 변수
		
		changeValue(a);
		System.out.println(a); // 10
		
		// ----------------------------------
		
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		changeArray(nums); // nums의 주소값 복사
		
		System.out.println(nums[0]); // 123
		
	}

	
	private static void changeArray(int[] nums) { // nums의 주소값 대입
		
		nums[0] = 123;
		System.out.println(nums[0]); // 123
		
	}

	private static void changeValue(int a) {

		a = 20;
		System.out.println(a); // 20
		
	}

	private static void m6() {
		// 배열 복사 (= 참조형 복사)
		
		// 값형의 복사
		int a = 10;
		int b;
		b = a; // 값 복사
		
		a = 20; // 원본 수정
		
		System.out.println("a: " + a); // 20
		System.out.println("b: " + b); // 10
		
		
		// 배열의 복사
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		int[] copy; // copy의 자료형은 int
		
		copy = nums; // 배열 복사 (int[] = int[];)
		
		System.out.println(copy[0]); // 10
		System.out.println(copy[1]); // 20
		System.out.println(copy[2]); // 30
		
		
		nums[0] = 100; // 원본 수정 => 복사본도 수정됨
		System.out.println(copy[0]); // 100
		
		copy[1] = 200; // 복사본 수정 => 원본도 수정됨
		System.out.println(copy[1]); // 20
		// = Side Effect가 발생한다.
		
		
		
		
	}

	private static void m5() {
		/* 값형 vs 참조형
		  - 값형: 변수 안에 데이터 직접 저장
		  - 참조형: 데이터는 따로 생성 + 변수에 메모리 주소값 저장
		  
		  *** 원인
		  - 데이터의 크기가 일정 => 값형
		  - 데이터의 크기가 일정하지 않음 => 참조형
		  - ***변수만 보고 데이터의 길이를 추측 가능 => 값형
		  - ***변수만 보고 데이터의 길이를 추측 불가능 => 참조형
		   
		 */
		
		int a1 = 10;
		// a1의 메모리 크기 = 4byte
		int a2 = 1000000000;
		// a2의 메모리 크기 = 4byte
		
		
		String s1 = "홍길동";
		// s1의 메모리 크기 = 6byte
		String s2 = "안녕하세요";
		// s2의 메모리 크기 = 10byte
		
		int[] nums1 = new int[3]; // 12byte
		int[] nums2 = new int[5]; // 20byte
		
		
		
	}

	private static void m4() {
		// 모든 자료형으로 배열을 만들 수 있다.
		
		// 정수 배열(byte, short, int, long)
		byte[] list1 = new byte[5];
		list1[0] = 10;
		System.out.println(list1[0]);
		
		// 실수 배열(float, double)
		double[] list2 = new double[4]; // 변수 선언
		list2[0] = 3.14; // 값 넣기
		System.out.println(list2[0]); // 출력
		
		// 문자 배열(char)
		char[] list3 = new char[5];
		list3[0] = 'a';
		System.out.println(list3[0]);
		
		// 논리 배열(boolean)
		boolean[] list4 = new boolean[5];
		list4[0] = true;
		System.out.println(list4[0]);
		
		
		// 참조형 배열
		String[] list5 = new String[5];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		
		//Calendar c1; // 안에 값 X => 변수만 만든거임
		
		Calendar c1 = Calendar.getInstance(); // Calendar.getInstance();가 실질적인 현재 시간을 생성하는 거임!!!
		
		Calendar[] list6 = new Calendar[5]; // 한꺼번에 만들기 (= 배열)
		list6[0] = Calendar.getInstance();
		System.out.println(list6[0]);
		
		
		
	}

	private static void m3() {
		// 참조형의 특징
		// - 모든 참조형들은 공간을 초기화하지 않아도 자동 초기화가 됨
		
		int[] nums = new int[10];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]); // 초기화 안했는데 0
		// System.out.println(nums[10]); // 배열 길이: 0 ~ 9 
		// 배열의 길이 = 10
		// 첨자의 범위 = 0 ~ 9
		
		// 변수: 값을 갖고 있지 않으면 null 상태
		
		// 배열 탐색하기 (for문 사용)
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
		
		
		
		
	}

	private static void m2() {
		// 요구사항: 학생 3명의 국어 점수를 저장해서 총점과 평균을 구하기
		// 수정: 학생 수 30명 -> 300명 (배열 사용)
		
		
		// 배열 선언하기
		// - 자료형[] 변수명 = new 자료형 [길이];
		// - 배열타입[] 배열명 = new 배열타입[배열 길이];
		int[] kors = new int[3];
		
		// 배열의 방(요소, Element)에 접근하기 => 방 번호(index) 사용
		kors[0] = 100; // 방 하나의 자료형은 int
		kors[1] = 90;
		kors[2] = 80;
		
		
		int total = 0; // 누적
		for (int i = 0; i < kors.length; i++) {
			total += kors[i]; // 총점
		}
		
		
		double avg = (double)total / kors.length; // 속성, 필드, 프로퍼티
		
		System.out.printf("총점: %d, 평균: %.1f점\n", total, avg);
		
		
	}

	
	private static void m1() {
		// 요구사항: 학생 3명의 국어 점수를 저장해서 총점과 평균을 구하기
		// 수정: 학생 수 30명 -> 300명 (배열 사용)
		
		int kor1 = 100;
		int kor2 = 90;;
		int kor3 = 80;;
		
		int total = kor1 + kor2 + kor3; // 총점
		double avg = total / 3.0; // 평균
		
		System.out.printf("총점: %d, 평균: %.1f점\n", total, avg);
		
	}
}
