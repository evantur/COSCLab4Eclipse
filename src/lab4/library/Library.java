package lab4.library;
import java.util.ArrayList;
import java.util.HashMap;
public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:	
	private ArrayList<String> availableBooks = new ArrayList<>();
	private HashMap<String, ArrayList<String>> memberBorrowedBooks = new HashMap<>();
	
	
	// Methods:
	// Adds a book to the library catalog
	public void addBook(String bookName) {
	    availableBooks.add(bookName);
	    System.out.println(bookName + " has been added to the catalog.");
	}
	
	// Adds a new member to the library (without a separate class)
	public void registerMember(String memberName) {
	    if (!memberBorrowedBooks.containsKey(memberName)) {
	        memberBorrowedBooks.put(memberName, new ArrayList<>());
	        System.out.println("Member " + memberName + " has been added.");
	    } else {
	        System.out.println("Member " + memberName + " already exists.");
	    }
	}
	
	// Borrow a book from the library
	public void borrowBook(String bookName, String memberName) {
	    if (!memberBorrowedBooks.containsKey(memberName)) {
	        System.out.println("Member " + memberName + " not found.");
	        return;
	    }

	    if (availableBooks.contains(bookName)) {
	        availableBooks.remove(bookName);
	        memberBorrowedBooks.get(memberName).add(bookName);
	        System.out.println(memberName + " has successfully borrowed " + bookName);
	    } else {
	        System.out.println(bookName + " is either already borrowed or not available.");
	    }
	}
	// Return a book to the library
	public void returnBook(String bookName, String memberName) {
	    if (!memberBorrowedBooks.containsKey(memberName)) {
	        System.out.println("Member " + memberName + " not found.");
	        return;
	    }

	    if (memberBorrowedBooks.get(memberName).contains(bookName)) {
	        memberBorrowedBooks.get(memberName).remove(bookName);
	        availableBooks.add(bookName);
	        System.out.println(memberName + " has successfully returned " + bookName);
	    } else {
	        System.out.println(memberName + " didn't borrow " + bookName);
	    }
	}
	// Find member and if found print name
	public void findMemberByName(String name) {
		if (memberBorrowedBooks.containsKey(name)) {
			System.out.println(name + " has been registered already.");
		}
		else {
			System.out.println(name + " has not yet been registered.");
		}
	}
	
	// Show the available books in the library
	public void showAvailableBooks() {
	    System.out.println("Available Books:");
	    for (String book : availableBooks) {
	        System.out.println(book);
	    }
	}
	//Show members of in the library
	public void showMembers() {
	   System.out.println("Library members:");
	   for (String member : memberBorrowedBooks.keySet()) {
	       System.out.println(member);
	   }
	}
	// TODO: implement functionality of Member class

}
