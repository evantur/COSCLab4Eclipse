package lab4.library;
//Simplified version of Library Management System

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class LibraryApp {
  
public static void main(String[] args) {
	
	 Library library = new Library();

	 System.out.println(" *** Library management system demo *** ");
	 
    // Adding some books to the catalog
	System.out.println("\n *** Adding \"Dune\" to the library:");
	library.addBook(new Book("Dune"));
	
	System.out.println("\n *** Adding \"1984\" to the library:");
	library.addBook(new Book("1984")); 
	
	System.out.println("\n *** Adding \"Moby Dick\" to the library:");
    library.addBook(new Book("Moby Dick"));

//    // Show available books
//    System.out.println("\n *** Show all books:");
//    library.showAvailableBooks();
//    
    // Adding members
    System.out.println("\n *** Adding \"Alice\" to the library members");
    library.registerMember(new Member("Alice"));
    
    System.out.println("\n *** Adding \"Bob\" to the library members");
    library.registerMember(new Member("Bob"));
//
    // Show members
    System.out.println("\n *** Show all members");
    library.showMembers();
    
    // Borrow a book
    System.out.println("\n *** Alice borrows Dune:");
    library.borrowBook("Dune", "Alice");
//
//    // Show available books after borrowing
//    System.out.println("\n *** Show all books:");
//    library.showAvailableBooks();
//
//    System.out.println("\n *** Bob borrows 1984:");
//    library.borrowBook("1984", "Bob");
//    
//    // Show available books after borrowing
//    System.out.println("\n *** Show all books:");
//    library.showAvailableBooks();
//    
//    System.out.println("\nBob borrows Dune:");
//    library.borrowBook("Dune", "Bob");
//    
//    // Show available books after borrowing
//    System.out.println("\n *** Show all books:");
//    library.showAvailableBooks();
//    
//    // Return a book
//    System.out.println("\n *** Alice returns Dune:");
//    library.returnBook("Dune", "Alice");
//
//    // Show available books after returning
//    System.out.println("\n *** Show all books:");
//    library.showAvailableBooks();
//
//    System.out.println("\n *** Bob borrows Dune:") ;
//    library.borrowBook("Dune", "Bob");
//    
//    // Show available books after borrowing
//    System.out.println("\n *** Show all books:");
//    library.showAvailableBooks();

	}
}