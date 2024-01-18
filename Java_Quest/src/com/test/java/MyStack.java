package com.test.java;

public class MyStack {
	
		private String[] stack;
		private int index;
		
		public MyStack() {
			this.stack = new String[5];
			this.index = 0;
		}

	//---------------------추가-------------------------

		public boolean push(String s) {
			
			if (checkLength()) {
				doubleLength();
			}
			this.stack[this.index] = s;
			this.index++;
			
			return true; 
		}
		
		private boolean checkLength() {
			if (this.index == this.stack.length) {
				return true;
			}
			return false;
		}

		private void doubleLength() {
			
			String[] temp = new String[this.stack.length * 2];
			
			for (int i = 0; i < this.stack.length; i++) {
				temp[i] = this.stack[i];
			}
			this.stack = temp;
		}
		
//	---------------------읽기----------------------!!!
//	* 후입 선출: 저장소에 나중에 들어간 요소가 가장 먼저 나온다.
//	1. 마지막 방의 요소 가져옴 (대입)
//	2. Right Shift
//	3. index 증가?
//	4. (이동한) 변수 반환
		
		public String pop() {

			String item = this.stack[this.index-1];
			
			this.index--;
			return item;
		}

	//---------------------개수---------------------
		
		public int size() {
			return this.index;
		}

	//---------------------확인---------------------!!!
		//* 확인: 마지막 값 반환
		public String peek() {
			return this.stack[this.stack.length-1];
		}

	//---------------------초기화------------------------
		
		public void clear() {
			this.index = 0;
		}
		
	//---------------------toString------------------------

		public String toString() {
			
			String temp = "";
			
			temp += String.format("length: %d\r\n", this.stack.length);
			temp += String.format("index: %d\r\n", this.index);
			for (int i = 0; i < this.stack.length; i++) {
				temp += String.format("   %d: %s\r\n", i, this.stack[i]);
			}
			return temp;
		}
	
	
	

}
