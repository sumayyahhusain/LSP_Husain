/**
 * @author sumayyahhusain
 */
package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class IntegerSet extends Exception {
	
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();

	
	/**
	 * Default Constructor
	 * @param ArrayList<Integer>s
	 */
	public void Set(ArrayList<Integer> s) {
		this.set = s;
	};

	
	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	};

	
	/**
	 * Get length of set
	 * @return integer representation of length of set
	 */
	public int length() {
		return set.size();
	};

	
	/** 
	 * Two sets are equal if they contain all of the same values in ANY order.
	 * @param IntegerSet 2
	 * @return true if the 2 sets are equal, false otherwise
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

	
	/**
	 * Check if specified value is in set
	 * @param value
	 * @return true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {
		if(set.contains(value) == true) {
			return true;
		}else {
			return false;
		}
	};    

	/**
	 * Find largest value in set
	 * @return number of greatest value in the given set
	 * @throws IntegerSetException if set is empty
	 */ 
	public int largest() throws IntegerSetException {
		if(set.size() == 0) {
			throw new IntegerSetException("Exception from largest because set is empty.");
		} else {
			return Collections.max(set);
		}
	}; 

	/**
	 * Find smallest value in set
	 * @return number of smallest value in the given set
	 * @throws IntegerSetException is set is empty
	 */
	public int smallest() throws IntegerSetException {
		if(set.size() == 0) {
			throw new IntegerSetException("Exception from smallest because set is empty.");
		} else {
			return Collections.min(set);
		}
	}

	/**
	 * Adds an item to the set or does nothing if already there
	 * @param integer item
	 */
 	public void add(int item) {
 		if(set.contains(item) != true) {
 			set.add(item);
 		}
 	}; 

 	/**
 	 * Removes an item from the set or does nothing if not there
 	 * @param integer item
 	 * @throws IntegerSetException if set is empty
 	 */
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

 	/**
 	 * Set Union
 	 * @param IntegerSet intSetb
 	 */
 	public void union(IntegerSet intSetb) {
 		List<Integer> b = intSetb.set;
 		for(int i = 0; i < b.size(); i++) {
 			set.add(b.get(i));
 		}
 		List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(set));
 		set = listWithoutDuplicates;
 	};

 	/**
 	 * Find intersection of two sets
 	 * @param IntegerSet intSetb
 	 * @return list containing integers that exist in both sets
 	 */
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

 	/**
 	 * Difference: Opposite of intersection 
 	 * @param IntegerSet intSetb
 	 * @return list containing integers that are unique to both sets
 	 */
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

 	/**
 	 * Check size of list to see if set is empty
 	 * @return true if the set is empty, false otherwise
 	 */
 	public boolean isEmpty() {
 		if(set.size() == 0) {
 			return true;
 		}else {
 			return false;
 		}
 	}

 	/**
 	 * Convert set to string
 	 * @return string representation of set
 	 */
 	public String toString() {
 		String stringList = "";
 		for(int i = 0; i < set.size(); i++) {
 			stringList = stringList + set.get(i) + " ";
 		}
 		return stringList;
 	};	
}

