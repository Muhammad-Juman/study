package com.dhuyo.accessmodifier_private;

public class Main {

	public static void main(String[] args) {
		StudentBioData shafiqueBioData = new StudentBioData();

		// Changing data through set methods

		shafiqueBioData.setName("Shafique");
		shafiqueBioData.setFatherName("A.R Dhuyo");
		shafiqueBioData.setRolLNumber("09SW35");

		shafiqueBioData.printName();
		shafiqueBioData.printFatherName();
		shafiqueBioData.printRollNumber();
		

		StudentBioData jumanBioData = new StudentBioData();

		// Changing data through set methods

		jumanBioData.setName("Juman");
		jumanBioData.setFatherName("Abdul Rehman Dhuyo");
		jumanBioData.setRolLNumber("123456");

		jumanBioData.printName();
		jumanBioData.printFatherName();
		jumanBioData.printRollNumber();

	}

}
