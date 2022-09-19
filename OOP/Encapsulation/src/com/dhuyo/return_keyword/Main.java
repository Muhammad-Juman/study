package com.dhuyo.return_keyword;

import com.dhuyo.setter_getter.StudentData;
import java.util.Scanner;

public class Main {

	public static StudentData[] getStudentData() {
		StudentData[] studentDataArray = new StudentData[10];
		for (int i = 0; i < studentDataArray.length; i++) {
			StudentData ob = new StudentData();
			ob.setName("Juman " + i);
			studentDataArray[i] = ob;
		}
		return studentDataArray;
	}

	public static void main(String[] args) {
		System.out.println("For each loop for Student Data Array");
		for (StudentData sd : getStudentData()) {
			System.out.println(sd.getName());
		}

	}

}
