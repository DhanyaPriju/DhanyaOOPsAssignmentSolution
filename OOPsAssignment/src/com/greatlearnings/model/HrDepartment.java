package com.greatlearnings.model;

public class HrDepartment extends SuperDepartment{
	public String departmentName() {
		String str = "Hr Department";
		return str;
	}
 
	public String getTodaysWork() {
		String str1 = "Fill today’s worksheet and mark your attendance";
		return str1;
	}
	
	public String getWorkDeadline() {
		String str2 = "Complete by EOD";
		return str2;
	}

	public String doActivity() {
		String str3 = "Team Lunch";
		return str3;
	}
}
