package com.dhuyo.interfaces.calculator;

public  interface CalculatorOperators {
	
	public  void addition();
	public  void subtraction();
	public  void multiply();
	public  void division();
	
	public default void showMsg() {
		System.out.println("Hello Default");
	}
	
}
