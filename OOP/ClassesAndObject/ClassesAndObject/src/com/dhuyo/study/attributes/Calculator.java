package com.dhuyo.study.attributes;
 import java.util.Scanner;
public class Calculator {
		int num1=2;
		int num2=4;
		void addition() {
			System.out.println("Addition "+num1+" "+num2+" = "+num1+num2);
		}
		void multiply() {
			System.out.println("Multiplication "+num1+" "+num2+" = "+num1*num2);
		}
		void subtraction() {
			System.out.println("Subtraction "+num2+" "+num1+" = "+num2);
		}
		
		public static void main(String[] args) {
			Calculator object=new Calculator();
			object.addition();
			object.multiply();
			object.subtraction();
		}
}
