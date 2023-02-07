package org.howard.edu.lsp.assignment2;

import java.io.*;

public class Driver {
	public static void main(String[] args) {
		ReadFIle rf = new ReadFIle();
		try {
			rf.readByString("main/resources/words.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open resource");
		}
		
	}

}
