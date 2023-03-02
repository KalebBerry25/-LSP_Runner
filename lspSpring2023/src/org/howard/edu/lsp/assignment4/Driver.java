package org.howard.edu.lsp.assignment4;

import java.io.*;

public class Driver {
	public static void main(String[] args) throws IntegerSetException {
	IntegerSet set1 = new IntegerSet();
	
	set1.add(1);
	set1.add(2);
	set1.add(3);

	System.out.println("Value of Set1 is:" + set1.toString());
	System.out.println("Smallest value in Set1 is:" + set1.smallest());
	System.out.println("Largest value in Set1 is:" + set1.largest());
	System.out.println("The length of Set1 is: " + set1.length());

	IntegerSet set2 = new IntegerSet();
	set2.add(4);
	set2.add(5);
	
	System.out.println("Union of Set1 and Set2");
	System.out.println("Value of Set1 is:" + set1.toString());
	System.out.println("Value of Set2 is:" + set2.toString());
	set1.union(set2);	
	System.out.println("Result of union of Set1 and Set2: " + set1.toString());
	
	set1.remove(5);
	System.out.println("Value of Set1 after removal:" + set1.toString());
	
	IntegerSet set3 = new IntegerSet();
	System.out.println("Value of Set3 is:" + set3.toString());
	try {
		set3.smallest();
	} catch (IntegerSetException e) {
		System.out.println("Set3 is Empty So there is no smallest value");
	}

	if(set3.isEmpty()) {
		System.out.println("Set3 is Empty");
	}
	
	IntegerSet set4 = new IntegerSet();
	set4.add(1);
	set4.add(2);
	set4.add(3);
	
	IntegerSet set5 = new IntegerSet();
	set5.add(1);
	set5.add(2);
	set5.add(3);
	
	System.out.println("Value of Set4 is:" + set4.toString());
	System.out.println("Value of Set4 is:" + set5.toString());
	if(set4.equals(set5)) {
		System.out.println("Set4 is equal to Set5");
	} else {
		System.out.println("Set4 is not equal to Set5");
	}
	set5.add(4);
	set5.add(5);
	System.out.println("Value of Set4 is:" + set4.toString());
	System.out.println("Value of Set5 is:" + set5.toString());
	if(set4.equals(set5)) {
		System.out.println("Set4 is equal to Set5");
	} else {
		System.out.println("Set4 is not equal to Set5");
	}
	
	System.out.println("Value of Set4 is:" + set4.toString());
	System.out.println("Value of Set5 is:" + set5.toString());
	set5.intersect(set4);
	System.out.println("The intersection of set4 and set5 is: "+ set5.toString());
	
	System.out.println("Value of Set4 is:" + set4.toString());
	System.out.println("Value of Set5 is:" + set5.toString());
	set4.diff(set5);
	System.out.println("The difference of set4 and set5 is: "+ set4.toString());
	
	System.out.println("Value of Set1 is:" + set1.toString());
	if(set1.contains(4)) {
		System.out.println("Set1 contains 4");
	} else {
		System.out.println("Set1 does not contain 4");
	}
	if(set1.contains(7)) {
		System.out.println("Set1 contains 7");
	} else {
		System.out.println("Set1 does not contain 7");
	}
	set1.clear();
	System.out.println("The final Value of Set1 cleared is:" + set1.toString());
	
	
	

}
}
