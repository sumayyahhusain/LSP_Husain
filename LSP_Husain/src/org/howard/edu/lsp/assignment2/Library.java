// Sumayyah Husain
// @02921486

package org.howard.edu.lsp.assignment2;
import java.util.*;
import java.util.Arrays;
import java.io.*;

public class Library {
	// Add the missing implementation (methods and data definitions) to this class 
	private ArrayList<Book> bookLibrary = new ArrayList<Book>();
	private String address;
	private static String hours = "Libraries are open daily from 9am to 5pm.";
	
		// Constructor – look it up
		public Library(String libraryAddress) {
			// Implement the constructor
			this.address = libraryAddress;
		}
		
		public void addBook(Book title) {
			Book s1 = title;
			bookLibrary.add(s1);
			return;
		}
		
		public static String printOpeningHours() {
			System.out.println(hours);
			return hours;
		}
		
		public String printAddress() {
			System.out.println(address);
			return address;
		}
		
		public String borrowBook(String title) {
			//System.out.println("Borrowing " + title);
			
			if(bookLibrary.contains(title)) {
				if(Book.isBorrowed()) {
					System.out.println("Sorry, this book is already borrowed.");
					return("Sorry, this book is already borrowed.");
				} else {
					System.out.println("You successfully borrowed " + title + ":");
					return("You successfully borrowed " + title);
				}
			} else {
				System.out.println("Sorry, this book is not in our catalog.");
				return ("Sorry, this book is not in our catalog.");
			}
	
		}
		
		public String printAvailableBooks() {
			
			//System.out.println(Arrays.asList(bookLibrary));
			//System.out.println(Arrays.toString(bookLibrary));
			
			Book x;
			for (Book i : bookLibrary) {
				x = i;
				System.out.println(x.toString());
			}
			
//			if(bookLibrary == null) {
//				System.out.println("No books in catalog.");
//			} else {
//				System.out.println(bookLibrary);
//			}
			return "test";
		}
		
		public String returnBook(String title) {
			Book.returned();
			System.out.println("You successfully returned " + title + "!");
			
			return "Success";
		}

		public static void main(String[] args) { 
		// Create two libraries 
		Library firstLibrary = new Library("10 Main St."); 
		Library secondLibrary = new Library("228 Liberty St."); 
		

		// Add four books to the first library 
		firstLibrary.addBook(new Book("The Da Vinci Code")); 
		firstLibrary.addBook(new Book("Le Petit Prince")); 
		firstLibrary.addBook(new Book("A Tale of Two Cities")); 
		firstLibrary.addBook(new Book("The Lord of the Rings")); 

		// Print opening hours and the addresses 
		System.out.println("Library hours:");
		firstLibrary.printOpeningHours(); 
		System.out.println();
		
		System.out.println("Library addresses:"); 
		firstLibrary.printAddress(); 
		secondLibrary.printAddress(); 
		System.out.println();

		// Try to borrow The Lords of the Rings from both libraries System.out.println("Borrowing The Lord of the Rings:"); firstLibrary.borrowBook("The Lord of the Rings"); 
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings"); 
		secondLibrary.borrowBook("The Lord of the Rings"); 
		System.out.println(); 

		// Print the titles of all available books from both libraries 
		System.out.println("Books available in the first library:"); 
		firstLibrary.printAvailableBooks(); 
		System.out.println(); 
		System.out.println("Books available in the second library:"); 
		secondLibrary.printAvailableBooks(); 
		System.out.println(); 

		// Return The Lords of the Rings to the first library 
		System.out.println("Returning The Lord of the Rings:"); 
		firstLibrary.returnBook("The Lord of the Rings"); 
		System.out.println(); 
		} 

}
		




