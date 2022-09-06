package method.signature;

public class Student {
	private String name;
	private String fatherName;
	private String rollNumber;
	private int age;

	public void setName(String n) {
			name = n;
	}

	public String getName() {
		return name.toUpperCase();
	}

	public void setAge(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}

}
