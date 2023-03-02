package org.howard.edu.lsp.assignment4;

import java.io.IOException;

/**
 *  This class is for the custom IntegerSetException
 * @author Kaleb
 *
 */
public class IntegerSetException extends IOException { 
  
	private static final long serialVersionUID = 1L;
	/**
	 * This method prints the chosen error message for the exception
	 * 
	 * @param errorMessage that is to be printed
	 */
	public IntegerSetException(String errorMessage) {
        super(errorMessage);
    }
}