import java.util.Scanner;
public class MyOperator{
public static void main(String[] args){

Scanner input = new Scanner(System.in);



System.out.print("Enter number:");
int number = input.nextInt();


if(number == 1){
	System.out.println("Print here calander program");
}
else if(number == 2){
	System.out.println("Print here calculator program");
}
else if(number == 3){
	System.out.println("Print here table program");
}
else if(number == 5){
	System.out.println("Please enter number from 1 to 3");
}
else if(number == 4){
	    System.out.print("First name:");
		String First = input.nextLine();
		
		System.out.print("Middle name:");
		String Middle = input.nextLine();
		
		System.out.print("Last name:");
		String Last = input.nextLine();
		
		System.out.print("Father First name:");
		String Father = input.nextLine();
		
		System.out.print("Father Middle name:");
		String Fatherm = input.nextLine();
		
		System.out.print("Father Last name:");
		String Firstn= input.nextLine();
		
		System.out.print("Surname:");
		String Surname = input.nextLine();
		
		System.out.print("Date of Birth:");
		String DateofBirth = input.nextLine();
		
		System.out.print("Place name:");
		String Place = input.nextLine();
		
		System.out.print("Marreid Status:");
		String Married = input.nextLine();
		
		System.out.print("Nationality:");
		String Nationality = input.nextLine();
		
		System.out.print("City:");
		String City = input.nextLine();
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
} 