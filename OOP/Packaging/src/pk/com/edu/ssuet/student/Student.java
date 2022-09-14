package pk.com.edu.ssuet.student;

public class Student {
	private String name;
	private String fatherName;
	private String rollNumber;
	private int age;
	private String address;

	public Student() {

	}

	public Student(String name, String fatherName, String rollNumber, int age, String address) {
		this.name = name;
		this.fatherName = fatherName;
		this.rollNumber = rollNumber;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
