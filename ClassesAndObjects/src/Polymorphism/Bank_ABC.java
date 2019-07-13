package Polymorphism;

public class Bank_ABC extends Bank{
	int getInterestRate() { 
		// method over-riding : method name and return type is same ,
							//   but the function is different
		
		//method overloading : method name is same , 
						//    return type can be different and function can be different
		return 5;
	}
}
