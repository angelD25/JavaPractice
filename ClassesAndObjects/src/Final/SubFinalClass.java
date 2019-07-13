package Final;

// Final CLass + Method + Variable

	//final class cannot be subclassed

	//final method can not be overridden by subclass

	//final variable can only be initialized/assigned once.
public class SubFinalClass /*extends finalClass*/ {
	// error :The type SubFinalClass cannot subclass the final class finalClass

	public final int number;
	
	SubFinalClass(){
		number= 10;
	}
	
	public final String Hello() {
		System.out.println("Hello");
	}
}
