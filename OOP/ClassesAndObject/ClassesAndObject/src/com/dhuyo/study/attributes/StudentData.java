package com.dhuyo.study.attributes;

public class StudentData {
	String name="M.Juman";
	String fatherName="Dr.Abdul Rehman";
	int age=20;
	String uni="SSUET";
	String depart="Software Engineering";
	String homeAddress="Larkana";
	
	void bioData() {
		System.out.println("Name : "+name);
		System.out.println("Father Name : "+fatherName);
		System.out.println("Age : "+age);
		System.out.println("University : "+uni);
		System.out.println("Departement : "+depart);
		System.out.println("Home Address"+homeAddress);
	}
	
	public static void main(String[] args) {
		StudentData object=new StudentData();
		object.name="Babo";

		object.bioData();
		System.out.println();
		object.bioData();

		
	}

}
