   import java.util.Scanner;
   
      public class Arithmetic2{
	    public static void main(String[] args){
		   
		   
		   Scanner input= new Scanner(System.in);
		   
		   System.out.print("ENTER First Number:");
		  
		   int firstNumber = input.nextInt();
		   
		   System.out.print("ENTER Operation:");
		   
		   String op = input.next();
		   
		   System.out.print("ENTER Second Number:");
		   
		   int secondNumber = input.nextInt();
		   
		   if(op.equals("+")){
			System.out.print("ADDITION"+(firstNumber+secondNumber));
		   }
		   
		   else if(op.equals("-")){
			System.out.print("SUBTRACTION"+(firstNumber-secondNumber));
		   }
		    
		   else if(op.equals("x")){
			System.out.print("MULTIPLY"+(firstNumber*secondNumber));
		   }
		   
		   
		   else if(op.equals("/")){
			System.out.print("DIVISION"+(firstNumber/secondNumber));
		   }
		   
		   else if(op.equals("%")){
			System.out.print("REMINDER"+(firstNumber%secondNumber));
		   }
		   
		   else{
			   System.out.print("No Any Operation");
			
		   }
		   
		   
		   
		   
		}
		
		
	  }