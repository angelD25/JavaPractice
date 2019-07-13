package lesson2GettersSetters;

public class MainClass {

	public static void main(String[] args) {
		
		SubClass student1 = new SubClass();
		
		student1.setId(1);
		student1.setName("Anjali");
		student1.setAge(25);
		
		SubClass student2 = new SubClass();
		
		student2.setId(2);
		student2.setName("Dhaval");
		student2.setAge(29);
		
		System.out.println(student1.getName() + " is " + student1.getAge() + " years old");
		System.out.println(student2.getName() + " is " + student2.getAge() + " years old");
	}

}
