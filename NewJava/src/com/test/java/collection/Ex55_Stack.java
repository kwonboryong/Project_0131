package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex55_Stack {
	public static void main(String[] args) {
		
		
		//m1();
		//m2();
		m3(); // queue 만들기
		
		
		
	}

	
	private static void m3() {
		
		//배열 생성
		MyQueue queue = new MyQueue();
		
		System.out.println(queue);

		//추가
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		queue.add("주황");
		queue.add("검정");
		
		
		//읽기
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue);

		
		//개수
		System.out.println(queue.size());

		//확인
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.size());

//		//크기 조절
//		queue.trimToSize();
//
		//초기화
		queue.clear();
		System.out.println(queue.size());
		
	}


	private static void m2() {
		// Queue
		// 인터페이스 -> 객체 생성 X
		Queue<String> queue = new LinkedList<String>();
		
		
		// 1. 요소 추가하기
		// - boolean add(T value)
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		
		// 2. 요소 개수
		System.out.println(queue.size());
		
		// 3. 요소 확인
		System.out.println(queue.poll()); // dequeue()
		System.out.println(queue.poll()); 
		System.out.println(queue.poll());
		
//		while (queue.size() > 0) {
//			System.out.println(queue.poll());
//		}
		
		// 4. 요소 미리보기
		System.out.println(queue.peek());
		
	}


	private static void m1() {
		
		/* Stack
		 */
		
		Stack<String> stack = new Stack<String>();
		
		// 1. 요소 추가하기
		// - T push(T value)
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		// 2. 요소 개수
		// - int size()
		System.out.println(stack.size());
		
		// 3. 요소 읽기
		// - T pop
		System.out.println(stack.pop()); // 파랑
		
//		System.out.println(stack.size()); // 2
//		System.out.println(stack.pop()); // 노랑
//		System.out.println(stack.pop()); // 빨강
		
		// 요소 읽기 - 배열 내용을 모를 때
//		// 안되는 코드: pop은 꺼내서 읽고 제거도 하기 때문에 stack.size는 계속 변함
//		for (int i = 0; i < stack.size(); i++) {
//			System.out.println(stack.pop());
//		}
//		
//		while (stack.size() > 0) { // 데이터가 남아있으면 계속 실행 
//			System.out.println(stack.pop());
//		}
		
		
		// 4. 빈 배열 - isEmpty
		System.out.println(stack.isEmpty());
		
		
		// 5. 이번에 pop()을 하면 가져오게 될 요소 미리보기 - peek
		System.out.println(stack.peek());
		
	}

}


