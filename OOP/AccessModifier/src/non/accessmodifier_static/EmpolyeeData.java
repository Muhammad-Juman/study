package non.accessmodifier_static;

import java.util.Scanner;

public class EmpolyeeData {
	// create a static variable
	static String company = "The MJD Software";

	// create constuctor and value sign in constuctor
	EmpolyeeData(String name, int salary) {
		System.out.println("Hello " + name + "\nYour Salary Is " + salary + "\nCompany " + company);
	}

	// create a main method
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		// enter number to how many time run loop
		System.out.print("Enter Total Empolyee : ");
		int totalEmpolyee = input1.nextInt();
		// For loop use for multi time input data
		for (int a = 1; a <= totalEmpolyee; a++) {
			Scanner input = new Scanner(System.in);
			System.out.println();
			// enter empolyee name and salary
			System.out.print("Enter Empolyee Number " + a + " Name : ");
			String empolyeeName = input.nextLine();
			System.out.print("Enter Empolyee Number " + a + " Salary : ");
			int empolyeeSalary = input.nextInt();
			// create a object
			EmpolyeeData Empolyee = new EmpolyeeData(empolyeeName, empolyeeSalary);

		}

	}

}
