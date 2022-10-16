package com.mjd.assignment.university.data;

import com.the_mjd.set.data.StudentData;
import com.the_mjd.set.data.TeacherData;
import com.the_mjd.set.data.DepartementData;

public class NormalPrint {

	public static void main(String[] args) {

		StudentData[] studentInfo = new StudentData[10];
		for (int i = 0; i < studentInfo.length; i++) {
			StudentData studentObject = new StudentData();
			studentObject.setStudentName("Juman : " + i);
			studentObject.setFatherName("Abdul ur Rehman : " + i);
			studentObject.setAge(i);
			studentInfo[i] = studentObject;
		}

		TeacherData[] teacherInfo = new TeacherData[5];
		for (int i = 0; i < teacherInfo.length; i++) {
			TeacherData teacherObject = new TeacherData();
			teacherObject.setTeacherName("Shafque ur Rehman : " + i);

			String[] subjects = { "English : " + i, "Math : " + i, "DSA : " + i };
			teacherObject.setSubject(subjects);
			teacherInfo[i] = teacherObject;
		}

		DepartementData[] departmentData = new DepartementData[2];
		for (int i = 0; i < departmentData.length; i++) {
			DepartementData depart = new DepartementData();
			if (i == 0)
				depart.setDepartement("Software Engineering");
			else
				depart.setDepartement("Computer System");
			
			depart.setAddress("SSUET Main Campus In Karachi");

			depart.setTeacher(teacherInfo);
			depart.setStudent(studentInfo);

			departmentData[i] = depart;
		}

		for (DepartementData x : departmentData) {
			System.out.println("Department Name : " + x.getDepartmentName());
			System.out.println("Address  : " + x.getAddress());
			for (TeacherData y : teacherInfo) {
				System.out.println("Teacher Name : " + y.getTeacherName());
				for (String subjects : y.getSubjects()) {
					System.out.println("Mr : " + y.getTeacherName() + "Studing Subjects : " + subjects + " in "
							+ x.getDepartmentName() + " Departement");

				}
			}
			
			for (StudentData z : studentInfo) {
				System.out.println("Student Name " + z.getStudentName());
				System.out.println("Father Name : " + z.getFatherName());
				System.out.println("Age : " + z.getAge());
			}
			
			System.out.println("******");
		}

	}

}
