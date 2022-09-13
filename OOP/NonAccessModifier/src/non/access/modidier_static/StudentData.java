package non.access.modidier_static;

import java.util.Scanner;

public class StudentData {

	static void studentData() {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = input.nextLine();
		System.out.print("Enter Your Father Name : ");
		String fatherName = input.nextLine();
		System.out.print("Enter Your Age : ");
		int age = input.nextInt();
		System.out.print("Enter Your Roll No : ");
		String rollNo = input.next();
		System.out.print("Enter University Name : ");
		String uni = input.nextLine();
		System.out.print("Enter Departement : ");
		String depart = input.nextLine();

	}

	public static void main(String[] args) {

		StudentData.studentData();
	
		
	}

	
}

