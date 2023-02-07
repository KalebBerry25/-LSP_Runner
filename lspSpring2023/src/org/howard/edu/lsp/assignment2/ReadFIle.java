

package org.howard.edu.lsp.assignment2;

import java.util.*;

import java.io.*;
import java.net.URL;

/**
 *  This class is for reading files 
 * @author kaleb
 *
 */
public class ReadFIle {
	/**
	 * This method is for reading files and printing the count of each significant file in a word
	 * 
	 * @param resource qualifies where the file is
	 * @return Prints count of each word in the file
	 * @throws FileNotFoundException
	 */
	public String readByString(String resource) throws FileNotFoundException {

		URL url = getClass().getClassLoader().getResource(resource);
		Hashtable<String, Integer> word_dict = new Hashtable<String, Integer>();
		if(url != null) {
			File file = new File(url.getPath());
			
			Scanner sc = null;
			sc = new Scanner(file);
			String word = "";
			while (sc.hasNext()) {
				word = sc.next();
				boolean allLetters = word.chars().allMatch(Character::isLetter);
				if (allLetters) {
					if (word.length() > 3) {
						word = word.toLowerCase();
						if(word_dict.containsKey(word)) {
							word_dict.put(word, word_dict.get(word) + 1);
						} else {
							word_dict.put(word, 1);
						}
					} else {
						continue;
					}
				} else {
					continue;
				}
				
			}
			sc.close();
			for (Map.Entry<String,Integer> entry : word_dict.entrySet())
				System.out.println(entry.getKey() + "   " + entry.getValue());
				
		}
		throw new FileNotFoundException();
	}
}
