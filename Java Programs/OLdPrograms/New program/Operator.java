import java.util.Scanner;
public class Operator{
public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int a = input.nextInt();
		
		System.out.print("Enter operator :");
		String operator = input.next();
		
		System.out.print("Enter b number :");
		int b = input.nextInt();
		
		if(operator.equals("+"))
		   System.out.print(a = a+b);
		
		
		else if(operator.equals("-"))
			System.out.print(a -= b);
		
		else if(operator.equals("*"))
			System.out.print(a *= b);
		
		else if(operator.equals("/"))
			System.out.print(a /= b);
		
		else if(operator.equals("%"))
			System.out.println(a %= b);
			
		
		if(operator.equals("&&") || operator.equals("||") || operator.equals("!") ){
			
		System.out.println("Now Logical Operator");
		System.out.println();
		System.out.println("A Value Big Compare To B");
		System.out.println();
		System.out.println();
		
		 if(operator.equals("&&")){
			System.out.println(a > b && b < a);
		}
		else if(operator.equals("&&")){
			System.out.println(a < b && b > a);
		}
		else if(operator.equals("||")){
			System.out.println(a > b || b < a);
			
		}
		else if(operator.equals("||")){
			System.out.println(a > b || a < b);
		}
		else if(operator.equals("||")){
			System.out.println(a < b || b > a);
		}
		else if(operator.equals("!")){
			System.out.println(!(a < b));
		}
		else if(operator.equals("!")){
			System.out.println(!(a > b));
		}
			
		}
		
		
		
    } 	
		

}