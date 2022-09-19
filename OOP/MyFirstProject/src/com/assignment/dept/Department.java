package com.assignment.dept;

import com.assignment.student.Student;
import com.assignment.teacher.Teacher;

public class Department {
	private String name;
	private String address;
	private Student[] students;
	private Teacher[] teachers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Teacher[] getTeachers() {
		return teachers;
	}

	public void setTeachers(Teacher[] teachers) {
		this.teachers = teachers;
	}

}
