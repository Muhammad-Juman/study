import java.util.Scanner;
public class Functions {
//	public static void evenOrOdd(int num) {
//	if(num%2==0) {
//		System.out.println(num+" Is Even Number");
//	}
//	else {
//		System.out.println(num+" Is Odd Number");
//	}
//	return;
//}
//	public static void main(String[]args) {
//	Scanner input=new Scanner(System.in);
//	System.out.print("Enter Your Number :");
//	int num=input.nextInt();
//	evenOrOdd(num);
//}
	
///   Second Program
	
//	public static void main(String[]args) {
//		Scanner input=new Scanner(System.in);
//		System.out.print("Enter Table Number :");
//		int num=input.nextInt();
//		table(num);
//	}
//	public static void table(int num) {
//		int table=10;
//		for(int i=1;i<=table;i++) {
//			System.out.println(num+"*"+i+"="+num*i);
//		}
//	}
	
	/// Third Program
	
//	public static void main(String[]args) {
//		Scanner user=new Scanner(System.in);
//		System.out.print("Enter Your 1st Number :");
//		int num1,num2,num3;
//		num1 =user.nextInt();
//		System.out.print("Enter Your 2nd Number :");
//		num2=user.nextInt();
//		System.out.print("Enter Your 3rd Number :");
//		num3=user.nextInt();
//		int sum=num1+num2+num3;
//		System.out.println("Sum of all  Number :"+sum);
//		inputFunction(sum);
//	}
//	    public static void inputFunction(int sum) {
//		int average;
//		average=sum/3;
//		System.out.print("Average :"+average);
//
// }
	
	///FourtProgram
	
//	    public static void oddFunction() {
//		Scanner input =new Scanner(System.in);
//		System.out.print("Enter Your Start Number :");
//		int start=input.nextInt();
//		System.out.print("Enter Your End Number :");
//		int end=input.nextInt();
//		for(int i=start;i<=end;i++) {
//			if(i%2!=0) {
//				System.out.println(i+" This Is Odd Number");
//			}
//		}
//
//	}
//	    public static void main(String[] args) {
//		oddFunction();
//	}
	
	///fifth program
	
//	    public static void greater() {
//		Scanner input=new Scanner(System.in);
//		System.out.print("Enter Your First Number :");
//		int num1=input.nextInt();
//		System.out.print("Enter Your Second Number");
//		int num2=input.nextInt();
//		if(num1>num2) {
//			System.out.println(num1+" is greater than "+num2);
//		}
//		else if(num1<num2) {
//			System.out.print(num2+" is greater than "+num1);
//		}
//		else {
//			System.out.println("Both are same numbers");
//		}
//	}
//	   public static void main(String[] args) {
//		greater();
//	}
	
///     sixth program
	
//	    public static void AreaRadius() {
//		Scanner input=new Scanner(System.in);
//		double radius,area;
//		System.out.print("Enter Area Of Radius ");
//		radius=input.nextInt();
//		area=Math.PI*radius*radius;
//		System.out.println("Area "+area);
//	}
//	    public static void main(String[] args) {
//		AreaRadius();
//	}
	
	/// Seventh Program
	
//	    public static void VoteFunction() {
//		Scanner input=new Scanner(System.in);
//		System.out.print("Enter Your Age :");
//		int age=input.nextInt();
//		if(age>=18) {
//			System.out.println("You Are Eligible For Vote");
//		}
//		else {
//			System.out.println("Your Are Not Eligible For Vote");
//		}
//	}
//	   public static void main(String[] args) {
//		VoteFunction();
//	}
	
	///Eigth Program
	
//	  public static void InfinityLoop() {
//		while(true) {
//			System.out.println("Infinity Loop");
		}
	}
	 public static void main(String[] args) {
		InfinityLoop();
	}
	
	///Nineth Program
	 
	 public static void CountFunction() {
	 Scanner user = new Scanner(System.in);
	 System.out.print("Enter Your Number :");
	 int num=user.nextInt();
	 int countPositive = 0 , countNegative = 0 ,countZeros = 0; 
	 	if(num>0) {
			countPositive++;
			//System.out.println("All Positive Numbers :"+sum);
		}
		else if(num<0) {
			countNegative++;
			//System.out.println("All Negative Numbers :"+sum);
		}
		else {
			countZeros++;
			//System.out.println("All Zeros :"+sum);
		}
	 
		System.out.println("Positive Numbers : "+countPositive);
		System.out.println("Negative Numbers : "+countNegative);
		System.out.println("ZerosNumbers : "+countZeros);
		
	}
		
				
	public static void main(String[] args) {
		CountFunction();
		
	}
	}




