package com.test.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex69_RegEx {
	public static void main(String[] args) {
		
		// 정규 표현식 요소 (= 문법)
		// 안녕~ 길동아~ 네 이름은 홍길동이지? 홍홍길동, 홍홍홍홍홍길동
		// 홍길동, 홍홍길동만 찾기 (홍?홍길동)
		// 980101-1234567 
		
		// > ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		
		
		
	}

	private static void m5() {
		
		// 모든 길동이 찾기
		String txt = "안녕하세요. 홍길동입니다. 네? 당신 이름도 길동이라구요? 아~ 김길동이요? 저쪽에 최길동도 있어요. 그 옆에 남궁길동도 있습니다.";
		
		String regex = "(홍|김|최|남궁)(길동)";
		// 두 글자 이상 선택하는 법 -> | 사용
		
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(txt);
		
		while (m1.find()) {
			System.out.println("찾은 이름: " + m1.group(0));
			System.out.println("성: " + m1.group(1));
			System.out.println("이름: " + m1.group(2));
		}
	}
	

	private static void m4() {
		// 이메일 찾기
		
		String txt = "주 메뉴위키백과검색계정 만들기로그인개인 도구숨기기 고려 에디터톤이 2월 4일까지 열립니다. 사용자:용인 학생에 대한 관리자 선거가 1월 28일 (일) 17:51 (KST)까지 진행됩니다.목차 토글전자 우편 주소문서토론읽기편집역사 보기도구위키백과, 우리 모두의 백과사전.전자 우편 주소의 예.전자 우편 주소(電子 郵便 住所) 또는 이메일 주소(email address)는 전자 우편 메시지가 전달될 전자 메일 상자를 식별한다. 초기 이메일 시스템에서는 여러 형태의 포맷이 사용되었지만 오늘날에는 1980년대부터 인터넷 메일 시스템을 위해 개발된 표준에 따라 오직 하나의 포맷만이 사용된다.John.Smith@example.com와 같은 전자 메일 주소는 로컬 파트인 @ 기호와 대소문자를 구분하는 도메인으로 이루어진다. 표준에서는 로컬 파트가 대소문자를 구별하지만, 실제로 example.com의 메일 시스템은 John.Smith를 JohnSmith, 심지어는 johnsmith과도 동등하게 취급하며[1], 메일 시스템들은 종종 기술적으로 유효한 문자들의 부분 집합으로 사용자의 이름을 지정하도록 제한한다. 일부의 경우, 메일 도착지의 주소를 제한하기도 한다.국제화 도메인 네임의 도입과 함께 ASCII가 아닌 문자를 전자 우편 주소에 허용하는 노력이 진행 중이다.문법로컬 파트전자 우편 주소의 로컬 파트는 아래의 ASCII 문자 중 어느 것이든 올 수 있다:대소문자 로마자 기본 A부터 Z, a부터 z숫자 0부터 9특수 문자 !#$%&'*+-/=?^_`{|}~점 (.)공백과 (),:;<>@[\\] 문자괄호 안에 사용되는 주석 (예: john.smith(comment)@example.com, (comment)john.smith@example.com)도메인이메일 주소 중 도메인 이름은 명확한 지침을 따라야 한다. 호스트명의 요구 사항, 점(.)으로 구분되는 DNS 레이블의 목록, 각 레이블이 63자를 넘지 않는 등의 요구 사항을 충족해야 하며, 다음으로 구성되어야 한다:[2]대소문자 로마자 기본 A부터 Z, a부터 z숫자 0부터 9 (최상위 도메인 이름이 모두 숫자가 아닌 경우)하이픈 - (처음 또는 마지막 글자가 아닌 경우)예유효한 전자 우편 주소prettyandsimple@example.comvery.common@example.comdisposable.style.email.with+symbol@example.comother.email-with-dash@example.comx@example.com (1문자 로컬 파트)much.more unusual@example.comvery.unusual.@.unusual.com@example.comvery.(),:;<>[]\\.VERY.\\very@\\\\ \\very\\.unusual@strange.example.comexample-indeed@strange-example.comadmin@mailserver1 (TLD이 없는 로컬 도메인 네임)#!$%&'*+-/=?^_`{}|~@example.org()<>[]:,;@\\\\\\!#$%&'-/=?^_`{}| ~.a@example.org @example.org (인용 부호 사이의 공백)example@localhost (localhost로부터의 송신)example@s.solutions (인터넷 최상위 도메인 목록 참조)user@localserveruser@tt (ICANN [1]이 점이 없는 이메일 주소의 사용을 권장하지 않지만 허용됨)user@[IPv6:2001:DB8::1]유효하지 않은 전자 우편 주소Abc.example.com (@ 문자 없음)A@b@c@example.com (인용 부호 밖에서는 오직 @만이 허용됨.)ab(c)d,e:f;g<h>i[j\\k]l@example.com (인용 부호 밖에서 로컬 부분에 특수 문자가 허용되지 않음)justnotright@example.comthis isnot\\allowed@example.comthis\\ still\\not\\\\allowed@example.com1234567890123456789012345678901234567890123456789012345678901234+x@example.com (너무 긺)john..doe@example.com (@ 이전의 점 두 개)john.doe@example..com (@ 뒤의 점 두 개)뒤에 공백이 있는 유효한 주소앞에 공백이 있는 유효한 주소표준 문서RFC 821 – Simple Mail Transfer Protocol (Obsoleted by RFC 2821)RFC 822 – Standard for the Format of ARPA Internet Text Messages (Obsoleted by RFC 2822) (Errata)RFC 1035 – Domain names, Implementation and specification (Errata)RFC 1123 – Requirements for Internet Hosts, Application and Support (Updated by RFC 2821, RFC 5321) (Errata)RFC 2142 – Mailbox Names for Common Services, Roles and Functions (Errata)RFC 2821 – Simple Mail Transfer Protocol (Obsoletes RFC 821, Updates RFC 1123, Obsoleted by RFC 5321) (Errata)RFC 2822 – Internet Message Format (Obsoletes RFC 822, Obsoleted by RFC 5322) (Errata)RFC 3696 – Application Techniques for Checking and Transformation of Names (Errata)RFC 4291 – IP Version 6 Addressing Architecture (Updated by RFC 5952) (Errata)RFC 5321 – Simple Mail Transfer Protocol (Obsoletes RFC 2821, Updates RFC 1123) (Errata)RFC 5322 – Internet Message Format (Obsoletes RFC 2822) (Errata)RFC 5952 – A Recommendation for IPv6 Address Text Representation (Updates RFC 4291) (Errata)RFC 6530 – Overview and Framework for Internationalized Email (Obsoletes RFC 4952, 5504, 5825)같이 보기이메일 클라이언트각주 ...you can add or remove the dots from a Gmail address without changing the actual destination address; and they'll all go to your inbox..., Google.com RFC 3696, section 2. Restrictions on domain (DNS) names분류: 전자 우편이 문서는 2022년 12월 23일 (금) 13:42에 마지막으로 편집되었습니다.모든 문서는 크리에이티브 커먼즈 저작자표시-동일조건변경허락 4.0에 따라 사용할 수 있으며, 추가적인 조건이 적용될 수 있습니다. 자세한 내용은 이용 약관을 참고하십시오.Wikipedia®는 미국 및 다른 국가에 등록되어 있는 Wikimedia Foundation, Inc. 소유의 등록 상표입니다.개인정보처리방침위키백과 소개면책 조항행동 강령개발자통계쿠키 정책모바일 보기Wikimedia FoundationPowered by MediaWiki";
		
		String regex = "(\\w+)@([a-zA-Z_]+?\\.[a-zA-Z]{2,3})";
		
		Pattern p1 = Pattern.compile(regex);
		
		Matcher m1 = p1.matcher(txt);
		
		while (m1.find()) {
			System.out.println(m1.group());
			System.out.println("아이디: " + m1.group(1));
			System.out.println("도메인: " + m1.group(2));
		}
		
		
		
		
		
		
		
		
	}

	private static void m3() {
		
		// txt 안에 전화번호가 포함되어 있는지 확인하기

		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-2345-2345 입니다. 연락주세요. 혹시 연락이 안되면 다른 번호 010-4334-0956로 연락주세요.";
		
		String regex = "([0-9]{3})-([0-9]{3,4})-([0-9]{4})"; // 같은 표현 "\\d{3}-\\d{3,4}-\\d{4}";
		
		// 패턴 객체 생성 (정규 표현식 객체)
		Pattern p1 = Pattern.compile(regex);
		
		// 검색 결과
		Matcher m1 = p1.matcher(txt); // m1 -> 검색 결과

		// 결과 확인
		//System.out.println(m1.find()); // 첫 번째 전화번호 검색 결과 (010-2345-2345)
		//System.out.println(m1.find()); // 두 번째 전화번호 검색 결과 (010-4334-0956)
		
//		if (m1.find()) {
//			System.out.println("txt 내에서 전화번호 발견");
//		} else {
//			System.out.println("txt 내에 전화번호 없음");
//		}
		
		// 전화번호 횟수
//		int count = 0;
//		
//		while (m1.find()) {
//			count++;
//		}
//		System.out.printf("전화번호를 총 %d회 발견했습니다.", count);
		
//		while (m1.find()) {
//			System.out.println("[전화번호 발견]");
//			System.out.println(m1.group());
		//}
		
		
		while (m1.find()) {
			System.out.println("[전화번호 발견]");
			System.out.println(m1.group(0));
			System.out.println("통신사: " + m1.group(1)); // 첫 번째 (소괄호): ([0-9]{3})
			System.out.println("앞자리: " + m1.group(2)); // 두 번째 (소괄호): ([0-9]{3,4})
			System.out.println("뒷자리: " + m1.group(3)); // 세 번째 (소괄호): ([0-9]{4})
			System.out.println();
		}
		
	}

	private static void m2() {
		
		String name = "홍길동,,아무개;강아지,고양이 멍멍이";
		
		String[] list = name.split("[,;\\s]+"); // \s는 특수문자로 인식해서 \\s로 사용
		
		for (String item : list) {
		
			System.out.println(item);
		}
		
	}
	

	private static void m1() {
		
		// 자바 -> 여러 메서드의 인자값으로 정규 표현식을 지원한다
		
		// 요구사항: 게시판 글쓰기 -> 개인정보(전화번호) 마스킹하기
		
		String txt = "안녕하세요. 홍길동입니다. 제 연락처는 010-2345-2345 입니다. 연락주세요. 혹시 연락이 안되면 다른 번호 010-4334-0956로 연락주세요.";
		
		System.out.println(txt.replaceAll("[0-9]{3}-[0-9]{3,4}-[0-9]{4}", "***-****-****"));
		
	}

}
