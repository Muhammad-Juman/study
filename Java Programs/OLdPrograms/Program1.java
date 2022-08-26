import java.util.Scanner;
public class Program1{
public static void main(String[] args){

Scanner input = new Scanner(System.in);



System.out.print("Enter first number:");
int firstNumber = input.nextInt();

System.out.print("Enter Operation:");
String op = input.next();

System.out.print("Enter second number:");
int secondNumber = input.nextInt();

if(op.equals("+")){
	System.out.println("Addition"+(firstNumber+secondNumber));
}

else if(op.equals("-")){
	System.out.println("Subtraction"+(firstNumber-secondNumber));
}
 
 else if(op.equals("x")){
	System.out.println("Multiply"+(firstNumber*secondNumber));
}

 else if(op.equals("/")){
	System.out.println("Division"+(firstNumber/secondNumber));
}


  }
} 