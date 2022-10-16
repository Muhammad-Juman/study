package com.mjd.assignment.university.data;

import java.util.Scanner;
import com.the_mjd.set.data.StudentData;
import com.the_mjd.set.data.TeacherData;
import com.the_mjd.set.data.DepartementData;

public class DeaartmentDataInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Total Student No : ");
		int totalStudent = input.nextInt();
		StudentData[] student = new StudentData[totalStudent];
		for(int i=0;i<student.length;i++) {
			StudentData studentObject = new StudentData();
			System.out.print(i+" | Enter Student Name : ");
			String name = input.nextLine();
			System.out.print(" Enter Father Name : ");
			String fatherName = input.nextLine();
			System.out.print(i+" | Enter Student Age : ");
			int age = input.nextInt();
			studentObject.setStudentName(name);
			studentObject.setFatherName(fatherName);
			studentObject.setAge(age);
			student[i] = studentObject;	
		}
		System.out.println();
		System.out.print("Enter Total Teacher No : ");
		int totalTeacher = input.nextInt();
		TeacherData[] teacher = new TeacherData[totalTeacher];
		for(int i=0;i<teacher.length;i++) {
			TeacherData teacherObject = new TeacherData();
			System.out.print(i+" | Enter Teacher Name : ");
			String teacherName = input.nextLine();
			teacherObject.setTeacherName(teacherName);
			
			System.out.print("Total Subjects No : ");
			int teacherSubjects = input.nextInt();
			String[] subjects = new String[teacherSubjects];
			for(int j =0;j<subjects.length;j++) {
			System.out.print(" Subjects  Name : ");
			String subjectsName = input.nextLine();
			subjects[i] = subjectsName;
			}
			teacherObject.setSubject(subjects);
			teacher[i]=teacherObject;
		}
		System.out.println();
		System.out.print("Enter Department No : ");
		int departmentNo = input.nextInt();
		DepartementData[] department = new DepartementData[departmentNo];
		for(int i=0;i<department.length;i++) {
			DepartementData departmentName = new DepartementData();
			System.out.print("Enter Department Name : ");
			String name = input.nextLine();
			departmentName.setDepartement(name);
			departmentName.setAddress("SSUET In Karachi ");
			departmentName.setTeacher(teacher);
			departmentName.setStudent(student);
			department[i] = departmentName;
		}
		System.out.println();
		for(DepartementData x : department) {
			System.out.println(x.getDepartmentName()+" Department");
			System.out.println(x.getAddress());
			System.out.println();
			System.out.println("Teachers Data");
			for(TeacherData y : teacher) {
				System.out.println(" Teacher "+y.getTeacherName());
				for(String z : y.getSubjects()) {
					System.out.println("Subjects : "+y.getSubjects());
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Student Data");
			for(StudentData z : student) {
				System.out.println(" Student Name : "+z.getStudentName());
				System.out.println("Father Name : "+z.getFatherName());
				System.out.println("Age : "+z.getAge());
			}
		System.out.println("******");
		}
		
	}
}
