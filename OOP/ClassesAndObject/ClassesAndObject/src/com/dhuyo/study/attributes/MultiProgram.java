package com.dhuyo.study.attributes;

import java.util.Scanner;

public class MultiProgram {
	// Declare a variable
	int num1;
	int num2;
	int num3;

	// This method will print input teacher Data
	void printStudentData(int num1) {
		Scanner input = new Scanner(System.in);
		System.out.println("    Teacher Information   ");
		System.out.print("Enter Your Name : ");
		String name = input.nextLine();
		System.out.print("Enter Your Father Name : ");
		String fatherName = input.nextLine();
		System.out.print("Enter Your Qualification : ");
		String qualifi = input.nextLine();
		System.out.print("Enter Your Subject :");
		String subject = input.nextLine();
		System.out.print("Write Your Experience : ");
		String experience = input.nextLine();
		// Now Print Data
		System.out.println("Print Your Input Data");
		System.out.println("Name : " + name + "\nFather Name : " + fatherName + "\nQualification : " + qualifi
				+ "\nSubject : " + subject + "\nExperience : " + experience);

	}

//This method input student data
	void studentData(int num2) {
		Scanner input = new Scanner(System.in);
		System.out.println("   Student Information   ");
		System.out.print("Enter Your Name : ");
		String name = input.nextLine();
		System.out.print("Enter Your Father Name : ");
		String fatherName = input.nextLine();
		System.out.print("Enter Your Roll No :");
		String rollNo = input.nextLine();
		System.out.print("Enter Your University Name : ");
		String uni = input.nextLine();
		System.out.println("Enter Your Departement : ");
		String depart = input.nextLine();
		// Now Print Data
		System.out.println("Print Your Input Data");
		System.out.println("Name : " + name + "\nFather Name : " + fatherName + "\nRoll No : " + rollNo
				+ "\nUniversity : " + uni + "\nDepartement : " + depart);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//Create A Object With The Help Of New Keyword
		MultiProgram object = new MultiProgram();
// Call Method 1
		System.out.print("Enter number 1 and Teacher Data Input  : ");
		int number1 = input.nextInt();
		object.num1 = number1;
		object.printStudentData(number1);
//Call Method 2
		System.out.print("Enter number 2 and Student Data Input : ");
		int number2 = input.nextInt();
		object.num2 = number2;
		object.studentData(number2);
	}
}
