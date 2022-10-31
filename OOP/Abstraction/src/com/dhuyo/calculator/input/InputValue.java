package com.dhuyo.calculator.input;

public class InputValue extends Operator {
	
	public void addition(int num1 , int num2) {
		System.out.println("Addition : " + (num1 +num2));
	}

	public void subtraction(int num1 , int num2) {
		System.out.println("Subraction : " + (num1-num2));
	}
	
	public void multiply(int num1 , int num2) {
		System.out.println("Multiply : " + (num1*num2));
	}
	
	public void division(int num1 , int num2) {
		System.out.println("Division : " + (num1/num2));
	}
	
	public void reminder(int num1 , int num2) {
		    System.out.println("Reminder : " + (num1%num2));
	}
	
}
