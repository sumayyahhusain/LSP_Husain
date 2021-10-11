package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import org.howard.edu.lsp.assignment4.IntegerSet;

public class Driver {
	
	public static void main (String[] args) throws IntegerSetException{
	
	
	// test add and toString functions
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
	
		System.out.println("Set1 looks like: " + set1.toString());
		
		IntegerSet set2 = new IntegerSet();
		set2.add(10);
		set2.add(9);
		set2.add(8);
	
		System.out.println("Set2 looks like: " + set2.toString());
		
	// test contains function 
		System.out.println();
		System.out.println("Set1 contains the number 2: " + set1.contains(2));
		System.out.println("Set1 contains the number 12: " + set1.contains(12));
		
		System.out.println("Set2 contains the number 9: " + set2.contains(9));
		System.out.println("Set2 contains the number 19: " + set2.contains(19));
		
	// test remove, clear, isEmpty, length, and toString functions
		System.out.println();
		set1.remove(2);
		System.out.println("After removing 2 from the set, Set1 looks like: " + set1.toString());
		set2.clear();
		System.out.println("After clearing Set2, it looks like: " + set2.toString());
		System.out.println("Is Set1 empty? " + set1.isEmpty());
		System.out.println("The length of Set1 is: " + set1.length());
		System.out.println("Is Set2 empty? " + set2.isEmpty());
		System.out.println("The length of Set2 is: " + set2.length());
		
	// test equals function
		System.out.println();
		System.out.println("Does Set1 equal Set2? " + set1.equals(set2));
		
		
		//try {
		//	set1.largest();
		//} catch (IntegerSetException error){
		//	System.out.println(error);
		//}
		
	// test largest and smallest functions
		System.out.println();
		try {
			System.out.println("The largest number in Set1 is: " + set1.largest());
		} catch (IntegerSetException error){
			System.out.println("Exception thrown by largest. Set1 is empty.");
		}
		
		try {
			System.out.println("The largest number in Set2 is: " + set2.largest());
		} catch (IntegerSetException error){
			System.out.println("Exception thrown by largest. Set2 is empty.");
		}
		
		try {
			System.out.println("The smallest number in Set1 is: " + set1.smallest());
		} catch (IntegerSetException error){
			System.out.println("Exception thrown by smallest. Set1 is empty.");
		}
		
		try {
			System.out.println("The smallest number in Set2 is: " + set2.smallest());
		} catch (IntegerSetException error){
			System.out.println("Exception thrown by smallest. Set2 is empty.");
		}
	
	// test add and toString functions again
		System.out.println();
		set1.add(4);
		set1.add(5);
			
		System.out.println("After adding to Set1, it looks like: " + set1.toString());
				
		set2.add(7);
		set2.add(6);
		set2.add(5);
			
		System.out.println("After adding to Set2, it looks like: " + set2.toString());
		
	// test union function
		System.out.println();
		set1.union(set2);
		System.out.println("The Union of Set1 and Set2 is: " + set1.toString());
		
	// test intersect function 	
		System.out.println();
		System.out.println("The Intersection of Set1 and Set2 is: " + set1.intersect(set2));
		
	// test difference function (assuming we're looking for values unique to each set...? )
		System.out.println();
		System.out.println("The unique elements of Set1 and Set2 are: " + set1.diff(set2));
		

	}
}
