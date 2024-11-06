package lab4.library;

import java.util.ArrayList;
import java.util.HashMap;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private int memberId;
	private ArrayList<Book> borrowedBooks = new ArrayList<>();
	
	public Member(String name, int memberId, ArrayList<Book> borrowedBooks) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBooks = borrowedBooks;
	}
	
	
	public void borrowBook(Book book) {
		if (book.getAvailability() == false) {
			System.out.println("Book is not available.");
		}
		else {
			book.setAvailability(false);
			borrowedBooks.add(book);
			System.out.println("Book borrowed succesfully.");
		}
	 }
	public void returnBook(String bookTitle) {
		
	}
	
	// getters
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.memberId;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(int id) {
		this.memberId = id;
	}
}
