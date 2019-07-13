package recursion;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(Factorial(5));

	}
	
	public static int Factorial(int N) {
		if(N <= 1) {
			return 1;
		}
		else {
			return (N*Factorial(N-1));
		}
	}

}
