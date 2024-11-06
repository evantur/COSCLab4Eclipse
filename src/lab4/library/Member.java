package lab4.library;

import java.util.ArrayList;
import java.util.HashMap;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private int memberId;
	private ArrayList<String> borrowedBooks = new ArrayList<>();
	
	public Member(String name, int memberId, ArrayList<String> borrowedBooks) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBooks = borrowedBooks;
	}
	
	
	public void borrowBook(Book book) {
		String memberName = name;
	     if (!borrowedBooks.contains(memberName)) {
	         System.out.println("Member " + memberName + " not found.");
	         return;
	     }

	     if (availableBooks.contains(bookTitle)) {
	         availableBooks.remove(bookTitle);
	         borrowedBooks.get(memberName).add(bookTitle);
	         System.out.println(memberName + " has successfully borrowed " + bookTitle);
	     } else {
	         System.out.println(book.getTitle() + " is either already borrowed or not available.");
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
