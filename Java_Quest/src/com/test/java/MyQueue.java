package com.test.java;

public class MyQueue {
	
	private String[] queue;
	private int index;
	
	public MyQueue() {
		this.queue = new String[4];
		this.index = 0;
	}

	//추가-----------------------------------------
	
	public void add(String s) {
		
		if (checkLength()) {
			doubleLength();
		}
		
		// Append mode
		this.queue[index] = s;
		this.index++;
		
	}
	
	private boolean checkLength() {
		if (this.index == this.queue.length) {
			return true;
		}
		return false;
	}
	
	private void doubleLength() {
		String[] temp = new String[this.queue.length * 2];
		
		for (int i = 0; i < this.queue.length; i++) {
			temp[i] = this.queue[i];
		}
		
		this.queue = temp;
	}
	

	//toString-----------------------------------------
	public String toString() {
		
		String temp = "";
		
		temp += String.format("length: %d\n", this.queue.length);
		temp += String.format("index: %d\n", this.index);
		for (int i = 0; i < this.queue.length; i++) {
			temp += String.format("  %d: %s", i, this.queue[i]);
		}
		
		return temp;
	}
	

}
