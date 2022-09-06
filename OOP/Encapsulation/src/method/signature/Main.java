package method.signature;

public class Main {

	public static void main(String[] args) {
		 Student juman = new Student();
		 juman.setName("JUman");
		 juman.setAge(20);
		 
		 Student shafique = new Student();
		 shafique.setName("Shafique");
		 shafique.setAge(31);
		 
		 
		 String name = juman.getName();
		 System.out.println(name);
		 
		 int age = juman.getAge();
		 System.out.println(age);
		 
		 System.out.println(shafique.getName());
		 System.out.println(shafique.getAge());
		 
		 
		 

	}

}
