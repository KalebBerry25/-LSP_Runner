package org.howard.edu.lsp.assignment4;

import java.io.FileNotFoundException;
import java.util.*;

/**
 *  This class is for is sets containing only integers
 * @author Kaleb
 *
 */

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Default constructor
	 */
	public IntegerSet() {
		
	}
	
	/**
	 * This method removes all elements in the set object
	 * 
	 */
	public void clear() {
		set.removeAll(set);

	};
	
	/**
	 * This method is for finding the length of a set
	 * @return Returns the number of elements in a set
	 */
	public int length() {
		return set.size();
	}; 
	
	/**
	 * This method is for determining if two sets have the elements no matter the order
	 * 
	 * @return returns true is sets are equal and false if not
	 * @param b the set to be compared
	 */
	public boolean equals(IntegerSet b) {
		if (set.isEmpty() && b.set.isEmpty()){
	        return true;
	    }

	    if((set.isEmpty() && !b.set.isEmpty()) 
	      || !set.isEmpty() && b.set.isEmpty()
	      || set.size() != b.set.size()){
	        return false;
	    }
	    ArrayList<Integer> one = new ArrayList<Integer>(set); 
	    ArrayList<Integer> two = new ArrayList<Integer>(b.set);   

	    Collections.sort(one);
	    Collections.sort(two);      
	    return one.equals(two);
	}; 
	/**
	 * This method is for finding if a value is contained in a set
	 * 
	 * @param value to be searched for
	 * @return returns true if the value is in the set and false if not
	 */
	public boolean contains(int value) {
		if(set == null) {
			return false;
		}
		for (int i = 0; i < set.size(); i++) {
			if(value == set.get(i)) {
				return true;
			}
		}
		return false;
		
	};
	
	/**
	 * This method is for finding the largest value in a set
	 * 
	 * @return returns the largest value in a set and throws exception if set is empty
	 * @throws IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException{
		if(set != null || !set.isEmpty()) {
			return Collections.max(set);
		} 
		throw new IntegerSetException("IntegerSetException");
	}; 
	
	/**
	 * This method is for finding the smallest value in a set
	 * 
	 * @return returns the smallest value in a set and throws exception if set is empty
	 * @throws IntegerSetException if the set is empty
	 */
	public int smallest() throws IntegerSetException {
		if(set != null && !set.isEmpty()) {
			return Collections.min(set);
		} 
		throw new IntegerSetException("IntegerSetException");
		
	};
	/**
	 * This method is for adding elements to a set, but it does not add duplicate elements to a set
	 * 
	 * @param item element to be added to set
	 */
	
	public void add(int item) {
		if(!set.contains(item)) {
			set.add(item);
		}
	}; 
	
	/**
	 * This method is for removing elements froma set
	 * 
	 * @param item element to be removed from set
	 */
	public void remove(int item) {
		if(set.contains(item)) {
			set.remove(Integer.valueOf(item));
		}
	}; 
	/**
	 * This method is for joining the elements of two sets into one
	 * 
	 * @param intSetb the set that will be added
	 */
	public void union(IntegerSet intSetb) {
		set.addAll(intSetb.set);
	};
	
	/**
	 * This method is for finding the elements two sets have in common
	 * 
	 * @param intSetb: the set that will be compared
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(Integer i : intSetb.set) {
			if(set.contains(i)) {
				temp.add(i);
			}
		}
		set.clear();
		set.addAll(temp);
	}; 
	
	/**
	 * This method is for finding the elements that differ between two sets
	 * 
	 * @param intSetb: the set that will be compared
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> temp = new ArrayList<Integer>(intSetb.set);
		if(set.size() >= intSetb.set.size()) {
			set.removeAll(intSetb.set);
		} else {
			temp.removeAll(set);
			set.clear();
			set.addAll(temp);
		}
	}; 
	
	/**
	 * This method is for determining if a set is empty
	 * 
	 * @return returns true if the set is empty and false if not
	 */
	boolean isEmpty() {
		if(set == null || set.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}; 
	
	/**
	 * This method is for converting a set and its elements into strings
	 * 
	 * @return returns the string format of the set
	 */
	public String toString() {
		return set.toString();
	};

	
	




}
