package com.mjd.single.inheritance;

import java.util.Scanner;

class StudentData {
	void inputStudentData() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = input.nextLine();
		System.out.print("Enter Your Father Name : ");
		String fatherName = input.nextLine();
		System.out.print("Enter University Name : ");
		String uni = input.nextLine();
		System.out.print("Enter Your Roll No : ");
		String rollNo = input.nextLine();
		System.out.println();
		System.out.println("Student Name : " + name);
		System.out.println("Father Name : " + fatherName);
		System.out.println("University : " + uni);
		System.out.println("Roll No : " + rollNo);

	}
}

class StudentDataPrint extends StudentData {
	public static void main(String[] args) {

		StudentDataPrint ob = new StudentDataPrint();
		ob.inputStudentData();

	}
}
