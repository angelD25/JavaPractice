package hashSet;

import java.util.HashSet;
import java.util.Iterator;



public class MainClass {

	public static void main(String[] args) {
		//unordered collection of elements
		HashSet<String> name = new HashSet<String>();
		
		//add values
		name.add("Anjali");
		name.add("Dhaval");
		name.add("Jack");
		name.add("Zack");
		name.add("Jhon");
		
		//Iterator for iterating throughout the HashSet
		Iterator<String> itr = name.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}*/
		// hashSet cannot use hasPrevious() and previous() methods because it is an unordered list
		name.remove("Anjali");
		System.out.println(name.size());
		name.clear();
		System.out.println(name.size());
		
	}

}
