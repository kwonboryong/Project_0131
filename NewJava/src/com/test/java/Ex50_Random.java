package com.test.java;

import java.util.Random;

public class Ex50_Random {
	public static void main(String[] args) {
		
		
		// 난수
		
		m1();
		
		
		Random rnd = new Random();
		
		String[] name1 = {"김", "이", "박", "최", "유", "권", "조", "전", "차", "정"};
		String[] name2 = {"길", "동", "제", "석", "영", "수", "세", "원", "호", "민", "진", "유", "한"};
		
		String[] address1 = {"서울시", "평택시", "수원시", "대전시", "대구시", "부산시", "강릉시"};
		String[] address2 = {"강남구", "강북구", "용산구", "중랑구", "중구", "서초구", "강서구"};
		String[] address3 = {"역삼동", "대치동", "한남동", "역청담동", "압구정동", "천호동"};
		
		
		
		for (int i = 0; i < 200; i++) { // 이름 데이터 랜덤 생성
			String name = name1[rnd.nextInt(name1.length)] // 성 랜덤
						+ name2[rnd.nextInt(name2.length)] // 이름 중간
						+ name2[rnd.nextInt(name2.length)]; // 이름 끝
		
		// 나이
		int age = rnd.nextInt(2) + 13; // 13 or 14세 
		
		// 성별
		String gender = rnd.nextInt(2) == 0 ? "남자" : "여자";
		
		// 지역
		String address = address1[rnd.nextInt(address1.length)] + " "
						+ address2[rnd.nextInt(address2.length)] + " "
						+ address3[rnd.nextInt(address3.length)] + " "
						+ (rnd.nextInt(300) + 100) + "번지";
		
		
		System.out.printf("%s(%d세) %s [%s]\n", name, age, gender, address);
		
		
		}
		
		
		
		
	}

	private static void m1() {

		Random rnd = new Random();
		// 각 자료형별로 난수 생성
		// - rnd.nextXXX
		
		for (int i = 0; i < 10; i++) {
			System.out.println(rnd.nextInt()); // int형 사이의 난수 생성
			System.out.println(rnd.nextDouble()); // Math.random()과 같음
			System.out.println(rnd.nextInt(10)); // 0 ~ 9 사이의 정수 반환
			System.out.println(rnd.nextLong());
		}
		
		
		
		
	}

}
