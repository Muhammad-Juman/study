package com.dhuyo.calculator.input;

public abstract class Operator {
	
	protected abstract void addition(int num1,int num2);
	protected abstract void subtraction(int num1,int num2);
	protected abstract void multiply(int num1 , int num);
	protected abstract void division(int num1 , int num2);
	protected abstract void reminder(int num1 , int num2);
	
}