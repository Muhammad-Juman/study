package com.dhuyo.accessmodifier_default;
import java.util.Scanner;
class StudentInputData {
	void studentDataInput(Scanner user) {
		System.out.print("Enter Your Name : ");
		String name=user.nextLine();
		System.out.print("Enter Your Father Name : ");
		String fatherName=user.nextLine();
		System.out.print("Enter Roll No : ");
		String rollNo=user.nextLine();
		System.out.print("Enter Your University Name : ");
		String uni=user.nextLine();
		
	}
	
public	static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StudentInputData studentObject=new StudentInputData();
		studentObject.studentDataInput(input);
	}
}
