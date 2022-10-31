package com.dhuyo.calculator.input;

import java.util.Scanner;

public class DisplayInputCalculator extends InputValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Addition ");
		System.out.print("Enter First Number : ");
		int no1 = input.nextInt();
		System.out.print("Enter Second Number :");
		int no2 = input.nextInt();
		DisplayInputCalculator inputCalculator = new DisplayInputCalculator();
		inputCalculator.addition(no1, no2);
		System.out.println("Subtraction");
		System.out.print("Enter First Number : ");
		int numb1 = input.nextInt();
		System.out.print("Enter Second Number :");
		int numb2 = input.nextInt();
		inputCalculator.subtraction(numb1, numb2);
		System.out.println("Multiply");
		System.out.print("Enter First Numb  er : ");
		int numbe1 = input.nextInt();
		System.out.print("Enter Second Number :");
		int numbe2 = input.nextInt();
		inputCalculator.multiply(numbe1, numbe2);
		System.out.println("Division");
		System.out.print("Enter First Number : ");
		int number1 = input.nextInt();
		System.out.print("Enter Second Number :");
		int number2 = input.nextInt();
		inputCalculator.division(number1, number2);
		System.out.println("Reminder");
		System.out.print("Enter First Number : ");
		int nu1 = input.nextInt();
		System.out.print("Enter Second Number :");
		int nu2 = input.nextInt();
		inputCalculator.reminder(nu1, nu2);

	}

}
