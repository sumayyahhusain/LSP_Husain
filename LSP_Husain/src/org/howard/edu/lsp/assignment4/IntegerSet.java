package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class IntegerSet extends Exception {
	
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();

	
	// Default Constructor
	public void Set(ArrayList<Integer> s) {
		this.set = s;
	};

	
	// Clears the internal representation of the set
	public void clear() {
		set.clear();
	};

	
	// Returns the length of the set
	public int length() {
		return set.size();
	};

	
	/** Returns true if the 2 sets are equal, false otherwise;
	* Two sets are equal if they contain all of the same values in ANY order.
	*/
	public boolean equals(IntegerSet set2) {
		
		List<Integer> b = set2.set;
		
		if(set.size() != b.size()) {
			return false;
		}
		
		Collections.sort(set);
		Collections.sort(b);
		
		for (int i = 0; i < set.size(); i++) {
			if(set.get(i) != b.get(i)) {
				return false;
			}
		}
		return true;
	}; 

	
	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		if(set.contains(value) == true) {
			return true;
		}else {
			return false;
		}
	};    

	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {
		if(set.size() == 0) {
			throw new IntegerSetException("Exception from largest because set is empty.");
		} else {
			return Collections.max(set);
		}
	}; 

	
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException {
		if(set.size() == 0) {
			throw new IntegerSetException("Exception from smallest because set is empty.");
		} else {
			return Collections.min(set);
		}
	}

	
	// Adds an item to the set or does nothing it already there	
 	public void add(int item) {
 		set.add(item);
 	}; 

 	
	// Removes an item from the set or does nothing if not there
 	//Throws a IntegerSetException of the set is empty
 	public void remove(int item) throws IntegerSetException{
 		if(set.size() == 0) {
 			throw new IntegerSetException("Exception thrown by remove because set is empty.");
 		} else {
 			if(contains(item) == true) {
 				for(int i = 0; i < set.size(); i++) {
 					if(set.get(i) == item) {
 						set.remove(i);
 					}
 				}
 			}
 		}
 	};  

 	
 	// Set union
 	public void union(IntegerSet intSetb) {
 		List<Integer> b = intSetb.set;
 		for(int i = 0; i < b.size(); i++) {
 			set.add(b.get(i));
 		}
 		List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(set));
 		set = listWithoutDuplicates;
 	};

 	
 	// Set intersection
 	public List<Integer> intersect(IntegerSet intSetb) {
 		List<Integer> b = intSetb.set;
 		List<Integer> intersection = new ArrayList<Integer>();
 		for(int i = 0; i < set.size(); i++) {
 			int val = set.get(i);
 			if(b.contains(val) == true) {
 				intersection.add(val);
 			}
 		}
 		return intersection;
 	}; 

 	
 	// Set difference, i.e., s1 –s2
 	public List<Integer> diff(IntegerSet intSetb) {
 		List<Integer> b = intSetb.set;
 		List<Integer> difference = new ArrayList<Integer>();
 		for(int i = 0; i < set.size(); i++) {
 			int val = set.get(i);
 			if(b.contains(val) == false) {
 				difference.add(val);
 			}
 		}
 		return difference;
 		
 	}

 	
 	// Returns true if the set is empty, false otherwise
 	public boolean isEmpty() {
 		if(set.size() == 0) {
 			return true;
 		}else {
 			return false;
 		}
 	}

 	
 	// Return String representation of your set
 	public String toString() {
 		String stringList = "";
 		for(int i = 0; i < set.size(); i++) {
 			stringList = stringList + set.get(i) + " ";
 		}
 		return stringList;
 	};	
}

