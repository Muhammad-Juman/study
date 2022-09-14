package pk.com.edu.ssuet;

import pk.com.edu.ssuet.department.Department;
import pk.com.edu.ssuet.student.*;

public class Main {

	//Create 10 students objects with different data
	//create 5 teacher objects with different data and create 3 subjects in teacher class
	// create two department [software,computer system] and assign student array and teacher array
	// to each department
	// Display all Departments data with Students and teachers with subjects
	public static void main(String[] args) {
		Department[] departments =  new Department[2];
		
		
		Department software = new Department();
		software.setName("Software Engineering");
		software.setAddress("Karachi");
		
		
		
		
		departments[0]=software;
		
		
		

	}

}
