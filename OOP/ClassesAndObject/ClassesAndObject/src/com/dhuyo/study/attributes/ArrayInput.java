package com.dhuyo.study.attributes;
import java.util.Scanner;
public class ArrayInput {

	void inputArray(int row,int column) {
		Scanner input=new Scanner(System.in);
		int[][] array=new int[row][column];
		for(int i = 0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print("Enter Array Value Row ["+i+"] and Column ["+j+"] : ");
				array[i][j]=input.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter Row Number : ");
	int row=input.nextInt();
	System.out.print("Enter Column Number : ");
	int column=input.nextInt();
	ArrayInput object=new ArrayInput();
	object.inputArray(row, column);

}
}
