package com.dhuyo.interfaces.multiple.calculator;

public class Calculator implements CalculatorOperators,CalculatorAttributes {
	
	public void addition() {
		System.out.println("Addition : 10 +20 = " + (num1 + num2));
	}
	
	public void subtraction() {
		System.out.println("Subtraction : 20 - 10 =  " + (num2 - num1));
	}

	public void multiply() {
		System.out.println("Multiply : 20 * 10 = " + (num2 * num1));
	}
	
	public void division() {
		System.out.println("Division : 10 / 20 = " + (num1 / num2));
	}
	
}
