import java.util.Scanner;
public class WhileLoop4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number:");
		int num=input.nextInt();
		while(1<num){
			System.out.print("X");
			num--;
		}
	}
}