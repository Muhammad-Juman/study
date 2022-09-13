package com.dhuyo.return_keyword;

import com.dhuyo.setter_getter.Calculator;
import com.dhuyo.setter_getter.InputData;
import com.dhuyo.setter_getter.StudentData;

public class Main {
	static String name = "JUman";

	public static void main(String[] args) {
		printName();
		String name = getName();
		System.out.println(name);

		System.out.println(getAge());

		String[] names = getStudentsName();

		System.out.println("For each loop");

		for (String s : names) {
			System.out.println(s);
		}

		System.out.println("Normal For loop");
		for (int i = 0; i < names.length; i++) {
			String s = names[i];
			System.out.println(s);
		}

		System.out.println("For each loop for Student Data Array");
		for (StudentData sd : composeAndReturnStudentData()) {
			System.out.println(sd.getName());

		}
		
		
		Calculator cal = getCalculatorObject();
		cal.setFirstNum(10);
		cal.setSecondNum(10);
		cal.doCalculation();
		System.out.println(cal.getTotalNum());
		
		System.out.println("Two parameters Calculator constructot");
		
		Calculator cal1 = new Calculator(15, 15);
		System.out.println(cal1.getTotalNum());

	}

	public static void printName() {
		System.out.println("Hello Juman");
	}

	public static String getName() {
		return name;

	}

	public static int getAge() {
		return 21;
	}

	public static String[] getStudentsName() {
		String[] names = { "Juman", "Shafique", "Habib", "Hafeez" };
		return names;

	}

	public static StudentData[] composeAndReturnStudentData() {
		StudentData[] studentDataArray = new StudentData[10];

		for (int i = 0; i < studentDataArray.length; i++) {
			StudentData ob = new StudentData();
			ob.setName("Juman " + i);
			studentDataArray[i] = ob;
		}

		return studentDataArray;

	}

	public static Calculator getCalculatorObject() {
		return new Calculator();
	}

	public static InputData getInputData() {
		return new InputData();
	}

}
