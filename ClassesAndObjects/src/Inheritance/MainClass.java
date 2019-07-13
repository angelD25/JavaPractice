package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		rectangle rec = new rectangle();
		triangle tri = new triangle();
		
		rec.setValues(10, 10);
		tri.setValues(10, 10);
		
		System.out.println(rec.area());
		System.out.println(tri.area());
	}

}
