package com.dhuyo.study.attributes;
//import java.utile.Scanner;
public class StudentDataInConstuctor {
//Create Constuctor
StudentDataInConstuctor(String name,String fatherName,String rollNo,String uni,String depart,String home){
	//Print Constuctor	
	System.out.println("Name : "+name+"\nFather Name : "+fatherName+"\nRoll No : "+rollNo+
	"\nUniversity : "+uni+"\nDepartement : "+depart+ "Home Adders : "+home);
		
	}
//Create main method
public static void main(String[] args) {
	//Create a object and Value Sign With The Help Of Constuctor
StudentDataInConstuctor object=new StudentDataInConstuctor("Juman","Abdul Rehman","2021f-BSE-264",
			"SSUET","Software","Larkana"	);
	}
	
}
