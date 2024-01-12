package com.test.java.obj;

public class Monitor {
	
	private String model;
	private int size = 24;
	private int price;
	//private int level;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		// 유효성 검사
		this.model = model;
	}

	// 읽기 전용 Property
	public int getSize() {
		return size;
	}
	

	// 쓰기 전용 Property
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getLevel() {
		
		if (this.price >= 500000) {
			return 1;
		} else if (this.price >= 300000) {
			return 2;
		} else {
			return 3;
		}
	}

	@Override
	public String toString() {
		return "Monitor [model=" + model + ", size=" + size + ", price=" + price + "]";
	}
	
//	public String toString() {
//		return String.format("%s[%,d원, %d인치]", this.model, this.price, this.size);
//	}
	

}
