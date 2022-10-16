package com.mjd.multilevel.inheritance;

import java.util.*;

public class Calculcator {
	void simpleCalculator() {
		System.out.println("Addition 2+2 = " + (2 + 2));
		System.out.println("Subtraction 2-2 = " + (2 - 2));
		System.out.println("Multiplication 2*2 = " + (2 * 2));
		System.out.println("Division 2/2 = " + (2 / 2));

	}
}

class InputCalculator extends Calculcator {
	void inputCalculator() {
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

class Display extends InputCalculator {
	public static void main(String[] args) {
		Display ob = new Display();
		System.out.println("First Class Method");
		ob.simpleCalculator();
		System.out.println();
		System.out.println("Second Class Method");
		ob.inputCalculator();
	}
}
