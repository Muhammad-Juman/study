package non.access.modidier_static;

import java.util.Scanner;

public class CalculatorInputInStaticBlock {
	 static Scanner input = new Scanner(System.in);

	static {
		System.out.print("Enter First Number : ");
		int a = input.nextInt();
		System.out.print("Enter operator");
		char op = input.next().charAt(0);
		System.out.print("Enter Second Number : ");
		int b = input.nextInt();
		if (op == '*') {
			System.out.println("Multiplication : " + (a * b));
		} else if (op == '/') {
			System.out.println("Division : " + (a / b));
		} else if (op == '+') {
			System.out.println("Addition : " + (a + b));
		} else if (op == '-') {
			System.out.println("Subtraction" + (a - b));
		} else {
			System.out.println("Try Correct Operator");
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello");
	}
}
