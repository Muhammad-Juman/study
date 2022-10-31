package com.dhuyo.calculator;

public class DisplayCalculator extends Calculator{
	public static void main(String[] args) {
		DisplayCalculator display = new DisplayCalculator();
		System.out.println("Simple Calculator");
		display.addition();
		display.subtraction();
		display.division();
		display.multiplication();
		display.reminder();

	}

}
