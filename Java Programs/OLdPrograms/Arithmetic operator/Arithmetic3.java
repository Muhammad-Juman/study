import java.util.Scanner;
 
 public class Arithmetic3{
	
	public static void main(String[] args){
		
	
		
			Scanner input= new Scanner(System.in);
	
	       System.out.print("enter number:");
		   
		   
	       String sterNum = input.nextLine();
		
		int number = Integer.parseInt(sterNum);
		 
		//int number1 = Integer.parseInt(sterNum);
		 
		int reminderValue= number % 2;
		
		if(reminderValue == 0 ){
			
			System.out.println("THIS IS EVEN NUMBER");
		}
		
		else{
			
			
			System.out.println("THIS IS ODD NUMBER");
			
		}
		
	}
}