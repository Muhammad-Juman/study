public class MyCalculator2{
	public static void main(String[] args){
		//SECOND CALCULATOR ASSIGNMENT FOR JAVA PROGRAM
		int firstValue = Integer.parseInt(args[0]);
		int secondValue = Integer.parseInt(args[1]);
		int thirdValue = Integer.parseInt(args[2]);
		int fourthValue = Integer.parseInt(args[3]);
		int fivethValue = Integer.parseInt(args[4]);
		int sixthValue = Integer.parseInt(args[5]);
		
		
		System.out.println("A ADDITION B SUBTRACT C : "+(firstValue+secondValue-thirdValue));
		System.out.println("A ADDITION D: "+(firstValue+fourthValue));
		System.out.println("E MULTIPLE B SUBTRACT F : "+(fivethValue*secondValue-sixthValue));
		System.out.println("C ADDITION F MULTIPLE D : "+(thirdValue+sixthValue*fourthValue));
		System.out.println("E DIVISION D MULTIPLE A: "+(fivethValue/fourthValue*firstValue));
		System.out.println("B SUBTRACT F MULTIPLE A: "+(secondValue-sixthValue*firstValue));
		
		
		
	}
  
  }