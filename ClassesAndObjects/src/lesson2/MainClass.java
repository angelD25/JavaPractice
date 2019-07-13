package lesson2;

public class MainClass {

	public static void main(String[] args) {
		SubClass1 student1 = new SubClass1();
		
		student1.id = 1;
		student1.name = "Anjali";
		student1.age = 25;
		
		SubClass1 student2 = new SubClass1();
		
		student2.id = 2;
		student2.name = "Dhaval";
		student2.age = 29;
		
		System.out.println(student1.name + " is " + student1.age + " years old");
		System.out.println(student2.name + " is " + student2.age + " years old");
	}

}
