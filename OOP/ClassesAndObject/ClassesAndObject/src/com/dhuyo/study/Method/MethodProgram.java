package com.dhuyo.study.Method;

public class MethodProgram {
	String name="Juman";
	int age =19;
	
void myName(String name,int age) {
	System.out.println("My Name Is : "+name);
}

void myFatherName(String fatherName) {
	System.out.println("My Father Name Is : "+fatherName);
}

void myRollNo(String rollNo) {
	System.out.println("My Roll No Is : "+rollNo);
}

void myAge(int age) {
	System.out.println("My Age Is : "+age);
}

void myDepartement(String depart) {
	System.out.println("My Departement Is : "+depart);
}

void university(String uni) {
	System.out.println("My University Is : "+uni);
}

public static void main(String[] args) {
	MethodProgram object=new MethodProgram();
	object.myName(object.name,object.age);
	object.myFatherName("Abdul Rehman");
	object.myRollNo("2021f-BSE-264");
	object.myAge(20);
	object.myDepartement("Software Engineer");
	object.university("Sir Syed University Of Engineering \nAnd Technology");
	
}

}
