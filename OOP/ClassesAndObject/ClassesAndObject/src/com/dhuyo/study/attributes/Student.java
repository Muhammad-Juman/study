package com.dhuyo.study.attributes;

public class Student {
	
	// Below are student attributes or properties for fields
//	final String name = "Juman";
	String name = "Juman";
	String fatherName = "Abdul Rehman";
	String rollNumber = "0221FBSE064";
	String universityName = "SSEUED";
	String departement = "Software Engineer";
	int age = 20;
	String qualification="Software Engineer";
	
	void readBook() {
		System.out.println("Student is reading book");
	}
	void readBook(String name) {
		System.out.println(name+ " is reading book");
	}
	void readBook(String name,String deptName) {
		System.out.println(name+ " is reading book at "+deptName);
	}
	
	void printName(String name) {
		System.out.println("My name is:"+name);
	}
	
  //Below main method is entry point for our program	
  public static void main(String[] args) {
	  Student jumanOb=new Student();
	  jumanOb.age= 21;
	 
//	  System.out.println("Name "+jumanOb.name);
	  jumanOb.printName(jumanOb.name);
	  System.out.println("Father Name "+jumanOb.fatherName);
	  System.out.println("Roll no "+jumanOb.rollNumber);
	  System.out.println("University "+jumanOb.universityName);
	  System.out.println("Age "+jumanOb.age);
	  System.out.println("Departement "+jumanOb.departement);
	  System.out.println("Qualification "+jumanOb.qualification);
	
	  jumanOb.readBook();
	  jumanOb.readBook(jumanOb.name);
	  jumanOb.readBook(jumanOb.name, jumanOb.departement);
	  
	  System.out.println("####################");
	  Student shafiqueOb=new Student();
	  shafiqueOb.name="Shafique";
	  shafiqueOb.rollNumber="09SW35";
	  shafiqueOb.age=31;
	  
	  //Multiple attributes
	  
	  System.out.println("Name :"+shafiqueOb.name +" Age: "+shafiqueOb.age+ " Roll Number :"+shafiqueOb.rollNumber);
	  
	  shafiqueOb.readBook(shafiqueOb.name);
	  
	  
  }	

}
