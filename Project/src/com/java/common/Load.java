package com.java.common;

public class Load {
	Data data = new Data();

	public void loadAll() {

		data.loadEmployeeList();
		data.loadUserList();
		data.loadPassList();
		data.loadCalendarList();
	}

}
