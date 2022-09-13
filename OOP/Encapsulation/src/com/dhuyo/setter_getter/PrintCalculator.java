package com.dhuyo.setter_getter;

public class PrintCalculator {

	public static void main(String[] args) {

		Calculator calculatorObject = new Calculator();
		calculatorObject.setFirstNum(10);
		calculatorObject.setSecondNum(20);
		calculatorObject.doCalculation();
		System.out.println("First Number : " + calculatorObject.getFirstNum());
		System.out.println("Second Number : " + calculatorObject.getSecondNum());
		System.out.println("" + calculatorObject.getTotalNum());

	}
	
}
