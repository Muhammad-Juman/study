package com.dhuyo.study;

public class TDArray {
	
	public void printTDArray() {
		
		int[][] intArray= new int[4][5];
		intArray[0][0] = 11;
		intArray[0][1] = 11;
		intArray[0][2] = 11;
		intArray[0][3] = 11;
		intArray[0][4] = 11;
		
		intArray[1][0] = 22;
		intArray[1][1] = 22;
		intArray[1][2] = 22;
		intArray[1][3] = 22;
		intArray[1][4] = 22;
		
		intArray[2][0] = 33;
		intArray[2][1] = 33;
		intArray[2][2] = 33;
		intArray[2][3] = 33;
		intArray[2][4] = 33;
		
		intArray[3][0] = 44;
		intArray[3][1] = 44;
		intArray[3][2] = 44;
		intArray[3][3] = 44;
		intArray[3][4] = 44;
		
	
		
		for(int i =0; i < intArray.length;i++) {
			for(int j =0; j < intArray[i].length;j++) {
				System.out.print(intArray[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		TDArray ob = new TDArray();
		ob.printTDArray();
		

	}

}
