package com.dhuyo.study.constructor;
import java.util.Scanner;
public class CalculatorInConstuctor {
   CalculatorInConstuctor(int num1,int num2){
	   System.out.println("Four Operator Run In This Two Numbers");
	   System.out.println("Multiplication : "+(num1*num2));
	   System.out.println("Division : "+(num1/num2));
	   System.out.println("Addition : "+(num1+num2));
	   System.out.println("Subtraction : "+(num1-num2));
   }
   public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter First Number  : ");
	   int a=input.nextInt();
	   System.out.println("Enter Second Number : ");
	   int b=input.nextInt();
	   CalculatorInConstuctor calculatorObject = new CalculatorInConstuctor(a,b);
	   System.out.println();
	   System.out.println("Enter ' Y ' Your Program Again Run And \nYou Not Again Run"
	   		+ " Program Than You Enter N : ");
	   char letter=input.next().charAt(0);
	   		 if(letter=='Y'||letter=='y') {
	   		  System.out.println("Enter First Number  : ");
	   	   int c=input.nextInt();
	   	   System.out.println("Enter Second Number : ");
	   	   int d=input.nextInt();
	   		   CalculatorInConstuctor calculatorObject1 = new CalculatorInConstuctor(c,d);

	   			 
	   		 }
	   		 else if(letter=='N'||letter=='n') {
	   			 
	   		 } 
	   		 else {
	   			 System.out.println("Sorry You Enter Wrong Letter ");
	   		 }
}
   
}
