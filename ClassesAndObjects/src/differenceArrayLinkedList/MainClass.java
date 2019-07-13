package differenceArrayLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		//a number
		long n = (long) 1E7; // 10^7
		
		//declare an ArrayList
		ArrayList array = new ArrayList();
		
		//declare a LinkedList
		LinkedList link = new LinkedList();
	
		
		//add values up to 1E7 in arrayList and record the time
		long milis = System.currentTimeMillis();
		for(int i=0;i<n;i++) {
		array.add(i);
		}
		System.out.println("ArrayList Insertion takes: "+ (System.currentTimeMillis() - milis) +" miliseconds");
	
		//add values up to 1E7 in linkedList and record the time
		long secondmilis = System.currentTimeMillis();
		for(int i=0;i<n;i++) {
			link.add(i);
		}
		System.out.println("LinkedList Insertion takes: "+ (System.currentTimeMillis() - secondmilis) +" miliseconds");
	
		
		
		//remove one element in arrayList and record the time
	    milis = System.currentTimeMillis();
		array.remove(3);
		System.out.println("ArrayList Deletion takes: "+ (System.currentTimeMillis() - milis) +" miliseconds");
			
		//remove one element in linkedList and record the time
		secondmilis = System.currentTimeMillis();	
		link.remove(3);
		System.out.println("LinkedList Deletion takes: "+ (System.currentTimeMillis() - secondmilis) +" miliseconds");
			
		
		
		//search an element in arrayList and record the time
	    milis = System.currentTimeMillis();
		array.get((int)(n/2));
		System.out.println("ArrayList Search takes: "+ (System.currentTimeMillis() - milis) +" miliseconds");
			
		//search an element in linkedList and record the time
		secondmilis = System.currentTimeMillis();	
		link.get((int)(n/2));
		System.out.println("LinkedList Search takes: "+ (System.currentTimeMillis() - secondmilis) +" miliseconds");
	
	}

}
