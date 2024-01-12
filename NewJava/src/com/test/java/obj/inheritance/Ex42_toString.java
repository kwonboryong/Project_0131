package com.test.java.obj.inheritance;

import java.util.Calendar;
import java.util.Date;

import com.test.java.obj.Monitor;

public class Ex42_toString {
	public static void main(String[] args) {
		
		/* Object.toString() 오버라이딩
		   - 국민 오버라이딩
		   
		   
		   + 패키지가 다른 클래스 사용 => import 사용
		 */
		
		Monitor m1 = new Monitor();
		m1.setModel("LG101");
		m1.setPrice(5000000);
		
		// 방금 만든 객체의 상태가 궁금 -> 출력을 통해 상태를 확인
		System.out.println(m1.getModel());
		System.out.println(m1.getSize());
		System.out.println();
		//System.out.println(m1.info()); // 단점: info()메서드를 사람들이 잘 모름
		
		System.out.println(m1);
		
		
		
		
		Time t1 = new Time(2, 30);
		Time t2 = new Time(3, 50);
		
		System.out.println(t1.info());
		System.out.println(t2.info());
		System.out.println(t1.toString()); // com.test.java.obj.inheritance.Time@816f27d -> 메서드 오버라이딩 -> 2:30 
		System.out.println(t2);
		
		
//		Date now = new Date();
//		Calendar now2 = Calendar.getInstance();
//		
//		System.out.println(now);
//		System.out.println(now.toString()); // Date.toString() -> 오버라이딩 됨
//		
//		System.out.println(now2);
//		System.out.println(now2.toString()); // Calendar.toString()
		
		
	}

}

class Time {
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public String info() {
		return this.hour + ":" + this.minute;
	}
	
	// 메서드 오버라이딩
	public String toString() {
		// toString: 객체의 상태를 문자열로 반환하는 역할
		// 여기서의 객체 상태 = 현재 시, 분
		return this.hour + ":" + this.minute;
	}
	
	
	
	
	
	
}




















