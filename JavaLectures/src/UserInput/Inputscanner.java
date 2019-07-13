package UserInput;

import java.util.Scanner;

public class Inputscanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int numInput = scan.nextInt();
		System.out.println("The num is:");
		System.out.print(numInput);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the string");
		String strInput = scan1.nextLine();
		System.out.println("The string is:");
		System.out.print(strInput);
	}

}
