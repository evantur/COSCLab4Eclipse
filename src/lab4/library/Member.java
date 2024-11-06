package lab4.library;

import java.util.ArrayList;
import java.util.HashMap;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private ArrayList<Book> borrowedBooks = new ArrayList<>();
	
	public Member(String name) {
		this.name = name;
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
	public void returnBook(Book book) {
		if (!borrowedBooks.contains(book)) {
			System.out.println("Member has not borrowed this book.");
		}
		else {
			borrowedBooks.remove(book);
			book.setAvailability(true);
		}
	}
	
	// getters
	public String getName() {
		return this.name;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
}
