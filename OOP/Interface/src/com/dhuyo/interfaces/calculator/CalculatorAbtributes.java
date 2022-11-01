package com.dhuyo.interfaces.calculator;

public class CalculatorAbtributes implements CalculatorOperators {
	public void addition() {
		System.out.println("2 + 2 = " + (2+2));
	}
	
	public void subtraction() {
		System.out.println("3 - 1 = " + (3-1));
	}

	public void multiply() {
		System.out.println("5 * 5 = " + (5*5));
	}
	
	public void division() {
		System.out.println("5 / 25 = " + (5/25));
	}
	
}
