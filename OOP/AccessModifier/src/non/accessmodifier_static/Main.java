package non.accessmodifier_static;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(ClassWithStatic.x);
		System.out.println(ClassWithStatic.name);
		System.out.println("Static methods");
		ClassWithStatic.printName();
		ClassWithStatic.setName("Shafique");
		ClassWithStatic.printName();
		System.out.println(ClassWithStatic.name);
		methodDetails();
		
		System.out.println("pi value"+Math.PI);
		
     
	}
	
	static void methodDetails() {
		System.out.println("Hello! I am static method. Call me without create object");
	}

}
