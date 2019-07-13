package Static;

public class SubClass {
	String name;
	int age;
	static int NoOfStudents;
	
	SubClass(){
		NoOfStudents++;
	}
	
	public static int getNoOfStudents() {
		return NoOfStudents;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
