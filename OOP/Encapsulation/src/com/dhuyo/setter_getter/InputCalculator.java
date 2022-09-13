package com.dhuyo.setter_getter;

public class InputCalculator {

	private int firstNum;
	private String operator;
	private int secondNum;
	private int totalNum;

	public int getFirstNum() {
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public int getTotalNum() {
		switch(this.getOperator()) {
		case "+":
			totalNum = this.getFirstNum() + this.getSecondNum();
			break;
		case"-":
			totalNum=this.getFirstNum() - this.getSecondNum();
			break;
		case "*":
			totalNum=this.getFirstNum() * this.getSecondNum();
			break;
		case "/":
			totalNum=this.getFirstNum() / this.getSecondNum();
			break;
		}
		
		return totalNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
		}
	
	private String getOperator() {
		return operator;
	}
}
