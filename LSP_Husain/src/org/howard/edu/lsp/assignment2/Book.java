package org.howard.edu.lsp.assignment2;
import java.util.*;

public class Book {
	
	private String title;
	private static boolean borrowed; 
	

	// Creates a new Book 
	public Book(String bookTitle) { 
		// Implement this method 
		title = bookTitle;
		borrowed = false;
	}
	
	// Marks the book as rented 
	public void borrowed() { 
		// Implement this method 
		borrowed = true;
	}
	
	// Marks the book as not rented 
	public static void returned() { 
		// Implement this method 
		borrowed = false;
	}
	
	// Returns true if the book is rented, false otherwise public 
	public static boolean isBorrowed() { 
		// Implement this method  
		
		if(borrowed) {
			return true;
		} else {
			return false;
		}
	}
	
	// Returns the title of the book public 
	public String getTitle(String title) { 
		// Implement this method 
		return title;
	}

}
