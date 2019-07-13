package arrayList;

//importing ArrayList 
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		//declaration
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		
		//adding elements to ArrayList
		myList.add(1);
		myList.add(10);
		myList.add(100);
		myList.add(1000);
		
		//print elements of array
		System.out.println("Elements of Array");
		for(Integer x: myList) {
			System.out.println(x);
		}
		
		//get the size of array
		System.out.println("Size of Array");
		System.out.println(myList.size());
		
		//remove elements of array
		myList.remove(2);
		System.out.println("Size of Array after removing one element");
		System.out.println(myList.size());
		
		
		//change an element value 
		myList.set(1, 10000);
		System.out.println("Elements of Array after changing one element");
		for(Integer x: myList) {
			System.out.println(x);
		}
		
		//delete all the elements in array
		myList.clear();
		System.out.println("Size of Array after clearing out everything");
		System.out.println(myList.size());
	}

}
