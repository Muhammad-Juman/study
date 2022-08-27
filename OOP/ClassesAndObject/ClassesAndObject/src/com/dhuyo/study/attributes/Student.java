package com.dhuyo.study.attributes;

public class Student {
	
	// Below are student attributes or properties for fields
	String name = "Juman";
	String fatherName = "Abdul Rehman";
	String rollNumber = "0221FBSE064";
	String universityName = "SSEUED";
	String departement = "Software Engineer";
	int age = 20;
	String qualification="Software Engineer";
	
  //Below main method is entry point for our program	
  public static void main(String[] args) {
	  Student obj=new Student();
	  System.out.println("Name "+obj.name);
	  System.out.println("Father Name "+obj.fatherName);
	  System.out.println("Roll no "+obj.rollNumber);
	  System.out.println("University "+obj.universityName);
	  System.out.println("Age "+obj.age);
	  System.out.println("Departement "+obj.departement);
	  System.out.println("Qualification "+obj.qualification);
	  
  }	

}
