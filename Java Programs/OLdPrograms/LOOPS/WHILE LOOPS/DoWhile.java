import java.util.Scanner;
public class DoWhile{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		System.out.print("ENTER NUMBER:");
		
		int number=input.nextInt();
		
		boolean condition=true;
		do{
			System.out.println("HELLO MUHAMMAD JUMMAN DHUYO");
			
			condition=false;
		}
		while(condition);
	}
}