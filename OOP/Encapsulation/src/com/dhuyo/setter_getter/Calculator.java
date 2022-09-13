package com.dhuyo.setter_getter;

public class Calculator {

	private int firstNum;
	private int secondNum;
	private int totalNum;

	public Calculator() {

	}

	public Calculator(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.totalNum = getFirstNum() + getSecondNum();
	}

	public int getFirstNum() {
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void doCalculation() {
		this.totalNum = firstNum + secondNum;
	}

}
