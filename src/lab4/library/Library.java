package lab4.library;
import java.util.ArrayList;
import java.util.HashMap;
public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:	
	public ArrayList<Book> catalog = new ArrayList<>();
	public ArrayList<Member> registeredMembers = new ArrayList<>();	
	
	// Methods:
	// Adds a book to the library catalog
	public void addBook(Book book) {
	    catalog.add(book);
	    System.out.println(book.getTitle() + " has been added to the catalog.");
	}
	
	// Adds a new member to the library (without a separate class)
	public void registerMember(String memberName) {
	    if (!registeredMembers.contains(memberName)) {
	    	
	    } else {
	    	
	    }
	}
	// borrow book
	public void borrowBook(String bookName, String memberName) {
		Book book = findBookByTitle(bookName);
		Member member = findMemberByName(memberName);
		member.borrowBook(book);
	}
	// Find member and if found print name
	public Member findMemberByName(String name) {
		if (registeredMembers.containsKey(name)) {
			return registeredMembers
		}
		else {
			System.out.println(name + " has not yet been registered.");
		}
	}
	
	//find book by title
	public Book findBookByTitle(String title) {
		for (Book book : catalog) {
			if (book.getTitle() == title) {
				return book;
			}
		}
		return null;
	}
	
	// Show the available books in the library
	public void showcatalog() {
	    System.out.println("Available Books:");
	    for (String book : catalog) {
	        System.out.println(book);
	    }
	}
	//Show members of in the library
	public void showMembers() {
	   System.out.println("Library members:");
	   for (String member : registeredMembers.keySet()) {
	       System.out.println(member);
	   }
	}
	// TODO: implement functionality of Member class

}
