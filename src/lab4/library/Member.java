package lab4.library;

import java.util.ArrayList;
import java.util.HashMap;

public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	private int memberId;
	private ArrayList<String> availableBooks = new ArrayList<>();
	private HashMap<String, ArrayList<String>> borrowedBooks = new HashMap<>();
	
	
	public void borrowBook(Book book) {
	     if (!borrowedBooks.containsKey(memberName)) {
	         System.out.println("Member " + memberName + " not found.");
	         return;
	     }

	     if (availableBooks.contains(bookName)) {
	         availableBooks.remove(bookName);
	         borrowedBooks.get(memberName).add(bookName);
	         System.out.println(memberName + " has successfully borrowed " + bookName);
	     } else {
	         System.out.println(bookName + " is either already borrowed or not available.");
	     }
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
