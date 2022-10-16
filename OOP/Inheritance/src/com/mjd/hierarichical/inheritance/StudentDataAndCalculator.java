package com.mjd.hierarichical.inheritance;

import java.util.*;

class StudentData {
	void studentData() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Name :  ");
		String name = input.nextLine();
		System.out.print("Enter Father Name :  ");
		String fatherName = input.nextLine();
		System.out.print("Enter University Name : ");
		String uni = input.nextLine();
		System.out.print("Enter Your Department : ");
		String department = input.nextLine();
		System.out.print("Enter Your Roll No :  ");
		String rollNo = input.nextLine();
		System.out.println();
		System.out.println("Student Name : "+name);
		System.out.println("Father Name : "+fatherName);
		System.out.println("University   :  "+uni );
		System.out.println("Department : "+department);
		System.out.println("Roll No : "+rollNo);
	}
	
}

class Calculator{
	void calculator() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int firstNum = input.nextInt();
		System.out.print("Enter Opperator : ");
		char opperator = input.next().charAt(0);
		System.out.print("Enter Second Number : ");
		int secondNum = input.nextInt();
		switch (opperator) {
		case '+':
			System.out.print("Addition " + (firstNum + secondNum));
			break;
		case '*':
			System.out.print("Multiplication " + (firstNum * secondNum));
			break;
		case '/':
			System.out.print("Division " + (firstNum / secondNum));
			break;
		case '-':
			System.out.print("Subtraction " + (firstNum - secondNum));
			break;
		}

	}
}


class Display {
	public static void main(String[] args) {
		StudentData ob1 = new StudentData();
		ob1.studentData();
		System.out.println();
		Calculator ob2 = new Calculator();
		ob2.calculator();
		
	}
}

