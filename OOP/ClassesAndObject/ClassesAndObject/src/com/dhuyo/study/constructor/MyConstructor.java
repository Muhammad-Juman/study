package com.dhuyo.study.constructor;

public class MyConstructor {
	
	int a;
	MyConstructor() { // Initializing constructor
		System.out.println("Hello Constructor");
	}

	MyConstructor(String message) { // Initializing constructor
		System.out.println(message);
	}
	
	MyConstructor(int aValue) { // Initializing constructor
		a = aValue;
	}

	

	public static void main(String[] args) {
		MyConstructor b= new MyConstructor();
		MyConstructor ob = new MyConstructor("JUmman");// Calling constructor
		MyConstructor ob1 = new MyConstructor(10);// Calling constructor
		
		System.out.println(ob.a);
		System.out.println(ob1.a);

	}

}
