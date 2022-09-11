package com.dhuyo.setter_getter;

public class StudentData {

	// private instance variable

	private String name;
	private String fatherName;
	private String rollNo;
	private int age;
	private char section;
	private String uni;
	private String departement;

	// create Getter Method

	public String getName() {
		return name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public int getAge() {
		return age;
	}

	public char getSection() {
		return section;
	}

	public String getUniversity() {
		return uni;
	}

	public String getDepartement() {
		return departement;
	}

	// create Setter Method

	public void setName(String yourName) {
		name = yourName;
	}

	public void setFatherName(String fName) {
		fatherName = fName;
	}

	public void setRollNo(String rollNum) {
		rollNo = rollNum;
	}

	public void setAge(int ageNo) {
		age = ageNo;
	}

	public void setSection(char sect) {
		section = sect;
	}

	public void setUni(String university) {
		uni = university;
	}

	public void setDepart(String depart) {
		departement = depart;
	}

}
