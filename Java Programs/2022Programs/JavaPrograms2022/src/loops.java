import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollBarUI;
public class loops {
	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
//		System.out.print("Enter Your Table Number :");
//		int number=user.nextInt();
////		int num=1;
//		for(num=1;num<=10;num++) {
//			System.out.println(number+"x"+num+"="+num*number);
//			
//		}
//		while(num<=10) {
//			System.out.println(number+"x"+num+"="+num*number);
//			num++;
//		}
//		do {
//			System.out.println(number+"x"+num+"="+num*number);
//			num++;
//		}
//		while(num<=10);
	
//		System.out.print("Enter Your Array Number To How Many Times Run Array :");
//		int number=user.nextInt();
//		System.out.print("Enter Your Array Numbers :");
//		int array[]=new int[number];
//		for(int i =0 ;i < number;i++) {
//			 array[i]=user.nextInt();
//		}
//		
//		System.out.print("This Is Your Array Numbers :");
//		
//		for(int b : array) {
//			System.out.print(b +" ");
//		}	
//		float number1,number2,multiply;
//		System.out.println("Enter Your First Float Number :");
//		number1=user.nextFloat();
//		System.out.println("Enter Your Second Float Number :");
//		number2=user.nextFloat();
//		multiply=number1*number2;
//		System.out.println("Your Answer Multiply :"+multiply);
//		
//		
		
//		System.out.print("Enter Your Number :");
//		int number1=user.nextInt();
//		System.out.print("Enter Your Number Power :");
//		int number2=user.nextInt();
//		System.out.println(Math.pow(number1,number2));
//		System.out.println("Enter Your Number ");
//		int number=user.nextInt();
//		System.out.println(Math.sqrt(number));
//		System.out.println(number);
//		System.out.println("Enter Your Number");
//		int number=user.nextInt();
//		System.out.println(Math.ceil(number));	
//		System.out.print("Enter number :");
//		int number=user.nextInt();
//		while(number>=0) {
//			if(number%2==0) {
//				System.out.println("Your Number Is Even "+number);
//				break;
//			}
//			else{
//				System.out.println("Your Number Is Odd "+number);
//				break;
//			}
//		}		
//		swich case calculator	
//		int num1,num2,result;
//		System.out.print("Enter your first number ");
//		num1=user.nextInt();
//		System.out.print("Enter Your Operator ");
//		String operator=user.next();
//		System.out.print("Enter Your Second Number ");
//		num2=user.nextInt();
//		switch(operator) {
//		case"+":result=num1+num2;
//			System.out.println("Addition "+result);
//			break;
//		case"-":result=num1-num2;
//			System.out.println("Subtraction "+result);
//			break;
//		case"*":result=num1*num2;
//			System.out.println("Multiplication "+result);
//			break;
//		case"/":result=num1/num2;
//			System.out.println("Division "+result);
//			break;
//		case"%":result=num1%num2;	
//			System.out.println("Reminder "+result);
//			break;
//		}
//		use ??? 
//		int num1,num2,num3,value;
//	  System.out.print("Enter Your Number");	
//	 num1=user.nextInt();
//	 System.out.print("Enter Your Number");
//	 num2=user.nextInt();
//	 System.out.print("Enter Your Number");
//	 num3=user.nextInt();
//	 value= (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
//	 System.out.println("Result Who number is Greater "+value);	
//		int num1,num2,num3,num4,result;
//		System.out.println("Enter Your Number ");
//		num1=user.nextInt();
//		System.out.println("Enter Your Number ");
//		num2=user.nextInt();
//		System.out.println("Enter Your Number ");
//		num3=user.nextInt();
//		System.out.println("Enter Your Number ");
//		num4=user.nextInt();
//	result=(num1>num2)?(num1>num3?num1:num3)?(num2>num3)?(num2>num3?num2:num3):(num3>num4?num3:num4)
//		//1 dimention Array Program
//		System.out.print("Enter Array Size :");
//		int arraySize=user.nextInt();
//		int array[]=new int[arraySize];
//		System.out.println("Enter Five Number :");
//		for(int a=0;a<arraySize;a++) {
//			array[a]=user.nextInt();
//		}
//		System.out.print("Your Numbers :");
//		for(int b:array) {
//			System.out.print(b+" ");	
//		}
//		//2D Array
//		int row,colume;
//		System.out.print("Enter Matrix Row Number :");
//		row=user.nextInt();
//		System.out.print("Enter Matrix Colume Number :");
//		colume=user.nextInt();
//		int array[][]=new int[row][colume];
//		for(int i=0;i<row;i++) {
//			System.out.println("Row Number "+i+" : ");
//			for(int j=0;j<colume;j++) {
//				System.out.print("Colume Number "+j+" : ");
//				array[i][j]=user.nextInt();
//		}		
//			}
//		System.out.println();
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<colume;j++) {
//				System.out.print(array[i][j]+" ");	
//			}	
//			System.out.println();
//		}
//	
//		int num1, num2 ,sum;
//		num1=user.nextInt();
//		num2=user.nextInt();
//		sum=num1+num2;
//		System.out.print(sum);
		//pattern problems 1
//		System.out.println("Enter Your Number :");
//		int num=user.nextInt();
//		for(int i=1;i<=num;i++){
//			for(int j=4;j>=i;j--){
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		//pattern 2
//		System.out.print("Enter Your Row Number ");
//		int row=user.nextInt();
//		for(int i=1;i<=row;i++){
//			for(int j=1;j<=row-i;j++){
//				System.out.print(" ");
//		}
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//				}
		//pattern no 3
//		System.out.print("Enter Row Number ");
//		int row=user.nextInt();
//		for(int i =1;i<=row;i++) {
//                                       
//			for(int a=1;a<=i-1;a++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=row-i+1;j++) {
//				System.out.print(j);
//				
//			}
//			System.out.println();
//		}
		
		//pattern no 4
		int num=1;
		System.out.print("Enter Row Number :");
		int row=user.nextInt();
		for(int i =1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
		
	
		
		
	}

}