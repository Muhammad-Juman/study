import java.util.Scanner;
public class WhileLoop5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number:");
		int value=input.nextInt();
		
		
		
		for(int a=1;a<=value;a++){
			while(1<=value){
				System.out.print("X");
				
				value--;
			}
			System.out.println();
		}
		boolean condition=true;
		do{
			System.out.print("HELLO");
			condition=false;
		}
		while(condition);
	}
}