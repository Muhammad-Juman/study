package com.dhuyo.setter_getter;

import java.util.Scanner;

public class PrintInputCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		InputCalculator inputObject = new InputCalculator();
		System.out.println("Enter First Number ");
		int first = input.nextInt();
		inputObject.setFirstNum(first);
		System.out.println("Enter Second Number ");
		int second = input.nextInt();
		inputObject.setsecondNum(second);
		inputObject.setTotalNum();
		System.out.println("First Number : " + inputObject.getFirstNum());
		System.out.println("Second Number : " + inputObject.getSecondNum());
		System.out.println("Addition : " + inputObject.getTotalNum());

	}

}
