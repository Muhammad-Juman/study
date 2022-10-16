package com.the_mjd.set.data;

import com.the_mjd.set.data.StudentData;
import com.the_mjd.set.data.TeacherData;

public class DepartementData {

	private String department;
	private String address;
	private TeacherData[] teacher;
	private StudentData[] student;

	public String getDepartmentName() {
		return department;
	}

	public String getAddress() {
		return address;
	}
	
	public TeacherData[] getTeacher() {
		return teacher;
	}
	
	public StudentData[] getStudent() {
		return student;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public void setDepartement(String department) {
		this.department = department;
	}

	public void setTeacher(TeacherData[] teacher) {
		this.teacher = teacher;
	}
	
	public void setStudent(StudentData[] student) {
		this.student = student;
	}
}
