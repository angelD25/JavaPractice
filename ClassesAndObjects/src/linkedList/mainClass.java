package linkedList;

import java.util.LinkedList;

public class mainClass {

	public static void main(String[] args) {
		//Declaration
		LinkedList<String> name = new LinkedList<String>();
		
		//add elements to LinkedList
		name.add("Patrik");
		name.add("Anjali");
		name.add("Kartik");
		
		//access elements in LinkedList
		System.out.println("Elemenets of LinkedList in Beginning");
		for(String x: name) {
			System.out.println(x);
		}
		
		//add value to the top of the list
		name.addFirst("Jack");
		
		//add value to the bottom of the list
		name.addLast("Zack");
		
		//add value to the particular position of the list
		name.add(2, "chick");
		
		//access elements after adding more values
		System.out.println("Elemenets of LinkedList after adding more elements");
		for(String x: name) {
			System.out.println(x);
		}
		
		//remove element from the top of the list
		name.removeFirst();
		
		//remove element from the bottom of the list
		name.removeLast();
		
		//remove element from the top of the list
		name.remove(2);
		
		//access elements after removing elements
		System.out.println("Elemenets of LinkedList after removing more elements");
		for(String x: name) {
			System.out.println(x);
		}
		
		//size of the LinkedList
		System.out.println("Size of the LinkedList");
		System.out.println(name.size());
		
		//delete all the elements
		name.clear();
		
		//size of the LinkedList
		System.out.println("Size of the LinkedList after clearing all");
		System.out.println(name.size());

				
	}

}
