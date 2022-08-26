import java.util.Scanner;
public class WhileLoop3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number:");
		int value=input.nextInt();
		
			
			while(1<=value){
				for(int a=1;a<=value;a++){
				
				System.out.print("X");
			value--;
			}
			value++;
			System.out.println();
			
		}
		
	}
}