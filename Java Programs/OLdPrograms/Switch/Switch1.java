import java.util.Scanner;
	public class Switch1{
	public static void main(String[] args){
		 
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("ONE WEAK DAYS NAME ");
		System.out.println();
		System.out.println("Enter Number");
		int days = input.nextInt();
		
		
		switch (days){
			
			case 1:
			
			System.out.println("First 1 Day is Monday");
			break;
			
			case 2:
			
			System.out.println("Second 2 Day is Tuesday");
			break;
			
			case 3:
			
			System.out.println("Third 3 Day is Wednesday");
			break;
			
			case 4:
			
			System.out.println("Fourth 4 Day is Thursday");
			break;
			
			case 5:
			
			System.out.println("Fifth 5 Day is Friday");
			break;
			
			case 6:
			
			System.out.println("Sixth 6 Day is Saturday");
			break;
			
			case 7:
			
			System.out.println("Seventh 7 Day is Sunday");
			break;
			
			
  			default:
			
			System.out.println("NO MORE DAYS IN ONE WEEK ONLY SEVEN DAYS");
			
			
			
		}
}
  }
 
 
 
 
 