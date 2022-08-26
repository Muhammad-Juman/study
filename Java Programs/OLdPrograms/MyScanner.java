     import java.util.Scanner;
	 
    public class MyScanner{	
        public static void main(String[] args){
	
  
	     Scanner input= new Scanner(System.in);
	
	       System.out.print("First name:");
	       String first = input.nextLine();
		   
	       System.out.print("Middle name:");
	       String middle = input.nextLine();
		   
	       System.out.print("Last name:");
	       String last = input.nextLine();
		   
	       System.out.print("Father name:");
           String father = input.nextLine();
	
	
	        System.out.println("WELCOME TO JAVA: "+first); 
            System.out.println("WELCOME TO JAVA: "+middle);
            System.out.println("WELCOME TO JAVA: "+last);
	        System.out.println("WELCOME TO JAVA MJD FATHER: "+father)
	
	
  }
}