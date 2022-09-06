package com.dhuyo.study.Method;

public class StudentData {
	String name="M.Juman";
	String fatherName="Dr.Abdul Rehman";
	String rollNo ="2021f-bse-264";
	int age=20;
	String uni="SSUET";
	String depart="Software Engineering";
	String homeAddress="Larkana";
	
	void bioData(String name) {
		System.out.println("Name : "+name);
	}
	void bioData(String fName,String rollNo) {
		System.out.println("Father Name : "+fName+"\nRoll No : "+rollNo);
		
	}
	void bioData(int age,String uni) {
		System.out.println("Age : "+age+"\nUniversity : "+uni);
	}
	void boiData(String depart,String homeAdd) {
		System.out.println("Departement : "+depart+"\nHome Address : "+homeAdd);
	}
	
	public static void main(String[] args) {
		StudentData object=new StudentData();
		
		object.bioData(object.name);
		object.bioData(object.fatherName,object.rollNo);
		object.bioData(object.age,object.uni);
		object.bioData(object.depart,object.homeAddress);

		
	}

}
