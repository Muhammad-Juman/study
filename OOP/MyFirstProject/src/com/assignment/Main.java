package com.assignment;

import com.assignment.dept.Department;
import com.assignment.student.Student;
import com.assignment.teacher.Teacher;

public class Main {

	public static void main(String[] args) {
		//Create 10 students objects with different data
		Student[] students = new Student[10];
		for(int i=0; i<students.length;i++) {
			Student ob = new Student();
			ob.setName("Juman "+i);
			ob.setFatherName("AR "+i);
			ob.setRollNumber("SSUET "+i);
			ob.setAge(i);
			ob.setAddress("Larkana "+i);
			students[i]=ob;
		}
		//create 5 teacher objects with different data and create 3 subjects in teacher class
		
		//create 5 teacher objects with different data
		
		Teacher[] teachers = new Teacher[5];
		for(int i= 0; i < teachers.length;i++) {
			Teacher t = new Teacher();
			t.setName("Naveed "+i);
			t.setEmployeeNumber("T-SSUET-"+i);
			t.setAge(10*i);
//			create 3 subjects in teacher class
			String[] subjects = {"Math "+i,"DS "+i,"Java "+i};
			t.setSubjects(subjects);
			// adding teacher object in array with i index
			teachers[i]=t;
			
		}
		
		// create two department [software,computer system] and assign student array and teacher array
		// to each department
		
		Department[] departments = new Department[2];
		
		for(int i = 0;i<departments.length;i++) {
			Department dept = new Department();
			if(i == 0)
				dept.setName("Software Engineering");
			else
				dept.setName("Computer System Engineering");
			
			dept.setAddress("SSUET, Karachi");
			
			dept.setStudents(students);
			dept.setTeachers(teachers);
			
			
			departments[i]=dept;
			
		}
		
		// Display all Departments data with Students and teachers with subjects
		
		for(Department dept:departments) {
		//Display department data
			System.out.println("Department Name :"+dept.getName());
			System.out.println("Department Location :"+dept.getAddress());
			
		// display department teachers data
			for(Teacher t:dept.getTeachers()) {
				System.out.println(t.getName()+" is teacher of Department "+ dept.getName());
				for(String subject:t.getSubjects()) {
					System.out.println(t.getName()+"is studying subject "+subject + " at Department "+dept.getName());
				}
			}
			
		// display student data	
		  for(Student stud:dept.getStudents()) {
			  System.out.println(stud.getName()+" is study at Department "+dept.getName());
		  }
		}
		
		
		 

	}

}
