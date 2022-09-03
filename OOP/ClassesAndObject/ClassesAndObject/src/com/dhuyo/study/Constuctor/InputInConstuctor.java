package com.dhuyo.study.attributes;
import java.util.Scanner;
public class InputInConstuctor {
//Create a Constuctor With the Help Of object
	InputInConstuctor(String name,String fName,String rollNo){
		System.out.println("Name : "+name+"Father Name : "+fName+"Roll No : "+rollNo);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//input variable declear
		System.out.print("Enter Your Name ");
		String	name=input.nextLine();
		System.out.print("Enter Your Father Name : ");
		String fatherName=input.nextLine();
		System.out.print("Enter Your Roll No : ");
		String rollNo=input.nextLine();
		
		//Create a Object
		InputInConstuctor object=new InputInConstuctor(name,fatherName,rollNo);
	}
	
}
