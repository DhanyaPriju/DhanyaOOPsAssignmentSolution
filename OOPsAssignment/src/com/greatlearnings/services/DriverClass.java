package com.greatlearnings.services;
import com.greatlearnings.model.*;

public class DriverClass {
	public static void main(String[] args)
	{
		//Admin Department Details
		AdminDepartment admin = new AdminDepartment();
		System.out.println("Welcome to "+ admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("          ");
		
		//HR Department Details
		HrDepartment hrDept = new HrDepartment();
		System.out.println("Welcome to "+ hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());
		System.out.println("          ");
		
		//Technical Department details
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to "+ tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}
}
