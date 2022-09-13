package non.access.modidier_static;

public class CalculatorInStaticBlock {
	static int firstNum = 10;
	static int secondNum = 20;

	static {
		System.out.println("FirstNumber " + firstNum);
		System.out.println("Second Number " + secondNum);
		System.out.println();
	}
	static {
	System.out.println("Multiplication " + firstNum + " and " + secondNum + " = " + (firstNum * secondNum));
	}
	static {
		System.out.println("Division " + firstNum + " and " + secondNum + " = " + (firstNum / secondNum));
	}
	static {
		System.out.println("Addition " + firstNum + " and " + secondNum + " = " + (firstNum + secondNum));
	}
	static {
		System.out.println("Subtraction " + firstNum + " and " + secondNum + " = " + (firstNum - secondNum));
	}

	public static void main(String[] args) {

	}

}
