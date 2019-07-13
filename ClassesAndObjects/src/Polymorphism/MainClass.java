package Polymorphism;

public class MainClass {

	public static void main(String[] args) {
		Bank abc = new Bank_ABC();
		Bank def = new Bank_DEF();
		
		System.out.println(abc.getInterestRate());
		System.out.println(def.getInterestRate());

	}

}
