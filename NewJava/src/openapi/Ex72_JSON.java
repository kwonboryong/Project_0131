package openapi;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Ex72_JSON {
	public static void main(String[] args) {
		
		// 객체
		
		//m1();
		m2();
		
		
		
		
	}

	private static void m2() {
		// 외부 프로그램 실행
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 메모장");
		System.out.println("2. 그림판");
		System.out.println("3. 계산기");
		System.out.println("4. 브라우저");
		System.out.print("선택: ");
		String sel = scan.nextLine();
		
		
		try {
			
			ProcessBuilder builder = new ProcessBuilder();
			
			if (sel.equals("1")) { // 회원.txt 파일을 메모장으로 실행
				builder.command("notepad.exe", "C:\\class\\code\\java\\회원.txt");
			} else if (sel.equals("2")) { // 그림판 실행
				builder.command("mspaint.exe", "C:\\class\\code\\java\\고양이.webp");
			} else if (sel.equals("3")) { // 계산기 실행
				builder.command("calc.exe");
			} else if (sel.equals("4")) { // 브라우저 실행
				builder.command("\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"");
			} 
			builder.start();
			
			
			
		} catch (Exception e) {
			System.out.println("Ex72_JSON.m2");
			e.printStackTrace();
		}
		
		
	}
	

	private static void m1() {
		String json = """ 
				{ 
			"name": "홍길동",
			"age": 20,
			"nick": ["강아지", "멍멍이", "고양이"]
		}
				""";
		
		try {
			JSONParser parser = new JSONParser(); // 객체 생성
			JSONObject obj = (JSONObject)parser.parse(json);
			
			// name
			String name = (String)obj.get("name"); // name 값 얻어오기
			System.out.println(name); // 홍길동
			
			// age
			long age = (Long)obj.get("age"); // age 값 얻어오기
			System.out.println(age); // 20
			
			// nick
			JSONArray nick = (JSONArray)obj.get("nick"); //JSON 배열이라 캐스팅 시 JSONArray로 형변환 해야 함
			for (Object n : nick) { 
				System.out.println(n);
			}
			
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
