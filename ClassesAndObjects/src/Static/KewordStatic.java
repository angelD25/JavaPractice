package Static;

public class KewordStatic {

	public static void main(String[] args) {
		SubClass student1 = new SubClass();
		System.out.println(SubClass.getNoOfStudents()); // Correct way// method is static 
		SubClass student2 = new SubClass();
		System.out.println(student2.getNoOfStudents()); //warning -- wrong way
	}

}
