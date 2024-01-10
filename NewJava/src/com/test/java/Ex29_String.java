package com.test.java;

import java.util.Scanner;

public class Ex29_String {
	public static void main(String[] args) {
		
		/* 문자열 (String)
		   - String 클래스에서 문자열 조작에 관련된 기능 제공
		   
		  */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5(); // -> m4();의 깔끔한 버전
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
	//*	m12(); // 문자열 추출 - String substring
	//*	m13(); // 문자열 검색 - boolean contains(String s)
		// m14(); -> 문자열 치환
		m15(); // 문자열 분리
		
	}
	

	private static void m15() {
		/* 문자열 분리
		   - String[] split(String delimiter)
		   - 자르기 위한 구분자를 넣어준다
		 */
		
		String txt = "홍길동.아무개.하하하.호호호.후후후";
		
		String[] list = txt.split("\\."); // 자르기 위한 구분자(,)를 넣어준다 -> 구분자(,)는 사라짐
		// ***구분자 예외
		// 점(.)을 구분자로 하려면 (\\.)으로 사용해야 한다.
		// |도 (\\|)로 사용해야 함
		// 구분자는 아예 안쓰는 문자로 쓰는게 좋다.
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("이름: " + list[i]); 
		}
//		이름: 홍길동
//		이름: 아무개
//		이름: 하하하
//		이름: 호호호
//		이름: 후후후

		
		
		
	}


	private static void m14() {
		/* 문자열 치환 (바꾸기)
		   - String replace(String old, String new) 
		   - 기존의 단어(old) -> new로 바꾼다.
		   
		 */
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.replace("홍길동", "집갈래"));
		
		
		// 게시판 글쓰기: 금지어 마스킹하기
		String content = "게시판 글을 씁니다. 바보야";
		String word = "바보";
		
		System.out.println(content.replace(word, "**")); 
		// 게시판 글을 씁니다. **야
		
		
		// 문자열 중간에 있는 공백 지우기
		txt = "    하나    둘    셋";
		System.out.println(txt.trim()); // trim()은 명시적으로 알아볼 수 있는 공백은 안 지움
		
		System.out.println(txt.replace(" ", ""));
		System.out.println(txt.replace("하나", "")); // 특정 검색어 지우기
		
		
		
		
		
	}


	private static void m13() {
		/* 문자열 검색
		   1. indexOf
		   2. lastIndexOf
		   3. boolean contains(String s)
		   - boolean형으로 사용
		   
		 */
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		if (txt.contains("홍길동")) { // 3. boolean contains(String s)
			System.out.println("O");
		}
		
		
		
		
		
		
	}


	private static void m12() {
		/* 문자열 추출
		  - String substring(int beginIndex, int endIndex)
		  - String substring(int beginIndex)
		  - 해당 범위에 있는 문자열을 출력한다.
		  * beginIndex: 포함 (inclusive)
		  * endIndex: 비포함 (exclusive)
		 */
	
		String txt = "가나다라마바사아자차카타파하";
		// 문자열 추출
		System.out.println(txt.substring(3, 7)); // 3번째(시작 위치) ~ 6번째 위치(끝 위치)까지 출력 (라마바사)
		System.out.println(txt.substring(3)); // 시작 위치 ~ 끝까지 출력 (라마바사아자차카타파하)
		
		// 한 글자 뽑기
		System.out.println(txt.charAt(4)); // char => 문자코드값 추출 가능 (문자코드값이 필요 시 사용!)
		System.out.println(txt.substring(4, 5)); // String 
		
		
		// 성별 알아내기 
		String jumin = "970410-2098765";
		
		System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자"); // char
		System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자"); // String
		
		
		// 몇 년생인지 알아내기
		System.out.println("" + jumin.charAt(0) + jumin.charAt(1)); // 97, ""를 더해서 char -> String으로 변환
		System.out.println(jumin.substring(0, 2)); // 97, 1번째 ~ 2번째
		
		
		// 몇 월생인지 알아내기
		System.out.println(jumin.substring(2, 4)); // 04
		System.out.println(jumin.substring(4, 6)); // 10
		
		
		
		// 파일 경로
		String path = "C:\\class\\code\\java\\Hello.java";
		
		// 1. 파일 명 추출하기: Hello.java
		// - 끝에서 찾기
		int index = path.lastIndexOf("\\"); // 맨 마지막의 \\의 index
		// 실제 역슬래시는 1개임(\)
		String filename = path.substring(index + 1); // 맨 마지막의 \\의 뒤부터 검색, 추출
		System.out.println("파일명: " + filename);
		// 파일명: Hello.java
		
		
		// 2. 파일명 -> 확장자가 없는 파일명 추출: Hello
		index = filename.lastIndexOf("."); // 마지막 .(점) 찾기
		// 0번째 ~ 마지막 .(점) 전까지 찾기
		String filenameWithoutExtension = filename.substring(0, index);
		System.out.println("순수 파일명: " + filenameWithoutExtension);
		// 순수 파일명: Hello
		
		
		// 3. 확장자만 출력: .java
		String extension = filename.substring(index); // .(index)부터 끝까지 추출
		System.out.println("확장자: " + extension);
		// 확장자: .java
		
		
		
		
		
		
		
	}


	private static void m11() {
		/* 문자열 검색(******)
		 * - 문자열 내에서 원하는 문자(열)을 검색, 발견된 위치(index)를 반환한다.
		  - int indexOf(char c)
		  - int indexOf(String c)
		  - int indexOf(char c, int beginIndex)
		  - int indexOf(String c, int beginIndex)
		   
		  - int lastindexOf(char c)
		  - int lastindexOf(String c)
		  - int lastindexOf(char c, int beginIndex)
		  - int lastindexOf(String c, int beginIndex)
		   
		   
		 */
		
		String txt = "홍길동 자바 아무개 자바 테스트";
		
		
		System.out.println(txt.indexOf("자바")); // 4
		System.out.println(txt.indexOf("자바", 6)); // 11
		
		System.out.println(txt.lastIndexOf("자바")); // 11 (오른쪽 -> 왼쪽으로 검색)
		System.out.println(txt.lastIndexOf("자바", 10)); // 2번째 자바 
		
		
		
	}


	private static void m10() {
		/* 패턴 검색
		  - boolean startsWith(String word)
		  - boolean endsWith(String word)
		  - 
		 */
		
		String name = "홍길동";
		
		// 이 사람이 '홍'씨인지?
		System.out.println(name.charAt(0) == '홍'); // index 0이 '홍'인지
		System.out.println(name.indexOf('홍') == 0); // '홍'이 index 0에 있는지
		System.out.println(name.startsWith("홍")); // 문자열이 "홍"으로 시작하는지
		
		// 이 사람이 '동'으로 끝나는지?
		System.out.println(name.charAt(name.length()-1) == '동'); // 마지막 index에 '동'인지
		System.out.println(name.indexOf('동') == name.length()-1); // '동'이 마지막 index에 있는지
		System.out.println(name.endsWith("동")); // 문자열이 "동"으로 시작하는지
		
		
		// 자원 경로
		String path = "C:\\class\\code\\java\\Hello.java";
		
		// 위의 자원이 자바 소스 파일인가?
		if (path.endsWith(".java")) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
	}


	private static void m9() {
		/* 문자열 대소문자 변경
		  - String toUpperCase()
		  - String toLowerCase()
		  - 영어만 가능
		 */
		
		
		String content = "오늘 수업하는 과목은 Java입니다.";
		String word = "java"; // 사용자가 입력한 검색어
		
		System.out.println(content.toUpperCase());
		//System.out.println(content.toLowerCase());
		System.out.println(word.toUpperCase()); // 사용자가 입력한 검색어를 대문자로 변환 -> 대소문자에 의한 유니코드 차이가 없음
		
		
		// 대소문자 구분 (Case sensitive)
		// - 정확도 높음
		// - 검색율이 낮음
		if (content.indexOf(word) > -1) {
			System.out.println("검색 결과 O");
		} else {
		System.out.println("검색 결과 X");
		}
		
		
		// 대소문자 구분 X (Case insensitive)
		// - 검색율 높음
		// - 정확도 낮음
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			// 1. content.toUpperCase() (JAVA.indexOf(word.toUpperCase())) 
			// -> 2. .indexOf(word.toUpperCase())
			// 메서드 체이닝
			// 메서드().메서드()
			System.out.println("검색 결과 O");
		} else {
			System.out.println("검색 결과 X");
		}
		
		
	}


	private static void m8() {
		// 게시판 글쓰기 -> 금지어 단속
		String stop = "바보"; // 금지어
		
		String content = "안녕하세요. 바보 저는 멍청이 자바를 배우는 학생입니다.";
		
		
		if (content.indexOf(stop) > -1) { // 없는 글자는 -1로 출력 => (글자) > -1 => 금지어가 있다는 뜻
			System.out.println("금지어 금지");
		} else { // 금지어가 없는 경우
			System.out.println("글쓰기 처리");
		}
		
		String[] stops = {"바보", "멍청이", "메롱", "ㅂㅏㅂㅗ"};
		
		for (int i = 0; i < stops.length; i++) {
			if (content.indexOf(stops[i]) > -1) {
				System.out.println("금지어 발견");
				break; // 금지어를 발견한 순간 오염된 단어이기 때문에 빠져나간다. (break)
			} 
			
		}
		
		System.out.println("종료");
		
		
		
	}


	private static void m7() {
		/* 문자열 검색(******)
		 * - 문자열 내에서 원하는 문자(열)을 검색, 발견된 위치(index)를 반환한다.
		  - int indexOf(char c)
		  - int indexOf(String c)
		  - int indexOf(char c, int beginIndex)
		  - int indexOf(String c, int beginIndex)
		   
		 */
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		int index = -1;
		
		index = txt.indexOf('하'); // txt에서 글자 '하' 찾기 (해당 글자의 발견 위치(index)를 알려준다.)
		System.out.println(index); // 2 ('하'가 몇 번째 index에 있는지)
		
		index = txt.indexOf('홍'); 
		System.out.println(index); 
		
		index = txt.indexOf('강'); // 없는 글자 
		System.out.println(index); // -1 (index 값이 아닌 숫자를 돌려준다.)
		
		index = txt.indexOf("홍길동"); // 문자열
		System.out.println(index); // 찾은 글자의 첫 번째 글자 반환
		
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히 가세요. 홍길동입니다.";
		
		
		index = txt.indexOf("홍길동"); 
		System.out.println(index); // 7
		
		// 2번째 홍길동 찾기
		index = txt.indexOf("홍길동", index + 3); // 앞에 찾은 '홍길동'(index) + 3(글자 수)
		System.out.println(index); // 22
		
		// 3번째 홍길동 찾기
		index = txt.indexOf("홍길동", index + 3);
		System.out.println(index);  // 39
		
	}


	private static void m6() {
		/* 문자열 공백 제거
		   - String trim()
		   - 문자열에 존재하는 공백(Whitespace: 스페이스, 탭, 개행)을 제거하는 메서드
		   - 문자열의 시작과 끝에 존재하는 공백 문자를 제거한다.
		   - 불필요하거나 사용자 실수로 생긴 공백을 제거하는 역할
		   
		 */
		
		String txt = "     하나     둘     셋    ";
		
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
		
		
		System.out.println();
		
		
	}


	private static void m5() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어: ");
		String word = scan.nextLine();
		
		if (isValid(word)) {
			System.out.println("소문자 O");
		} else {
			System.out.println("소문자 X");
		}
		
	}

	private static boolean isValid(String word) { // m5();의 메서드
		
		for (int i = 0; i < word.length(); i++) {
			
			char c = word.charAt(i);
			
			
			if (c < 'a' || c > 'z') { 
			// 유효성 검사: 입력값이 소문자가 아니면 false 반환 -> 위 if문의 (isValid(word))로 들어감
				return false;
			} 
			
		}
		
		return true;
	}


	
	private static void m4() {
		// 영어 소문자 단어만 입력 받기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어: ");
		String word = scan.nextLine();
		
		
//		System.out.println(word.charAt(0)); // 한 글자씩 뽑아오기
//		System.out.println(word.charAt(1));
//		System.out.println(word.charAt(2));
		
		boolean result = true;
		
		for (int i = 0; i < word.length(); i++) {
			
			char c = word.charAt(i); // 단어를 한 글자씩 추출 -> 변수 c에 저장
			
//			if (c >= 'a' && c <= 'z') {
//				System.out.println("소문자 O");
//			} else {
//			System.out.println("소문자 X");
//			}
			
			// ***유효성 검사: 잘못된 것을 찾는 조건을 만든다.
			if (c < 'a' || c > 'z') { // 입력값이 소문자가 아니면
				System.out.println("소문자 X");
				result = false;
				break; // 잘못된 걸 찾으면 바로 break되게끔 한다. (하나라도 소문자가 아니면)
			} 
			
		} // for문
		
		System.out.println(result);
		
		if (result) {
			System.out.println("소문자 O");
		} else {
			System.out.println("소문자 X");
		}
		
		
	}


	private static void m3() {
		// 주민등록번호 입력 받기: 970110-1234567 ('-' 넣기)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민번호 입력('-'필수): ");
		
		String jumin = scan.nextLine();
		
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
		} else {
			System.out.println("잘못된 주민번호");
		}
		
		
		
		
		
		
		
		
		
		
	}


	private static void m2() {
		// 문자열 추출
		// - char charAt(int index)
		// - 원하는 위치의 문자를 추출하는 메서드
		// Zero-based Index: index가 0부터 시작
		
		// '요'만 뽑아내기
		String txt = "안녕하세요. 홍길동입니다.";
		
		char c = txt.charAt(4);
		
		//System.out.println(c);
		
		// 마지막 문자 뽑아내기
		c = txt.charAt(txt.length() - 1);
		System.out.println(c);
		
		
		
		
	}


	private static void m1() {
		/* 문자열 생성
		 * 1. 리터럴
		 * 2. 객체 생성 */
		
		String str1 = "홍길동"; // 리터럴
		String str2 = new String("홍길동"); // 객체 생성
		
		/* 문자열 == 문자의 집합
		 * String == char[] */
		
		// 문자열 길이
		// - int length()
		String txt = "홍길동";
		System.out.println(txt.length()); // 3 (문자의 수)
		
		System.out.println("자바".length()); // 2
		
		System.out.println("ABC한글123#$!".length()); // 11 (영어, 한글, 숫자, 특수문자도 1개로 취급)
		
		
		// 요구사항: 사용자가 몇 글자를 입력했는지 확인하기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장 입력: ");
		String statement = scan.nextLine();
		
		System.out.printf("%s > %d문자\n", statement, statement.length());
		
		
		// 유효성 검사
		// - 이름 입력 받기: 2자 ~ 5자
		
		System.out.print("이름 입력: ");
		String name = scan.nextLine();
		
		if (name.length() >= 2 && name.length() <= 5) {
			System.out.println("올바른 이름");
		} else {
			System.out.println("이름을 2 ~ 5자 이내로 입력하세요");
		}
		
		
		
		
		
	}

}
