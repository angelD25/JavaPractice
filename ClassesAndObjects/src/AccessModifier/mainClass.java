package AccessModifier;

public class mainClass {

	public static void main(String[] args) {
	SubClass st = new SubClass();
	System.out.println(/*SubClass.a*/);
	//error :The field SubClass.a is not visible
	}

}
