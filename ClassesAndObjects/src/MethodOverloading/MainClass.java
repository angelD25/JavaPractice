package MethodOverloading;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(Add(1,26));
		System.out.println(Add(1.5,26.5));
		System.out.println(Add("Anjali","Dhaval"));
	}

	public static int Add(int a, int b) {
		return (a+b);
	}
	
	public static double Add(double a, double b) {
		return (a+b);
	}
	
	public static String Add(String a, String b) {
		return (a+b);
	}
}
