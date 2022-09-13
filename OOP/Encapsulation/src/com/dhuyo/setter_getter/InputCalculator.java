package com.dhuyo.setter_getter;

public class InputCalculator {

	private int firstNum;
	private int secondNum;
	private int totalNum;

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

	public void setsecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void setTotalNum() {
		totalNum = firstNum + secondNum;
	
	}

}
