import java.util.Scanner;
public class WhileLoop1{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number:");
	
		int count=input.nextInt();
		while(1<=count){
		for(int a=1;a<=count;a++){
				System.out.print("MJD");
			}
			count--;
			System.out.println();
		}
		
		
	}
}