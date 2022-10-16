package com.mjd.assignment.university.data;

import com.the_mjd.set.data.StudentData;
import com.the_mjd.set.data.TeacherData;
import java.util.Scanner;

public class MyFirstProject {
	static Scanner input = new Scanner(System.in);

	public static StudentData[] getStudentNames() {
		StudentData[] studentNameArray = new StudentData[10];
		for (int i = 0; i < studentNameArray.length; i++) {
			StudentData nameObject = new StudentData();
			System.out.print(i + "| Student Name : ");
			String name = input.nextLine();
			nameObject.setStudentName(name);
			studentNameArray[i] = nameObject;
		}
		System.out.println();
		return studentNameArray;
	}

	public static TeacherData[][] getTeacherData() {
		TeacherData[][] teacherDataArray = new TeacherData[5][5];
		for (int i = 0; i < teacherDataArray.length; i++) {
			TeacherData teacherData = new TeacherData();
			System.out.print(i + "| Teacher Name : ");
			String teacherName = input.nextLine();
			teacherData.setTeacherName(teacherName);
			teacherDataArray[i][i] = teacherData;
			
//			for (int j = 0; j < teacherDataArray[i].length; j++) {
//				System.out.print(j + "| Enter Subject Name : ");
//				String subject = input.nextLine();
//				teacherData.setSubject(subject);
//				teacherData.getSubjects();
//			}
			
			System.out.println();
		}
		return teacherDataArray;
	}       

	public static void main(String[] args) {
		for(StudentData x : getStudentNames()) {
			System.out.println("Student "+x.getStudentName());
		}
		System.out.println();
		
		for(TeacherData[] y:getTeacherData()) {
			TeacherData ob = new TeacherData();
			System.out.println("Teacher "+ob.getTeacherName());
			for(int j=0;j<y.length;j++) {
				System.out.println(ob.getSubjects());
			}
		
		}
		System.out.println();
		
	}

}
