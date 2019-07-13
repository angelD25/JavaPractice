package listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("anjali");
		array.add("dhaval");
		array.add("jack");
		array.add("jhon");
		array.add("zack");
		
		ListIterator<String> itr = array.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(" ");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
	}

}
