package com.dhuyo.accessmodifier_private;

public class StudentBioData {
	//Data
	//Instance variuables 
	private String name;
	private String fatherName;
	private String rollNumber;
	
	public void printName() {
		capitalName();
		System.out.println(name);
	}
	
	public void printFatherName() {
		System.out.println(fatherName);
	}
	
	public void printRollNumber() {
		System.out.println(rollNumber);
	}
	
	public void setName(String str) {
		name=str;
	}
	public void setFatherName(String str) {
		fatherName=str;
	}
	public void setRolLNumber(String str) {
		rollNumber=str;
	}
	
	private void capitalName() {
		name = name.toUpperCase();
	}

}
