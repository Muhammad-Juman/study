package com.dhuyo.study.attributes;
import java.util.Scanner;
public class StudentInputData {
void dataInput(String myName,int myAge) {
	System.out.println("My Age Is : "+myAge);
	System.out.println("My Name Is : "+myName);
	
}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter You Name : ");
	String name=input.nextLine();
	System.out.print("Age : ");
	int age=input.nextInt();
	StudentInputData object=new StudentInputData();
	object.dataInput(name, age);
	System.out.println();
	object.dataInput("babo", 40);

	
}
}
