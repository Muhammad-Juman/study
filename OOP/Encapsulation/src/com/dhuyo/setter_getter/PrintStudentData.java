package com.dhuyo.setter_getter;

public class PrintStudentData {

	public static void main(String[] args) {
		
		StudentData ob=new StudentData();
		ob.setName("Juman");
		System.out.println("Name : "+ob.getName());
		ob.setFatherName("Abdul Rehman");
		System.out.println("Father Name : "+ob.getFatherName());
		ob.setRollNo("2021-BSE-264");
		System.out.println("Roll No : "+ob.getRollNo());
		ob.setAge(20);
		System.out.println("Age : "+ob.getAge());
		ob.setSection('F');
		System.out.println("Section : "+ob.getSection());
		ob.setUni("Sir Syed University Of Engineering & Technology");
		System.out.println("University : "+ob.getUniversity());
		ob.setDepart("Software Engineering");
		System.out.println("Departement : "+ob.getDepartement());
	
	}
	
}
