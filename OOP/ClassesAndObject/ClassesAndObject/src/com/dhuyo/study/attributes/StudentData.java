package com.dhuyo.study.attributes;

public class StudentData {
	String name="M.Juman";
	String fatherName="Dr.Abdul Rehman";
	int age=20;
	String uni="SSUET";
	String depart="Software Engineering";
	String homeAddress="Larkana";
	
	void bioData1(String name) {
		System.out.println("Name : "+name);
	}
	void (String fName) {
		System.out.println("Father Name : "+fName);
		
	}
	void bioData(String rollNo) {
		
	}
	public static void main(String[] args) {
		StudentData object=new StudentData();
		object.name="Babo";

		object.bioData1();
		System.out.println();
		object.bioData1();

		
	}

}
