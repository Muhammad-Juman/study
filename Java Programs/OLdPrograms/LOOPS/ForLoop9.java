import java.util.Scanner;
public class ForLoop9{
public static void main(String[] args){
	System.out.print("ENTER ODD NUMBER :");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	for(int a=1;a<=num;a=a+2){
		System.out.println("ODD NUMBER :" + a);
	}
}
}