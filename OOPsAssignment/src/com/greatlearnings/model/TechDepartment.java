package com.greatlearnings.model;

public class TechDepartment extends SuperDepartment{
	public String departmentName() {
		String str = "Tech Department";
		return str;
	}
 
	public String getTodaysWork() {
		String str1 = "Complete coding of module 1";
		return str1;
	}
	
	public String getWorkDeadline() {
		String str2 = "Complete by EOD";
		return str2;
	}
	
	public String getTechStackInformation() {
		String str3 = "core Java";
		return str3;
	}
}
