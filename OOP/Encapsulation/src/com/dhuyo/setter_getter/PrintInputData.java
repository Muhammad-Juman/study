package com.dhuyo.setter_getter;

import java.util.Scanner;

public class PrintInputData {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// create a object and call method
		InputData ob = new InputData();
		// set value in user and add setter Method
		System.out.print("Enter Your Name : ");
		String name = input.nextLine();
		ob.setName(name);
		System.out.print("Enter Father Name : ");
		String fName = input.nextLine();
		ob.setFatherName(fName);
		System.out.print("Enter Your Age : ");
		int age = input.nextInt();
		ob.setMyAge(age);
		System.out.print("Enter Your Roll No : ");
		String rollNo = input.next();
		ob.setMyRollNo(rollNo);
		// call getter Method
		System.out.println();
		System.out.println("Name : " + ob.getName());
		System.out.println("Father Name : " + ob.getFatherName());
		System.out.println("Age : " + ob.getAge());
		System.out.println("Roll No : " + ob.getRollNo());

	}
}
