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
	public void registerMember(Member m) {
	    for (Member member : registeredMembers) {
	    	if (member.getName() == m.getName()) {
	    		System.out.println("Member already exists.");
	    		return;
	    	}
	    }
	    registeredMembers.add(m);
	    System.out.println("Member " + m.getName() + " added.");
	}
	
	// Find member and if found print name
	public Member findMemberByName(String name) {
		for (Member member : registeredMembers) {
			if (member.getName() == name) {
				return member;
			}
		}
		return null;
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
	public void showCatalog() {
	    System.out.println("Available Books:");
	    for (Book book : catalog) {
	        System.out.println(book.getTitle());
	    }
	}
	//Show members of in the library
	public void showMembers() {
	   System.out.println("Library members:");
	   for (Member member : registeredMembers) {
	       System.out.println(member);
	   }
	}
	// TODO: implement functionality of Member class

}
