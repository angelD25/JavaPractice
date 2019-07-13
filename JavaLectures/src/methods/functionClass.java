package methods;

public class functionClass {

	public static void main(String[] args) {
		firstmethod();
		hello("anjali");
		System.out.println(add(100,201,302));
	}
	public static void firstmethod() {
		System.out.println("hello world");
	}
	public static void hello(String name) {
		System.out.println("hello "+name);
	}
	public static int add(int a,int b,int c) {
		return (a+b+c);
	}
}
