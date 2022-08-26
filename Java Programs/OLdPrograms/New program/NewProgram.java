import java.util.Scanner;
public class NewProgram{
public static void main(String[] args){
	
Scanner input = new Scanner(System.in);
	
	
	
System.out.print("Enter int number :");
int intNumber = input.nextInt();

System.out.print("Enter long number :");
long longNumber = input.nextLong();

System.out.print("Enter float number :");
float floatNumber = input.nextFloat();

System.out.print("Enter double number :");
double doubleNumber = input.nextDouble();

System.out.print("Enter short number :");
short shortNumber = input.nextShort();

System.out.print("Enter byte number :");
byte byteNumber = input.nextByte();

System.out.print("Enter boolean value :");
boolean booleanValue = input.nextBoolean();

		System.out.println();
		System.out.println();
		System.out.println("Now Print");
		System.out.println();
System.out.println("your int number :" + intNumber);
System.out.println("your long Number :" + longNumber);
System.out.println("your float Number :" + floatNumber);
System.out.println("your double Number :" + doubleNumber); 
System.out.println("your short Number :" + shortNumber);
System.out.println("your byte Number :" + byteNumber);
System.out.println("your boolean Value :" + booleanValue);
	
}  
}
	