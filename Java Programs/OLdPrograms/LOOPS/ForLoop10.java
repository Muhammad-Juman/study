import java.util.Scanner;
public class ForLoop10{
public static void main(String[] args){
	System.out.print("Enter Even Number :");
	Scanner input = new Scanner(System.in);
	int number = input.nextInt();
	for(int x=2;x<=number;x=x+2){
		System.out.println("EVEN NUMBER :" + x);
	}
}
}