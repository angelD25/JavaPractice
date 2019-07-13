package Final;

public class MainFinalClass {

	public static void main(String[] args) {
		SubFinalClass sub = new SubFinalClass();
		sub.number = 20; 
		// error : The final field SubFinalClass.number cannot be assigned
		
	}
	
	public final String Hello(){ //error : final method can not be overridden by subclass
		System.out.println("Hi");
	}

}
