import java.util.Scanner;
public class SquareRootResolver{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

/**
 (a+b)2 = a2+2ab+b2

**/

System.out.print("Enter a value:");
int a = input.nextInt();

System.out.print("Enter b value:");
int b = input.nextInt();

double result = Math.pow(a,2)+(2*a*b)+Math.pow(b,2);

System.out.print(result);

 


  }
} 