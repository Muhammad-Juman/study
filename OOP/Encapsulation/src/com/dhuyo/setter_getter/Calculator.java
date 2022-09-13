package com.dhuyo.setter_getter;

public class Calculator {

	private int firstNum;
	private int secondNum;
	private int totalNum;

	Calculator(){
		this.totalNum=firstNum/secondNum;
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

	public void setTotalNum() {
		this.totalNum = firstNum + secondNum;
	}

}
