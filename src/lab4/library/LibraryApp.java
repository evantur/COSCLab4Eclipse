package lab4.library;
//Simplified version of Library Management System

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class LibraryApp {
  
public static void main(String[] args) {

		 
	 LibrarianController lc = new LibrarianController();	



	System.out.println(" *** Library management system demo *** ");
	 
    // Adding some books to the catalog
	System.out.println("\n *** Adding \"Dune\" to the lc:");
	lc.addBook("Dune");
	
	System.out.println("\n *** Adding \"1984\" to the lc:");
	lc.addBook("1984"); 
	
	System.out.println("\n *** Adding \"Moby Dick\" to the lc:");
    lc.addBook("Moby Dick");

    // Show available books

    System.out.println("\n *** Show all books:");
    lc.showCatalog();
  
    // Adding members
    System.out.println("\n *** Adding \"Alice\" to the lc members");
    lc.registerMember("Alice");
    
	System.out.println("\n *** Adding \"Bob\" to the library members");
	lc.registerMember("Bob");

	//DONE make showMembers() method in librarian controller in similar structure to the other methods there
	
	//DONE also test that if a book has been borrowed, can another member attempt to borrow it
	
	//DONE test for null pointers (if a member or book does not exist) in findBookByTitle() or findMemberByName()
	
    // Show members
    System.out.println("\n *** Show all members");
    lc.showMembers();
    
    // Borrow a book
    System.out.println("\n *** Alice borrows Dune:");
    lc.borrowBook("Dune", "Alice");

    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    lc.showAvailableBooks();

    System.out.println("\n *** Bob borrows 1984:");
    lc.borrowBook("1984", "Bob");
    
    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    lc.showAvailableBooks();
    
    System.out.println("\nBob borrows Dune:");
    lc.borrowBook("Dune", "Bob");
    
    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    lc.showAvailableBooks();
    
    // Return a book
    System.out.println("\n *** Alice returns Dune:");
    lc.returnBook("Dune", "Alice");

    // Show available books after returning
    System.out.println("\n *** Show all books:");
    lc.showAvailableBooks();

    System.out.println("\n *** Bob borrows Dune:") ;
    lc.borrowBook("Dune", "Bob");
   
    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    lc.showCatalog();
    
    System.out.println();
    try {
    	lc.borrowBook("The Fellowship of the Ring", "J.R.R. Tolkien");
    } catch (NullPointerException e) {
    	System.out.println("");
    }

	}
}