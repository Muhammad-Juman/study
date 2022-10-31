package com.dhuyo.calculator;

public class Calculator extends Operators {
	public void addition() {
		System.out.println("Addition : 2 + 2 = " + (2 + 2));
	}

	public void subtraction() {
		System.out.println("Subtraction : 6 - 2 = " + (6 - 2));
	}

	public void multiplication() {
		System.out.println("Multiplication : 5 * 5 = " + (5 * 5));
	}

	public void division() {
		System.out.println("Division : 6 / 36  = " + (6 / 36));
	}

	public void reminder() {
		System.out.println("Reminder : 21 % 4 = " + (21 % 4));
	}

}
